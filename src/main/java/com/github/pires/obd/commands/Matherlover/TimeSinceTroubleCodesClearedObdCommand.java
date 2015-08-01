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
package com.github.pires.obd.commands.engine;

import com.github.pires.obd.commands.ObdCommand;
import com.github.pires.obd.enums.AvailableCommandNames;

/**
 * Engine runtime.
 */
public class TimeSinceTroubleCodesClearedObdCommand extends ObdCommand {

    private int value = 0;

    /**
     * Default ctor.
     */
    public TimeSinceTroubleCodesClearedObdCommand() {
        super("01 4E");
    }

    /**
     * Copy ctor.
     *
     * @param other a {@link com.github.pires.obd.commands.engine.TimeSinceTroubleCodesClearedObdCommand} object.
     */
    public TimeSinceTroubleCodesClearedObdCommand(TimeSinceTroubleCodesClearedObdCommand other) {
        super(other);
    }

    @Override
    protected void performCalculations() {
        // ignore first two bytes [01 0C] of the response
        value = buffer.get(2) * 256 + buffer.get(3);
    }

    @Override
    public String getFormattedResult() {
        return String.format("%d%s", value, getResultUnit());
    }

    @Override
    public String getCalculatedResult() {
        return String.valueOf(value);
    }

    @Override
    public String getResultUnit() {
        return "m";
    }

    @Override
    public String getName() {
        return AvailableCommandNames.TIME_SINCE_TROUBLE_CODES_CLEARED.getValue();
    }

}
