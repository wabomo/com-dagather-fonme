package com.dagather.fonme.jms.procuder.impl;

import com.dagather.fonme.jms.procuder.IProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.core.JmsTemplate;

import javax.jms.Destination;

public class Producer implements IProducer {

    private final JmsTemplate jmsTemplate;
    private final Destination destination;

    private Logger logger = LoggerFactory.getLogger(getClass());

    public Producer(final JmsTemplate jmsTemplate, final Destination destination) {
        this.jmsTemplate = jmsTemplate;
        this.destination = destination;
    }

    public void send(final String msg) {
        try {
            jmsTemplate.setDefaultDestination(destination);
            jmsTemplate.convertAndSend(msg);
            logger.info("向[" + destination + "]队列发送消息<|>成功<|>msg:" + msg);
        } catch (Exception e) {
            logger.error("向[" + destination + "]队列发送消息<|>出现异常：" + e.getMessage(), e);

        }
    }
}