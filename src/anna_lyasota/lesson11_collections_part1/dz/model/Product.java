package anna_lyasota.lesson11_collections_part1.dz.model;

public abstract class Product {
    //1) Абстрактный класс Product (id, name, price;)
    // - помимо get и set методов, создать абстарктный метод getTotalSum()
    private Integer id;
    private String name;
    private double price;

    public Product(Integer id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Product() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract double getTotalSum();
}
