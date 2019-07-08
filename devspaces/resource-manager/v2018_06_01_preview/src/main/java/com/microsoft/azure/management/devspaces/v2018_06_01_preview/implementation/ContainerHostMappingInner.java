/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devspaces.v2018_06_01_preview.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Container host mapping object specifying the Container host resource ID and
 * its associated Controller resource.
 */
public class ContainerHostMappingInner {
    /**
     * ARM ID of the Container Host resource.
     */
    @JsonProperty(value = "containerHostResourceId")
    private String containerHostResourceId;

    /**
     * ARM ID of the mapped Controller resource.
     */
    @JsonProperty(value = "mappedControllerResourceId", access = JsonProperty.Access.WRITE_ONLY)
    private String mappedControllerResourceId;

    /**
     * Get aRM ID of the Container Host resource.
     *
     * @return the containerHostResourceId value
     */
    public String containerHostResourceId() {
        return this.containerHostResourceId;
    }

    /**
     * Set aRM ID of the Container Host resource.
     *
     * @param containerHostResourceId the containerHostResourceId value to set
     * @return the ContainerHostMappingInner object itself.
     */
    public ContainerHostMappingInner withContainerHostResourceId(String containerHostResourceId) {
        this.containerHostResourceId = containerHostResourceId;
        return this;
    }

    /**
     * Get aRM ID of the mapped Controller resource.
     *
     * @return the mappedControllerResourceId value
     */
    public String mappedControllerResourceId() {
        return this.mappedControllerResourceId;
    }

}