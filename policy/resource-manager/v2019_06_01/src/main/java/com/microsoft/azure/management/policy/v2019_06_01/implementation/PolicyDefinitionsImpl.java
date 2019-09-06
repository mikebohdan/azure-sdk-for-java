/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * jkl
 */

package com.microsoft.azure.management.policy.v2019_06_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.policy.v2019_06_01.PolicyDefinitions;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;
import rx.Completable;
import com.microsoft.azure.management.policy.v2019_06_01.PolicyDefinition;
import com.microsoft.azure.arm.utils.PagedListConverter;

class PolicyDefinitionsImpl extends WrapperImpl<PolicyDefinitionsInner> implements PolicyDefinitions {
    private PagedListConverter<PolicyDefinitionInner, PolicyDefinition> converter;
    private final PolicyManager manager;

    PolicyDefinitionsImpl(PolicyManager manager) {
        super(manager.inner().policyDefinitions());
        this.manager = manager;
        this.converter = new PagedListConverter<PolicyDefinitionInner, PolicyDefinition>() {
            @Override
            public Observable<PolicyDefinition> typeConvertAsync(PolicyDefinitionInner inner) {
                return Observable.just((PolicyDefinition) wrapModel(inner));
            }
        };
    }

    public PolicyManager manager() {
        return this.manager;
    }

    @Override
    public PolicyDefinitionImpl define(String name) {
        return wrapModel(name);
    }

    private PolicyDefinitionImpl wrapModel(PolicyDefinitionInner inner) {
        return  new PolicyDefinitionImpl(inner, manager());
    }

    private PolicyDefinitionImpl wrapModel(String name) {
        return new PolicyDefinitionImpl(name, this.manager());
    }

    @Override
    public Completable deleteAsync(String policyDefinitionName) {
        PolicyDefinitionsInner client = this.inner();
        return client.deleteAsync(policyDefinitionName).toCompletable();
    }

    @Override
    public Observable<PolicyDefinition> getAsync(String policyDefinitionName) {
        PolicyDefinitionsInner client = this.inner();
        return client.getAsync(policyDefinitionName)
        .map(new Func1<PolicyDefinitionInner, PolicyDefinition>() {
            @Override
            public PolicyDefinition call(PolicyDefinitionInner inner) {
                return new PolicyDefinitionImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<PolicyDefinition> getBuiltInAsync(String policyDefinitionName) {
        PolicyDefinitionsInner client = this.inner();
        return client.getBuiltInAsync(policyDefinitionName)
        .map(new Func1<PolicyDefinitionInner, PolicyDefinition>() {
            @Override
            public PolicyDefinition call(PolicyDefinitionInner inner) {
                return new PolicyDefinitionImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<PolicyDefinition> createOrUpdateAtManagementGroupAsync(String policyDefinitionName, String managementGroupId, PolicyDefinitionInner parameters) {
        PolicyDefinitionsInner client = this.inner();
        return client.createOrUpdateAtManagementGroupAsync(policyDefinitionName, managementGroupId, parameters)
        .map(new Func1<PolicyDefinitionInner, PolicyDefinition>() {
            @Override
            public PolicyDefinition call(PolicyDefinitionInner inner) {
                return new PolicyDefinitionImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable deleteAtManagementGroupAsync(String policyDefinitionName, String managementGroupId) {
        PolicyDefinitionsInner client = this.inner();
        return client.deleteAtManagementGroupAsync(policyDefinitionName, managementGroupId).toCompletable();
    }

    @Override
    public Observable<PolicyDefinition> getAtManagementGroupAsync(String policyDefinitionName, String managementGroupId) {
        PolicyDefinitionsInner client = this.inner();
        return client.getAtManagementGroupAsync(policyDefinitionName, managementGroupId)
        .map(new Func1<PolicyDefinitionInner, PolicyDefinition>() {
            @Override
            public PolicyDefinition call(PolicyDefinitionInner inner) {
                return new PolicyDefinitionImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<PolicyDefinition> listByManagementGroupAsync(final String managementGroupId) {
        PolicyDefinitionsInner client = this.inner();
        return client.listByManagementGroupAsync(managementGroupId)
        .flatMapIterable(new Func1<Page<PolicyDefinitionInner>, Iterable<PolicyDefinitionInner>>() {
            @Override
            public Iterable<PolicyDefinitionInner> call(Page<PolicyDefinitionInner> page) {
                return page.items();
            }
        })
        .map(new Func1<PolicyDefinitionInner, PolicyDefinition>() {
            @Override
            public PolicyDefinition call(PolicyDefinitionInner inner) {
                return new PolicyDefinitionImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<PolicyDefinition> listBuiltInAsync() {
        PolicyDefinitionsInner client = this.inner();
        return client.listBuiltInAsync()
        .flatMapIterable(new Func1<Page<PolicyDefinitionInner>, Iterable<PolicyDefinitionInner>>() {
            @Override
            public Iterable<PolicyDefinitionInner> call(Page<PolicyDefinitionInner> page) {
                return page.items();
            }
        })
        .map(new Func1<PolicyDefinitionInner, PolicyDefinition>() {
            @Override
            public PolicyDefinition call(PolicyDefinitionInner inner) {
                return new PolicyDefinitionImpl(inner, manager());
            }
        });
    }

    @Override
    public PagedList<PolicyDefinition> list() {
        PolicyDefinitionsInner client = this.inner();
        return converter.convert(client.list());
    }

    @Override
    public Observable<PolicyDefinition> listAsync() {
        PolicyDefinitionsInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<PolicyDefinitionInner>, Iterable<PolicyDefinitionInner>>() {
            @Override
            public Iterable<PolicyDefinitionInner> call(Page<PolicyDefinitionInner> page) {
                return page.items();
            }
        })
        .map(new Func1<PolicyDefinitionInner, PolicyDefinition>() {
            @Override
            public PolicyDefinition call(PolicyDefinitionInner inner) {
                return wrapModel(inner);
            }
        });
    }

}
