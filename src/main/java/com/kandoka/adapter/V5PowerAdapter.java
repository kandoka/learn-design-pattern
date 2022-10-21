package com.kandoka.adapter;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description 电压适配器
 * @Author kandoka
 * @Date 2022/10/21 15:34
 */
@Slf4j
public class V5PowerAdapter implements V5Power {

    private V220Power power;

    public V5PowerAdapter(V220Power power) {
        this.power = power;
    }

    @Override
    public int provide5VPower() {
        int power = this.power.provide220VPower() * 5 / 220;
        log.info("适配器：我悄悄的适配了电压~");
        return power;
    }
}
