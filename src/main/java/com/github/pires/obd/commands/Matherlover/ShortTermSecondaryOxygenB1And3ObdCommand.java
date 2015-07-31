package com.github.pires.obd.commands.engine;

import com.github.pires.obd.commands.PercentageObdCommand;
import com.github.pires.obd.enums.AvailableCommandNames;

/**
 * Read the throttle position in percentage.
 */
public class ShortTermSecondaryOxygenB1And3ObdCommand extends PercentageObdCommand {

    /**
     * Default ctor.
     */
    public ShortTermSecondaryOxygenB1And3ObdCommand() {
        super("01 55");
    }

    /**
     * Copy ctor.
     *
     * @param other a {@link com.github.pires.obd.commands.engine.ShortTermSecondaryOxygenB1And3ObdCommand} object.
     */
    public ShortTermSecondaryOxygenB1And3ObdCommand(ShortTermSecondaryOxygenB1And3ObdCommand other) {
        super(other);
    }

    @Override
    protected void performCalculations() {
        // ignore first two bytes [hh hh] of the response
        percentage = (buffer.get(2) - 128) * 100 / 128;
    }

    /**
     *
     */
    @Override
    public String getName() {
        return AvailableCommandNames.SHORT_TERM_SECONDARY_OXYGEN_B1_B3.getValue();
    }

}
