# dubbo-rest-demo

## api-test.http
* src/test/java/http/api-test.http
* http://127.0.0.1:8099/com.poazy.dubbo.rest.demo.api.RestDemoService/queryPrice
* You can use api-test.http to run the test multiple times, or use the test tool to run the test multiple times concurrently, and errors will occur occasionally.  Thank you!

## Occasional erroneous responses
```bash
POST http://127.0.0.1:8099/com.poazy.dubbo.rest.demo.api.RestDemoService/queryPrice

HTTP/1.1 500 
alt-svc: h2=":8099"
Content-Type: application/json
Content-Length: 232
Date: Wed, 28 May 2025 00:48:46 GMT
Connection: close

{
  "message": "Name for argument of type [class com.poazy.dubbo.rest.demo.api.entity.DrdRQ] not specified, and parameter name information not available via reflection. Ensure that the compiler uses the -parameters flag",
  "status": "500"
}
Response file saved.
```

## Occasional code exceptions
```bash
2025-05-28T08:49:25.574+08:00 ERROR 97955 --- [dubbo-rest-demo] [8099-thread-120] .r.p.t.h.AbstractServerTransportListener :  [DUBBO] An error occurred while processing the http request with DefaultHttp11ServerTransportListener, org.apache.dubbo.rpc.protocol.tri.servlet.jakarta.HttpMetadataAdapter@10b31972, headers=DefaultHttpHeaders{headers=HeadersMap[content-type: application/json, content-length: 18, user-agent: IntelliJ HTTP Client/IntelliJ IDEA 2025.1, accept-encoding: br, deflate, gzip, x-gzip, accept: */*, host: 127.0.0.1:8099, :method: POST, :scheme: http, :authority: 127.0.0.1, :protocol: HTTP/1.1]}, method=com.poazy.dubbo.rest.demo.api.RestDemoService.queryPrice(DrdRQ), service=RestDemoServiceImpl@3e574f9c, url='tri://192.168.9.133:8099/com.poazy.dubbo.rest.demo.api.RestDemoService?anyhost=true&application=dubbo-rest-demo-dubbo&background=false&bind.ip=192.168.9.133&bind.port=8099&check.serializable=false&deprecated=false&dubbo=2.0.2&dynamic=true&executor-management-mode=isolation&file-cache=true&generic=false&interface=com.poazy.dubbo.rest.demo.api.RestDemoService&logger=slf4j&methods=queryPrice&pid=97955&prefer.serialization=hessian2,fastjson2&qos.enable=false&qos.port=-1&release=3.3.4&retries=0&serialize.check.status=DISABLE&service-name-mapping=true&side=provider&timeout=50000&timestamp=1748392604083', dubbo version: 3.3.4, current host: 192.168.9.133, error code: 99-0. This may be caused by , go to https://dubbo.apache.org/faq/99/0 to find instructions. 

org.apache.dubbo.rpc.protocol.tri.rest.RestException: Name for argument of type [class com.poazy.dubbo.rest.demo.api.entity.DrdRQ] not specified, and parameter name information not available via reflection. Ensure that the compiler uses the -parameters flag
	at org.apache.dubbo.rpc.protocol.tri.rest.mapping.meta.NamedValueMeta.name(NamedValueMeta.java:59) ~[dubbo-3.3.4.jar:3.3.4]
	at org.apache.dubbo.rpc.protocol.tri.rest.support.basic.FallbackArgumentResolver.doResolveValue(FallbackArgumentResolver.java:118) ~[dubbo-3.3.4.jar:3.3.4]
	at org.apache.dubbo.rpc.protocol.tri.rest.support.basic.FallbackArgumentResolver.resolveValue(FallbackArgumentResolver.java:73) ~[dubbo-3.3.4.jar:3.3.4]
	at org.apache.dubbo.rpc.protocol.tri.rest.argument.NamedValueArgumentResolverSupport.resolve(NamedValueArgumentResolverSupport.java:45) ~[dubbo-3.3.4.jar:3.3.4]
	at org.apache.dubbo.rpc.protocol.tri.rest.argument.AbstractArgumentResolver.resolve(AbstractArgumentResolver.java:28) ~[dubbo-3.3.4.jar:3.3.4]
	at org.apache.dubbo.rpc.protocol.tri.rest.argument.CompositeArgumentResolver.resolve(CompositeArgumentResolver.java:76) ~[dubbo-3.3.4.jar:3.3.4]
	at org.apache.dubbo.rpc.protocol.tri.rest.RestHttpMessageCodec.decode(RestHttpMessageCodec.java:87) ~[dubbo-3.3.4.jar:3.3.4]
	at org.apache.dubbo.remoting.http12.message.HttpMessageDecoder.decode(HttpMessageDecoder.java:56) ~[dubbo-3.3.4.jar:3.3.4]
	at org.apache.dubbo.remoting.http12.message.DefaultListeningDecoder.decode(DefaultListeningDecoder.java:41) ~[dubbo-3.3.4.jar:3.3.4]
	at org.apache.dubbo.rpc.protocol.tri.h12.DefaultHttpMessageListener.onMessage(DefaultHttpMessageListener.java:39) ~[dubbo-3.3.4.jar:3.3.4]
	at org.apache.dubbo.rpc.protocol.tri.h12.AbstractServerTransportListener.doOnData(AbstractServerTransportListener.java:183) ~[dubbo-3.3.4.jar:3.3.4]
	at org.apache.dubbo.rpc.protocol.tri.h12.AbstractServerTransportListener.lambda$onData$1(AbstractServerTransportListener.java:168) ~[dubbo-3.3.4.jar:3.3.4]
	at org.apache.dubbo.common.threadpool.serial.SerializingExecutor.run(SerializingExecutor.java:111) ~[dubbo-3.3.4.jar:3.3.4]
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136) ~[na:na]
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635) ~[na:na]
	at org.apache.dubbo.common.threadlocal.InternalRunnable.run(InternalRunnable.java:39) ~[dubbo-3.3.4.jar:3.3.4]
	at java.base/java.lang.Thread.run(Thread.java:840) ~[na:na]

2025-05-28T08:49:25.575+08:00  INFO 97955 --- [dubbo-rest-demo] [8099-thread-120] o.a.d.r.p.t.h.CompositeExceptionHandler  :  [DUBBO] Http request process error: status=500, dubbo version: 3.3.4, current host: 192.168.9.133

org.apache.dubbo.rpc.protocol.tri.rest.RestException: Name for argument of type [class com.poazy.dubbo.rest.demo.api.entity.DrdRQ] not specified, and parameter name information not available via reflection. Ensure that the compiler uses the -parameters flag
	at org.apache.dubbo.rpc.protocol.tri.rest.mapping.meta.NamedValueMeta.name(NamedValueMeta.java:59) ~[dubbo-3.3.4.jar:3.3.4]
	at org.apache.dubbo.rpc.protocol.tri.rest.support.basic.FallbackArgumentResolver.doResolveValue(FallbackArgumentResolver.java:118) ~[dubbo-3.3.4.jar:3.3.4]
	at org.apache.dubbo.rpc.protocol.tri.rest.support.basic.FallbackArgumentResolver.resolveValue(FallbackArgumentResolver.java:73) ~[dubbo-3.3.4.jar:3.3.4]
	at org.apache.dubbo.rpc.protocol.tri.rest.argument.NamedValueArgumentResolverSupport.resolve(NamedValueArgumentResolverSupport.java:45) ~[dubbo-3.3.4.jar:3.3.4]
	at org.apache.dubbo.rpc.protocol.tri.rest.argument.AbstractArgumentResolver.resolve(AbstractArgumentResolver.java:28) ~[dubbo-3.3.4.jar:3.3.4]
	at org.apache.dubbo.rpc.protocol.tri.rest.argument.CompositeArgumentResolver.resolve(CompositeArgumentResolver.java:76) ~[dubbo-3.3.4.jar:3.3.4]
	at org.apache.dubbo.rpc.protocol.tri.rest.RestHttpMessageCodec.decode(RestHttpMessageCodec.java:87) ~[dubbo-3.3.4.jar:3.3.4]
	at org.apache.dubbo.remoting.http12.message.HttpMessageDecoder.decode(HttpMessageDecoder.java:56) ~[dubbo-3.3.4.jar:3.3.4]
	at org.apache.dubbo.remoting.http12.message.DefaultListeningDecoder.decode(DefaultListeningDecoder.java:41) ~[dubbo-3.3.4.jar:3.3.4]
	at org.apache.dubbo.rpc.protocol.tri.h12.DefaultHttpMessageListener.onMessage(DefaultHttpMessageListener.java:39) ~[dubbo-3.3.4.jar:3.3.4]
	at org.apache.dubbo.rpc.protocol.tri.h12.AbstractServerTransportListener.doOnData(AbstractServerTransportListener.java:183) ~[dubbo-3.3.4.jar:3.3.4]
	at org.apache.dubbo.rpc.protocol.tri.h12.AbstractServerTransportListener.lambda$onData$1(AbstractServerTransportListener.java:168) ~[dubbo-3.3.4.jar:3.3.4]
	at org.apache.dubbo.common.threadpool.serial.SerializingExecutor.run(SerializingExecutor.java:111) ~[dubbo-3.3.4.jar:3.3.4]
	at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1136) ~[na:na]
	at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:635) ~[na:na]
	at org.apache.dubbo.common.threadlocal.InternalRunnable.run(InternalRunnable.java:39) ~[dubbo-3.3.4.jar:3.3.4]
	at java.base/java.lang.Thread.run(Thread.java:840) ~[na:na]
```