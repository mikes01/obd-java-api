package com.github.pires.obd.commands.engine;

import com.github.pires.obd.commands.PercentageObdCommand;
import com.github.pires.obd.enums.AvailableCommandNames;

/**
 * Read the throttle position in percentage.
 */
public class AbsoluteThrottlePositionCObdCommand extends PercentageObdCommand {

    /**
     * Default ctor.
     */
    public AbsoluteThrottlePositionCObdCommand() {
        super("01 48");
    }

    /**
     * Copy ctor.
     *
     * @param other a {@link com.github.pires.obd.commands.engine.AbsoluteThrottlePositionCObdCommand} object.
     */
    public AbsoluteThrottlePositionCObdCommand(AbsoluteThrottlePositionCObdCommand other) {
        super(other);
    }

    /**
     *
     */
    @Override
    public String getName() {
        return AvailableCommandNames.ABSOLUTE_THROTTLE_POS_C.getValue();
    }

}
