package com.github.pires.obd.commands.mikolaj.WRLambdaEquivalenceRatio;

import com.github.pires.obd.enums.AvailableCommandNames;

/**
 * Created by Mikolaj on 2015-08-01.
 */
public class S1WRLambdaEquivalenceRatioObdCommand extends WRLambdaEquivalenceRatioObdCommand {

    public S1WRLambdaEquivalenceRatioObdCommand() {
        super("01 24");
    }

    /**
     * @param other a {@link com.github.pires.obd.commands.mikolaj.WRLambdaEquivalenceRatio.WRLambdaEquivalenceRatioObdCommand} object.
     */
    public S1WRLambdaEquivalenceRatioObdCommand(WRLambdaEquivalenceRatioObdCommand other) {
        super(other);
    }

    @Override
    public String getName() {
        return AvailableCommandNames.S1_WR_LAMBDA_ER.getValue();
    }

}