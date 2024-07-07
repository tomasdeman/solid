package main.java.dip.violation;

/**
 * violation: ElectricPowerSwitch is directly dependent on the LightBulb class.
 */
public class ElectricPowerSwitch
{
    private LightBulb lightBulb;

    public ElectricPowerSwitch(LightBulb lightBulb) {
        this.lightBulb = lightBulb;
    }

    public void press() {
        // logic to use the light bulb
    }
}
