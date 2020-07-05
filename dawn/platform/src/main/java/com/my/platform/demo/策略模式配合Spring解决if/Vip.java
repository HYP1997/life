package com.my.platform.demo.策略模式配合Spring解决if;

import org.springframework.stereotype.Service;

/**
 * @author ：hu
 * @date ：Created in 2020/7/5 18:49
 * @description：vip用户
 */
@Service
public class Vip implements MyAlgorithm {

    @Override
    public String type() {
        return "Vip";
    }

    @Override
    public Double discount(Double fee) {
        return fee*0.9;
    }
}
