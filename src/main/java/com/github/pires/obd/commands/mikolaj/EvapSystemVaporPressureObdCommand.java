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
package com.github.pires.obd.commands.mikolaj;

import com.github.pires.obd.commands.ObdCommand;
import com.github.pires.obd.enums.AvailableCommandNames;

/**
 * Current speed.
 */
public class EvapSystemVaporPressureObdCommand extends ObdCommand {

    private double pressure = 0;

    /**
     * Default ctor.
     */
    public EvapSystemVaporPressureObdCommand() {
        super("01 32");
    }

    /**
     * Copy ctor.
     *
     * @param other a {@link com.github.pires.obd.commands.mikolaj} object.
     */
    public EvapSystemVaporPressureObdCommand(EvapSystemVaporPressureObdCommand other) {
        super(other);
    }

    @Override
    protected void performCalculations() {
        // Ignore first two bytes [hh hh] of the response.
        double a = buffer.get(2);
        double b = buffer.get(3);
        pressure = (a * 256 + b) / 4;
    }

    public String getFormattedResult() {
        return String.format("%.1f PA", pressure);
    }

    @Override
    public String getCalculatedResult() {
        return String.valueOf(pressure);
    }

    @Override
    public String getName() {
        return AvailableCommandNames.SYSTEM_VAPOR.getValue();
    }

}
