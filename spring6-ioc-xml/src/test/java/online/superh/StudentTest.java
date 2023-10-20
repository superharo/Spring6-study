package online.superh;

import online.superh.ioc.xml.Student;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @version: 1.0
 * @author: haro
 * @description:
 * @date: 2023-10-20 15:43
 */
public class StudentTest {

    @Test
    public void studentBySet(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        Student studentOne = ac.getBean("studentOne", Student.class);
        System.out.println(studentOne);
    }

    @Test
    public void testDIByConstructor(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        Student studentOne = ac.getBean("studentTwo", Student.class);
        System.out.println(studentOne);
    }

    @Test
    public void test1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        Student studentOne = ac.getBean("studentFour", Student.class);
        System.out.println(studentOne);
    }

}
