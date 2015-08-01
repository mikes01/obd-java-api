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
public enum FuelSystem {

    SYSTEM_1(0x01, "Open loop due to insufficient engine temperature"),
    SYSTEM_2(0x02, "Closed loop, using oxygen sensor feedback to determine fuel mix"),
    SYSTEM_3(0x04, "Open loop due to engine load OR fuel cut due to deceleration"),
    SYSTEM_4(0x08, "Open loop due to system failure"),
    SYSTEM_5(0x10, "Closed loop, using at least one oxygen sensor but there is a fault in the feedback system");

    private static Map<Integer, FuelSystem> map = new HashMap<Integer, FuelSystem>();

    static {
        for (FuelSystem error : FuelSystem.values())
            map.put(error.getValue(), error);
    }

    private final int value;
    private final String description;

    private FuelSystem(final int value, final String description) {
        this.value = value;
        this.description = description;
    }

    /**
     * <p>fromValue.</p>
     *
     * @param value a int.
     * @return a {@link com.github.pires.obd.enums.FuelSystem} object.
     */
    public static FuelSystem fromValue(final int value) {
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

    /**
     * <p>buildObdCommand.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public final String buildObdCommand() {
        return new String("01 " + value);
    }

}
