package com.github.pires.obd.commands.Marcin;

import com.github.pires.obd.enums.AvailableCommandNames;
import com.github.pires.obd.commands.ObdCommand;

/**
 * Created by Marcin on 31.07.2015.
 */
public class MaxValForSensorsObdCommand extends ObdCommand {
    private float second = 0;
    private float third = 0;
    private float fourth = 0;
    private float fifth = 0;

    public MaxValForSensorsObdCommand() {
        super("01 4F");
    }

    @Override
    protected void performCalculations() {
        // ignore first two bytes [01 63] of the response
        second = buffer.get(2);
        third = buffer.get(3);
        fourth = buffer.get(4);
        fifth = buffer.get(5);
    }

    @Override
    public String getFormattedResult() {
        return String.format("second = %.2f; third = %.2f; fourth = %.2f; fifth = %.2f;", second, third, fourth, fifth);
    }

    @Override
    public String getName() {
        return AvailableCommandNames.MAX_VALUE_SENSORS.getValue();
    }

}
