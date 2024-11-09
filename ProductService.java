import java.util.ArrayList;
import java.util.List;
public class ProductService {
    List<Product> products=new ArrayList<>();
    public void addProduct(Product p){
        products.add(p);
    }
    public List<Product> getAllProducts(){
        return products;
    }
    public Product getProduct(String name){
        for(Product p : products){
            if(p.getName().equals(name))
                return p;
            }
        return null;
    }
    public List<Product> getSpecificProducts(String text){
        List<Product> specificproducts=new ArrayList<>();
        for(Product p : products){
            if(p.getName().equals(text) || p.getPlace().equals(text) || p.getType().equals(text) || p.getWarranty().equals(text))
                specificproducts.add(p);
        }
        return specificproducts;
    }

    public List<Product> getProductsWithText(String text){
        List<Product> productwithtext=new ArrayList<>();
        String str=text.toLowerCase();
        for(Product p : products){
            String name=p.getName().toLowerCase();
            String place=p.getPlace().toLowerCase();
            String type=p.getType().toLowerCase();
            String warranty=p.getWarranty().toLowerCase();
            if(name.contains(str) || place.contains(str) || type.contains(str) || warranty.contains(str))
                productwithtext.add(p);
        }
        return productwithtext;
    }


}
