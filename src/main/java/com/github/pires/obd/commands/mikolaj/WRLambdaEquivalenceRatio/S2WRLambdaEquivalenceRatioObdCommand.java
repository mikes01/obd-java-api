package com.github.pires.obd.commands.mikolaj.WRLambdaEquivalenceRatio;

import com.github.pires.obd.enums.AvailableCommandNames;

/**
 * Created by Mikolaj on 2015-08-01.
 */
public class S2WRLambdaEquivalenceRatioObdCommand extends WRLambdaEquivalenceRatioObdCommand {

    public S2WRLambdaEquivalenceRatioObdCommand() {
        super("01 25");
    }

    /**
     * @param other a {@link S2WRLambdaEquivalenceRatioObdCommand} object.
     */
    public S2WRLambdaEquivalenceRatioObdCommand(S2WRLambdaEquivalenceRatioObdCommand other) {
        super(other);
    }

    @Override
    public String getName() {
        return AvailableCommandNames.S2_WR_LAMBDA_ER.getValue();
    }

}