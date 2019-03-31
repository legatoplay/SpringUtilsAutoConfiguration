# SpringUtilsAutoConfiguration
普通类中获取spring bean对象


```java
IHelloService service = SpringContextUtil.getBeanByClass(IHelloService.class);
```
