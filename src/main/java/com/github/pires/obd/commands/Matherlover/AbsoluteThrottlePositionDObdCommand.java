package com.github.pires.obd.commands.engine;

import com.github.pires.obd.commands.PercentageObdCommand;
import com.github.pires.obd.enums.AvailableCommandNames;

/**
 * Read the throttle position in percentage.
 */
public class AbsoluteThrottlePositionDObdCommand extends PercentageObdCommand {

    /**
     * Default ctor.
     */
    public AbsoluteThrottlePositionDObdCommand() {
        super("01 49");
    }

    /**
     * Copy ctor.
     *
     * @param other a {@link com.github.pires.obd.commands.engine.AbsoluteThrottlePositionDObdCommand} object.
     */
    public AbsoluteThrottlePositionDObdCommand(AbsoluteThrottlePositionDObdCommand other) {
        super(other);
    }

    /**
     *
     */
    @Override
    public String getName() {
        return AvailableCommandNames.ABSOLUTE_THROTTLE_POS_D.getValue();
    }

}
