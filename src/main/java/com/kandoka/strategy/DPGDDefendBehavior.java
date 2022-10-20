package com.kandoka.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description 具体策略：盾牌格挡！
 * @Author kandoka
 * @Date 2022/10/20 20:02
 */
@Slf4j
public class DPGDDefendBehavior implements IDefendBehavior {

    @Override
    public void defend() {
        log.info("盾牌格挡！");
    }
}
