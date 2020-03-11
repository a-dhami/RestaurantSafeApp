package com.example.cmpt_cobalt.ca.cobalt.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RestaurantManager implements Iterable<Restaurant>{
    private List<Restaurant> restaurants = new ArrayList<>();

    public void add(Restaurant restaurant) {restaurants.add(restaurant);}

    public List<Restaurant> getRestaurants() {
        return restaurants;
    }

    /*
    Singleton Support
    */
    private static RestaurantManager instance;

    private RestaurantManager() {
        // prevent anyone else from instantiating object
    }

    public static RestaurantManager getInstance() {
        if(instance == null) {
            instance = new RestaurantManager();
        }
        return instance;
    }

    /*
    Normal Object Code
     */
    @Override
    public Iterator<Restaurant> iterator() {
        return restaurants.iterator();
    }

    public int getManagerSize() {
        int count = 0;
        for(Restaurant restaurant: restaurants)
            count++;

        return count;
    }
}
