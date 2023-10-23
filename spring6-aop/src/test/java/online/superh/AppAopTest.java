package online.superh;

import online.superh.aop.Calculator;
import online.superh.aop.CalculatorImpl;
import online.superh.aop.ProxyFactory;
import online.superh.config.Spring6Config;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppAopTest {


    @Test
    public void test_ProxyFactory() throws Exception {
        ProxyFactory factory = new ProxyFactory(new CalculatorImpl());
        Calculator proxy = (Calculator) factory.getProxy();
        proxy.div(1,2);
    }

    @Test
    public void testAllAnnotation(){
        //注解开发
        ApplicationContext context = new AnnotationConfigApplicationContext(Spring6Config.class);
        Calculator calculator = context.getBean(Calculator.class);
        int add = calculator.add(1, 1);
        System.out.println(("执行成功:"+add));
    }

}
