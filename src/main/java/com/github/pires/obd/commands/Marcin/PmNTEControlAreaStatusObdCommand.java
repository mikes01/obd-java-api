package com.github.pires.obd.commands.Marcin;

import com.github.pires.obd.commands.ObdCommand;
import com.github.pires.obd.enums.AvailableCommandNames;

/**
 * Created by Marcin on 02.08.2015.
 */
public class PmNTEControlAreaStatusObdCommand extends ObdCommand {
    private float afr = 0;

    public PmNTEControlAreaStatusObdCommand() {
        super("01 7E");
    }

    @Override
    protected void performCalculations() {
        // ignore first two bytes [01 63] of the response
        float A = buffer.get(2);

        afr = A;
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
        return AvailableCommandNames.PM_NTE_CONTROL_AREA_STATUS.getValue();
    }

}
