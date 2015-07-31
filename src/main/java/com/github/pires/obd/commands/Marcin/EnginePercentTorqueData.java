package com.github.pires.obd.commands.Marcin;

import com.github.pires.obd.commands.ObdCommand;
import com.github.pires.obd.enums.AvailableCommandNames;

/**
 * Created by Marcin on 2015-07-29.
 */

public class EnginePercentTorqueData extends ObdCommand {

    private float afr = 0;

    public EnginePercentTorqueData() {
        super("01 64");
    }

    @Override
    protected void performCalculations() {
        // ignore first two bytes [01 64] of the response
        float A = buffer.get(2);
        afr = A - 125;
    }

    @Override
    public String getFormattedResult() {
        return String.format("%.2f", getAfr() + "%");
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
        return AvailableCommandNames.ENGINE_PERCENT_TORQUE_DATA.getValue();
    }

}

