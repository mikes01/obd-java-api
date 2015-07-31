package com.github.pires.obd.commands.Marcin;

import com.github.pires.obd.enums.AvailableCommandNames;
import com.github.pires.obd.commands.ObdCommand;

/**
 * Created by Marcin on 31.07.2015.
 */
public class FuelPressureControlSystem extends ObdCommand {
    private float afr = 0;

    public FuelPressureControlSystem() {
        super("01 6D");
    }

    @Override
    protected void performCalculations() {
        // ignore first two bytes [01 63] of the response
        float A = buffer.get(2);
        float B = buffer.get(3);
        float C = buffer.get(4);
        float D = buffer.get(5);
        float E = buffer.get(6);
        float F = buffer.get(7);

        afr = A + B + C + D + E + F;
    }

    @Override
    public String getFormattedResult() {
        return String.format("%.2f", getAfr());
    }

    @Override
    public String getCalculatedResult() {
        return String.valueOf(getAfr());
    }

    public double getAfr() {
        return afr;
    }

    @Override
    public String getName() {
        return AvailableCommandNames.FUEL_PRESSURE_CONTROL.getValue();
    }

}
