package com.my.platform.demo.策略模式配合Spring解决if;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author ：hu
 * @date ：Created in 2020/7/5 17:52
 * @description：策略模式
 * 流程：解决无限if的情况，定义一个接口 提供 type方法，和业务逻辑方法。 在调用接口实现类之前，改变当前service(开始调用的类)的构造函数
 * 1.创建 map集合，
 * 2.重写构造函数，参数列表为 List<接口名> ,便利 根据type 为K 对象为value存入map
 * 3.就可以直接从map中获取对应type的实现类对象
 *
 * 这里是借用了 spring getBean 的操作， 在初始化的时候，检测到构造函数中有 定义接口的List集合，就会获取到当前接口所有的实现类Bean
 * 然后，就可以根据type的方式，获取到相应的 实现类对象。 完美解决无限 if 的情况
 * spring --牛逼
 */
@Service
public class TestService3 {

    Map<String,MyAlgorithm> map = new HashMap<>(16);

    public  TestService3(List<MyAlgorithm> myAlgorithmList) {
        myAlgorithmList.forEach(myAlgorithm -> {
            map.put(myAlgorithm.type(),myAlgorithm);
        });
    }


    public Double test(String type,Double fee){
        MyAlgorithm myAlgorithm = map.get(type);

        return myAlgorithm.discount(fee);
    }
}
