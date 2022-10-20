package com.kandoka.factory.simple;

/**
 * @Description 食物工厂
 * @Author kandoka
 * @Date 2022/10/20 10:05
 */
public class FoodFactory {
    /**
     * 按食物种类生产食物
     * @param type 食物种类
     * @return
     */
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
