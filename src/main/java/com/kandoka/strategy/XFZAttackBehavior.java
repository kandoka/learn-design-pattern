package com.kandoka.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description 具体策略：旋风斩！
 * @Author kandoka
 * @Date 2022/10/20 20:01
 */
@Slf4j
public class XFZAttackBehavior implements IAttackBehavior {

    @Override
    public void attack() {
        log.info("旋风斩！");
    }
}
