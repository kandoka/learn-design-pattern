package com.kandoka.adapter;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description 家用220V插座
 * @Author kandoka
 * @Date 2022/10/21 15:32
 */
@Slf4j
public class V220Power {
    public int provide220VPower() {
        log.info("插座：我提供220V交流电压~");
        return 220;
    }
}
