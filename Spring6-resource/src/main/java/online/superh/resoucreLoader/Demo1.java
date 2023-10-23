package online.superh.resoucreLoader;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.Resource;

/**
 * @version: 1.0
 * @author: haro
 * @description:
 * @date: 2023-10-23 14:19
 */
public class Demo1 {

    /*
    该接口实现类的实例可以获得一个Resource实例:
            **Resource getResource（String location）** ：
            该接口仅有这个方法，用于返回一个Resource实例。ApplicationContext实现类都实现ResourceLoader接口，因此ApplicationContext可直接获取Resource实例。
     */

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext();
//        通过ApplicationContext访问资源
//        ApplicationContext实例获取Resource实例时，
//        默认采用与ApplicationContext相同的资源访问策略
        Resource res = ctx.getResource("testClass.txt");
        System.out.println(res.getFilename());

        ApplicationContext ctx2 = new FileSystemXmlApplicationContext();
        Resource res2 = ctx2.getResource("testFile.txt");
        System.out.println(res2.getFilename());
    }

}
