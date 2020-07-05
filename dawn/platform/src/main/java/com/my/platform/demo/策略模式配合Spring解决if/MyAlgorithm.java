package com.my.platform.demo.策略模式配合Spring解决if;

/**
 * @author ：hu
 * @date ：Created in 2020/7/5 18:47
 * @description：算法接口
 */
public interface MyAlgorithm {
    public String type();
    public Double discount(Double fee);
}
