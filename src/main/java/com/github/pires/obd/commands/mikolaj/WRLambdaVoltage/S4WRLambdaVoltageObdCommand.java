package com.github.pires.obd.commands.mikolaj.WRLambdaVoltage;

import com.github.pires.obd.enums.AvailableCommandNames;

/**
 * Created by Mikolaj on 2015-08-01.
 */
public class S4WRLambdaVoltageObdCommand extends WRLambdaVoltageObdCommand {

    public S4WRLambdaVoltageObdCommand() {
        super("01 27");
    }

    /**
     * @param other a {@link S4WRLambdaVoltageObdCommand} object.
     */
    public S4WRLambdaVoltageObdCommand(S4WRLambdaVoltageObdCommand other) {
        super(other);
    }

    @Override
    public String getName() {
        return AvailableCommandNames.S4_WR_LAMBDA_VOL.getValue();
    }

}