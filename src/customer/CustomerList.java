package customer;

/**
 * @description：内部封装一个Customer[]，提供对Customer数据的增删改查操作
 * @auther lurongrong
 * @create 2021-04-20 12:40
 */
public class CustomerList {
    private Customer[] customers;
    private int total;//记录存储的客户的个数

    /**
     * 构造器，用来初始化customers的数组
     * @param totalCustomer ：指定customers数组的最大空间
     */
    public CustomerList(int totalCustomer){
         customers = new Customer[totalCustomer];
//         total = 0;
    }

    /**
     * 添加指定的客户到数组中
     * @param customer
     * @return 添加是否成功
     */
    public boolean addCustomer(Customer customer){
        if (customer != null && total < customers.length){
            customers[total++] = customer;
            return true;
        }
        return false;
    }

    /**
     * 替换指定位置上的数组元素
     * @param index 从0开始
     * @param customer 替换元素
     * @return 是否替换成功
     */
    public boolean replaceCustomer(int index,Customer customer){
        if (index >= 0 && index < total){

        }
        return true;
    }
}
