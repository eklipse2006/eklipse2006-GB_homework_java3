package ru.geekbrains;

import java.util.ArrayList;

public class Box <T extends Fruit> {

    private ArrayList<T> fruits = new ArrayList<>();

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public float getWeight() {
        float sumWeight = 0.0f;
        for (T fruit : fruits) {
            sumWeight += fruit.getWeight();
        }
        return sumWeight;
    }

    public boolean compare(Box boxToCompare) {
        return Math.abs(this.getWeight() - boxToCompare.getWeight()) < 0.001;
    }

    public void move(Box<T> boxTwo) {
        if (boxTwo == this) {
            return;
        }
        boxTwo.fruits.addAll(this.fruits);
        this.fruits.clear();
    }
}
