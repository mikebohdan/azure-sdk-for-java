/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2019_06_01.implementation;

import com.microsoft.azure.management.containerregistry.v2019_06_01.RegistryListCredentialsResult;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;
import com.microsoft.azure.management.containerregistry.v2019_06_01.RegistryPassword;

class RegistryListCredentialsResultImpl extends WrapperImpl<RegistryListCredentialsResultInner> implements RegistryListCredentialsResult {
    private final ContainerRegistryManager manager;
    RegistryListCredentialsResultImpl(RegistryListCredentialsResultInner inner, ContainerRegistryManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public ContainerRegistryManager manager() {
        return this.manager;
    }

    @Override
    public List<RegistryPassword> passwords() {
        return this.inner().passwords();
    }

    @Override
    public String username() {
        return this.inner().username();
    }

}
