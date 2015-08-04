package com.github.pires.obd.commands.protocol;

import com.github.pires.obd.commands.PersistentObdCommand;
import com.github.pires.obd.enums.AvailableCommandNames;

public class AvailablePids4ObdCommand extends PersistentObdCommand {

    /**
     * Default ctor.
     */
    public AvailablePids4ObdCommand() {
        super("01 60");
    }

    /**
     * Copy ctor.
     *
     * @param other a {@link AvailablePids4ObdCommand} object.
     */
    public AvailablePids4ObdCommand(AvailablePids4ObdCommand other) {
        super(other);
    }

    @Override
    protected void performCalculations() {

    }

    @Override
    public String getName() {
        return AvailableCommandNames.PIDS_4.getValue();
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
