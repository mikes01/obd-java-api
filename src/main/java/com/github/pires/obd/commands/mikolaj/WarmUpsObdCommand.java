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

/**
 * Current speed.
 */
public class WarmUpsObdCommand extends ObdCommand {

    private int warmups = 0;

    /**
     * Default ctor.
     */
    public WarmUpsObdCommand() {
        super("01 30");
    }

    /**
     * Copy ctor.
     *
     * @param other a {@link com.github.pires.obd.commands.mikolaj} object.
     */
    public WarmUpsObdCommand(WarmUpsObdCommand other) {
        super(other);
    }

    @Override
    protected void performCalculations() {
        // Ignore first two bytes [hh hh] of the response.
        warmups = buffer.get(2);
    }

    public String getFormattedResult() {
        return String.format("%d", warmups);
    }

    @Override
    public String getCalculatedResult() {
        return String.valueOf(warmups);
    }

    @Override
    public String getName() {
        return AvailableCommandNames.WARM_UPS.getValue();
    }

}
