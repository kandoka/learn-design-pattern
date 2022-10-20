package com.kandoka.factory.abs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description 肉类工厂，实现食物的抽象工厂
 * @Author kandoka
 * @Date 2022/10/20 15:49
 */
public class MeatFoodFactory extends FoodFactory{
    @Override
    public String name() {
        return "肉";
    }

    @Override
    public List<Step> createSteps() {
        return new ArrayList<>(Arrays.asList(new MeatStep()));
    }

    @Override
    public List<Ingredient> createIngredients() {
        return new ArrayList<>(Arrays.asList(new Oil(), new StarAnis()));
    }
}
