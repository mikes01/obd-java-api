package com.github.pires.obd.commands.temperature;

import com.github.pires.obd.enums.AvailableCommandNames;

/**
 * Temperature of intake air.
 */
public class CatalystTemperatureB1S2ObdCommand extends TemperatureObdCommand {

    public CatalystTemperatureB1S2ObdCommand() {
        super("01 3E");
    }

    /**
     * @param other a {@link com.github.pires.obd.commands.temperature.CatalystTemperatureB1S2ObdCommand} object.
     */
    public CatalystTemperatureB1S2ObdCommand(CatalystTemperatureB1S2ObdCommand other) {
        super(other);
    }

    @Override
    protected void performCalculations() {
        float a = buffer.get(2);
        float b = buffer.get(3);
        temperature = (a * 256 + b) / 10 - 40;
    }

    @Override
    public String getName() {
        return AvailableCommandNames.CATALYST_TEMPERATURE_B1_S2.getValue();
    }

}
