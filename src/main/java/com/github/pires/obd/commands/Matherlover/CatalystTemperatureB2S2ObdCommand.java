package com.github.pires.obd.commands.temperature;

import com.github.pires.obd.enums.AvailableCommandNames;

/**
 * Temperature of intake air.
 */
public class CatalystTemperatureB2S2ObdCommand extends TemperatureObdCommand {

    public CatalystTemperatureB2S2ObdCommand() {
        super("01 3F");
    }

    /**
     * @param other a {@link com.github.pires.obd.commands.temperature.CatalystTemperatureB2S2ObdCommand} object.
     */
    public CatalystTemperatureB2S2ObdCommand(CatalystTemperatureB2S2ObdCommand other) {
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
        return AvailableCommandNames.CATALYST_TEMPERATURE_B2_S2.getValue();
    }

}
