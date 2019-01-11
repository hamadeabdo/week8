package reflection;

import org.junit.jupiter.api.Test;

public class ThermostatTest {
    @Test
    void testSkiing(){
        Thermostat thermostat = new Thermostat(s -> s<0,t->t+"degrees Celsius");


    }
}
