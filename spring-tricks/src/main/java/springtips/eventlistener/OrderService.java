package springtips.eventlistener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

@SuppressWarnings("unused")
@Service
public class OrderService {

    private ApplicationEventPublisher publisher;

    @Autowired
    public OrderService(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    @PreAuthorize("hasRole('IS_AUTHENTICATED_FULLY')")
    public void publishOrderEvent(int orderId, boolean confirmed) {
        OrderEvent event = new OrderEvent(this, orderId, confirmed, 1);
        publisher.publishEvent(event);
    }

}