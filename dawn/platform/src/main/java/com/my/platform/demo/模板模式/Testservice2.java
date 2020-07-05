package com.my.platform.demo.模板模式;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author ：hu
 * @date ：Created in 2020/7/5 16:00
 * @description：模板模式： 常见的模板模式 RedisTemplate  JDBCTemplate， 封装一些重复的代码，暴露可变参数成接口交给程序员实现并返回信息
 * 流程： 一些固定的操作可以定义一个 Template 模板类，定义执行方法参数中填写一个接口，里面操作固定逻辑，当需要用户输入参数时，参数接口类，去调用方法。 这个方法由使用者去实现。获取一些参数并返回。
 * 使用场景： 封装某些固定操作 如连接jdbc redis。 一般代码涉及不到，可能需要到架构级别，为程序员封装
 */
@Service
public class Testservice2 {

    @Autowired
    private MyTemplate myTemplate;
    public String test(){
        //项目中出现很多重复步骤的代码， 比如 创建xx对象，创建连接，解析固定参数 等等。可以用到模板模式
        //借用 spring 的模板模式

        List<Object> data = ( List<Object> )myTemplate.execute(new MyCallback<Object>() {
            @Override
            public Object doMyTest(Object var1) {
                List<Object> data = (List<Object>) var1;
                data.add("a");
                data.add("成功的调用了回调函数");
                return data;
            }
        });
        data.forEach(a ->{
            System.out.println(a.toString());
        });
        return "成功";
    }

   /* RedisTemplate redisTemplate;
    public void save(){
        redisTemplate.execute(new RedisCallback() {
            @Override
            public Object doInRedis(RedisConnection redisConnection) throws DataAccessException {
                return null;
            }
        });
    }*/
}
