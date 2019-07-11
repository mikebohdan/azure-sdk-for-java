/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A copy activity DelimitedText sink.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("DelimitedTextSink")
public class DelimitedTextSink extends CopySink {
    /**
     * DelimitedText store settings.
     */
    @JsonProperty(value = "storeSettings")
    private StoreWriteSettings storeSettings;

    /**
     * DelimitedText format settings.
     */
    @JsonProperty(value = "formatSettings")
    private DelimitedTextWriteSettings formatSettings;

    /**
     * Get delimitedText store settings.
     *
     * @return the storeSettings value
     */
    public StoreWriteSettings storeSettings() {
        return this.storeSettings;
    }

    /**
     * Set delimitedText store settings.
     *
     * @param storeSettings the storeSettings value to set
     * @return the DelimitedTextSink object itself.
     */
    public DelimitedTextSink withStoreSettings(StoreWriteSettings storeSettings) {
        this.storeSettings = storeSettings;
        return this;
    }

    /**
     * Get delimitedText format settings.
     *
     * @return the formatSettings value
     */
    public DelimitedTextWriteSettings formatSettings() {
        return this.formatSettings;
    }

    /**
     * Set delimitedText format settings.
     *
     * @param formatSettings the formatSettings value to set
     * @return the DelimitedTextSink object itself.
     */
    public DelimitedTextSink withFormatSettings(DelimitedTextWriteSettings formatSettings) {
        this.formatSettings = formatSettings;
        return this;
    }

}