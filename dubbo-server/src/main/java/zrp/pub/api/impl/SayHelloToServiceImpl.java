package zrp.pub.api.impl;

import org.springframework.stereotype.Service;

import zrp.pub.api.SayHelloToService;

@Service("sayHelloToService")
public class SayHelloToServiceImpl implements SayHelloToService {

    public String sayHello(String hello) {
        System.out.println("已经收到了,"+hello);  
        return hello+",你也好啊"; 
    }

}
