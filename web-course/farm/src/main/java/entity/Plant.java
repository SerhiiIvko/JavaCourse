package entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Plant implements Serializable {
    private static final long serialVersionUID = 8782385695782598376L;
    private int id;
    private String name;
    private double seedPrice;
    private double harvestPrice;
    private boolean isGrowing;
    private boolean isRipen;
    private long ripenTime;
    private Date startGrowingTime;
    private Date endGrowingTime;

    public Plant(int id, String name, double seedPrice, double harvestPrice, boolean isGrowing, boolean isRipen,
                 long ripenTime, Date startGrowingTime, Date endGrowingTime) {
        this.id = id;
        this.name = name;
        this.seedPrice = seedPrice;
        this.harvestPrice = harvestPrice;
        this.isGrowing = isGrowing;
        this.isRipen = isRipen;
        this.ripenTime = ripenTime;
        this.startGrowingTime = startGrowingTime;
        this.endGrowingTime = endGrowingTime;
    }

    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSeedPrice() {
        return seedPrice;
    }

    public double getHarvestPrice() {
        return harvestPrice;
    }

    public boolean isGrowing() {
        return isGrowing;
    }

    public boolean isRipen() {
        return isRipen;
    }

    public long getRipenTime() {
        return ripenTime;
    }

    public Date getStartGrowingTime() {
        return startGrowingTime;
    }

    public Date getEndGrowingTime() {
        return endGrowingTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Plant)) return false;
        Plant plant = (Plant) o;
        return id == plant.id &&
                Double.compare(plant.seedPrice, seedPrice) == 0 &&
                Double.compare(plant.harvestPrice, harvestPrice) == 0 &&
                isGrowing == plant.isGrowing &&
                isRipen == plant.isRipen &&
                ripenTime == plant.ripenTime &&
                Objects.equals(name, plant.name) &&
                Objects.equals(startGrowingTime, plant.startGrowingTime) &&
                Objects.equals(endGrowingTime, plant.endGrowingTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, seedPrice, harvestPrice, isGrowing, isRipen, ripenTime, startGrowingTime, endGrowingTime);
    }

    @Override
    public String toString() {
        return "Plant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", seedPrice=" + seedPrice +
                ", harvestPrice=" + harvestPrice +
                ", isGrowing=" + isGrowing +
                ", isRipen=" + isRipen +
                ", ripenTime=" + ripenTime +
                ", startGrowingTime=" + startGrowingTime +
                ", endGrowingTime=" + endGrowingTime +
                '}';
    }
}