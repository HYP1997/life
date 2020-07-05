package com.my.platform;


import com.my.platform.demo.模板模式.Testservice2;
import com.my.platform.demo.策略模式配合Spring解决if.TestService3;
import com.my.platform.demo.观察者模式.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author ：hu
 * @date ：Created in 2020/7/5 15:18
 * @description：测试
 */
@SpringBootTest
public class Test {
    @Autowired
    private TestService testService;
    @Autowired
    private Testservice2 testservice2;
    @Autowired
    private TestService3 testservice3;

    @org.junit.jupiter.api.Test
    public void test(){
        testService.save("业务参数");
    }

    @org.junit.jupiter.api.Test
    public void test2(){
        testservice2.test();
    }
    @org.junit.jupiter.api.Test
    public void test3(){
        Double test = testservice3.test("Normal", 100.00);
        System.out.println("结果为："+test);
    }
}
