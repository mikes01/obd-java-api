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


import com.github.pires.obd.enums.AvailableCommandNames;

/**
 * Temperature of intake air.
 */
public class Bank2Sensor4ShortBankSensorShortTermFuelObdCommand extends BankSensorShortTermObdCommand {

    public Bank2Sensor4ShortBankSensorShortTermFuelObdCommand() {
        super("01 1B");
    }

    /**
     * @param other a {@link Bank2Sensor4ShortBankSensorShortTermFuelObdCommand} object.
     */
    public Bank2Sensor4ShortBankSensorShortTermFuelObdCommand(Bank2Sensor4ShortBankSensorShortTermFuelObdCommand other) {
        super(other);
    }

    @Override
    public String getName() {
        return AvailableCommandNames.SHORT_TERM_FUEL_BANK2_SENSOR4.getValue();
    }

}