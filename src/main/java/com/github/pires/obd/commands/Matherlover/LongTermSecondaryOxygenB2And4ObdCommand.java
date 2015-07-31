package com.github.pires.obd.commands.engine;

import com.github.pires.obd.commands.PercentageObdCommand;
import com.github.pires.obd.enums.AvailableCommandNames;

/**
 * Read the throttle position in percentage.
 */
public class LongTermSecondaryOxygenB2And4ObdCommand extends PercentageObdCommand {

    /**
     * Default ctor.
     */
    public LongTermSecondaryOxygenB2And4ObdCommand() {
        super("01 58");
    }

    /**
     * Copy ctor.
     *
     * @param other a {@link com.github.pires.obd.commands.engine.LongTermSecondaryOxygenB2And4ObdCommand} object.
     */
    public LongTermSecondaryOxygenB2And4ObdCommand(LongTermSecondaryOxygenB2And4ObdCommand other) {
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
        return AvailableCommandNames.LONG_TERM_SECONDARY_OXYGEN_B2_B4.getValue();
    }

}
