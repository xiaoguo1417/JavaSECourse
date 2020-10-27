import java.util.ArrayList;

public class StockManager {

    private ArrayList<Product> stocks = new ArrayList<Product>();
    boolean newProduct = true;

    public void addProduct(Product item)
    {
        stocks.add(item);
    }

    public void delivery(int id, int amount)
    {
        for (Product stock : stocks){
            if(stock.getId()==id)
            {
                stock.increaseQuantity(amount);
            }
        }
    }

    public Product findProduct(int id)
    {
        for (Product stock : stocks){
            if(stock.getId()==id)
            {
                return stock;
            }
        }
        return null;
    }

    public int numberInStock(int id)
    {
        for (Product stock : stocks){
            if(stock.getId()==id)
            {
                return stock.getQuantity();
            }
        }
        //?????
        return 0;
    }

    public void printProductDetails()
    {
        for (Product stock : stocks) {
            System.out.println(stock.toString());
        }
    }

    public void printLowStockProducts(int limit)
    {
        for (Product stock : stocks)
        {
            if(stock.getQuantity() <= limit)
            {
                System.out.println(stock.toString());
            }
        }
    }

    public Product findProductByName(String name)
    {
        for (Product stock : stocks){
            if(stock.getName().equals(name))
            {
                return stock;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        StockManager manager = new StockManager();
        //加入新的元素
        manager.addProduct(new Product(132, "Clock Radio"));
        manager.addProduct(new Product(37,  "Mobile Phone"));
        manager.addProduct(new Product(23,  "Microwave Oven"));
        //打印所有元素
        manager.printProductDetails();
        //增加id为132的数量
        manager.delivery(132, 5);
        //再次打印所有元素
        manager.printProductDetails();
        //打印数量小于2的产品
        manager.printLowStockProducts(2);
        //根据id找产品
        System.out.println(manager.findProduct(132));
        //根据名字找产品
        System.out.println(manager.findProductByName("Clock Radio"));
    }
}
