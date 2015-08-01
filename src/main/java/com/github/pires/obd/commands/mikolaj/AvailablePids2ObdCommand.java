package com.github.pires.obd.commands.mikolaj;

import com.github.pires.obd.commands.PersistentObdCommand;
import com.github.pires.obd.enums.AvailableCommandNames;

public class AvailablePids2ObdCommand extends PersistentObdCommand {

    /**
     * Default ctor.
     */
    public AvailablePids2ObdCommand() {
        super("01 20");
    }

    /**
     * Copy ctor.
     *
     * @param other a {@link AvailablePids2ObdCommand} object.
     */
    public AvailablePids2ObdCommand(AvailablePids2ObdCommand other) {
        super(other);
    }

    @Override
    protected void performCalculations() {

    }

    @Override
    public String getName() {
        return AvailableCommandNames.PIDS_2.getValue();
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
