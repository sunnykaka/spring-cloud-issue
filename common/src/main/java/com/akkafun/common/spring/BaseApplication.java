package com.akkafun.common.spring;

import com.netflix.appinfo.ApplicationInfoManager;
import com.netflix.discovery.DiscoveryClient;
import com.netflix.discovery.EurekaClient;
import com.netflix.discovery.EurekaClientConfig;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.CloudEurekaClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

/**
 * Created by liubin on 2016/3/28.
 */
@ComponentScan({"com.akkafun.**.service", "com.akkafun.**.web"})
@EnableDiscoveryClient
public class BaseApplication {


    @LoadBalanced
    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }


//    @Bean(destroyMethod = "shutdown")
//    @org.springframework.cloud.context.config.annotation.RefreshScope
//    public EurekaClient eurekaClient(ApplicationInfoManager manager,
//                                     EurekaClientConfig config,
//                                     DiscoveryClient.DiscoveryClientOptionalArgs optionalArgs,
//                                     ApplicationContext context) {
//        manager.getInfo(); // force initialization
//        return new CloudEurekaClient(manager, config, optionalArgs, context);
//    }


}