package com.kandoka.factory.method;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description 食物抽象类
 * @Author kandoka
 * @Date 2022/10/20 10:06
 */
@Slf4j
public abstract class Food {
    protected String name;
    public void prepare() {
        log.info("准备食材:{}", name);
    }
    public void cook() {
        log.info("烹饪：{}", name);
    }
    public void send() {
        log.info("上菜：{}", name);
    }
}
