package com.github.pires.obd.commands.Marcin;

import com.github.pires.obd.commands.ObdCommand;
import com.github.pires.obd.enums.AvailableCommandNames;

/**
 * Created by Marcin on 31.07.2015.
 */
public class ExhaustGasRecirculationTemperatureObdCommand extends ObdCommand {
    private float afr = 0;

    public ExhaustGasRecirculationTemperatureObdCommand() {
        super("01 6B");
    }

    @Override
    protected void performCalculations() {
        // ignore first two bytes [01 63] of the response
        float A = buffer.get(2);
        float B = buffer.get(3);
        float C = buffer.get(4);
        float D = buffer.get(5);
        float E = buffer.get(6);

        afr = A + B + C + D + E;
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
        return AvailableCommandNames.EXHAUST_GAS_RECIRCULATION_TEMP.getValue();
    }

}
