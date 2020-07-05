package com.my.platform.demo.模板模式;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * @author ：hu
 * @date ：Created in 2020/7/5 16:11
 * @description：自定义模板
 */
@Component
public class MyTemplate {
    public <T> T execute(MyCallback<T> action) {
        List<Object> data = new ArrayList<>();
        //xxxx自定义逻辑 如创建一些对象,配置了一些参数
        data.add(new Date());
        //调用自定义回调接口，让使用者自定义数据并返回给我
        T result = action.doMyTest(data);

        //准备返回
        return (T) result;
    }

}
