## spring-cloud-netflix-issues-1026

Reproduce the [issue](https://github.com/spring-cloud/spring-cloud-netflix/issues/1026)

### How To Run
1. Start eureka server. Run `%ProjectPATH%/eureka/src/main/java/com/akkafun/eureka/RegistrationServer.java`.

2. Start account service. Run `%ProjectPATH%/account/core/src/main/java/com/akkafun/account/context/AccountApplication.java`.

3. Run order service integration test. Run `%ProjectPATH%/order/core/src/test/java/com/akkafun/order/service/OrderServiceTest.java`.
The test would fail with the exception.

4. Open `%ProjectPATH%/common/src/main/java/com/akkafun/common/spring/BaseApplication.java`, uncomment these lines:
```
    @Bean(destroyMethod = "shutdown")
    @org.springframework.cloud.context.config.annotation.RefreshScope
    public EurekaClient eurekaClient(ApplicationInfoManager manager,
                                     EurekaClientConfig config,
                                     DiscoveryClient.DiscoveryClientOptionalArgs optionalArgs,
                                     ApplicationContext context) {
        manager.getInfo(); // force initialization
        return new CloudEurekaClient(manager, config, optionalArgs, context);
    }

```
Rerun the step#3, the test will pass.