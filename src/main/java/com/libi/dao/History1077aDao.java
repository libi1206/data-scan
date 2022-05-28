package com.libi.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.libi.entity.F27x9133aDo;
import com.libi.entity.History1077aDo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.cursor.Cursor;

/**
 *
 *@author generator
 *@description 
 *@date 2022-05-28 14:13:46
 */
@Mapper
public interface History1077aDao extends BaseMapper<History1077aDo> {

    @Select("select * from History10_77A")
    Cursor<History1077aDo> selectAll();
}
