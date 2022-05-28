package com.libi.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.libi.dao.F27x9133aDao;
import com.libi.entity.F27x9133aDo;
import com.libi.service.F27x9133aService;
import org.apache.ibatis.cursor.Cursor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * @author  generator
 * @description 
 * @date 2022-05-28 14:13:46
 */
@Service("f27x9133aService" )
public class F27x9133aServiceImpl extends ServiceImpl<F27x9133aDao, F27x9133aDo> implements F27x9133aService {
    @Autowired
    private F27x9133aDao f27x9133aDao;

    @Override
    public Cursor<F27x9133aDo> cursor() {
        return f27x9133aDao.selectAll();
    }
}
