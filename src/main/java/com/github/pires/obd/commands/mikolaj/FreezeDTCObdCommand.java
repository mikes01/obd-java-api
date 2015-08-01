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

public class FreezeDTCObdCommand extends ObdCommand {

    /**
     * Default ctor.
     */
    public FreezeDTCObdCommand() {
        super("01 02");
    }

    /**
     * Copy ctor.
     *
     * @param other a {@link FreezeDTCObdCommand} object.
     */
    public FreezeDTCObdCommand(FreezeDTCObdCommand other) {
        super(other);
    }

    @Override
    protected void performCalculations() {

    }


    @Override
    public String getFormattedResult() {
        return Integer.toBinaryString(buffer.get(2) * 256 + buffer.get(3));
    }

    @Override
    public String getCalculatedResult() {
        return Integer.toBinaryString(buffer.get(2) * 256 + buffer.get(3));
    }

    @Override
    public String getName() {
        return AvailableCommandNames.FREEZE_DTC.getValue();
    }

}
