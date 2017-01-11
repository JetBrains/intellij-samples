package springtips.eventlistener;

import org.springframework.context.event.EventListener;

@SuppressWarnings("unused")
public class OrderEventProcessor {

    @EventListener(condition = "#event.confirmed == true")
//    @MyCustomEventListener(customConditionAttribute = "#event.confirmed == true")
    public void processConfirmedOrder(OrderEvent event) {
        System.out.println("OrderEventProcessor#processConfirmedOrder " +
                "got: Process Order Id: " + event.getOrderId());
    }

}