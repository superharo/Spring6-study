package online.superh;


import online.superh.ioc.xml.User;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @version: 1.0
 * @author: haro
 * @description:
 * @date: 2023-10-20 15:34
 */
public class UserTest {

    private Logger logger = LoggerFactory.getLogger(UserTest.class);

    @Test
    public void testUser() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        // User user = ac.getBean(User.class);
        User user = ac.getBean("user1",User.class);
        logger.info("User:{}",user);
    }

}
