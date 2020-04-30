package com.example.dubboproviderservice.service;

import com.example.common.api.HelloService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

@Service(version = "${provider.service.version}" )
public class HelloServiceImpl implements HelloService {

    @Value("${dubbo.protocol.port}")
    protected String port;

    @Override
    public String sayHi() {
        return " dubbo provider service , service protocol prot : " + port;
    }
}
