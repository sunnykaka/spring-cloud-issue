package com.akkafun.order.service;

import com.akkafun.order.test.OrderBaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by liubin on 2016/5/9.
 */
public class OrderServiceTest extends OrderBaseTest {

    @Autowired
    OrderService orderService;

    @Test
    public void test() {

        String result = orderService.placeOrder();
        assertThat(result, is("true"));
    }


}
