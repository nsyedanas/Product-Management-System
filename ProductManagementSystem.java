import java.util.List;

class ProductManagementSystem{
    public static void main(String[] args) {
        ProductService service=new ProductService();
        service.addProduct(new Product("Asus","Laptop","D_block 4th row","2024"));
        service.addProduct(new Product("chocolate","Laptop","D_block 3rd row","2025"));
        service.addProduct(new Product("Acer","Laptop","D_block 2nd row","2025"));
        service.addProduct(new Product("Diary Milk","Chocolate","C_block 4th row","2022"));
        service.addProduct(new Product("5 Star","Chocolate","C_block 3rd row","2024"));
        service.addProduct(new Product("Perk","Chocolate","C_block 2nd row","2023"));
        
        List<Product> products=service.getAllProducts();
        for (Product p : products)
            System.out.println(p);
        
        System.out.println("===================================================================================");
        Product product=service.getProduct("5 Star");
        System.out.println(product);

        System.out.println("===================================================================================");
        List<Product> specificproducts=service.getSpecificProducts("Chocolate");
        for(Product p : specificproducts)
            System.out.println(p);

        System.out.println("===================================================================================");
        List<Product> productwithtext=service.getProductsWithText("CHOCOLATE");
        for(Product p : productwithtext)
            System.out.println(p);    
    }
}