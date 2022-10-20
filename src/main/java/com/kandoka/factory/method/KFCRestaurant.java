package com.kandoka.factory.method;

/**
 * @Description KFC，餐厅的子类，用来实现创建食物的方法
 * @Author kandoka
 * @Date 2022/10/20 11:12
 */
public class KFCRestaurant extends Restaurant {
    @Override
    public Food create(String type) {
        Food food = null;
        if(type.equals("meat")) {
            food = new Meat();
        } else if (type.equals("vegetable")) {
            food = new Vegetable();
        }
        return food;
    }
}
