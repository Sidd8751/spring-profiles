package com.example.springprofiles.service.goodbye;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("groovy")
public class DevGoodbyeService implements GoodbyeService {

    @Override public String sayGoodbye() {
        return this.getClass().getSimpleName() + GOODBYE_MESSAGE + " Groovy!";
    }

}
