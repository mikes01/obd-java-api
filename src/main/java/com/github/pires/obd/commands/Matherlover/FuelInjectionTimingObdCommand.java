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
package com.github.pires.obd.commands.control;

import com.github.pires.obd.commands.PercentageObdCommand;
import com.github.pires.obd.enums.AvailableCommandNames;

/**
 * Timing Advance
 */
public class FuelInjectionTimingObdCommand extends PercentageObdCommand {

    public FuelInjectionTimingObdCommand() {
        super("01 5D");
    }

    /**
     * @param other a {@link com.github.pires.obd.commands.control.FuelInjectionTimingObdCommand} object.
     */
    public FuelInjectionTimingObdCommand(FuelInjectionTimingObdCommand other) {
        super(other);
    }

    @Override
    protected void performCalculations() {
        // ignore first two bytes [hh hh] of the response
        float a = buffer.get(2);
        float b = buffer.get(3);
        percentage = ((a * 256) - 26880) / 128;
    }

    @Override
    public String getName() {
        return AvailableCommandNames.TIMING_ADVANCE.getValue();
    }

}
