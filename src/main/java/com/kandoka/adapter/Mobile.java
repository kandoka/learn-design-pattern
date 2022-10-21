package com.kandoka.adapter;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description 手机
 * @Author kandoka
 * @Date 2022/10/21 15:28
 */
@Slf4j
public class Mobile {
    public void charge(V5Power power) {
        int powerProvided = power.provide5VPower();
        log.info("手机：我需要5V电压充电，现在是-->{}V", powerProvided);
    }

    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        V5Power power = new V5PowerAdapter(new V220Power());
        mobile.charge(power);
    }
}
