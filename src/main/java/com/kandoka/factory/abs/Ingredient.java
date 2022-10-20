package com.kandoka.factory.abs;

/**
 * @Description 配料
 * @Author kandoka
 * @Date 2022/10/20 15:12
 */
public abstract class Ingredient {
    protected String name;

    @Override
    public String toString() {
        return name;
    }
}
