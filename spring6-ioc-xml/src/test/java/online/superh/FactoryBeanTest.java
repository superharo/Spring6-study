package online.superh;

import online.superh.ioc.xml.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @version: 1.0
 * @author: haro
 * @description:
 * @date: 2023-10-20 16:26
 */
public class FactoryBeanTest {

    @Test
    public void testUserFactoryBean(){
        //获取IOC容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) ac.getBean("userf");
        System.out.println(user);
    }

}
