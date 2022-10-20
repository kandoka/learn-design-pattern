package com.kandoka.factory.method;

/**
 * @Description 餐厅，食物的使用方
 * @Author kandoka
 * @Date 2022/10/20 10:02
 */
public abstract class Restaurant {

    /**
     * 子类需要实现此工厂方法
     * @param type 食物种类
     * @return
     */
    public abstract Food create(String type);

    public void serve(String type) {
        Food food = create(type);
        food.prepare();
        food.cook();
        food.send();
    }

    public static void main(String[] args) {
        Restaurant restaurant = new KFCRestaurant();
        restaurant.serve("meat");
    }
}
