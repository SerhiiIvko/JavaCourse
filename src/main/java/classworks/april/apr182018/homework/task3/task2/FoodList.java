package classworks.april.apr182018.homework.task3.task2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FoodList implements Iterable<Food> {
    protected List<Food> foodList;

    public FoodList() {
        this.foodList = new ArrayList<>();
    }

    public void addFood(Food food) {
        foodList.add(food);
    }

    public Food get(int index) {
        return foodList.get(index);
    }

    @Override
    public Iterator<Food> iterator() {
        return foodList.iterator();
    }
}