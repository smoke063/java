
public class Good {
    public String name;
    public int price;
    public int sort;
    public String country;

    public int weight;

    Good(String name, int price, int sort){
        this.name = name;
        this.price = price;
        this.sort = sort;
    }

    Good(String name, int price, int sort, String country, int weight){
        this.name = name;
        this.price = price;
        this.sort = sort;
        this.country = country;
        this.weight = weight;
    }

    public Integer getPrice() {
        return this.price;
    }
    public String getName() {
        return name;
    }

    public int getSort() {
        return sort;
    }

}