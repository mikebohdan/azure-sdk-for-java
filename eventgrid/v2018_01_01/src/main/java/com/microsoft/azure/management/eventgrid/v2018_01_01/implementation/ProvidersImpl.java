/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.eventgrid.v2018_01_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.eventgrid.v2018_01_01.Providers;
import com.microsoft.azure.management.eventgrid.v2018_01_01.ProviderEventTypes;

class ProvidersImpl extends WrapperImpl<TopicsInner> implements Providers {
    private final EventGridManager manager;

    ProvidersImpl(EventGridManager manager) {
        super(manager.inner().topics());
        this.manager = manager;
    }

    @Override
    public ProviderEventTypes eventTypes() {
        ProviderEventTypes accessor = this.manager().providerEventTypes();
        return accessor;
    }

    public EventGridManager manager() {
        return this.manager;
    }

}