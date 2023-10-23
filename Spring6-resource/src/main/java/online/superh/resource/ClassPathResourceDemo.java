package online.superh.resource;

import org.springframework.core.io.ClassPathResource;

import java.io.InputStream;

/**
 * @version: 1.0
 * @author: haro
 * @description:
 *      ClassPathResource 用来访问类加载路径下的资源，
 *      相对于其他的 Resource 实现类，其主要优势是方便访问类加载路径里的资源，
 *      尤其对于 Web 应用，ClassPathResource 可自动搜索位于 classes 下的资源文件，无须使用绝对路径访问。
 * @date: 2023-10-23 14:09
 */
public class ClassPathResourceDemo {

    public static void loadAndReadUrlResource(String path) throws Exception{
        // 创建一个 Resource 对象
        ClassPathResource resource = new ClassPathResource(path);
        // 获取文件名
        System.out.println("resource.getFileName = " + resource.getFilename());
        // 获取文件描述
        System.out.println("resource.getDescription = "+ resource.getDescription());
        //获取文件内容
        InputStream in = resource.getInputStream();
        byte[] b = new byte[1024];
        while(in.read(b)!=-1) {
            System.out.println(new String(b));
        }
    }

    public static void main(String[] args) throws Exception {
        loadAndReadUrlResource("testClass.txt");
    }

}
