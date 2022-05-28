package com.libi.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.libi.entity.F27x9133aDo;
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
public interface F27x9133aDao extends BaseMapper<F27x9133aDo> {

    @Select("select * from F27X9_133a")
    Cursor<F27x9133aDo> selectAll();
}
