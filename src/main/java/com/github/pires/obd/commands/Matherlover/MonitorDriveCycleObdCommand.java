package com.github.pires.obd.commands.Marcin;

import com.github.pires.obd.enums.AvailableCommandNames;
import com.github.pires.obd.commands.ObdCommand;

/**
 * Created by Marcin on 31.07.2015.
 */
public class MonitorDriveCycleObdCommand extends ObdCommand {
    private float second = 0;
    private float third = 0;
    private float fourth = 0;

    public MonitorDriveCycleObdCommand() {
        super("01 41");
    }

    @Override
    protected void performCalculations() {
        // ignore first two bytes [01 63] of the response
        second = buffer.get(2);
        third = buffer.get(3);
        fourth = buffer.get(4);
    }

    @Override
    public String getFormattedResult() {
        return String.format("second = %.2f; third = %.2f; fourth = %.2f;", second, third, fourth);
    }

    @Override
    public String getName() {
        return AvailableCommandNames.MONITOR_STATUS.getValue();
    }

}
