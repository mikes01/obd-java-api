package com.github.pires.obd.commands.mikolaj.WRLambdaVoltage;

import com.github.pires.obd.enums.AvailableCommandNames;

/**
 * Created by Mikolaj on 2015-08-01.
 */
public class S5WRLambdaVoltageObdCommand extends WRLambdaVoltageObdCommand {

    public S5WRLambdaVoltageObdCommand() {
        super("01 28");
    }

    /**
     * @param other a {@link S5WRLambdaVoltageObdCommand} object.
     */
    public S5WRLambdaVoltageObdCommand(S5WRLambdaVoltageObdCommand other) {
        super(other);
    }

    @Override
    public String getName() {
        return AvailableCommandNames.S5_WR_LAMBDA_VOL.getValue();
    }

}