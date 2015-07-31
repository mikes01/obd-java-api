package com.github.pires.obd.commands.temperature;

import com.github.pires.obd.enums.AvailableCommandNames;

/**
 * Temperature of intake air.
 */
public class CatalystTemperatureB1S1ObdCommand extends TemperatureObdCommand {

    public CatalystTemperatureB1S1ObdCommand() {
        super("01 3C");
    }

    /**
     * @param other a {@link com.github.pires.obd.commands.temperature.CatalystTemperatureB1S1ObdCommand} object.
     */
    public CatalystTemperatureB1S1ObdCommand(CatalystTemperatureB1S1ObdCommand other) {
        super(other);
    }

    @Override
    protected void performCalculations() {
        double a = buffer.get(2);
        double b = buffer.get(3);
        temperature = (a * 256 + b) / 10 - 40
    }

    @Override
    public String getName() {
        return AvailableCommandNames.CATALYST_TEMPERATURE_B1_S1.getValue();
    }

}
