/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlabs.v2016_05_15.implementation;

import com.microsoft.azure.management.devtestlabs.v2016_05_15.GenerateUploadUriResponse;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class GenerateUploadUriResponseImpl extends WrapperImpl<GenerateUploadUriResponseInner> implements GenerateUploadUriResponse {
    private final DevTestLabsManager manager;
    GenerateUploadUriResponseImpl(GenerateUploadUriResponseInner inner, DevTestLabsManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public DevTestLabsManager manager() {
        return this.manager;
    }

    @Override
    public String uploadUri() {
        return this.inner().uploadUri();
    }

}