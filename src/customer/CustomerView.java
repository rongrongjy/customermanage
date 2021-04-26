package customer;

/**
 * @description：
 * @auther lurongrong
 * @create 2021-04-20 12:41
 */

public class CustomerView {
    private CustomerList custList  = new CustomerList(10);
    public CustomerView(){
        Customer customer = new Customer("柯南",'男',23,"12345678912","ken@abc.com");
        custList.addCustomer(customer);
    }
    /**
     * 进入主界面的方法
     */
    public void enterMainMenu(){
        boolean isFlag = true;
        do{
            System.out.println("\n--------------客户信息管理软件---------------------\n");
            System.out.println("                1 添加客户");
            System.out.println("                2 修改客户");
            System.out.println("                3 删除客户");
            System.out.println("                4 客户列表");
            System.out.println("                5 退   出\n");
            System.out.print("                 请选择（1-5）：");

            //从键盘获取用户1-5的选择
            char menu = CMUtility.readMenuSelection();
            //使用switch-case对客户的选择进行区别处理
            switch (menu){
                case '1':
                    addNewCustomer();
                    break;
                case '2':
//                    modifyCustomer();
                    break;
                case '3':
//                    deleteCustomer();
                    break;
                case '4':
//                    listAllCustomer();
                    break;
                case '5':
                    System.out.print("确认是否退出（Y/N）：");
                    char exit = CMUtility.readConfirmSelection();
                    if (exit == 'Y'){
                        isFlag = false;
                    }
                    break;
            }
        }while (isFlag);
    }
    private void addNewCustomer(){
        System.out.println("----------------添加客户-----------------");
        System.out.println("姓名：");
        String name = CMUtility.readString(5);
        System.out.println("性别：");
        char gender = CMUtility.readChar();
        System.out.println("年龄：");
        int age = CMUtility.readInt();
        System.out.println("电话：");
        String phone = CMUtility.readString(15);
        System.out.println("邮箱：");
        String email = CMUtility.readString(20);

        //封装为一个对象
        Customer customer = new Customer(name, gender, age, phone, email);
        //将此对象添加到CustomerList里的数组中
        boolean flag = custList.addCustomer(customer);
        if (flag){
            System.out.println("-----------------添加完成---------------------");
        }else {
            System.out.println("人数已达上限，添加失败！");
        }

    }

}
