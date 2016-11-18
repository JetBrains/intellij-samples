package com.jetbrains.spring;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private ApplicationEventPublisher publisher;

    public void publishEvent() {
        publisher.publishEvent(null);
    }
}
