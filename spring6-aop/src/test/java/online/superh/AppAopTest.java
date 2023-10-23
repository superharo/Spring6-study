package online.superh;

import online.superh.aop.Calculator;
import online.superh.aop.CalculatorLogImpl;
import online.superh.aop.ProxyFactory;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppAopTest {


    @Test
    public void test_ProxyFactory() throws Exception {
        ProxyFactory factory = new ProxyFactory(new CalculatorLogImpl());
        Calculator proxy = (Calculator) factory.getProxy();
        proxy.div(1,2);
    }

}
