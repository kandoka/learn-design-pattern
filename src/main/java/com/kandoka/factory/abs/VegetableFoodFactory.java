package com.kandoka.factory.abs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description 蔬菜工厂，实现食物的抽象工厂
 * @Author kandoka
 * @Date 2022/10/20 15:50
 */
public class VegetableFoodFactory extends FoodFactory{
    @Override
    public String name() {
        return "蔬菜";
    }

    @Override
    public List<Step> createSteps() {
        return new ArrayList<>(Arrays.asList(new VegetableStep()));
    }

    @Override
    public List<Ingredient> createIngredients() {
        return new ArrayList<>(Arrays.asList(new Salad()));
    }
}
