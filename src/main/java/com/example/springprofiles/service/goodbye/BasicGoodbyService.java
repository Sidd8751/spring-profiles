package com.example.springprofiles.service.goodbye;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class BasicGoodbyService implements GoodbyeService {

    @Override public String sayGoodbye() {
        return this.getClass().getSimpleName() + GOODBYE_MESSAGE;
    }
}
