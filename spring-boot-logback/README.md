# spring-boot-logback
> 使用 logback 记录程序运行过程中的日志，以及配置 logback，可以同时生成控制台日志和文件日志记录，文件日志以日期和大小进行拆分生成。

### logback-spring.xml
```xml
<!--定义日志文件的存储地址,使用绝对路径-->
<!--<property name="LOG_HOME" value="D:/log"/>-->
<property name="LOG_HOME" value="/opt/inkblog/log"/>
...
<fileNamePattern>${LOG_HOME}/inkblog.%d{yyyy-MM-dd}.log</fileNamePattern>

<!--定义日志文件的存储地址,使用相对路径-->
<FileNamePattern>logs/spring-boot-demo-logback/info.created_on_%d{yyyy-MM-dd}.part_%i.log</FileNamePattern>
<!--
生成的日志文件路径如下
logs/spring-boot-demo-logback/info.created_on_2020-09-15.part_0.log
-->
```

### @Slf4j 注解
@Slf4j是用作日志输出的，一般会在项目每个类的开头加入该注解，如果不写下面这段代码，并且想用log
```java
private final Logger logger = LoggerFactory.getLogger(当前类名.class);
```
就可以用@Slf4来代替;这样就省去这段很长的代码。添加了该注释之后，就可以在代码中直接饮用log.info( ) 打印日志了