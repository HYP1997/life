package com.my.platform.demo.观察者模式;


import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author ：hu
 * @date ：Created in 2020/7/5 14:53
 * @description：监听事件:  实现Spring的 ApplicationListener 接口，并指定监听哪一个事件，来执行业务员逻辑；
 */
@Component
public class monitorListenner implements ApplicationListener<OrderEvent> {
    @Override
    public void onApplicationEvent(OrderEvent orderEvent) {
        System.out.println("进入到monitorListenner 监听事件实现，参数是："+orderEvent.toString());
    }
}
