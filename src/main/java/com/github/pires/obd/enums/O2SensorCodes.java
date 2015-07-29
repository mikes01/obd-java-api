package com.github.pires.obd.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by bartek on 29.07.2015.
 */
public enum O2SensorCodes {
    SENSOR_1(1, "01 35"),
    SENSOR_2(2, "01 36"),
    SENSOR_3(3, "01 37"),
    SENSOR_4(4, "01 38"),
    SENSOR_5(5, "01 39"),
    SENSOR_6(6, "01 3A"),
    SENSOR_7(7, "01 3B"),
    SENSOR_8(8, "01 3C");


    private static Map<Integer, O2SensorCodes> map = new HashMap<Integer, O2SensorCodes>();

    static {
        for (O2SensorCodes error : O2SensorCodes.values())
            map.put(error.getValue(), error);
    }

    private final int value;
    private final String code;

    private O2SensorCodes(final int value, final String code) {
        this.value = value;
        this.code = code;
    }

    public static O2SensorCodes fromValue(final int value) {
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
    public String getCode() {
        return code;
    }
}
