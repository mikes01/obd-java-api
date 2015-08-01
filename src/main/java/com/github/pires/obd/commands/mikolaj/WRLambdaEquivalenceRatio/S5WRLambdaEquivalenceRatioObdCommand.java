package com.github.pires.obd.commands.mikolaj.WRLambdaEquivalenceRatio;

import com.github.pires.obd.enums.AvailableCommandNames;

/**
 * Created by Mikolaj on 2015-08-01.
 */
public class S5WRLambdaEquivalenceRatioObdCommand extends WRLambdaEquivalenceRatioObdCommand {

    public S5WRLambdaEquivalenceRatioObdCommand() {
        super("01 28");
    }

    /**
     * @param other a {@link S5WRLambdaEquivalenceRatioObdCommand} object.
     */
    public S5WRLambdaEquivalenceRatioObdCommand(S5WRLambdaEquivalenceRatioObdCommand other) {
        super(other);
    }

    @Override
    public String getName() {
        return AvailableCommandNames.S5_WR_LAMBDA_ER.getValue();
    }

}