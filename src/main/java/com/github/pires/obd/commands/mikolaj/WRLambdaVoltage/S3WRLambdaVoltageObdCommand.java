package com.github.pires.obd.commands.mikolaj.WRLambdaVoltage;

import com.github.pires.obd.enums.AvailableCommandNames;

/**
 * Created by Mikolaj on 2015-08-01.
 */
public class S3WRLambdaVoltageObdCommand extends WRLambdaVoltageObdCommand {

    public S3WRLambdaVoltageObdCommand() {
        super("01 26");
    }

    /**
     * @param other a {@link S3WRLambdaVoltageObdCommand} object.
     */
    public S3WRLambdaVoltageObdCommand(S3WRLambdaVoltageObdCommand other) {
        super(other);
    }

    @Override
    public String getName() {
        return AvailableCommandNames.S3_WR_LAMBDA_VOL.getValue();
    }

}