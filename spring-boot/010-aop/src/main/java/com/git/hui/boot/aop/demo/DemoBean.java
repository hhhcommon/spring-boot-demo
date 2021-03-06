package com.git.hui.boot.aop.demo;

import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * Created by @author yihui in 12:03 19/2/28.
 */
@Component
public class DemoBean {

    /**
     * 返回随机的字符串
     *
     * @param time
     * @return
     */
    public String randUUID(long time) {
        try {
            System.out.println("in randUUID before process!");
            return UUID.randomUUID() + "|" + time;
        } finally {
            System.out.println("in randUUID finally!");
        }
    }

}
