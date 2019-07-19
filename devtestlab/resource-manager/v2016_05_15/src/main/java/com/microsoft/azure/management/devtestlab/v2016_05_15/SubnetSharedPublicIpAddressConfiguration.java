/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlab.v2016_05_15;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Configuration for public IP address sharing.
 */
public class SubnetSharedPublicIpAddressConfiguration {
    /**
     * Backend ports that virtual machines on this subnet are allowed to
     * expose.
     */
    @JsonProperty(value = "allowedPorts")
    private List<Port> allowedPorts;

    /**
     * Get backend ports that virtual machines on this subnet are allowed to expose.
     *
     * @return the allowedPorts value
     */
    public List<Port> allowedPorts() {
        return this.allowedPorts;
    }

    /**
     * Set backend ports that virtual machines on this subnet are allowed to expose.
     *
     * @param allowedPorts the allowedPorts value to set
     * @return the SubnetSharedPublicIpAddressConfiguration object itself.
     */
    public SubnetSharedPublicIpAddressConfiguration withAllowedPorts(List<Port> allowedPorts) {
        this.allowedPorts = allowedPorts;
        return this;
    }

}