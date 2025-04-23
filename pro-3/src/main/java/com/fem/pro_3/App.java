package com.fem.pro_3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fem.config.DeviceConfig;
import com.fem.pojo.Device;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context =new AnnotationConfigApplicationContext(DeviceConfig.class);
        Device device = context.getBean(Device.class);
        System.out.println("Device:"+device.getName());
        System.out.println("Model:"+device.getModel());
    }
}
