package com.akkafun.order.web;

import com.akkafun.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liubin on 2016/3/29.
 */
@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @RequestMapping(value = "/orders/place", method = RequestMethod.POST)
    public String placeOrder() {

        return orderService.placeOrder();

    }


}
