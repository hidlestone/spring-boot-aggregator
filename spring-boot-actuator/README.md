# spring-boot-demo-actuator

> 在 SpringBoot 中通过 actuator 检查项目运行情况。

Actuator是Springboot提供的用来对应用系统进行自省和监控的功能模块，借助于Actuator开发者可以很方便地对应用系统某些监控指标进行查看、统计等。

### 1、 Endpoints
#### 1.1、使用方式
服务启动后，直接访问：`http://localhost:8090/sys/actuator/health`，最后个单词换成端点的任意一个单词。
#### 1.2、Endpoints
1.beans 显示应用spring beans的完整列表。  
2.conditions 自动装配的类信息，一般情况下也不会用到，研究源码时可以参考下。  
3.env 显示环境变量。  
4.metrics 当前应用的 metrics 信息。  
5.mappings 当前应用的 @RequestMapping 路径集列表。   
6.scheduledtasks 当前应用的定时任务列表。  
7.httptrace 显示 http 跟踪信息，默认显示最后 100 个 Http 请求-响应交换。  

### 2、 配置
#### application.yml
```yaml
server:
  port: 8080
  servlet:
    context-path: /demo
# 若要访问端点信息，需要配置用户名和密码
spring:
  security:
    user:
      name: payn
      password: 123456
management:
  # 端点信息接口使用的端口，为了和主系统接口使用的端口进行分离
  server:
    port: 8090
    servlet:
      context-path: /sys
  # 端点健康情况，默认值"never"，设置为"always"可以显示硬盘使用情况和线程情况
  endpoint:
    health:
      show-details: always
  # 设置端点暴露的哪些内容，默认["health","info"]，设置"*"代表暴露所有可访问的端点
  endpoints:
    web:
      exposure:
        include: '*'
```

### 3、端点暴露地址
将项目运行起来之后，会在**控制台**里查看所有可以访问的端口信息
1. 打开浏览器，访问：http://localhost:8090/sys/actuator/mappings ，输入用户名(payn)密码(123456)即可看到所有的mapping信息
2. 访问：http://localhost:8090/sys/actuator/beans ，输入用户名(payn)密码(123456)即可看到所有 Spring 管理的Bean
3. 其余可访问的路径，参见文档

### 4、参考
- actuator文档：https://docs.spring.io/spring-boot/docs/2.0.5.RELEASE/reference/htmlsingle/#production-ready
- 具体可以访问哪些路径，参考: https://docs.spring.io/spring-boot/docs/2.0.5.RELEASE/reference/htmlsingle/#production-ready-endpoints