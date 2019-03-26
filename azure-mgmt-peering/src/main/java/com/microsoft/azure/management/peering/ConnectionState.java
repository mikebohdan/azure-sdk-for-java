/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.peering;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ConnectionState.
 */
public final class ConnectionState extends ExpandableStringEnum<ConnectionState> {
    /** Static value None for ConnectionState. */
    public static final ConnectionState NONE = fromString("None");

    /** Static value PendingApproval for ConnectionState. */
    public static final ConnectionState PENDING_APPROVAL = fromString("PendingApproval");

    /** Static value Approved for ConnectionState. */
    public static final ConnectionState APPROVED = fromString("Approved");

    /** Static value ProvisioningStarted for ConnectionState. */
    public static final ConnectionState PROVISIONING_STARTED = fromString("ProvisioningStarted");

    /** Static value ProvisioningFailed for ConnectionState. */
    public static final ConnectionState PROVISIONING_FAILED = fromString("ProvisioningFailed");

    /** Static value ProvisioningCompleted for ConnectionState. */
    public static final ConnectionState PROVISIONING_COMPLETED = fromString("ProvisioningCompleted");

    /** Static value Validating for ConnectionState. */
    public static final ConnectionState VALIDATING = fromString("Validating");

    /** Static value Active for ConnectionState. */
    public static final ConnectionState ACTIVE = fromString("Active");

    /**
     * Creates or finds a ConnectionState from its string representation.
     * @param name a name to look for
     * @return the corresponding ConnectionState
     */
    @JsonCreator
    public static ConnectionState fromString(String name) {
        return fromString(name, ConnectionState.class);
    }

    /**
     * @return known ConnectionState values
     */
    public static Collection<ConnectionState> values() {
        return values(ConnectionState.class);
    }
}