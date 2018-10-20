package independentWork.advertMobile.farm;

import java.util.List;

public class Shop {
    private List<Plant> seeds;

    public Plant buySeed(Plant plant, User user) {
        if (plant.getSeedPrice() < user.getBalance()){
            plant = new Plant(null, 0, 0, true, false, false, 0);
//            user.getBalance() = user.getBalance() - plant.getSeedPrice();
            plant.setSeed(false);
            plant.setGrowing(true);
        } else {
            System.out.println("Not enough money!");
            return null;
        }
        return null;
    }

    public double sellHarvest(Plant plant) {
        double harvestPrice = plant.getHarvestPrice();
        System.out.println("Harvest sell " + harvestPrice);
        return harvestPrice;
    }
}
