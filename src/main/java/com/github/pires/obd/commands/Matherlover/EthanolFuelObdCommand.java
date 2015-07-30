package com.github.pires.obd.commands.engine;

import com.github.pires.obd.commands.PercentageObdCommand;
import com.github.pires.obd.enums.AvailableCommandNames;

/**
 * Read the throttle position in percentage.
 */
public class EthanolFuelObdCommand extends PercentageObdCommand {

    /**
     * Default ctor.
     */
    public EthanolFuelObdCommand() {
        super("01 52");
    }

    /**
     * Copy ctor.
     *
     * @param other a {@link com.github.pires.obd.commands.engine.EthanolFuelObdCommand} object.
     */
    public EthanolFuelObdCommand(EthanolFuelObdCommand other) {
        super(other);
    }

    /**
     *
     */
    @Override
    public String getName() {
        return AvailableCommandNames.ETHANOL_FUEL.getValue();
    }

}
