/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2019_06_01;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The retention policy for a container registry.
 */
public class RetentionPolicy {
    /**
     * The number of days to retain manifest before it expires.
     */
    @JsonProperty(value = "days")
    private Integer days;

    /**
     * The timestamp when the policy was last updated.
     */
    @JsonProperty(value = "lastUpdatedTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime lastUpdatedTime;

    /**
     * The value that indicates whether the policy is enabled or not. Possible
     * values include: 'enabled', 'disabled'.
     */
    @JsonProperty(value = "status")
    private PolicyStatus status;

    /**
     * Get the number of days to retain manifest before it expires.
     *
     * @return the days value
     */
    public Integer days() {
        return this.days;
    }

    /**
     * Set the number of days to retain manifest before it expires.
     *
     * @param days the days value to set
     * @return the RetentionPolicy object itself.
     */
    public RetentionPolicy withDays(Integer days) {
        this.days = days;
        return this;
    }

    /**
     * Get the timestamp when the policy was last updated.
     *
     * @return the lastUpdatedTime value
     */
    public DateTime lastUpdatedTime() {
        return this.lastUpdatedTime;
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
     * @return the RetentionPolicy object itself.
     */
    public RetentionPolicy withStatus(PolicyStatus status) {
        this.status = status;
        return this;
    }

}
