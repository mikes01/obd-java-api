package com.github.pires.obd.commands.mikolaj.WRLambdaVoltage;

import com.github.pires.obd.enums.AvailableCommandNames;

/**
 * Created by Mikolaj on 2015-08-01.
 */
public class S7WRLambdaVoltageObdCommand extends WRLambdaVoltageObdCommand {

    public S7WRLambdaVoltageObdCommand() {
        super("01 3A");
    }

    /**
     * @param other a {@link S7WRLambdaVoltageObdCommand} object.
     */
    public S7WRLambdaVoltageObdCommand(S7WRLambdaVoltageObdCommand other) {
        super(other);
    }

    @Override
    public String getName() {
        return AvailableCommandNames.S7_WR_LAMBDA_VOL.getValue();
    }

}