package com.libi.biz;

import com.libi.dao.History1077aDao;
import com.libi.entity.F27x9133aDo;
import com.libi.entity.History1077aDo;
import com.libi.service.F27x9133aService;
import com.libi.service.History1077aService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.cursor.Cursor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

@Component
@Slf4j
public class StatTask {
    @Autowired
    private F27x9133aService f27x9133aService;
    @Autowired
    private History1077aService history1077aService;
    @Autowired
    private ThreadPoolExecutor threadPoolExecutor;

    /**
     * 脚本开始
     */
    public void starTask() {
        log.info("开始执行");
        int fCount = f27x9133aService.count();
        int hCount = history1077aService.count();
        log.info("f27x9133a表大小 ： {}，history1077a 表大小：{}", fCount, hCount);
        Cursor<F27x9133aDo> fCursor = f27x9133aService.cursor();
        Iterator<F27x9133aDo> fIterator = fCursor.iterator();
        Integer fCurr = 0;
        while (fIterator.hasNext()) {
            fCurr++;
            Cursor<History1077aDo> hCursor = history1077aService.cursor();
            Iterator<History1077aDo> hIterator = hCursor.iterator();
            F27x9133aDo next = fIterator.next();
            List<History1077aDo> hList = new ArrayList<>();
            Integer hCurr = 0;
            Integer curr = 0;
            while (hIterator.hasNext()) {
                hList.add(hIterator.next());
                if (hList.size() >= 1000) {
                    List<History1077aDo> finalHList = hList;
                    threadPoolExecutor.submit(() -> {
                        doTask(next, finalHList);
                    });
                    hList = new ArrayList<>();
                }
                hCurr += 1000;
                curr += 1000;
                log.info("任务提交进度 f表 {}/{}    h表 {}/{}   {}%", fCurr, fCount, hCurr, hCount, String.format("%.2f", 1.0D * curr / hCount * fCount));
            }
            if (!ObjectUtils.isEmpty(hList)) {
                List<History1077aDo> finalHList1 = hList;
                threadPoolExecutor.submit(() -> {
                    doTask(next, finalHList1);
                });
                hCurr += hList.size();
                curr += hList.size();
                log.info("任务提交进度 f表 {}/{}    h表 {}/{}   {}%", fCurr, fCount, hCurr, hCount, String.format("%.2f", 1.0D * curr / hCount * fCount));
            }
        }

    }

    private void doTask(F27x9133aDo next, List<History1077aDo> hList) {
        hList.forEach(history1077aDo -> compareAndSave(next, history1077aDo));
    }

    private void compareAndSave(F27x9133aDo f27x9133aDo, History1077aDo history1077aDo) {

    }
}
