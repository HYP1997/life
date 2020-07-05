package com.my.platform.demo.观察者模式;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

/**
 * @author ：hu
 * @date ：Created in 2020/7/5 14:23
 * @description 业务层执行业务
 */
@Service
public class TestService {

    /**
     *
     */
    @Autowired
    private ApplicationContext applicationContext;

    /**
     *观察者模式:定义对象之间的一对多的依赖关系，当一个对象的状态改变的时，所有依赖于他的对象都可以得到通知并自动更新
     *
     */
    public String save(String parameter){

        //完成xxxxx业务逻辑
        System.out.println("完成业务操作");

        //完成业务逻辑后需要发起通知，发送短信, 直接写代码耦合度高，且不宜后期拆解 通过观察者模式发布事件，让事件去执行 他本身的职责
        applicationContext.publishEvent(new OrderEvent("发送信息"));

        return "完成业务";
    }
}
