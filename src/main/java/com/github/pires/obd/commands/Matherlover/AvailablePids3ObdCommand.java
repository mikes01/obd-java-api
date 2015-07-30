package com.github.pires.obd.commands.protocol;

import com.github.pires.obd.commands.PersistentObdCommand;
import com.github.pires.obd.enums.AvailableCommandNames;

public class AvailablePids3ObdCommand extends PersistentObdCommand {

    /**
     * Default ctor.
     */
    public AvailablePids3ObdCommand() {
        super("01 40");
    }

    /**
     * Copy ctor.
     *
     * @param other a {@link AvailablePids3ObdCommand} object.
     */
    public AvailablePids3ObdCommand(AvailablePids3ObdCommand other) {
        super(other);
    }

    @Override
    protected void performCalculations() {

    }

    @Override
    public String getName() {
        return AvailableCommandNames.PIDS_3.getValue();
    }

    @Override
    public String getFormattedResult() {
        return getCalculatedResult();
    }

    @Override
    public String getCalculatedResult() {
        return String.valueOf(rawData);
    }
}
