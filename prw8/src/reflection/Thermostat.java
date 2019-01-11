package reflection;

import java.util.function.Function;
import java.util.function.Predicate;

public class Thermostat {
    private Predicate<String> condition ;
    private Function<Double, String> function;

    public Thermostat(Predicate<String> condition, Function<Double, String> function) {
        this.condition = condition;
        this.function = function;
    }

    public String sense(Double degrees){
        if (condition.test(degrees))
            return "Warning";


    }
}
