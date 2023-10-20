package online.superh.ioc.xml;

/**
 * @version: 1.0
 * @author: haro
 * @description:
 * @date: 2023-10-20 15:33
 */
public class User {


    private String name;

    public User() {
        System.out.println("无参数构造方法执行");
    }


    public void Say(){
        System.out.println("Hello");
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
