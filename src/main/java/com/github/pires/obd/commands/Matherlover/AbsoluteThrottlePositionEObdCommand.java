package com.github.pires.obd.commands.engine;

import com.github.pires.obd.commands.PercentageObdCommand;
import com.github.pires.obd.enums.AvailableCommandNames;

/**
 * Read the throttle position in percentage.
 */
public class AbsoluteThrottlePositionEObdCommand extends PercentageObdCommand {

    /**
     * Default ctor.
     */
    public AbsoluteThrottlePositionEObdCommand() {
        super("01 4A");
    }

    /**
     * Copy ctor.
     *
     * @param other a {@link com.github.pires.obd.commands.engine.AbsoluteThrottlePositionEObdCommand} object.
     */
    public AbsoluteThrottlePositionEObdCommand(AbsoluteThrottlePositionEObdCommand other) {
        super(other);
    }

    /**
     *
     */
    @Override
    public String getName() {
        return AvailableCommandNames.ABSOLUTE_THROTTLE_POS_E.getValue();
    }

}
