package com.github.pires.obd.commands.engine;

import com.github.pires.obd.commands.PercentageObdCommand;
import com.github.pires.obd.enums.AvailableCommandNames;

/**
 * Read the throttle position in percentage.
 */
public class RelativeAcceleratorPedalPositionObdCommand extends PercentageObdCommand {

    /**
     * Default ctor.
     */
    public RelativeAcceleratorPedalPositionObdCommand() {
        super("01 5A");
    }

    /**
     * Copy ctor.
     *
     * @param other a {@link com.github.pires.obd.commands.engine.RelativeAcceleratorPedalPositionObdCommand} object.
     */
    public RelativeAcceleratorPedalPositionObdCommand(RelativeAcceleratorPedalPositionObdCommand other) {
        super(other);
    }

    /**
     *
     */
    @Override
    public String getName() {
        return AvailableCommandNames.RELATIVE_ACCELERATOR_PEDAL_POS.getValue();
    }

}
