import java.util.HashMap;
import java.util.Map;

public class StrategyContext {

    private static Map<String, Class> MAP_STRATEGY = new HashMap<String, Class>();
    static {
        Values[] values = Values.values();
        for(Values val : values){
            String className = val.getValue();
            try {
                MAP_STRATEGY.put(className, Class.forName(className));
            }
            catch (ClassNotFoundException ex){
                ex.printStackTrace();
            }
        }
    }

    public static BasePayment getStrategy(String key) throws Exception{
        return (BasePayment) MAP_STRATEGY.get(key).newInstance();
    }
}
