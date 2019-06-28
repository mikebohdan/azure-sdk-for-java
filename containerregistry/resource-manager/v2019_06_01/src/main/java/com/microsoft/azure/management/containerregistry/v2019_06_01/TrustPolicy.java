/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2019_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The content trust policy for a container registry.
 */
public class TrustPolicy {
    /**
     * The type of trust policy. Possible values include: 'Notary'.
     */
    @JsonProperty(value = "type")
    private TrustPolicyType type;

    /**
     * The value that indicates whether the policy is enabled or not. Possible
     * values include: 'enabled', 'disabled'.
     */
    @JsonProperty(value = "status")
    private PolicyStatus status;

    /**
     * Get the type of trust policy. Possible values include: 'Notary'.
     *
     * @return the type value
     */
    public TrustPolicyType type() {
        return this.type;
    }

    /**
     * Set the type of trust policy. Possible values include: 'Notary'.
     *
     * @param type the type value to set
     * @return the TrustPolicy object itself.
     */
    public TrustPolicy withType(TrustPolicyType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the value that indicates whether the policy is enabled or not. Possible values include: 'enabled', 'disabled'.
     *
     * @return the status value
     */
    public PolicyStatus status() {
        return this.status;
    }

    /**
     * Set the value that indicates whether the policy is enabled or not. Possible values include: 'enabled', 'disabled'.
     *
     * @param status the status value to set
     * @return the TrustPolicy object itself.
     */
    public TrustPolicy withStatus(PolicyStatus status) {
        this.status = status;
        return this;
    }

}
