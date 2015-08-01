/**
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
/**
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.github.pires.obd.commands.mikolaj.WRLambdaEquivalenceRatio;

import com.github.pires.obd.commands.ObdCommand;

public abstract class WRLambdaEquivalenceRatioObdCommand extends ObdCommand {

    private float ratio = 0.0f;

    /**
     * Default ctor.
     */
    public WRLambdaEquivalenceRatioObdCommand(String cmd) {
        super(cmd);
    }

    /**
     * Copy ctor.
     *
     * @param other a {@link com.github.pires.obd.commands.mikolaj.WRLambdaEquivalenceRatio.WRLambdaEquivalenceRatioObdCommand} object.
     */
    public WRLambdaEquivalenceRatioObdCommand(WRLambdaEquivalenceRatioObdCommand other) {
        super(other);
    }

    @Override
    protected void performCalculations() {
        // ignore first two bytes [hh hh] of the response
        int a = buffer.get(2);
        int b = buffer.get(3);
        ratio = ((a * 256 + b) * 2) / 65535;
    }

    /**
     *
     */
    @Override
    public String getFormattedResult() {
        return String.format("%.1f%s", ratio, getResultUnit());
    }

    @Override
    public String getCalculatedResult() {
        return String.valueOf(ratio);
    }

    @Override
    public String getResultUnit() {
        return "N/A";
    }



}
