package com.github.pires.obd.commands.engine;

import com.github.pires.obd.commands.PercentageObdCommand;
import com.github.pires.obd.enums.AvailableCommandNames;

/**
 * Read the throttle position in percentage.
 */
public class CommandedThrottleActuatorObdCommand extends PercentageObdCommand {

    /**
     * Default ctor.
     */
    public CommandedThrottleActuatorObdCommand() {
        super("01 4C");
    }

    /**
     * Copy ctor.
     *
     * @param other a {@link com.github.pires.obd.commands.engine.CommandedThrottleActuatorObdCommand} object.
     */
    public CommandedThrottleActuatorObdCommand(CommandedThrottleActuatorObdCommand other) {
        super(other);
    }

    /**
     *
     */
    @Override
    public String getName() {
        return AvailableCommandNames.COMMANDED_THROTTLE_ACTUATOR.getValue();
    }

}
