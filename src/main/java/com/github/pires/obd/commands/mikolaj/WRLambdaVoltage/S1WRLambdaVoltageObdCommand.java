package com.github.pires.obd.commands.mikolaj.WRLambdaVoltage;

import com.github.pires.obd.enums.AvailableCommandNames;

/**
 * Created by Mikolaj on 2015-08-01.
 */
public class S1WRLambdaVoltageObdCommand extends WRLambdaVoltageObdCommand {

    public S1WRLambdaVoltageObdCommand() {
        super("01 24");
    }

    /**
     * @param other a {@link S1WRLambdaVoltageObdCommand} object.
     */
    public S1WRLambdaVoltageObdCommand(S1WRLambdaVoltageObdCommand other) {
        super(other);
    }

    @Override
    public String getName() {
        return AvailableCommandNames.S1_WR_LAMBDA_VOL.getValue();
    }

}