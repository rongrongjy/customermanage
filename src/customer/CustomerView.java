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
    }

}
