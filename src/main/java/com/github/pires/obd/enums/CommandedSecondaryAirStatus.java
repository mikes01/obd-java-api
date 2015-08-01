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
package com.github.pires.obd.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * Select one of the Fuel Trim percentage banks to access.
 */
public enum CommandedSecondaryAirStatus {

    SYSTEM_1(0x01, "Upstream"),
    SYSTEM_2(0x02, "Downstream of catalytic converter"),
    SYSTEM_3(0x04, "From the outside atmosphere or off"),
    SYSTEM_4(0x08, "Pump commanded on for diagnostics");

    private static Map<Integer, CommandedSecondaryAirStatus> map = new HashMap<Integer, CommandedSecondaryAirStatus>();

    static {
        for (CommandedSecondaryAirStatus error : CommandedSecondaryAirStatus.values())
            map.put(error.getValue(), error);
    }

    private final int value;
    private final String description;

    private CommandedSecondaryAirStatus(final int value, final String description) {
        this.value = value;
        this.description = description;
    }

    /**
     * <p>fromValue.</p>
     *
     * @param value a int.
     * @return a {@link com.github.pires.obd.enums.FuelSystem} object.
     */
    public static CommandedSecondaryAirStatus fromValue(final int value) {
        return map.get(value);
    }

    /**
     * <p>Getter for the field <code>value</code>.</p>
     *
     * @return a int.
     */
    public int getValue() {
        return value;
    }

    /**
     * <p>Getter for the field <code>bank</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getDescription() {
        return description;
    }

}
