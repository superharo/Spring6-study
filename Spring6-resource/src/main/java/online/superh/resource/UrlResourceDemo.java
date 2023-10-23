package online.superh.resource;

import org.springframework.core.io.UrlResource;

/**
 * @version: 1.0
 * @author: haro
 * @description:
 *
 * @date: 2023-10-23 14:02
 */
public class UrlResourceDemo {

    /*
    Resource的一个实现类，用来访问网络资源，它支持URL的绝对路径。

    http:------该前缀用于访问基于HTTP协议的网络资源。

    ftp:------该前缀用于访问基于FTP协议的网络资源

    file: ------该前缀用于从文件系统中读取资源
     */
    public static void loadAndReadUrlResource(String path){
        // 创建一个 Resource 对象
        UrlResource url = null;
        try {
            url = new UrlResource(path);
            // 获取资源名
            System.out.println(url.getFilename());
            System.out.println(url.getURI());
            // 获取资源描述
            System.out.println(url.getDescription());
            //获取资源内容
            System.out.println(url.getInputStream().read());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // public static void main(String[] args) {
    //     //访问网络资源
    //     loadAndReadUrlResource("http://www.baidu.com");
    // }

    public static void main(String[] args) {
        //1 访问网络资源
        //loadAndReadUrlResource("http://www.atguigu.com");

        //2 访问文件系统资源(整个项目的根路径下)
        loadAndReadUrlResource("file:test.txt");
    }

}
