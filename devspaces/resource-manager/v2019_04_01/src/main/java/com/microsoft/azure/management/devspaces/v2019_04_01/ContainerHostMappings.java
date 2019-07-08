/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devspaces.v2019_04_01;

import rx.Observable;
import com.microsoft.azure.management.devspaces.v2019_04_01.implementation.ContainerHostMappingsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ContainerHostMappings.
 */
public interface ContainerHostMappings extends HasInner<ContainerHostMappingsInner> {
    /**
     * Returns container host mapping object for a container host resource ID if an associated controller exists.
     *
     * @param resourceGroupName Resource group to which the resource belongs.
     * @param location Location of the container host.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ContainerHostMapping> getContainerHostMappingAsync(String resourceGroupName, String location);

}