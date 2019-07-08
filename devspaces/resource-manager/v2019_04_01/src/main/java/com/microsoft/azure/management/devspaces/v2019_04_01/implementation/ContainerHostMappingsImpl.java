/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.devspaces.v2019_04_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.devspaces.v2019_04_01.ContainerHostMappings;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.devspaces.v2019_04_01.ContainerHostMapping;

class ContainerHostMappingsImpl extends WrapperImpl<ContainerHostMappingsInner> implements ContainerHostMappings {
    private final DevSpacesManager manager;

    ContainerHostMappingsImpl(DevSpacesManager manager) {
        super(manager.inner().containerHostMappings());
        this.manager = manager;
    }

    public DevSpacesManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ContainerHostMapping> getContainerHostMappingAsync(String resourceGroupName, String location) {
        ContainerHostMappingsInner client = this.inner();
        return client.getContainerHostMappingAsync(resourceGroupName, location)
        .map(new Func1<ContainerHostMappingInner, ContainerHostMapping>() {
            @Override
            public ContainerHostMapping call(ContainerHostMappingInner inner) {
                return new ContainerHostMappingImpl(inner, manager());
            }
        });
    }

}