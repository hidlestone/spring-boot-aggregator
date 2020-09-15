# spring-boot-demo-exception-handler

> 在SpringBoot中进行统一的异常处理，包括了两种方式的处理：第一种对常见API形式的接口进行异常处理，统一封装返回格式；第二种是对模板页面请求的异常处理，统一处理错误页面。

## @ControllerAdvice
@ControllerAdvice，是Spring3.2提供的新注解,它是一个Controller增强器,可对controller中被 @RequestMapping注解的方法加一些逻辑处理。最常用的就是异常处理.  
  
## 扩展  
@Data : 注解在类上, 为类提供读写属性, 此外还提供了 equals()、hashCode()、toString() 方法  
@Getter/@Setter : 注解在类上, 为类提供读写属性  
@ToString : 注解在类上, 为类提供 toString() 方法  
@Slf4j : 注解在类上, 为类提供一个属性名为 log 的 log4j 的日志对象  
@Log4j : 注解在类上, 为类提供一个属性名为 log 的 log4j 的日志对象  