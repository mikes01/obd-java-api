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
import com.github.pires.obd.enums.ObdStandard;

public class ObdStandardObdCommand extends ObdCommand {

    private int obdstandard = 0;
    /**
     * Default ctor.
     */
    public ObdStandardObdCommand() {
        super("01 1C");
    }

    /**
     * Copy ctor.
     *
     * @param other a {@link FreezeDTCObdCommand} object.
     */
    public ObdStandardObdCommand(ObdStandardObdCommand other) {
        super(other);
    }

    @Override
    protected void performCalculations() {
        // ignore first two bytes [hh hh] of the response
        obdstandard = buffer.get(2);
    }

    @Override
    public String getFormattedResult() {
        try {
            return ObdStandard.fromValue(obdstandard).getDescription();
        } catch (NullPointerException e) {
            return "-";
        }
    }

    @Override
    public String getCalculatedResult() {
        return String.valueOf(obdstandard);
    }

    @Override
    public String getName() {
        return AvailableCommandNames.OBD_STANDARD.getValue();
    }

}
