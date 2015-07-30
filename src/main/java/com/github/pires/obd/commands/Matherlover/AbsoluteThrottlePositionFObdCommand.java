package com.github.pires.obd.commands.engine;

import com.github.pires.obd.commands.PercentageObdCommand;
import com.github.pires.obd.enums.AvailableCommandNames;

/**
 * Read the throttle position in percentage.
 */
public class AbsoluteThrottlePositionFObdCommand extends PercentageObdCommand {

    /**
     * Default ctor.
     */
    public AbsoluteThrottlePositionFObdCommand() {
        super("01 4B");
    }

    /**
     * Copy ctor.
     *
     * @param other a {@link com.github.pires.obd.commands.engine.AbsoluteThrottlePositionFObdCommand} object.
     */
    public AbsoluteThrottlePositionFObdCommand(AbsoluteThrottlePositionFObdCommand other) {
        super(other);
    }

    /**
     *
     */
    @Override
    public String getName() {
        return AvailableCommandNames.ABSOLUTE_THROTTLE_POS_F.getValue();
    }

}
