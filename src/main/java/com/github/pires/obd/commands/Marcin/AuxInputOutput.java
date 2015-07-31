package com.github.pires.obd.commands.Marcin;

import com.github.pires.obd.commands.ObdCommand;
import com.github.pires.obd.enums.AvailableCommandNames;

/**
 * Created by Marcin on 2015-07-29.
 */
public class AuxInputOutput extends ObdCommand {
    private float afr = 0;

    public AuxInputOutput() {
        super("01 65");
    }

    @Override
    protected void performCalculations() {
        // ignore first two bytes [01 62] of the response
        float A = buffer.get(2);
        float B = buffer.get(3);
        afr = A * 256 + B;
    }

    @Override
    public String getFormattedResult() {
        return String.format("%d", getAfr());
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
        return AvailableCommandNames.AUX_IO.getValue();
    }

}
