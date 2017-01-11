package springtips.eventlistener;

import org.springframework.context.ApplicationEvent;

@SuppressWarnings({"WeakerAccess", "unused"})
public class OrderEvent extends ApplicationEvent {
    private final int orderId;
    private boolean confirmed;

    public OrderEvent(Object source, int orderId, boolean confirmed) {
        super(source);
        this.orderId = orderId;
        this.confirmed = confirmed;
    }

    /**
     * The Order ID.
     *
     * @return Special orders have 42.
     */
    public int getOrderId() {
        return orderId;
    }

    public boolean isConfirmed() {
        return confirmed;
    }

    public void setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
    }

}