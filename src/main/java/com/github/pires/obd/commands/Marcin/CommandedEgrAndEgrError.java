package com.github.pires.obd.commands.Marcin;

import com.github.pires.obd.enums.AvailableCommandNames;
import com.github.pires.obd.commands.ObdCommand;

/**
 * Created by Marcin on 31.07.2015.
 */
public class CommandedEgrAndEgrError extends ObdCommand {
    private float afr = 0;

    public CommandedEgrAndEgrError() {
        super("01 69");
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
        float G = buffer.get(8);
        afr = A + B + C + D + E + F + G;
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
        return AvailableCommandNames.COMMANDED_EGR.getValue();
    }

}
