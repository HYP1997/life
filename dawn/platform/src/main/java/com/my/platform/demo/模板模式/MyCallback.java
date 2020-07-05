package com.my.platform.demo.模板模式;


import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;

/**
 * @author 42426
 * 自定义 回调
 */
public interface MyCallback<T> {
    //此接口不用写实现类，让使用者自己去实现
    T doMyTest(Object var1);
}
