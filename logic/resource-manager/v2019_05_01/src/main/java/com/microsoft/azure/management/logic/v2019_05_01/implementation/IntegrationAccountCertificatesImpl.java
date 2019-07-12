/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.logic.v2019_05_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.logic.v2019_05_01.IntegrationAccountCertificates;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.logic.v2019_05_01.IntegrationAccountCertificate;

class IntegrationAccountCertificatesImpl extends WrapperImpl<IntegrationAccountCertificatesInner> implements IntegrationAccountCertificates {
    private final LogicManager manager;

    IntegrationAccountCertificatesImpl(LogicManager manager) {
        super(manager.inner().integrationAccountCertificates());
        this.manager = manager;
    }

    public LogicManager manager() {
        return this.manager;
    }

    @Override
    public IntegrationAccountCertificateImpl define(String name) {
        return wrapModel(name);
    }

    private IntegrationAccountCertificateImpl wrapModel(IntegrationAccountCertificateInner inner) {
        return  new IntegrationAccountCertificateImpl(inner, manager());
    }

    private IntegrationAccountCertificateImpl wrapModel(String name) {
        return new IntegrationAccountCertificateImpl(name, this.manager());
    }

    @Override
    public Observable<IntegrationAccountCertificate> listAsync(final String resourceGroupName, final String integrationAccountName) {
        IntegrationAccountCertificatesInner client = this.inner();
        return client.listAsync(resourceGroupName, integrationAccountName)
        .flatMapIterable(new Func1<Page<IntegrationAccountCertificateInner>, Iterable<IntegrationAccountCertificateInner>>() {
            @Override
            public Iterable<IntegrationAccountCertificateInner> call(Page<IntegrationAccountCertificateInner> page) {
                return page.items();
            }
        })
        .map(new Func1<IntegrationAccountCertificateInner, IntegrationAccountCertificate>() {
            @Override
            public IntegrationAccountCertificate call(IntegrationAccountCertificateInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<IntegrationAccountCertificate> getAsync(String resourceGroupName, String integrationAccountName, String certificateName) {
        IntegrationAccountCertificatesInner client = this.inner();
        return client.getAsync(resourceGroupName, integrationAccountName, certificateName)
        .map(new Func1<IntegrationAccountCertificateInner, IntegrationAccountCertificate>() {
            @Override
            public IntegrationAccountCertificate call(IntegrationAccountCertificateInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String integrationAccountName, String certificateName) {
        IntegrationAccountCertificatesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, integrationAccountName, certificateName).toCompletable();
    }

}
