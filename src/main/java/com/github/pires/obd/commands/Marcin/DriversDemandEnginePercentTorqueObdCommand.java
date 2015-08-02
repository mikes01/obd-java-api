package com.github.pires.obd.commands.Marcin;

import com.github.pires.obd.commands.ObdCommand;
import com.github.pires.obd.enums.AvailableCommandNames;

/**
 * Created by Marcin on 2015-07-29.
 */
public class DriversDemandEnginePercentTorqueObdCommand extends ObdCommand {

    private float afr = 0;

    public DriversDemandEnginePercentTorqueObdCommand() {
        super("01 61");
    }

    @Override
    protected void performCalculations() {
        // ignore first two bytes [01 61] of the response
        float A = buffer.get(2);
        afr = A - 125;
    }

    @Override
    public String getFormattedResult() {
        return String.format("%.2f", getAfr() +"%");
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
        return AvailableCommandNames.DRIVERS_DEMAND_ENGINE.getValue();
    }

}

