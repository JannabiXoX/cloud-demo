package cn.itcast.order.config;/*
 *@Author:user
 *@Date:5/3/2023 10:35 PM
 */

import feign.Logger;

public class DefaultFeignConfiguration {

    public Logger.Level logLevel(){
        return Logger.Level.BASIC;
    }
}
