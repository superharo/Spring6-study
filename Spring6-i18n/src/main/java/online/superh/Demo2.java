package online.superh;

import online.superh.config.Spring6Config;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Date;
import java.util.Locale;

/**
 * @version: 1.0
 * @author: haro
 * @description:
 * @date: 2023-10-23 14:50
 */
public class Demo2 {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Spring6Config.class);
        //传递动态参数，使用数组形式对应{0} {1}顺序
        Object[] objs = new Object[]{"haro",new Date().toString()};
        //hello为资源文件的key值,
        //objs为资源文件value值所需要的参数,Local.CHINA为国际化为语言
        String str=context.getMessage("hello", objs, Locale.CHINA);
        System.out.println(str);

        String str2=context.getMessage("hello", objs, Locale.UK);
        System.out.println(str2);
    }


}
