package com.github.pires.obd.commands.Matherlover;

import com.github.pires.obd.commands.ObdCommand;
import com.github.pires.obd.enums.AvailableCommandNames;
import com.github.pires.obd.enums.O2SensorCodes;

/**
 * Created by bartek on 29.07.2015.
 */
public class O2SensorEquivalenceObdCommand extends ObdCommand {
    private double equivalence = 0.00;
    private int sNumber;

    public O2SensorEquivalenceObdCommand(int sensorNumber) {
        super(O2SensorCodes.fromValue(sensorNumber).getCode());
        sNumber = sensorNumber;
    }

    public O2SensorEquivalenceObdCommand(O2SensorEquivalenceObdCommand other){
        super (other);
    }

    @Override
    protected void performCalculations() {
        int a = buffer.get(2);
        int b = buffer.get(3);

        equivalence = (a * 256 + b) / 32768;
    }

    @Override
    public String getFormattedResult() {
        return String.format("%.1f%s", equivalence, getResultUnit());
    }

    @Override
    public String getCalculatedResult() {
        return String.valueOf(equivalence);
    }

    @Override
    public String getResultUnit() {
        return "";
    }

    @Override
    public String getName() {
        return AvailableCommandNames.O2_SENSOR_EQUIVALENCE.getValue() + sNumber;
    }

    public double getEquivalence() { return equivalence; }

}
