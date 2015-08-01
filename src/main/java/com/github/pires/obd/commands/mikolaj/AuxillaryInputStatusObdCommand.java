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

public class AuxillaryInputStatusObdCommand extends ObdCommand {

    /**
     * Default ctor.
     */
    public AuxillaryInputStatusObdCommand() {
        super("01 1E");
    }

    /**
     * Copy ctor.
     *
     * @param other a {@link AuxillaryInputStatusObdCommand} object.
     */
    public AuxillaryInputStatusObdCommand(AuxillaryInputStatusObdCommand other) {
        super(other);
    }

    @Override
    protected void performCalculations() {

    }


    @Override
    public String getFormattedResult() {
        return Integer.toBinaryString(buffer.get(2));
    }

    @Override
    public String getCalculatedResult() {
        return Integer.toBinaryString(buffer.get(2));
    }

    @Override
    public String getName() {
        return AvailableCommandNames.AUXILLARY_INPUT_STATUS.getValue();
    }

}
