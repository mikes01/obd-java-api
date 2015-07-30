package com.github.pires.obd.commands.engine;

import com.github.pires.obd.commands.PercentageObdCommand;
import com.github.pires.obd.enums.AvailableCommandNames;

/**
 * Read the throttle position in percentage.
 */
public class AbsoluteThrottlePositionBObdCommand extends PercentageObdCommand {

    /**
     * Default ctor.
     */
    public AbsoluteThrottlePositionBObdCommand() {
        super("01 47");
    }

    /**
     * Copy ctor.
     *
     * @param other a {@link com.github.pires.obd.commands.engine.AbsoluteThrottlePositionBObdCommand} object.
     */
    public AbsoluteThrottlePositionBObdCommand(AbsoluteThrottlePositionBObdCommand other) {
        super(other);
    }

    /**
     *
     */
    @Override
    public String getName() {
        return AvailableCommandNames.ABSOLUTE_THROTTLE_POS_B.getValue();
    }

}
