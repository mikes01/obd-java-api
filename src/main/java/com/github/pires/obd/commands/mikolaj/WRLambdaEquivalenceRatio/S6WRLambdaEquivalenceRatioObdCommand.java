package com.github.pires.obd.commands.mikolaj.WRLambdaEquivalenceRatio;

import com.github.pires.obd.enums.AvailableCommandNames;

/**
 * Created by Mikolaj on 2015-08-01.
 */
public class S6WRLambdaEquivalenceRatioObdCommand extends WRLambdaEquivalenceRatioObdCommand {

    public S6WRLambdaEquivalenceRatioObdCommand() {
        super("01 29");
    }

    /**
     * @param other a {@link S6WRLambdaEquivalenceRatioObdCommand} object.
     */
    public S6WRLambdaEquivalenceRatioObdCommand(S6WRLambdaEquivalenceRatioObdCommand other) {
        super(other);
    }

    @Override
    public String getName() {
        return AvailableCommandNames.S6_WR_LAMBDA_ER.getValue();
    }

}