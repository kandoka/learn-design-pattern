package com.kandoka.factory.abs;

import java.util.List;

/**
 * @Description 食物抽象工厂
 * @Author kandoka
 * @Date 2022/10/20 10:05
 */
public abstract class FoodFactory {

    public abstract String name();
    public abstract List<Step> createSteps();
    public abstract List<Ingredient> createIngredients();
}
