package com.example.springprofiles.service.hello;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("prod")
public class ProdService implements HelloService {

    @Override public String sayHello() {
        return this.getClass().getSimpleName() + HELLO_MESSAGE;
    }
}