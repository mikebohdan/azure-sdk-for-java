/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_12_01.implementation;

import com.microsoft.azure.management.network.v2018_12_01.FrontendIPConfiguration;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.network.v2018_12_01.IPAllocationMethod;
import com.microsoft.azure.management.network.v2018_12_01.PublicIPAddress;
import com.microsoft.azure.management.network.v2018_12_01.Subnet;

class FrontendIPConfigurationImpl extends IndexableRefreshableWrapperImpl<FrontendIPConfiguration, FrontendIPConfigurationInner> implements FrontendIPConfiguration {
    private final NetworkManager manager;
    private String resourceGroupName;
    private String loadBalancerName;
    private String frontendIPConfigurationName;

    FrontendIPConfigurationImpl(FrontendIPConfigurationInner inner,  NetworkManager manager) {
        super(null, inner);
        this.manager = manager;
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.loadBalancerName = IdParsingUtils.getValueFromIdByName(inner.id(), "loadBalancers");
        this.frontendIPConfigurationName = IdParsingUtils.getValueFromIdByName(inner.id(), "frontendIPConfigurations");
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<FrontendIPConfigurationInner> getInnerAsync() {
        LoadBalancerFrontendIPConfigurationsInner client = this.manager().inner().loadBalancerFrontendIPConfigurations();
        return client.getAsync(this.resourceGroupName, this.loadBalancerName, this.frontendIPConfigurationName);
    }



    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public List<SubResource> inboundNatPools() {
        return this.inner().inboundNatPools();
    }

    @Override
    public List<SubResource> inboundNatRules() {
        return this.inner().inboundNatRules();
    }

    @Override
    public List<SubResource> loadBalancingRules() {
        return this.inner().loadBalancingRules();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public List<SubResource> outboundRules() {
        return this.inner().outboundRules();
    }

    @Override
    public String privateIPAddress() {
        return this.inner().privateIPAddress();
    }

    @Override
    public IPAllocationMethod privateIPAllocationMethod() {
        return this.inner().privateIPAllocationMethod();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public PublicIPAddress publicIPAddress() {
        PublicIPAddressInner inner = this.inner().publicIPAddress();
        if (inner != null) {
            return  new PublicIPAddressImpl(inner.name(), inner, manager());
        } else {
            return null;
        }
    }

    @Override
    public SubResource publicIPPrefix() {
        return this.inner().publicIPPrefix();
    }

    @Override
    public Subnet subnet() {
        SubnetInner inner = this.inner().subnet();
        if (inner != null) {
            return  new SubnetImpl(inner, manager());
        } else {
            return null;
        }
    }

    @Override
    public List<String> zones() {
        return this.inner().zones();
    }

}
