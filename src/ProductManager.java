import java.util.ArrayList;
import java.util.Comparator;

public class ProductManager extends Product{
    ArrayList<Product> products = new ArrayList<>();

    public static void main(String[] args) {
        Product pro1 = new Product(1,"Apple",12);
        Product pro2 = new Product(2,"Peach",11);
        Product pro3 = new Product(3,"Orange",1);

        ArrayList<Product> lists = new ArrayList<Product>();
        lists.add(pro1);
        lists.add(pro2);
        lists.add(pro3);
        for (Product st: lists) {
            System.out.println(st.toString());
        }

    }

    public void add(Product p) {
        products.add(p);
    }
    public void update(Product product){
        for (Product e: products) {
            if(e.getId()==product.getId()){
                e.setName(product.getName());
                e.setPrice(product.getPrice());
            }
        }
    }
    public void delete(int id){
        for (int i = 0; i < products.size(); i++) {
            if(products.get(i).getId()==id){
                products.remove(products.get(i));
            }
        }
    }
    public void search(String name){
        for (Product p: products) {
            if(p.getName().equals(name)){
                System.out.println(p.toString());
            }
        }
    }
    public void showAll(){
        for (Product p: products) {
            System.out.println(p.toString());
        }
    }
    public int compareTo(Product product){
        return Double.compare(this.getPrice(),product.getPrice());
    }
}
