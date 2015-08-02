package com.github.pires.obd.commands.Marcin;

import com.github.pires.obd.commands.ObdCommand;
import com.github.pires.obd.enums.AvailableCommandNames;

/**
 * Created by Marcin on 02.08.2015.
 */
public class ManifoldSurfaceTemperatureObdCommand extends ObdCommand {
    private float afr = 0;

    public ManifoldSurfaceTemperatureObdCommand() {
        super("01 84");
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
        return AvailableCommandNames.MANIFOLD_SURFACE_TEMP.getValue();
    }

}
