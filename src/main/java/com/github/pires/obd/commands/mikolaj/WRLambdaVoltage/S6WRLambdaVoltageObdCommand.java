package com.github.pires.obd.commands.mikolaj.WRLambdaVoltage;

import com.github.pires.obd.enums.AvailableCommandNames;

/**
 * Created by Mikolaj on 2015-08-01.
 */
public class S6WRLambdaVoltageObdCommand extends WRLambdaVoltageObdCommand {

    public S6WRLambdaVoltageObdCommand() {
        super("01 29");
    }

    /**
     * @param other a {@link S6WRLambdaVoltageObdCommand} object.
     */
    public S6WRLambdaVoltageObdCommand(S6WRLambdaVoltageObdCommand other) {
        super(other);
    }

    @Override
    public String getName() {
        return AvailableCommandNames.S6_WR_LAMBDA_VOL.getValue();
    }

}