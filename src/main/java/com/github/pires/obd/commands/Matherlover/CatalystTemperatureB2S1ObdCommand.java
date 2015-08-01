package com.github.pires.obd.commands.temperature;

import com.github.pires.obd.enums.AvailableCommandNames;

/**
 * Temperature of intake air.
 */
public class CatalystTemperatureB2S1ObdCommand extends TemperatureObdCommand {

    public CatalystTemperatureB2S1ObdCommand() {
        super("01 3D");
    }

    /**
     * @param other a {@link com.github.pires.obd.commands.temperature.CatalystTemperatureB2S1ObdCommand} object.
     */
    public CatalystTemperatureB2S1ObdCommand(CatalystTemperatureB2S1ObdCommand other) {
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
        return AvailableCommandNames.CATALYST_TEMPERATURE_B2_S1.getValue();
    }

}
