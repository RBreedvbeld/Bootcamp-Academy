package com.booleanuk;

import java.util.ArrayList;

public class LearningPlan {
    ArrayList<String> planItems;
    ArrayList<Integer> planCosts;
    int capacity;

    public LearningPlan() {
        this.planItems = new ArrayList<>();
        this.planCosts = new ArrayList<>();
        this.capacity = 5;
    }

    public boolean addItem(String itemName, int itemCosts) {
        this.planItems.add(itemName);
        this.planCosts.add(itemCosts);
        return true;
    }


}
