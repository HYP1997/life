package com.my.platform.demo.观察者模式;


import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;

/**
 * @author ：hu
 * @date ：Created in 2020/7/5 14:28
 * @description：需要通知的事件
 * extends ApplicationEvent  是借用了 spring  的时间
 * 该事件 需要由 ApplicationContext 容器上下文来发布。详见 业务层
 */

public class OrderEvent extends ApplicationEvent {

    /**
     *
     * @param source
     */
    public OrderEvent(Object source) {
        super(source);
        System.out.println("进入到OrderEvent事件，参数是："+source.toString());
    }
}
