package com.kandoka.factory.abs;

import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @Description 食物抽象类
 * @Author kandoka
 * @Date 2022/10/20 10:06
 */
@Slf4j
public class Food {
    protected String name;
    /**
     * 食材准备步骤
     */
    protected List<Step> steps;
    /**
     * 添加的配料
     */
    protected List<Ingredient> ingredients;

    public Food(FoodFactory factory) {
        this.name = factory.name();
        this.steps = factory.createSteps();
        this.ingredients = factory.createIngredients();
    }

    public void prepare() {

        log.info("准备食材:{}，操作：{}", name, steps.stream().map(Objects::toString).collect(Collectors.joining("、")));
    }
    public void cook() {
        log.info("烹饪：{}，加入调料：{}", name, ingredients.stream().map(Objects::toString).collect(Collectors.joining("、")));
    }
    public void send() {
        log.info("上菜：{}", name);
    }
}
