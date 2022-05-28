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

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component
@Slf4j
public class StatTask {
    @Autowired
    private F27x9133aService f27x9133aService;
    @Autowired
    private History1077aService history1077aService;

    /**
     * 脚本开始
     */
    public void starTask() {
        log.info("开始执行");
        int fCount = f27x9133aService.count();
        int hCount = history1077aService.count();
        log.info("f27x9133a表大小 ： {}，history1077a 表大小：{}", fCount, hCount);
        Cursor<F27x9133aDo> fCursor = f27x9133aService.cursor();
        Cursor<History1077aDo> hCursor = history1077aService.cursor();
        Iterator<F27x9133aDo> fIterator = fCursor.iterator();
        while (fIterator.hasNext()) {
            F27x9133aDo next = fIterator.next();
            List<History1077aDo> hList = new ArrayList<>();


        }

    }
}
