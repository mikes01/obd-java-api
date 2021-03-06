package com.github.pires.obd.commands.Marcin;

import com.github.pires.obd.enums.AvailableCommandNames;
import com.github.pires.obd.commands.ObdCommand;

/**
 * Created by Marcin on 31.07.2015.
 */
public class EmissionRequirementsObdCommand extends ObdCommand {
    private float value = 0;

    public EmissionRequirementsObdCommand() {
        super("01 5F");
    }

    @Override
    protected void performCalculations() {
        // ignore first two bytes [01 63] of the response
        value = buffer.get(2);
    }

    @Override
    public String getFormattedResult() {
        return String.format("%.2f", value);
    }

    @Override
    public String getCalculatedResult() {
        return String.valueOf(value);
    }

    @Override
    public String getName() {
        return AvailableCommandNames.EMISSION_REQUIREMENTS.getValue();
    }

}
