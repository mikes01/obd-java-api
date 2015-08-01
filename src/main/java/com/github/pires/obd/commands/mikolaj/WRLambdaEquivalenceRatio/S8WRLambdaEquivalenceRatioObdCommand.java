package com.github.pires.obd.commands.mikolaj.WRLambdaEquivalenceRatio;

import com.github.pires.obd.enums.AvailableCommandNames;

/**
 * Created by Mikolaj on 2015-08-01.
 */
public class S8WRLambdaEquivalenceRatioObdCommand extends WRLambdaEquivalenceRatioObdCommand {

    public S8WRLambdaEquivalenceRatioObdCommand() {
        super("01 2B");
    }

    /**
     * @param other a {@link S8WRLambdaEquivalenceRatioObdCommand} object.
     */
    public S8WRLambdaEquivalenceRatioObdCommand(S8WRLambdaEquivalenceRatioObdCommand other) {
        super(other);
    }

    @Override
    public String getName() {
        return AvailableCommandNames.S8_WR_LAMBDA_ER.getValue();
    }

}