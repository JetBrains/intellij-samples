package springtips.eventlistener;

import org.springframework.context.ApplicationEvent;

import java.util.ArrayList;

@SuppressWarnings({"WeakerAccess", "unused"})
public class OrderEvent extends ApplicationEvent {
    private final int orderId;
    private boolean confirmed;

    private final int id1;
    public OrderEvent(Object source, int orderId, boolean confirmed, int id1) {
        super(source);
        ArrayList elements = new ArrayList(2);


        this.orderId = orderId;
        this.confirmed = confirmed;
        this.id1 = id1;
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