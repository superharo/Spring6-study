package online.superh.ioc.xml.factoryBean;

import online.superh.ioc.xml.User;
import org.springframework.beans.factory.FactoryBean;

/**
 * @version: 1.0
 * @author: haro
 * @description:
 * @date: 2023-10-20 16:23
 */
public class UserFactoryBean implements FactoryBean<User> {
    @Override
    public User getObject() throws Exception {
        User user = new User();
        user.setName("11");
        return user;
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}
