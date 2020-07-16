package com.lesson.service;

import com.lesson.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Hello World Service
 *
 * @author Du Lee
 * @version 1.0
 * @since JDK 1.8
 * <p>Date: 2020-07-16 11-09
 */
@Service
public class HelloWorldService {

    @Autowired
    private TestMapper mapper;

    public String sayHello() {
        return mapper.test();
    }
}
