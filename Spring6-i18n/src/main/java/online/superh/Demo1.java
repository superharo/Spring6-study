package online.superh;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @version: 1.0
 * @author: haro
 * @description:
 * @date: 2023-10-23 14:43
 */
public class Demo1 {

    /*
        Java自身是支持国际化的，java.util.Locale用于指定当前用户所属的语言环境等信息，java.util.ResourceBundle用于查找绑定对应的资源文件。
        Locale包含了language信息和country信息，Locale创建默认locale对象时使用的静态方法：
     */

    public static void main(String[] args) {
        System.out.println(ResourceBundle.getBundle("messages",
                new Locale("en","GB")).getString("test"));

        System.out.println(ResourceBundle.getBundle("messages",
                new Locale("zh","CN")).getString("test"));
    }

}
