package com.github.pires.obd.commands.Marcin;

import com.github.pires.obd.commands.ObdCommand;
import com.github.pires.obd.enums.AvailableCommandNames;

/**
 * Created by Marcin on 2015-07-29.
 */

public class EngineReferenceTorqueObdCommand extends ObdCommand {

    private float afr = 0;

    public EngineReferenceTorqueObdCommand() {
        super("01 63");
    }

    @Override
    protected void performCalculations() {
        // ignore first two bytes [01 63] of the response
        float A = buffer.get(2);
        float B = buffer.get(3);
        afr = (A * 125) + B;
    }

    @Override
    public String getFormattedResult() {
        return String.format("%.3f", getAfr() + "Nm");
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
        return AvailableCommandNames.ENGINE_REFERENCE_TORQUE.getValue();
    }

}

