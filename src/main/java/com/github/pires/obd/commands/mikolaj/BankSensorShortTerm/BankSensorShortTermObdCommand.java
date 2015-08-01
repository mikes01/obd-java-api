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
package com.github.pires.obd.commands.mikolaj.BankSensorShortTerm;

import com.github.pires.obd.commands.ObdCommand;
import com.github.pires.obd.enums.AvailableCommandNames;

public class BankSensorShortTermObdCommand extends ObdCommand {

    // Equivalent ratio (L/h)
    private float termfuel = 0.0f;

    /**
     * Default ctor.
     */
    public BankSensorShortTermObdCommand(String cmd) {
        super(cmd);
    }

    /**
     * Copy ctor.
     *
     * @param other a {@link BankSensorShortTermObdCommand} object.
     */
    public BankSensorShortTermObdCommand(BankSensorShortTermObdCommand other) {
        super(other);
    }

    @Override
    protected void performCalculations() {
        // ignore first two bytes [hh hh] of the response
        int b = buffer.get(3);
        termfuel = ((b - 128) * 100) / 128;
    }

    /**
     *
     */
    @Override
    public String getFormattedResult() {
        return String.format("%.1f%s", termfuel, getResultUnit());
    }

    @Override
    public String getCalculatedResult() {
        return String.valueOf(termfuel);
    }

    @Override
    public String getResultUnit() {
        return "%";
    }

    @Override
    public String getName() {
        return AvailableCommandNames.SECOND_TERM_FUEL.getValue();
    }

}
