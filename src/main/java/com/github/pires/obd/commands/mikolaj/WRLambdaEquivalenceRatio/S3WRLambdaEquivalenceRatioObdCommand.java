package com.github.pires.obd.commands.mikolaj.WRLambdaEquivalenceRatio;

import com.github.pires.obd.enums.AvailableCommandNames;

/**
 * Created by Mikolaj on 2015-08-01.
 */
public class S3WRLambdaEquivalenceRatioObdCommand extends WRLambdaEquivalenceRatioObdCommand {

    public S3WRLambdaEquivalenceRatioObdCommand() {
        super("01 26");
    }

    /**
     * @param other a {@link S3WRLambdaEquivalenceRatioObdCommand} object.
     */
    public S3WRLambdaEquivalenceRatioObdCommand(S3WRLambdaEquivalenceRatioObdCommand other) {
        super(other);
    }

    @Override
    public String getName() {
        return AvailableCommandNames.S3_WR_LAMBDA_ER.getValue();
    }

}