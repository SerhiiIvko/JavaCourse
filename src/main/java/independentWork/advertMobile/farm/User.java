package independentWork.advertMobile.farm;

public class User {
    private String name;
    private double balance;

    public User(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Plant planting(Shop shop, Plant plant){
//        if (plant.getSeedPrice() < balance){
//            plant = new Plant(null, 0, 0, true, false, false, 0);
//            balance = balance - plant.getSeedPrice();
//            plant.setSeed(false);
//            plant.setGrowing(true);
//        } else {
//            System.out.println("Not enough money!");
//            return null;
//        }
        return plant;
    }

    public double harvesting(Plant plant, Shop shop){
        double harvestPrice = shop.sellHarvest(plant);
//        double harvestCoast = balance + harvestPrice;
        balance = balance + harvestPrice;
        return shop.sellHarvest(plant);
    }
}
