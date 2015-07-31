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
package com.github.pires.obd.commands.pressure;

import com.github.pires.obd.enums.AvailableCommandNames;

public class EvapObdCommand extends PressureObdCommand {

    public EvapObdCommand() {
        super("01 54");
    }

    /**
     * @param other a {@link com.github.pires.obd.commands.pressure.EvapObdCommand} object.
     */
    public EvapObdCommand(EvapObdCommand other) {
        super(other);
    }

    /**
     * {@inheritDoc}
     *
     * TODO describe of why we multiply by 3
     */
    @Override
    protected final int preparePressureValue() {
        double a = buffer.get(2);
        double b = buffer.get(3);
        return ((a * 256 + b) - 32767) / 1000;
    }

    @Override
    public String getName() {
        return AvailableCommandNames.EVAP.getValue();
    }

}
