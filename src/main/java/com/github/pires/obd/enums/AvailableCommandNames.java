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

/**
 * Names of all available commands.
 */
public enum AvailableCommandNames {

    AIR_INTAKE_TEMP("Air Intake Temperature"),
    CATALYST_TEMPERATURE_B1_S1("Catalyst Temperature Bank 1 Sensor 1"),
    CATALYST_TEMPERATURE_B1_S2("Catalyst Temperature Bank 1 Sensor 2"),
    CATALYST_TEMPERATURE_B2_S1("Catalyst Temperature Bank 2 Sensor 1"),
    CATALYST_TEMPERATURE_B2_S2("Catalyst Temperature Bank 2 Sensor 2"),
    AMBIENT_AIR_TEMP("Ambient Air Temperature"),
    ENGINE_COOLANT_TEMP("Engine Coolant Temperature"),
    BAROMETRIC_PRESSURE("Barometric Pressure"),
    FUEL_PRESSURE("Fuel Pressure"),
    INTAKE_MANIFOLD_PRESSURE("Intake Manifold Pressure"),
    ENGINE_LOAD("Engine Load"),
    ENGINE_RUNTIME("Engine Runtime"),
    ENGINE_RUNTIME_WITH_MIL("Engine Runtime With MIL On"),
    TIME_SINCE_TROUBLE_CODES_CLEARED("Time Since Trouble Codes Cleared"),
    ENGINE_RPM("Engine RPM"),
    SPEED("Vehicle Speed"),
    MAF("Mass Air Flow"),
    THROTTLE_POS("Throttle Position"),
    COMMANDED_THROTTLE_ACTUATOR("Commanded Throttle Actuator"),
    ABSOLUTE_THROTTLE_POS_B("Absolute Throttle Position B"),
    ABSOLUTE_THROTTLE_POS_C("Absolute Throttle Position C"),
    ABSOLUTE_THROTTLE_POS_D("Absolute Throttle Position D"),
    ABSOLUTE_THROTTLE_POS_E("Absolute Throttle Position E"),
    ABSOLUTE_THROTTLE_POS_F("Absolute Throttle Position F"),
    RELATIVE_THROTTLE_POS("Relative Throttle Position"),
    HYBRID_BATTERY_REMAINING("Hybrid Battery Remaining"),
    RELATIVE_ACCELERATOR_PEDAL_POS("Relative Accelerator Pedal Position"),
    ETHANOL_FUEL("Ethanol Fuel"),
    TROUBLE_CODES("Trouble Codes"),
    FUEL_LEVEL("Fuel Level"),
    FUEL_TYPE("Fuel Type"),
    FUEL_CONSUMPTION("Fuel Consumption"),
    FUEL_ECONOMY("Fuel Economy"),
    FUEL_ECONOMY_WITH_MAF("Fuel Economy 2"),
    FUEL_ECONOMY_WITHOUT_MAF("Fuel Economy 3"),
    TIMING_ADVANCE("Timing Advance"),
    DTC_NUMBER("Diagnostic Trouble Codes"),
    EQUIV_RATIO("Command Equivalence Ratio"),
    DISTANCE_TRAVELED_AFTER_CODES_CLEARED("Distance since codes cleared"),
    CONTROL_MODULE_VOLTAGE("Control Module Power Supply "),
    ENGINE_FUEL_RATE("Engine Fuel Rate"),
    FUEL_RAIL_PRESSURE("Fuel Rail Pressure"),
    VIN("Vehicle Identification Number (VIN)"),
    DISTANCE_TRAVELED_MIL_ON("Distance traveled with MIL on"),
    TIME_TRAVELED_MIL_ON("Time run with MIL on"),
    TIME_SINCE_TC_CLEARED("Time since trouble codes cleared"),
    REL_THROTTLE_POS("Relative throttle position"),
    PIDS("Available PIDs"),
    PIDS_3("Available PIDs 3"),
    PIDS_4("Available PIDs 4"),
    ABS_LOAD("Absolute load"),
    ENGINE_OIL_TEMP("Engine oil temperature"),
    FUEL_AIR_COMMANDED("Air/Fuel Ratio"),
    FUEL_AIR_WIDE_COMMANDED("Air/Fuel Wide Ratio"),
    O2_SENSOR_EQUIVALENCE("O2 Sensor Heater Circuit Malfunction Equivalence"),
    O2_SENSOR_AMPERAGE("O2 Sensor Heater Circuit Malfunction Amperage"),
    DRIVERS_DEMAND_ENGINE("Drivers Demand Engine - Percent Torque"),
    ACTUAL_ENGINE("Actual engine - percent torque"),
    ENGINE_REFERENCE_TORQUE("Engine reference torque"),
    ENGINE_PERCENT_TORQUE_DATA("Engine percent torque data"),
    AUX_IO("Auxiliary input / output supported"),
    MAF_SENSOR("Mass air flow sensor"),
    LONG_TERM_SECONDARY_OXYGEN_B2_B4("Long Term Secondary Oxygen Bank 2 And Bank 4"),
    SHORT_TERM_SECONDARY_OXYGEN_B2_B4("Short Term Secondary Oxygen Bank 2 And Bank 4"),
    LONG_TERM_SECONDARY_OXYGEN_B1_B3("Long Term Secondary Oxygen Bank 1 And Bank 3"),
    SHORT_TERM_SECONDARY_OXYGEN_B1_B3("Short Term Secondary Oxygen Bank 1 And Bank 3"),
    ABSOLUTE_EVAP("Absolute Evap system Vapor Pressure"),
    EVAP("Evap system vapor pressure"),
    FUEL_RAIL_ABSOLUTE("Fuel rail pressure (absolute)"),
    ENGINE_COOLANT_TEMPERATURE("Engine coolant temperature"),
    INTAKE_AIR_TEMP_SENSOR("Intake air temperature sensor"),
    COMMANDED_EGR("Commanded EGR and EGR Error"),
    COMMANDED_DIESEL_INTAKE_AIR_FLOW("Commanded Diesel intake air flow control and relative intake air flow position"),
    EXHAUST_GAS_RECIRCULATION_TEMP("Exhaust gas recirculation temperature"),
    COMMANDED_THROTTLE_ACTUATOR("Commanded throttle actuator control and relative throttle position"),
    FUEL_PRESSURE_CONTROL("Fuel pressure control system"),
    INJECTION_PRESSURE_CONTROL("Injection pressure control system"),
    TURBOCHARGER_COMPRESSOR_INLET("Turbocharger compressor inlet pressure");

    private final String value;

    /**
     * @param value
     */
    private AvailableCommandNames(String value) {
        this.value = value;
    }

    /**
     * @return a {@link String} object.
     */
    public final String getValue() {
        return value;
    }

}
