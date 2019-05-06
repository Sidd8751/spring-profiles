package com.example.springprofiles.lintexamples;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Map;

public class Example1 implements Comparable<Example1> {

    private static final Logger logger = LoggerFactory.getLogger(Example1.class.getName());

    public Boolean badConditional(String message) {

        Boolean isValid = false;
        if (message.contains("a")) {

            Boolean conditionA = true;
            if (message.contains("b")) {

                if (message.contains("c")) {

                    if (message.contains("d")) {
                        isValid = true;
                    }
                }
            }
        }

        return isValid;
    }

    @Override public int compareTo(Example1 o) {
        return 0;
    }

    public Map<String, ArrayList<Map<String, String>>> cleanWhiteSpace(Map<String, ArrayList<Map<String, String>>> bfc) {

        bfc.forEach((k, v) -> {

            v.forEach((v1) -> {

                v1.forEach((k2, v2) -> {

                    logger.info(k2 + ":" + v2);
                    v2 = v2.replaceAll("\\s+", "_");
                    System.out.println(k2 + ":" + v2 + " altered key/value pair");

                });

            });

        });


    }
}
