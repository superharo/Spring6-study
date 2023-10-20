package online.superh;

import online.superh.bean.User;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @version: 1.0
 * @author: haro
 * @description:
 * @date: 2023-10-20 11:16
 */
public class TestUser {

    private Logger logger = LoggerFactory.getLogger(TestUser.class);


    /**
     * dom4j解析beans.xml文件，从中获取class属性值，类的全类名
     * 通过反射机制调用无参数构造方法创建对象
     *      Class clazz = Class.forName("online.superh.bean.User");
     *      Object obj = clazz.newInstance();
     *      Object object = clazz.getDeclaredConstructor().newInstance();
     */

    @Test
    public void testUserObject(){
        //加载sprIng的配置文件，对象创建
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        //获取创建的对象
        User user = context.getBean("user", User.class);
        System.out.println(user);
        logger.info("user：{}",user);
        //调试对象方法
        user.Say();
    }



    @Test
    public void testUserObject2(){
        Class clazz = null;
        try {
            clazz = Class.forName("online.superh.bean.User");
            User user1 = (User)clazz.newInstance();
            System.out.println(user1);
            User user2 = (User)clazz.getDeclaredConstructor().newInstance();
            System.out.println(user2);
        } catch (Exception e) {
            System.out.println("反射获取类错误");
        }
    }


}
