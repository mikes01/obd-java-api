package com.github.pires.obd.commands.mikolaj.WRLambdaEquivalenceRatio;

import com.github.pires.obd.enums.AvailableCommandNames;

/**
 * Created by Mikolaj on 2015-08-01.
 */
public class S7WRLambdaEquivalenceRatioObdCommand extends WRLambdaEquivalenceRatioObdCommand {

    public S7WRLambdaEquivalenceRatioObdCommand() {
        super("01 2A");
    }

    /**
     * @param other a {@link S7WRLambdaEquivalenceRatioObdCommand} object.
     */
    public S7WRLambdaEquivalenceRatioObdCommand(S7WRLambdaEquivalenceRatioObdCommand other) {
        super(other);
    }

    @Override
    public String getName() {
        return AvailableCommandNames.S7_WR_LAMBDA_ER.getValue();
    }

}