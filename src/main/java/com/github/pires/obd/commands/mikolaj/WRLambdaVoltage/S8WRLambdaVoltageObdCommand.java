package com.github.pires.obd.commands.mikolaj.WRLambdaVoltage;

import com.github.pires.obd.enums.AvailableCommandNames;

/**
 * Created by Mikolaj on 2015-08-01.
 */
public class S8WRLambdaVoltageObdCommand extends WRLambdaVoltageObdCommand {

    public S8WRLambdaVoltageObdCommand() {
        super("01 3B");
    }

    /**
     * @param other a {@link S8WRLambdaVoltageObdCommand} object.
     */
    public S8WRLambdaVoltageObdCommand(S8WRLambdaVoltageObdCommand other) {
        super(other);
    }

    @Override
    public String getName() {
        return AvailableCommandNames.S8_WR_LAMBDA_VOL.getValue();
    }

}