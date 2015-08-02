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
    FUEL_RAIL_PRESSURE2("Fuel Rail Pressure (relative to manifold vacuum)"),
    VIN("Vehicle Identification Number (VIN)"),
    DISTANCE_TRAVELED_MIL_ON("Distance traveled with MIL on"),
    TIME_TRAVELED_MIL_ON("Time run with MIL on"),
    TIME_SINCE_TC_CLEARED("Time since trouble codes cleared"),
    REL_THROTTLE_POS("Relative throttle position"),
    PIDS("Available PIDs"),
    PIDS_2("PIDs supported [21 - 40]"),
    PIDS_3("Available PIDs 3"),
    PIDS_4("Available PIDs 4"),
    ABS_LOAD("Absolute load"),
    ENGINE_OIL_TEMP("Engine oil temperature"),
    FUEL_AIR_COMMANDED("Air/Fuel Ratio"),
    FUEL_AIR_WIDE_COMMANDED("Air/Fuel Wide Ratio"),
    FUEL_AIR_WIDE_COMMANDED_S2("Air/Fuel Wide Ratio sensor 2"),
    FUEL_AIR_WIDE_COMMANDED_S3("Air/Fuel Wide Ratio sensor 3"),
    FUEL_AIR_WIDE_COMMANDED_S4("Air/Fuel Wide Ratio sensor 4"),
    FUEL_AIR_WIDE_COMMANDED_S5("Air/Fuel Wide Ratio sensor 5"),
    FUEL_AIR_WIDE_COMMANDED_S6("Air/Fuel Wide Ratio sensor 6"),
    FUEL_AIR_WIDE_COMMANDED_S7("Air/Fuel Wide Ratio sensor 7"),
    FUEL_AIR_WIDE_COMMANDED_S8("Air/Fuel Wide Ratio sensor 8"),
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
    INTAKE_AIR_TEMP_SENSOR("Intake air temperature sensor"),
    COMMANDED_EGR("Commanded EGR and EGR Error"),
    COMMANDED_EGR_ONLY("Only commanded EGR"),
    EGR_ERROR("EGR error"),
    COMMANDED_DIESEL_INTAKE_AIR_FLOW("Commanded Diesel intake air flow control and relative intake air flow position"),
    EXHAUST_GAS_RECIRCULATION_TEMP("Exhaust gas recirculation temperature"),
    COMMANDED_THROTTLE_ACTUATOR("Commanded throttle actuator control and relative throttle position"),
    FUEL_PRESSURE_CONTROL("Fuel pressure control system"),
    INJECTION_PRESSURE_CONTROL("Injection pressure control system"),
    TURBOCHARGER_COMPRESSOR_INLET("Turbocharger compressor inlet pressure"),
    FUEL_INJECTION_TIMING("Fuel injection timing"),
    ENGINE_COOLANT_TEMPERATURE("Engine coolant temperature"),
    FREEZE_DTC("Freeze DTC"),
    FUEL_SYSTEM("Fuel System"),
    TERM_FUEL("Term Fuel"),
    SHORT_TERM_FUEL_BANK1("Short term fuel trim Bank 1"),
    LONG_TERM_FUEL_BANK1("Long term fuel trim Bank 1"),
    SHORT_TERM_FUEL_BANK2("Short term fuel trim Bank 2"),
    LONG_TERM_FUEL_BANK2("Long term fuel trim Bank 2"),
    COMMANDED_SECONDARY_AIR_STATUS("Commanded secondary air status"),
    OXYGEN_SENSORS_PRESENT("Oxygen sensors present"),
    SECOND_TERM_FUEL("Second term fuel"),
    SHORT_TERM_FUEL_BANK1_SENSOR1("Short term fuel from bank 1 sensor 1"),
    SHORT_TERM_FUEL_BANK1_SENSOR2("Short term fuel from bank 1 sensor 2"),
    SHORT_TERM_FUEL_BANK1_SENSOR3("Short term fuel from bank 1 sensor 3"),
    SHORT_TERM_FUEL_BANK1_SENSOR4("Short term fuel from bank 1 sensor 4"),
    SHORT_TERM_FUEL_BANK2_SENSOR1("Short term fuel from bank 2 sensor 1"),
    SHORT_TERM_FUEL_BANK2_SENSOR2("Short term fuel from bank 2 sensor 2"),
    SHORT_TERM_FUEL_BANK2_SENSOR3("Short term fuel from bank 2 sensor 3"),
    SHORT_TERM_FUEL_BANK2_SENSOR4("Short term fuel from bank 2 sensor 4"),
    OXYGEN_SENSOR("Oxygen sensor"),
    OXYGEN_SENSOR_BANK1_SENSOR1("Oxygen sensor bank 1 sensor 1"),
    OXYGEN_SENSOR_BANK1_SENSOR2("Oxygen sensor bank 1 sensor 2"),
    OXYGEN_SENSOR_BANK1_SENSOR3("Oxygen sensor bank 1 sensor 3"),
    OXYGEN_SENSOR_BANK1_SENSOR4("Oxygen sensor bank 1 sensor 4"),
    OXYGEN_SENSOR_BANK2_SENSOR1("Oxygen sensor bank 2 sensor 1"),
    OXYGEN_SENSOR_BANK2_SENSOR2("Oxygen sensor bank 2 sensor 2"),
    OXYGEN_SENSOR_BANK2_SENSOR3("Oxygen sensor bank 2 sensor 3"),
    OXYGEN_SENSOR_BANK2_SENSOR4("Oxygen sensor bank 2 sensor 4"),
    OBD_STANDARD("OBD standards this vehicle conforms to"),
    AUXILLARY_INPUT_STATUS("Auxillary input status"),
    S1_WR_LAMBDA_ER("O2S1_WR_lambda(1) Equivalence Ratio"),
    S2_WR_LAMBDA_ER("O2S2_WR_lambda(1) Equivalence Ratio"),
    S3_WR_LAMBDA_ER("O2S3_WR_lambda(1) Equivalence Ratio"),
    S4_WR_LAMBDA_ER("O2S4_WR_lambda(1) Equivalence Ratio"),
    S5_WR_LAMBDA_ER("O2S5_WR_lambda(1) Equivalence Ratio"),
    S6_WR_LAMBDA_ER("O2S6_WR_lambda(1) Equivalence Ratio"),
    S7_WR_LAMBDA_ER("O2S7_WR_lambda(1) Equivalence Ratio"),
    S8_WR_LAMBDA_ER("O2S8_WR_lambda(1) Equivalence Ratio"),
    S1_WR_LAMBDA_VOL("O2S1_WR_lambda(1) Voltage"),
    S2_WR_LAMBDA_VOL("O2S2_WR_lambda(1) Voltage"),
    S3_WR_LAMBDA_VOL("O2S3_WR_lambda(1) Voltage"),
    S4_WR_LAMBDA_VOL("O2S4_WR_lambda(1) Voltage"),
    S5_WR_LAMBDA_VOL("O2S5_WR_lambda(1) Voltage"),
    S6_WR_LAMBDA_VOL("O2S6_WR_lambda(1) Voltage"),
    S7_WR_LAMBDA_VOL("O2S7_WR_lambda(1) Voltage"),
    S8_WR_LAMBDA_VOL("O2S8_WR_lambda(1) Voltage"),
    COMMANDED_EVAPORATIVE_PURGE("Commanded evaporative purge"),
    WARM_UPS("Number of warm-ups since codes cleared"),
    SYSTEM_VAPOR("Evap. System Vapor Pressure"),
    BOOST_PREASURE_CONTROL("Boost pressure control"),
    VARIABLE_GEOMETRY_TURBO("Variable Geometry turbo (VGT) control"),
    WASTEGATE_CONTROL("Wastegate control"),
    EXHAUST_PRESSURE("Exhaust pressure"),
    TURBOCHARGER_RPM("Turbocharger RPM"),
    TURBOCHARGER_TEMP1("Turbocharger temperature 1"),
    TURBOCHARGER_TEMP2("Turbocharger temperature 2"),
    CHARGE_AIR_COOLER_TEMP("Charge air cooler temperature (CACT)"),
    EXHAUST_GAS_TEMP_BANK1("Exhaust Gas temperature (EGT) Bank 1"),
    EXHAUST_GAS_TEMP_BANK2("Exhaust Gas temperature (EGT) Bank 2"),
    DIESEL_PARTICULATE_FILTER1("Diesel particulate filter (DPF) 1"),
    DIESEL_PARTICULATE_FILTER2("Diesel particulate filter (DPF) 2"),
    DIESEL_PARTICULATE_FILTER_TEMP("Diesel particulate filter (DPF) temperature"),
    MONITOR_STATUS("Monitor current drive cycle status (bits explained at wiki)"),
    EMISSION_REQUIREMENTS("Emission Requirements (Encoded)"),
    MAX_AIR_FLOW("Maximum value for air flow rate from mass air flow sensor"),
    MAX_VALUE_SENSORS("Maximum value for equivalence ratio, oxygen sensor voltage, oxygen sensor current, and intake manifold absolute pressure"),
    NOx_NTE_CONTROL_AREA_STATUS("NOx NTE control area status"),
    PM_NTE_CONTROL_AREA_STATUS("PM NTE control area status"),
    ENGINE_RUN_TIME("Engine run time"),
    PIDS_8("Available PIDs 8"),
    ENGINE_RUN_TIME_AUX_EMISSION_CONTROL_DEVICE1("Engine run time for Auxiliary Emissions Control Device(AECD) 1"),
    ENGINE_RUN_TIME_AUX_EMISSION_CONTROL_DEVICE2("Engine run time for Auxiliary Emissions Control Device(AECD) 2"),
    NOX_SENSOR("NOx sensor"),
    MANIFOLD_SURFACE_TEMP("Manifold surface temperature"),
    NOX_REAGENT_SYSTEM("NOx reagent system"),
    PM_SENSOR("Particulate matter (PM) sensor"),
    INTAKE_MANIFOLD_ABS_PRESSURE("Intake manifold absolute pressure");


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
