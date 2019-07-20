/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes the parameters for resuming a cluster upgrade.
 */
public class ResumeClusterUpgradeDescription {
    /**
     * The next upgrade domain for this cluster upgrade.
     */
    @JsonProperty(value = "UpgradeDomain", required = true)
    private String upgradeDomain;

    /**
     * Get the next upgrade domain for this cluster upgrade.
     *
     * @return the upgradeDomain value
     */
    public String upgradeDomain() {
        return this.upgradeDomain;
    }

    /**
     * Set the next upgrade domain for this cluster upgrade.
     *
     * @param upgradeDomain the upgradeDomain value to set
     * @return the ResumeClusterUpgradeDescription object itself.
     */
    public ResumeClusterUpgradeDescription withUpgradeDomain(String upgradeDomain) {
        this.upgradeDomain = upgradeDomain;
        return this;
    }

}