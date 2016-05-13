package com.akkafun.order.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

/**
 * Created by liubin on 2016/4/29.
 */
@Service
public class OrderService {

    protected Logger logger = LoggerFactory.getLogger(OrderService.class);

    @Autowired
    RestTemplate restTemplate;

    /**
     * 下订单
     * @param
     * @return
     */
    public String placeOrder() {

        URI uri = UriComponentsBuilder
                .fromHttpUrl("http://ACCOUNT/accounts/enough")
                .queryParam("userId", 1L)
                .queryParam("balance", 0L)
                .build().encode().toUri();

        return restTemplate.getForObject(uri, String.class);
    }
}
