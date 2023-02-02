import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Manager_Customer {
    private List<Customer> customerList;
    public Manager_Customer(){
        this.customerList = new ArrayList<>();
    }
    public void addCustomer(Customer customer){
        this.customerList.add(customer);
    }
    public boolean deleteCustomerByName(String name){
        Customer customer = this.customerList.stream()
                .filter(customerList->customerList.getName().equals(name))
                .findAny().orElse(null);
        if(customer == null){
            return false;
        }
        this.customerList.remove(customer);
        return true;
    }
    public boolean deleteCustomerById(String id){
        Customer customer = this.customerList.stream()
                .filter(customerList->customerList.getName().equals(id))
                .findAny().orElse(null);
        if(customer == null){
            return false;
        }
        this.customerList.remove(customer);
        return true;
    }
    public void showInfor(){
        this.customerList.forEach(customerList-> System.out.println(customerList.toString()));
    }
    public void searchByName(String name){
        this.customerList.stream().filter(o->o.getName().contains(name)).collect(Collectors.toList());
    }
    public void searchById(String id){
        this.customerList.stream().filter(o->o.getName().contains(id)).collect(Collectors.toList());
    }


}
