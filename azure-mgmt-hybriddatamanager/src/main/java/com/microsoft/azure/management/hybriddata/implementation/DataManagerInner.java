/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hybriddata.implementation;

import com.microsoft.azure.management.hybriddata.Sku;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.Resource;

/**
 * The DataManager resource.
 */
public class DataManagerInner extends Resource {
    /**
     * Etag of the Resource.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * The sku type.
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /**
     * Get etag of the Resource.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set etag of the Resource.
     *
     * @param etag the etag value to set
     * @return the DataManagerInner object itself.
     */
    public DataManagerInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the sku type.
     *
     * @return the sku value
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku type.
     *
     * @param sku the sku value to set
     * @return the DataManagerInner object itself.
     */
    public DataManagerInner withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

}
