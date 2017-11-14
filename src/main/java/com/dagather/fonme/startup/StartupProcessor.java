package com.dagather.fonme.startup;

import com.dagather.fonme.exchange.service.IExchangeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

import javax.annotation.Resource;

public class StartupProcessor implements ApplicationListener<ContextRefreshedEvent> {

    @Resource
    private IExchangeService exchangeServiceImpl;

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        if (event.getApplicationContext().getParent() == null) {//root application context 没有parent，他就是老大.
            //需要执行的逻辑代码，当spring容器初始化完成后就会执行该方法。

            // 获取号段资费Map(强制刷新缓存)
            exchangeServiceImpl.selectCacheMapPhoneCodeToRate(true);
        }
    }

}
