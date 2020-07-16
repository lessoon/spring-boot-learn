package com.lesson;

import com.lesson.mapper.TestMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Connection test
 *
 * @author Du Lee
 * @version 1.0
 * @since JDK 1.8
 * <p>Date: 2020-07-16 11-04
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ConnectionTest {

    @Autowired
    private TestMapper mapper;

    @Test
    public void test() {
        System.out.println(mapper.test());
    }
}
