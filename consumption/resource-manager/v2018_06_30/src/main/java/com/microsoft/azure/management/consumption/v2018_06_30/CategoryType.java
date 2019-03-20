/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.consumption.v2018_06_30;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for CategoryType.
 */
public final class CategoryType extends ExpandableStringEnum<CategoryType> {
    /** Static value Cost for CategoryType. */
    public static final CategoryType COST = fromString("Cost");

    /** Static value Usage for CategoryType. */
    public static final CategoryType USAGE = fromString("Usage");

    /**
     * Creates or finds a CategoryType from its string representation.
     * @param name a name to look for
     * @return the corresponding CategoryType
     */
    @JsonCreator
    public static CategoryType fromString(String name) {
        return fromString(name, CategoryType.class);
    }

    /**
     * @return known CategoryType values
     */
    public static Collection<CategoryType> values() {
        return values(CategoryType.class);
    }
}
