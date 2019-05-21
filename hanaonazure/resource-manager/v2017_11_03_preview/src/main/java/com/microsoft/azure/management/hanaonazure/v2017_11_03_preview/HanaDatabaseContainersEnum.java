/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hanaonazure.v2017_11_03_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for HanaDatabaseContainersEnum.
 */
public final class HanaDatabaseContainersEnum extends ExpandableStringEnum<HanaDatabaseContainersEnum> {
    /** Static value single for HanaDatabaseContainersEnum. */
    public static final HanaDatabaseContainersEnum SINGLE = fromString("single");

    /** Static value multiple for HanaDatabaseContainersEnum. */
    public static final HanaDatabaseContainersEnum MULTIPLE = fromString("multiple");

    /**
     * Creates or finds a HanaDatabaseContainersEnum from its string representation.
     * @param name a name to look for
     * @return the corresponding HanaDatabaseContainersEnum
     */
    @JsonCreator
    public static HanaDatabaseContainersEnum fromString(String name) {
        return fromString(name, HanaDatabaseContainersEnum.class);
    }

    /**
     * @return known HanaDatabaseContainersEnum values
     */
    public static Collection<HanaDatabaseContainersEnum> values() {
        return values(HanaDatabaseContainersEnum.class);
    }
}