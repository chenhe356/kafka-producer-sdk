package com.dycd.kafka_sdk.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 返回properties对象
 *
 * @author he.chen
 * @date 2017/11/28
 * @time 上午9:18
 **/
public class PropertiesFileInit {
    public Properties loadProperties(InputStream in){
        Properties properties = new Properties();
        try {
            properties.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }
}
