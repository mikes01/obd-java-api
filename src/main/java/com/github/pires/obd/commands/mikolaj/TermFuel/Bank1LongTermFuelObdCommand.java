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
package com.github.pires.obd.commands.mikolaj.TermFuel;

import com.github.pires.obd.enums.AvailableCommandNames;

/**
 * Temperature of intake air.
 */
public class Bank1LongTermFuelObdCommand extends TermFuelObdCommand {

    public Bank1LongTermFuelObdCommand() {
        super("01 07");
    }

    /**
     * @param other a {@link Bank1ShortTermFuelObdCommand} object.
     */
    public Bank1LongTermFuelObdCommand(Bank1LongTermFuelObdCommand other) {
        super(other);
    }

    @Override
    public String getName() {
        return AvailableCommandNames.LONG_TERM_FUEL_BANK1.getValue();
    }

}