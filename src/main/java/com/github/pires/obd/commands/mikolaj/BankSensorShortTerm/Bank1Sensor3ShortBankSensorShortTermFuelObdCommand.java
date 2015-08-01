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

import com.github.pires.obd.commands.mikolaj.TermFuel.Bank1ShortTermFuelObdCommand;
import com.github.pires.obd.enums.AvailableCommandNames;

/**
 * Temperature of intake air.
 */
public class Bank1Sensor3ShortBankSensorShortTermFuelObdCommand extends BankSensorShortTermObdCommand {

    public Bank1Sensor3ShortBankSensorShortTermFuelObdCommand() {
        super("01 16");
    }

    /**
     * @param other a {@link Bank1ShortTermFuelObdCommand} object.
     */
    public Bank1Sensor3ShortBankSensorShortTermFuelObdCommand(Bank1Sensor3ShortBankSensorShortTermFuelObdCommand other) {
        super(other);
    }

    @Override
    public String getName() {
        return AvailableCommandNames.SHORT_TERM_FUEL_BANK1_SENSOR3.getValue();
    }

}