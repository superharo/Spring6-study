package online.superh.resource;

import org.springframework.core.io.FileSystemResource;

import java.io.InputStream;

/**
 * @version: 1.0
 * @author: haro
 * @description:
 * @date: 2023-10-23 14:13
 */
public class FileSystemResourceDemo {
    /*
        Spring 提供的 FileSystemResource 类用于访问文件系统资源，
        使用 FileSystemResource 来访问文件系统资源并没有太大的优势，因为 Java 提供的 File 类也可用于访问文件系统资源。
     */

    public static void loadAndReadUrlResource(String path) throws Exception{
        //相对路径
        FileSystemResource resource = new FileSystemResource("testFile.txt");
        //绝对路径
        //FileSystemResource resource = new FileSystemResource("C:\\atguigu.txt");
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
        loadAndReadUrlResource("testFile.txt");
    }

}
