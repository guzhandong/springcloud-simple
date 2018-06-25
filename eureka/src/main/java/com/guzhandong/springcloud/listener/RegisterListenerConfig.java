package com.guzhandong.springcloud.listener;

import org.springframework.cloud.netflix.eureka.server.event.*;
import org.springframework.context.event.EventListener;

/**
 * 注册中心事件监听配置
 *
 * @author guzhandong
 * @CREATE 2017-12-20 7:13 PM
 */

//@Component
public class RegisterListenerConfig {

    @EventListener
    public void listen(EurekaInstanceCanceledEvent eurekaInstanceCanceledEvent) {
        //服务断线事件
        String appName = eurekaInstanceCanceledEvent.getAppName();
        String serverId = eurekaInstanceCanceledEvent.getServerId();
        long time = eurekaInstanceCanceledEvent.getTimestamp();
        System.out.println("eurekaInstanceCanceledEvent");
        System.out.println(time);
        System.out.println(appName);
        System.out.println(serverId);
    }

    @EventListener
    public void listen(EurekaInstanceRegisteredEvent event) {
        String appName = event.getInstanceInfo().getAppName();
        String serverId = event.getInstanceInfo().getId();
        long time = event.getTimestamp();
        System.out.println("EurekaInstanceRegisteredEvent");
        System.out.println(time);
        System.out.println(appName);
        System.out.println(serverId);
    }

    @EventListener
    public void listen(EurekaInstanceRenewedEvent event) {
        String appName = event.getInstanceInfo().getAppName();
        String serverId = event.getInstanceInfo().getId();
        long time = event.getTimestamp();
        System.out.println("EurekaInstanceRenewedEvent");
        System.out.println(time);
        System.out.println(appName);
        System.out.println(serverId);
    }

    @EventListener
    public void listen(EurekaRegistryAvailableEvent event) {
        long time = event.getTimestamp();
        System.out.println("EurekaRegistryAvailableEvent");
        System.out.println(time);
    }

    @EventListener
    public void listen(EurekaServerStartedEvent event) {
        //Server启动
    }


}
