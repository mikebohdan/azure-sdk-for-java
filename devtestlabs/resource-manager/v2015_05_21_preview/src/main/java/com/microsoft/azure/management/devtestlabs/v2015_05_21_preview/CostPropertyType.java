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
 * Defines values for CostPropertyType.
 */
public final class CostPropertyType extends ExpandableStringEnum<CostPropertyType> {
    /** Static value Unavailable for CostPropertyType. */
    public static final CostPropertyType UNAVAILABLE = fromString("Unavailable");

    /** Static value Reported for CostPropertyType. */
    public static final CostPropertyType REPORTED = fromString("Reported");

    /** Static value Projected for CostPropertyType. */
    public static final CostPropertyType PROJECTED = fromString("Projected");

    /**
     * Creates or finds a CostPropertyType from its string representation.
     * @param name a name to look for
     * @return the corresponding CostPropertyType
     */
    @JsonCreator
    public static CostPropertyType fromString(String name) {
        return fromString(name, CostPropertyType.class);
    }

    /**
     * @return known CostPropertyType values
     */
    public static Collection<CostPropertyType> values() {
        return values(CostPropertyType.class);
    }
}