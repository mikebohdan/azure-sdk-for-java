/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2018_11_01_preview.implementation;

import com.microsoft.azure.management.billing.v2018_11_01_preview.Address;
import java.util.List;
import com.microsoft.azure.management.billing.v2018_11_01_preview.EnabledAzureSKUs;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * A billing profile resource.
 */
@JsonFlatten
public class BillingProfileInner extends ProxyResource {
    /**
     * The billing profile name.
     */
    @JsonProperty(value = "properties.displayName")
    private String displayName;

    /**
     * Purchase order number.
     */
    @JsonProperty(value = "properties.poNumber")
    private String poNumber;

    /**
     * Billing address.
     */
    @JsonProperty(value = "properties.address")
    private Address address;

    /**
     * If the billing profile is opted in to receive invoices via email.
     */
    @JsonProperty(value = "properties.invoiceEmailOptIn", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean invoiceEmailOptIn;

    /**
     * Is OMS bootstrapped billing profile.
     */
    @JsonProperty(value = "properties.isClassic", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isClassic;

    /**
     * Invoice day.
     */
    @JsonProperty(value = "properties.invoiceDay", access = JsonProperty.Access.WRITE_ONLY)
    private Integer invoiceDay;

    /**
     * The currency associated with the billing profile.
     */
    @JsonProperty(value = "properties.currency", access = JsonProperty.Access.WRITE_ONLY)
    private String currency;

    /**
     * Information about the product.
     */
    @JsonProperty(value = "properties.enabledAzureSKUs")
    private List<EnabledAzureSKUs> enabledAzureSKUs;

    /**
     * The invoice sections associated to the billing profile.
     */
    @JsonProperty(value = "properties.invoiceSections")
    private List<InvoiceSectionInner> invoiceSections;

    /**
     * Get the billing profile name.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the billing profile name.
     *
     * @param displayName the displayName value to set
     * @return the BillingProfileInner object itself.
     */
    public BillingProfileInner withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get purchase order number.
     *
     * @return the poNumber value
     */
    public String poNumber() {
        return this.poNumber;
    }

    /**
     * Set purchase order number.
     *
     * @param poNumber the poNumber value to set
     * @return the BillingProfileInner object itself.
     */
    public BillingProfileInner withPoNumber(String poNumber) {
        this.poNumber = poNumber;
        return this;
    }

    /**
     * Get billing address.
     *
     * @return the address value
     */
    public Address address() {
        return this.address;
    }

    /**
     * Set billing address.
     *
     * @param address the address value to set
     * @return the BillingProfileInner object itself.
     */
    public BillingProfileInner withAddress(Address address) {
        this.address = address;
        return this;
    }

    /**
     * Get if the billing profile is opted in to receive invoices via email.
     *
     * @return the invoiceEmailOptIn value
     */
    public Boolean invoiceEmailOptIn() {
        return this.invoiceEmailOptIn;
    }

    /**
     * Get is OMS bootstrapped billing profile.
     *
     * @return the isClassic value
     */
    public Boolean isClassic() {
        return this.isClassic;
    }

    /**
     * Get invoice day.
     *
     * @return the invoiceDay value
     */
    public Integer invoiceDay() {
        return this.invoiceDay;
    }

    /**
     * Get the currency associated with the billing profile.
     *
     * @return the currency value
     */
    public String currency() {
        return this.currency;
    }

    /**
     * Get information about the product.
     *
     * @return the enabledAzureSKUs value
     */
    public List<EnabledAzureSKUs> enabledAzureSKUs() {
        return this.enabledAzureSKUs;
    }

    /**
     * Set information about the product.
     *
     * @param enabledAzureSKUs the enabledAzureSKUs value to set
     * @return the BillingProfileInner object itself.
     */
    public BillingProfileInner withEnabledAzureSKUs(List<EnabledAzureSKUs> enabledAzureSKUs) {
        this.enabledAzureSKUs = enabledAzureSKUs;
        return this;
    }

    /**
     * Get the invoice sections associated to the billing profile.
     *
     * @return the invoiceSections value
     */
    public List<InvoiceSectionInner> invoiceSections() {
        return this.invoiceSections;
    }

    /**
     * Set the invoice sections associated to the billing profile.
     *
     * @param invoiceSections the invoiceSections value to set
     * @return the BillingProfileInner object itself.
     */
    public BillingProfileInner withInvoiceSections(List<InvoiceSectionInner> invoiceSections) {
        this.invoiceSections = invoiceSections;
        return this;
    }

}
