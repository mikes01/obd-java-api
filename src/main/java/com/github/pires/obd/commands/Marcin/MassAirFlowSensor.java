package com.github.pires.obd.commands.Marcin;

import com.github.pires.obd.commands.ObdCommand;
import com.github.pires.obd.enums.AvailableCommandNames;

/**
 * Created by Marcin on 2015-07-29.
 */
public class MassAirFlowSensor extends ObdCommand {

    private float afr = 0;

    public MassAirFlowSensor() {
        super("01 66");
    }

    @Override
    protected void performCalculations() {
        // ignore first two bytes [01 66] of the response
        float A = buffer.get(2);
        float B = buffer.get(3);
        float C = buffer.get(4);
        float D = buffer.get(5);
        float E = buffer.get(6);
        afr = ( (int)A << 8 ) + ( (int)B << 8 ) + ( (int)C << 8 ) + ( (int)D << 8 ) + ( (int)E << 8 );
    }

    @Override
    public String getFormattedResult() {
        return String.format("%d", getAfr());
    }

    @Override
    public String getCalculatedResult() {
        return String.valueOf(getAfr());
    }

    public double getAfr() {
        return afr;
    }

    @Override
    public String getName() {
        return AvailableCommandNames.MAF_SENSOR.getValue();
    }

}
