package entities;

public class Merchandise {
    private String name;
    private double pricePurchase;
    private double priceSale;

    public Merchandise() {
    }

    public Merchandise(String name, double pricePurchase, double priceSale) {
        this.name = name;
        this.pricePurchase = pricePurchase;
        this.priceSale = priceSale;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPricePurchase() {
        return pricePurchase;
    }

    public void setPricePurchase(double pricePurchase) {
        this.pricePurchase = pricePurchase;
    }

    public double getPriceSale() {
        return priceSale;
    }

    public void setPriceSale(double priceSale) {
        this.priceSale = priceSale;
    }

    public double MerchandiseProfit(double pricePurchase, double priceSale){
        return priceSale - pricePurchase;
    }

    public double porcentMerchandiseProfit(double pricePurchase, double priceSale){
        return ((priceSale - pricePurchase) / pricePurchase * 100);
    }
}
