package independentWork.advertMobile.farm;

public class Plant {
    private String name;
    private double seedPrice;
    private double harvestPrice;
    private boolean isSeed;
    private boolean isGrowing;
    private boolean isRipen;
    private long ripenTime;

    public Plant(String name, double seedPrice, double harvestPrice, boolean isSeed, boolean isGrowing, boolean isRipen, long ripenTime) {
        this.name = name;
        this.seedPrice = seedPrice;
        this.harvestPrice = harvestPrice;
        this.isSeed = isSeed;
        this.isGrowing = isGrowing;
        this.isRipen = isRipen;
        this.ripenTime = ripenTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSeedPrice() {
        return seedPrice;
    }

    public void setSeedPrice(double seedPrice) {
        this.seedPrice = seedPrice;
    }

    public double getHarvestPrice() {
        return harvestPrice;
    }

    public void setHarvestPrice(double harvestPrice) {
        this.harvestPrice = harvestPrice;
    }

    public boolean isSeed() {
        return isSeed;
    }

    public void setSeed(boolean seed) {
        isSeed = seed;
    }

    public boolean isGrowing() {
        return isGrowing;
    }

    public void setGrowing(boolean growing) {
        isGrowing = growing;
    }

    public boolean isRipen() {
        return isRipen;
    }

    public void setRipen(boolean ripen) {
        isRipen = ripen;
    }

    public long getRipenTime() {
        return ripenTime;
    }

    public void setRipenTime(long ripenTime) {
        this.ripenTime = ripenTime;
    }

    public void growing(Plant plant){
        if (isSeed == false && isGrowing == true){
            ripenTime = 0;
        }
    }
}
