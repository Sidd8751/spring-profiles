package com.example.springprofiles.service.hello;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("default")
public class BasicService extends AbstractHelloService {

    @Override
    public String sayHello() {
        return this.getClass().getSimpleName() + HELLO_MESSAGE;
    }

}
