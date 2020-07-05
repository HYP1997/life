package com.my.platform.demo.观察者模式;


import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author ：hu
 * @date ：Created in 2020/7/5 14:59
 * @description： 推送事件：
 */
@Component
public class PushListenner implements ApplicationListener<OrderEvent> {
    @Override
    public void onApplicationEvent(OrderEvent orderEvent) {
        System.out.println("进入到PushListenner 推送事件实现，参数是："+orderEvent.toString());
    }
}
