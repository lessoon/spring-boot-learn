package com.lesson.mapper;

import org.apache.ibatis.annotations.Select;

/**
 * @author Du Lee
 * @version 1.0
 * @since JDK 1.8
 * <p>Date: 2020-07-15 15-52
 */
public interface TestMapper {
    @Select("select '1' from dual")
    String test();
}
