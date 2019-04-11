/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hybriddata.implementation;

import com.microsoft.azure.AzureClient;
import com.microsoft.azure.AzureServiceClient;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.RestClient;

/**
 * Initializes a new instance of the HybridDataManagementClientImpl class.
 */
public class HybridDataManagementClientImpl extends AzureServiceClient {
    /** the {@link AzureClient} used for long running operations. */
    private AzureClient azureClient;

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    public AzureClient getAzureClient() {
        return this.azureClient;
    }

    /** The API Version. */
    private String apiVersion;

    /**
     * Gets The API Version.
     *
     * @return the apiVersion value.
     */
    public String apiVersion() {
        return this.apiVersion;
    }

    /** The Subscription Id. */
    private String subscriptionId;

    /**
     * Gets The Subscription Id.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Sets The Subscription Id.
     *
     * @param subscriptionId the subscriptionId value.
     * @return the service client itself
     */
    public HybridDataManagementClientImpl withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /** The preferred language for the response. */
    private String acceptLanguage;

    /**
     * Gets The preferred language for the response.
     *
     * @return the acceptLanguage value.
     */
    public String acceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * Sets The preferred language for the response.
     *
     * @param acceptLanguage the acceptLanguage value.
     * @return the service client itself
     */
    public HybridDataManagementClientImpl withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /** The retry timeout in seconds for Long Running Operations. Default value is 30. */
    private int longRunningOperationRetryTimeout;

    /**
     * Gets The retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    public int longRunningOperationRetryTimeout() {
        return this.longRunningOperationRetryTimeout;
    }

    /**
     * Sets The retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     * @return the service client itself
     */
    public HybridDataManagementClientImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
        this.longRunningOperationRetryTimeout = longRunningOperationRetryTimeout;
        return this;
    }

    /** Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true. */
    private boolean generateClientRequestId;

    /**
     * Gets Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @return the generateClientRequestId value.
     */
    public boolean generateClientRequestId() {
        return this.generateClientRequestId;
    }

    /**
     * Sets Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @param generateClientRequestId the generateClientRequestId value.
     * @return the service client itself
     */
    public HybridDataManagementClientImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * The OperationsInner object to access its operations.
     */
    private OperationsInner operations;

    /**
     * Gets the OperationsInner object to access its operations.
     * @return the OperationsInner object.
     */
    public OperationsInner operations() {
        return this.operations;
    }

    /**
     * The DataManagersInner object to access its operations.
     */
    private DataManagersInner dataManagers;

    /**
     * Gets the DataManagersInner object to access its operations.
     * @return the DataManagersInner object.
     */
    public DataManagersInner dataManagers() {
        return this.dataManagers;
    }

    /**
     * The DataServicesInner object to access its operations.
     */
    private DataServicesInner dataServices;

    /**
     * Gets the DataServicesInner object to access its operations.
     * @return the DataServicesInner object.
     */
    public DataServicesInner dataServices() {
        return this.dataServices;
    }

    /**
     * The JobDefinitionsInner object to access its operations.
     */
    private JobDefinitionsInner jobDefinitions;

    /**
     * Gets the JobDefinitionsInner object to access its operations.
     * @return the JobDefinitionsInner object.
     */
    public JobDefinitionsInner jobDefinitions() {
        return this.jobDefinitions;
    }

    /**
     * The JobsInner object to access its operations.
     */
    private JobsInner jobs;

    /**
     * Gets the JobsInner object to access its operations.
     * @return the JobsInner object.
     */
    public JobsInner jobs() {
        return this.jobs;
    }

    /**
     * The DataStoresInner object to access its operations.
     */
    private DataStoresInner dataStores;

    /**
     * Gets the DataStoresInner object to access its operations.
     * @return the DataStoresInner object.
     */
    public DataStoresInner dataStores() {
        return this.dataStores;
    }

    /**
     * The DataStoreTypesInner object to access its operations.
     */
    private DataStoreTypesInner dataStoreTypes;

    /**
     * Gets the DataStoreTypesInner object to access its operations.
     * @return the DataStoreTypesInner object.
     */
    public DataStoreTypesInner dataStoreTypes() {
        return this.dataStoreTypes;
    }

    /**
     * The PublicKeysInner object to access its operations.
     */
    private PublicKeysInner publicKeys;

    /**
     * Gets the PublicKeysInner object to access its operations.
     * @return the PublicKeysInner object.
     */
    public PublicKeysInner publicKeys() {
        return this.publicKeys;
    }

    /**
     * Initializes an instance of HybridDataManagementClient client.
     *
     * @param credentials the management credentials for Azure
     */
    public HybridDataManagementClientImpl(ServiceClientCredentials credentials) {
        this("https://management.azure.com", credentials);
    }

    /**
     * Initializes an instance of HybridDataManagementClient client.
     *
     * @param baseUrl the base URL of the host
     * @param credentials the management credentials for Azure
     */
    public HybridDataManagementClientImpl(String baseUrl, ServiceClientCredentials credentials) {
        super(baseUrl, credentials);
        initialize();
    }

    /**
     * Initializes an instance of HybridDataManagementClient client.
     *
     * @param restClient the REST client to connect to Azure.
     */
    public HybridDataManagementClientImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    protected void initialize() {
        this.apiVersion = "2016-06-01";
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.operations = new OperationsInner(restClient().retrofit(), this);
        this.dataManagers = new DataManagersInner(restClient().retrofit(), this);
        this.dataServices = new DataServicesInner(restClient().retrofit(), this);
        this.jobDefinitions = new JobDefinitionsInner(restClient().retrofit(), this);
        this.jobs = new JobsInner(restClient().retrofit(), this);
        this.dataStores = new DataStoresInner(restClient().retrofit(), this);
        this.dataStoreTypes = new DataStoreTypesInner(restClient().retrofit(), this);
        this.publicKeys = new PublicKeysInner(restClient().retrofit(), this);
        this.azureClient = new AzureClient(this);
    }

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    @Override
    public String userAgent() {
        return String.format("%s (%s, %s, auto-generated)", super.userAgent(), "HybridDataManagementClient", "2016-06-01");
    }
}
