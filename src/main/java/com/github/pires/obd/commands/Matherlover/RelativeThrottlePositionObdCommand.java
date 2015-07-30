package com.github.pires.obd.commands.engine;

import com.github.pires.obd.commands.PercentageObdCommand;
import com.github.pires.obd.enums.AvailableCommandNames;

/**
 * Read the throttle position in percentage.
 */
public class RelativeThrottlePositionObdCommand extends PercentageObdCommand {

    /**
     * Default ctor.
     */
    public RelativeThrottlePositionObdCommand() {
        super("01 45");
    }

    /**
     * Copy ctor.
     *
     * @param other a {@link com.github.pires.obd.commands.engine.RelativeThrottlePositionObdCommand} object.
     */
    public RelativeThrottlePositionObdCommand(RelativeThrottlePositionObdCommand other) {
        super(other);
    }

    /**
     *
     */
    @Override
    public String getName() {
        return AvailableCommandNames.RELATIVE_THROTTLE_POS.getValue();
    }

}
