package com.github.pires.obd.commands.mikolaj.WRLambdaVoltage;

import com.github.pires.obd.enums.AvailableCommandNames;

/**
 * Created by Mikolaj on 2015-08-01.
 */
public class S2WRLambdaVoltageObdCommand extends WRLambdaVoltageObdCommand {

    public S2WRLambdaVoltageObdCommand() {
        super("01 25");
    }

    /**
     * @param other a {@link S2WRLambdaVoltageObdCommand} object.
     */
    public S2WRLambdaVoltageObdCommand(S2WRLambdaVoltageObdCommand other) {
        super(other);
    }

    @Override
    public String getName() {
        return AvailableCommandNames.S2_WR_LAMBDA_VOL.getValue();
    }

}