1、dubbo使用demo
common 是提供者和消费者公用的接口


demo1 dubbo的基本使用示例
demo2 dubbo异步调用使用示例
demo3 dubbo本地存根使用示例，在消费者执行部分逻辑继而判断是否调用提供者服务
demo4 dubbo本地伪装，当调用服务发生非业务逻辑异常RpcException（网络失败，超时）时进行容错
demo5 dubbo访问提供者（dubbo-mybatis-provider）方法，提供者整合mybatis访问数据库