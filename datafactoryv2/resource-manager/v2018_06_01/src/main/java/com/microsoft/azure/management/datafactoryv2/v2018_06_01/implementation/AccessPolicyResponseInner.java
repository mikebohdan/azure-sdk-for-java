/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2018_06_01.implementation;

import com.microsoft.azure.management.datafactoryv2.v2018_06_01.UserAccessPolicy;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Get Data Plane read only token response definition.
 */
public class AccessPolicyResponseInner {
    /**
     * The user access policy.
     */
    @JsonProperty(value = "policy")
    private UserAccessPolicy policy;

    /**
     * Data Plane read only access token.
     */
    @JsonProperty(value = "accessToken")
    private String accessToken;

    /**
     * Data Plane service base URL.
     */
    @JsonProperty(value = "dataPlaneUrl")
    private String dataPlaneUrl;

    /**
     * Get the user access policy.
     *
     * @return the policy value
     */
    public UserAccessPolicy policy() {
        return this.policy;
    }

    /**
     * Set the user access policy.
     *
     * @param policy the policy value to set
     * @return the AccessPolicyResponseInner object itself.
     */
    public AccessPolicyResponseInner withPolicy(UserAccessPolicy policy) {
        this.policy = policy;
        return this;
    }

    /**
     * Get data Plane read only access token.
     *
     * @return the accessToken value
     */
    public String accessToken() {
        return this.accessToken;
    }

    /**
     * Set data Plane read only access token.
     *
     * @param accessToken the accessToken value to set
     * @return the AccessPolicyResponseInner object itself.
     */
    public AccessPolicyResponseInner withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    /**
     * Get data Plane service base URL.
     *
     * @return the dataPlaneUrl value
     */
    public String dataPlaneUrl() {
        return this.dataPlaneUrl;
    }

    /**
     * Set data Plane service base URL.
     *
     * @param dataPlaneUrl the dataPlaneUrl value to set
     * @return the AccessPolicyResponseInner object itself.
     */
    public AccessPolicyResponseInner withDataPlaneUrl(String dataPlaneUrl) {
        this.dataPlaneUrl = dataPlaneUrl;
        return this;
    }

}