package ro.ase.cts.sem3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here
        OShop o = new OShop("Emag", "logo.jpg", new ArrayList<Product>());

        Product p1 = new Product("Laptop", 3200.5, 1,1, 1123, "");
        Product p2 = new Product("Frigider", 207.95, 1,2, 1245, "");

        Product p3 = new Product(p1);

        p3.setQuantity(5);
        p3.setName("Paine");

        o.modifyProductsList(1,p1);
        o.modifyProductsList(1,p2);

        o.modifyProductsList(2, p1);
        System.out.println(p1.equals(p2));
    }
}

class OShop {
    private String onlineShopName;
    private String i;
    private ArrayList<Product> products;

    OShop(String name, String img, ArrayList<Product> products)
    {
        this.products = new ArrayList<Product>();
        this.i = img;
        this.onlineShopName = name;
    }

    public void modifyProductsList(int what, Product p)
    {
        if(what == 1)
        {
            this.products.add(p);
        }
        else
            this.products.remove(p);
    }

    public String getOnlineShopName() {
        return onlineShopName;
    }

    public void setOnlineShopName(String onlineShopName) {
        this.onlineShopName = onlineShopName;
    }

    public String getI() {
        return i;
    }

    public void setImg(String img) {
        this.i = img;
    }
}

class Product
{
    private int id;
    private String name;
    private double price;
    private int type;
    private int category;
    private int quantity;
    private String expiryDate; //expiry date - only for goods
    private String details; // ex.: processor, memory, power, volume (for refrigerators etc)

    public Product(String name, double price, int type, int category,int id, String expiryDate) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.type = type;
        this.category = category;
        this.expiryDate = expiryDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product(Product p)
    {
        this.id = p.id;
        this.name = p.name;
        this.price = p.price;
        this.type = p.type;
        this.category = p.category;
        this.expiryDate =p.expiryDate;

    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
    //    public boolean equals(Prod p)
//    {
//        if(p.prodId != this.prodId)
//            return false;
//        if(!p.prodName.equals(this.prodName))
//            return false;
//        if(p.productPrice != this.productPrice)
//            return false;
//        if(p.productType != p.productType)
//            return false;
//        if(p.productCategory != this.productCategory)
//            return false;
//
//        return true;
//    }

    public void modify(boolean flag, double val)
    {
        if(flag)
            this.price+=this.price*val;
        if(!flag)
            this.price-=price*val/100;
    }


}

class User
{
    private String usn;
    private String userId;
    private ArrayList<Order> o;
    private ArrayList<Order> c;

    public User(String usn, String userId)
    {
        this.usn = usn;
        this.userId = userId;
        o=new ArrayList<Order>();
        c=new ArrayList<Order>();
    }

    public void addO1(Order o)
    {
        this.o.add(o);
    }

    public void addO2(Order o)
    {
        this.c.add(o);
    }
}

class Order
{
    private ArrayList<Product> list;
    private String addr;

    public Order()
    {
        list = new ArrayList<Product>();
    }
    public void add(Product p)
    {
        if(list.size() > 99)
            return;

        list.add(p);
    }

    public void remove(Product p)
    {
        list.remove(p);
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}

class InventoryProduct
{
    private Product p;

    private int q;

    public InventoryProduct(Product p, int q)
    {
        this.p = new Product(p);
        this.q = q;
    }
    public Product getP() {
        return p;
    }

    public void setP(Product p) {
        this.p = p;
    }

    public int getQ() {
        return q;
    }

    public void setQ(int q) {
        this.q = q;
    }
}


