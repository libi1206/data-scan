package com.libi.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.libi.dao.History1077aDao;
import com.libi.entity.History1077aDo;
import com.libi.service.History1077aService;
import org.apache.ibatis.cursor.Cursor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;


/**
 *
 * @author  generator
 * @description 
 * @date 2022-05-28 14:13:46
 */
@Service("history1077aService" )
public class History1077aServiceImpl extends ServiceImpl<History1077aDao, History1077aDo> implements History1077aService {
    @Autowired
    private History1077aDao history1077aDao;

    @Override
    public Cursor<History1077aDo> cursor() {
        return history1077aDao.selectAll();
    }
}
