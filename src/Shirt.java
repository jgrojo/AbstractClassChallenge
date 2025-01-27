public class Shirt extends ProductForSale{
    public Shirt(String type, double price, String description){
        super(type, price, description);
    }

    @Override
    public void showDetails(){
        System.out.println("This " + type + " shirt is a " + description + " and costs $" + price);
    }
}
