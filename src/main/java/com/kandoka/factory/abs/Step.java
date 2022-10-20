package com.kandoka.factory.abs;

/**
 * @Description 准备食材步骤
 * @Author kandoka
 * @Date 2022/10/20 15:40
 */
public abstract class Step {
    protected String name;

    @Override
    public String toString() {
        return name;
    }
}
