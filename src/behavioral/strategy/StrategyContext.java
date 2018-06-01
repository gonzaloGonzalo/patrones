import java.util.HashMap;
import java.util.Map;

public class StrategyContext {

    private static Map<String, Class> EVENT_CLASS;

    public enum Event {
        CASH_PAYMENT("cash payment"),
        PAYPAL_PAYMENT("pay pal payment");

        private String event;

        Event(String event){
            this.event = event;
        }

        public String getValue(){
            return event;
        }
    }

    static {
        EVENT_CLASS = new HashMap<String, Class>();
        EVENT_CLASS.put(Event.CASH_PAYMENT.getValue(), CashPayment.class);
        EVENT_CLASS.put(Event.PAYPAL_PAYMENT.getValue(), PayPalPayment.class);
    }

    public static Class getClassForEvent(String event){
        return EVENT_CLASS.get(event);
    }

    public static BasePayment getStrategy(String event) throws Exception{
        return (BasePayment) getClassForEvent(event).newInstance();
    }
}
