package com.github.pires.obd.commands.Marcin;

import com.github.pires.obd.commands.ObdCommand;
import com.github.pires.obd.enums.AvailableCommandNames;

/**
 * Created by Marcin on 02.08.2015.
 */
public class EngineRunTimeObdCommand extends ObdCommand {
    private float afr = 0;

    public EngineRunTimeObdCommand() {
        super("01 7F");
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
        float H = buffer.get(9);
        float I = buffer.get(10);
        float J = buffer.get(11);
        float K = buffer.get(12);
        float L = buffer.get(13);
        float M = buffer.get(14);

        afr = A + B + C + D + E + F + G + H + I + J + K + L + M;
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
        return AvailableCommandNames.ENGINE_RUN_TIME.getValue();
    }

}
