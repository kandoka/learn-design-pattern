package com.kandoka.factory.simple;

/**
 * @Description 餐厅，食物的使用方
 * @Author kandoka
 * @Date 2022/10/20 10:02
 */
public class Restaurant {
    private FoodFactory factory;

    public Restaurant(FoodFactory factory) {
        this.factory = factory;
    }

    public void serve(String type) {
        Food food = factory.create(type);
        food.prepare();
        food.cook();
        food.send();
    }

    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant(new FoodFactory());
        restaurant.serve("meat");
    }
}
