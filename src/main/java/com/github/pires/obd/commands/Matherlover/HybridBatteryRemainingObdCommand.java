package com.github.pires.obd.commands.engine;

import com.github.pires.obd.commands.PercentageObdCommand;
import com.github.pires.obd.enums.AvailableCommandNames;

/**
 * Read the throttle position in percentage.
 */
public class HybridBatteryRemainingObdCommand extends PercentageObdCommand {

    /**
     * Default ctor.
     */
    public HybridBatteryRemainingObdCommand() {
        super("01 5B");
    }

    /**
     * Copy ctor.
     *
     * @param other a {@link com.github.pires.obd.commands.engine.HybridBatteryRemainingObdCommand} object.
     */
    public HybridBatteryRemainingObdCommand(HybridBatteryRemainingObdCommand other) {
        super(other);
    }

    /**
     *
     */
    @Override
    public String getName() {
        return AvailableCommandNames.HYBRID_BATTERY_REMAINING.getValue();
    }

}
