package com.github.pires.obd.commands.mikolaj.WRLambdaEquivalenceRatio;

import com.github.pires.obd.enums.AvailableCommandNames;

/**
 * Created by Mikolaj on 2015-08-01.
 */
public class S4WRLambdaEquivalenceRatioObdCommand extends WRLambdaEquivalenceRatioObdCommand {

    public S4WRLambdaEquivalenceRatioObdCommand() {
        super("01 27");
    }

    /**
     * @param other a {@link S4WRLambdaEquivalenceRatioObdCommand} object.
     */
    public S4WRLambdaEquivalenceRatioObdCommand(S4WRLambdaEquivalenceRatioObdCommand other) {
        super(other);
    }

    @Override
    public String getName() {
        return AvailableCommandNames.S4_WR_LAMBDA_ER.getValue();
    }

}