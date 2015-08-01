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
 * MODE 1 PID 0x51 will return one of the following values to identify the fuel
 * type of the vehicle.
 */
public enum ObdStandard {
    STANDARD_1(0x01, "OBD-II as defined by the CARB"),
    STANDARD_2(0x02, "OBD as defined by the EPA"),
    STANDARD_3(0x03, "OBD and OBD-II"),
    STANDARD_4(0x04, "OBD-I"),
    STANDARD_5(0x05, "Not OBD compliant"),
    STANDARD_6(0x06, "EOBD (Europe)"),
    STANDARD_7(0x07, "EOBD and OBD-II"),
    STANDARD_8(0x08, "EOBD and OBD"),
    STANDARD_9(0x09, "EOBD, OBD and OBD II"),
    STANDARD_10(0x0A, "JOBD (Japan)"),
    STANDARD_11(0x0B, "JOBD and OBD II"),
    STANDARD_12(0x0C, "JOBD and EOBD"),
    STANDARD_13(0x0D, "JOBD, EOBD, and OBD II"),
    STANDARD_14(0x0E, "Reserved"),
    STANDARD_15(0x0F, "Reserved"),
    STANDARD_16(0x10, "Reserved"),
    STANDARD_17(0x11, "Engine Manufacturer Diagnostics (EMD)"),
    STANDARD_18(0x12, "Engine Manufacturer Diagnostics Enhanced (EMD+)"),
    STANDARD_19(0x13, "Heavy Duty On-Board Diagnostics (Child/Partial) (HD OBD-C)"),
    STANDARD_20(0x14, "Heavy Duty On-Board Diagnostics (HD OBD)"),
    STANDARD_21(0x15, "World Wide Harmonized OBD (WWH OBD)"),
    STANDARD_22(0x16, "Reserved"),
    STANDARD_23(0x16, "Heavy Duty Euro OBD Stage I without NOx control (HD EOBD-I)"),
    STANDARD_24(0x16, "Heavy Duty Euro OBD Stage I with NOx control (HD EOBD-I N)"),
    STANDARD_25(0x16, "Heavy Duty Euro OBD Stage II without NOx control (HD EOBD-II)"),
    STANDARD_26(0x16, "Heavy Duty Euro OBD Stage II with NOx control (HD EOBD-II N)"),
    STANDARD_27(0x16, "Reserved"),
    STANDARD_28(0x16, "Brazil OBD Phase 1 (OBDBr-1)"),
    STANDARD_29(0x16, "Brazil OBD Phase 2 (OBDBr-2)"),
    STANDARD_30(0x16, "Korean OBD (KOBD)"),
    STANDARD_31(0x16, "India OBD I (IOBD I)"),
    STANDARD_32(0x16, "India OBD II (IOBD II)"),
    STANDARD_33(0x16, "Heavy Duty Euro OBD Stage VI (HD EOBD-IV)");

    private static Map<Integer, ObdStandard> map = new HashMap<Integer, ObdStandard>();

    static {
        for (ObdStandard error : ObdStandard.values())
            map.put(error.getValue(), error);
    }

    private final int value;
    private final String description;

    private ObdStandard(final int value, final String description) {
        this.value = value;
        this.description = description;
    }

    /**
     * <p>fromValue.</p>
     *
     * @param value a int.
     * @return a {@link com.github.pires.obd.enums.FuelType} object.
     */
    public static ObdStandard fromValue(final int value) {
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
     * <p>Getter for the field <code>description</code>.</p>
     *
     * @return a {@link java.lang.String} object.
     */
    public String getDescription() {
        return description;
    }

}
