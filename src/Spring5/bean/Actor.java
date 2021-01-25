package Spring5.bean;

/**
 * @author Eric
 * @date 2021/1/23 18:53
 */
public class Actor {
    private String name;
    private int age;

    public Actor() {
        System.out.println("第一步 无参构造法");
    }

    public void setName(String name) {
        System.out.println("第2.2步 set方法");
        this.name = name;
    }

    public void setAge(int age) {
        System.out.println("2.1");
        this.age = age;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public void initMethod(){
        System.out.println("3 初始化方法");
    }
    public void destroyMethod(){
        System.out.println("5销毁方法");
    }
}
