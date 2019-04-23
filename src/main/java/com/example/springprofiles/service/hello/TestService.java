package com.example.springprofiles.service.hello;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("test")
public class TestService implements HelloService {

    @Override public String sayHello() {
        return this.getClass().getSimpleName() + HELLO_MESSAGE;
    }
}
