package com.github.pires.obd.commands.Matherlover;

import com.github.pires.obd.commands.ObdCommand;
import com.github.pires.obd.enums.AvailableCommandNames;
import com.github.pires.obd.enums.O2SensorCodes;

/**
 * Created by bartek on 29.07.2015.
 */
public class O2SensorCurrentObdCommand extends ObdCommand {
    private double amperage = 0.00;
    private int sNumber;

    public O2SensorCurrentObdCommand(int sensorNumber) {
        super(O2SensorCodes.fromValue(sensorNumber).getCode());
        sNumber = sensorNumber;
    }

    public O2SensorCurrentObdCommand(O2SensorEquivalenceObdCommand other){
        super (other);
    }

    @Override
    protected void performCalculations() {
        int c = buffer.get(4);
        int d = buffer.get(5);

        amperage = (c * 256 + d) / 256 - 128;
    }

    @Override
    public String getFormattedResult() {
        return String.format("%.1f%s", amperage, getResultUnit());
    }

    @Override
    public String getCalculatedResult() {
        return String.valueOf(amperage);
    }

    @Override
    public String getResultUnit() {
        return "mA";
    }

    @Override
    public String getName() {
        return AvailableCommandNames.O2_SENSOR_AMPERAGE.getValue() + sNumber;
    }

    public double getAmperage() { return amperage; }

}
