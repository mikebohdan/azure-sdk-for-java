/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2019_06_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for SecretObjectType.
 */
public final class SecretObjectType extends ExpandableStringEnum<SecretObjectType> {
    /** Static value Opaque for SecretObjectType. */
    public static final SecretObjectType OPAQUE = fromString("Opaque");

    /** Static value Vaultsecret for SecretObjectType. */
    public static final SecretObjectType VAULTSECRET = fromString("Vaultsecret");

    /**
     * Creates or finds a SecretObjectType from its string representation.
     * @param name a name to look for
     * @return the corresponding SecretObjectType
     */
    @JsonCreator
    public static SecretObjectType fromString(String name) {
        return fromString(name, SecretObjectType.class);
    }

    /**
     * @return known SecretObjectType values
     */
    public static Collection<SecretObjectType> values() {
        return values(SecretObjectType.class);
    }
}
