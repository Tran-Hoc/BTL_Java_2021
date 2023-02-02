import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Manager_product {
    private List<Product> productList;
    private int in_stock, out_stock;// slg trong kho, slg đã xuất, nhập thêm.
    public Manager_product(){
        this.productList = new ArrayList<>();
        this.in_stock = 0;
        this.out_stock = 0;
    }
    // tìm kiếm sản phẩm,  them, xóa, cập nhật slg hàng
    public void addProduct(Product product){
        this.productList.add(product);
        in_stock ++;
    }
    public List<Product> searchProductByName(String name){
        return this.productList.stream().filter(o->o.getName().contains(name)).collect(Collectors.toList());
    }
    public boolean deleteListProductByName(String name){
        Product product = this.productList.stream()
                .filter(productList-> productList.getName().equals(name))
                .findFirst().orElse(null);
        if(product ==null){
            return false;
        }
        this.productList.remove(product);
        return true;
    }
    public void showListInforProduct(){
        this.productList.forEach(o->System.out.println(o.toString()));
    }

}
