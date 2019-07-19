/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlabs.v2015_05_21_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for LinuxOsState.
 */
public final class LinuxOsState extends ExpandableStringEnum<LinuxOsState> {
    /** Static value NonDeprovisioned for LinuxOsState. */
    public static final LinuxOsState NON_DEPROVISIONED = fromString("NonDeprovisioned");

    /** Static value DeprovisionRequested for LinuxOsState. */
    public static final LinuxOsState DEPROVISION_REQUESTED = fromString("DeprovisionRequested");

    /** Static value DeprovisionApplied for LinuxOsState. */
    public static final LinuxOsState DEPROVISION_APPLIED = fromString("DeprovisionApplied");

    /**
     * Creates or finds a LinuxOsState from its string representation.
     * @param name a name to look for
     * @return the corresponding LinuxOsState
     */
    @JsonCreator
    public static LinuxOsState fromString(String name) {
        return fromString(name, LinuxOsState.class);
    }

    /**
     * @return known LinuxOsState values
     */
    public static Collection<LinuxOsState> values() {
        return values(LinuxOsState.class);
    }
}