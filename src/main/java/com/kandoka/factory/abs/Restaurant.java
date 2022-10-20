package com.kandoka.factory.abs;

/**
 * @Description 餐厅，食物的使用方
 * @Author kandoka
 * @Date 2022/10/20 10:02
 */
public class Restaurant {
    private FoodFactory factory;

    public void serve(String type) {
        Food food = new Food(new MeatFoodFactory());
        food.prepare();
        food.cook();
        food.send();
    }

    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        restaurant.serve("meat");
    }
}
