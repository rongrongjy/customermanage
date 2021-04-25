package customer;

/**
 * @description：
 * @auther lurongrong
 * @create 2021-04-20 12:40
 */
public class Customer {
    private String name;//姓名
    private char gender;//性别
    private int age;//年龄
    private String phone;//电话
    private String email;//邮箱

    public Customer() {
    }

    public Customer(String name, char gender, int age, String phone, String email) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }
}
