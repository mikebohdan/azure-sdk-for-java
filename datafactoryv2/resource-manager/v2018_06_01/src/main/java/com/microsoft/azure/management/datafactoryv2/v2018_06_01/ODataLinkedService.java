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
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.datafactoryv2.v2018_06_01.implementation.LinkedServiceInner;

/**
 * Open Data Protocol (OData) linked service.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("OData")
@JsonFlatten
public class ODataLinkedService extends LinkedServiceInner {
    /**
     * The URL of the OData service endpoint. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.url", required = true)
    private Object url;

    /**
     * Type of authentication used to connect to the OData service. Possible
     * values include: 'Basic', 'Anonymous', 'Windows', 'AadServicePrincipal',
     * 'ManagedServiceIdentity'.
     */
    @JsonProperty(value = "typeProperties.authenticationType")
    private ODataAuthenticationType authenticationType;

    /**
     * User name of the OData service. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "typeProperties.userName")
    private Object userName;

    /**
     * Password of the OData service.
     */
    @JsonProperty(value = "typeProperties.password")
    private SecretBase password;

    /**
     * Specify the tenant information (domain name or tenant ID) under which
     * your application resides. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "typeProperties.tenant")
    private Object tenant;

    /**
     * Specify the application id of your application registered in Azure
     * Active Directory. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.servicePrincipalId")
    private Object servicePrincipalId;

    /**
     * Specify the resource you are requesting authorization to use Directory.
     * Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.aadResourceId")
    private Object aadResourceId;

    /**
     * Specify the credential type (key or cert) is used for service principal.
     * Possible values include: 'ServicePrincipalKey', 'ServicePrincipalCert'.
     */
    @JsonProperty(value = "typeProperties.aadServicePrincipalCredentialType")
    private ODataAadServicePrincipalCredentialType aadServicePrincipalCredentialType;

    /**
     * Specify the secret of your application registered in Azure Active
     * Directory. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.servicePrincipalKey")
    private SecretBase servicePrincipalKey;

    /**
     * Specify the base64 encoded certificate of your application registered in
     * Azure Active Directory. Type: string (or Expression with resultType
     * string).
     */
    @JsonProperty(value = "typeProperties.servicePrincipalEmbeddedCert")
    private SecretBase servicePrincipalEmbeddedCert;

    /**
     * Specify the password of your certificate if your certificate has a
     * password and you are using AadServicePrincipal authentication. Type:
     * string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.servicePrincipalEmbeddedCertPassword")
    private SecretBase servicePrincipalEmbeddedCertPassword;

    /**
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get the URL of the OData service endpoint. Type: string (or Expression with resultType string).
     *
     * @return the url value
     */
    public Object url() {
        return this.url;
    }

    /**
     * Set the URL of the OData service endpoint. Type: string (or Expression with resultType string).
     *
     * @param url the url value to set
     * @return the ODataLinkedService object itself.
     */
    public ODataLinkedService withUrl(Object url) {
        this.url = url;
        return this;
    }

    /**
     * Get type of authentication used to connect to the OData service. Possible values include: 'Basic', 'Anonymous', 'Windows', 'AadServicePrincipal', 'ManagedServiceIdentity'.
     *
     * @return the authenticationType value
     */
    public ODataAuthenticationType authenticationType() {
        return this.authenticationType;
    }

    /**
     * Set type of authentication used to connect to the OData service. Possible values include: 'Basic', 'Anonymous', 'Windows', 'AadServicePrincipal', 'ManagedServiceIdentity'.
     *
     * @param authenticationType the authenticationType value to set
     * @return the ODataLinkedService object itself.
     */
    public ODataLinkedService withAuthenticationType(ODataAuthenticationType authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get user name of the OData service. Type: string (or Expression with resultType string).
     *
     * @return the userName value
     */
    public Object userName() {
        return this.userName;
    }

    /**
     * Set user name of the OData service. Type: string (or Expression with resultType string).
     *
     * @param userName the userName value to set
     * @return the ODataLinkedService object itself.
     */
    public ODataLinkedService withUserName(Object userName) {
        this.userName = userName;
        return this;
    }

    /**
     * Get password of the OData service.
     *
     * @return the password value
     */
    public SecretBase password() {
        return this.password;
    }

    /**
     * Set password of the OData service.
     *
     * @param password the password value to set
     * @return the ODataLinkedService object itself.
     */
    public ODataLinkedService withPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Get specify the tenant information (domain name or tenant ID) under which your application resides. Type: string (or Expression with resultType string).
     *
     * @return the tenant value
     */
    public Object tenant() {
        return this.tenant;
    }

    /**
     * Set specify the tenant information (domain name or tenant ID) under which your application resides. Type: string (or Expression with resultType string).
     *
     * @param tenant the tenant value to set
     * @return the ODataLinkedService object itself.
     */
    public ODataLinkedService withTenant(Object tenant) {
        this.tenant = tenant;
        return this;
    }

    /**
     * Get specify the application id of your application registered in Azure Active Directory. Type: string (or Expression with resultType string).
     *
     * @return the servicePrincipalId value
     */
    public Object servicePrincipalId() {
        return this.servicePrincipalId;
    }

    /**
     * Set specify the application id of your application registered in Azure Active Directory. Type: string (or Expression with resultType string).
     *
     * @param servicePrincipalId the servicePrincipalId value to set
     * @return the ODataLinkedService object itself.
     */
    public ODataLinkedService withServicePrincipalId(Object servicePrincipalId) {
        this.servicePrincipalId = servicePrincipalId;
        return this;
    }

    /**
     * Get specify the resource you are requesting authorization to use Directory. Type: string (or Expression with resultType string).
     *
     * @return the aadResourceId value
     */
    public Object aadResourceId() {
        return this.aadResourceId;
    }

    /**
     * Set specify the resource you are requesting authorization to use Directory. Type: string (or Expression with resultType string).
     *
     * @param aadResourceId the aadResourceId value to set
     * @return the ODataLinkedService object itself.
     */
    public ODataLinkedService withAadResourceId(Object aadResourceId) {
        this.aadResourceId = aadResourceId;
        return this;
    }

    /**
     * Get specify the credential type (key or cert) is used for service principal. Possible values include: 'ServicePrincipalKey', 'ServicePrincipalCert'.
     *
     * @return the aadServicePrincipalCredentialType value
     */
    public ODataAadServicePrincipalCredentialType aadServicePrincipalCredentialType() {
        return this.aadServicePrincipalCredentialType;
    }

    /**
     * Set specify the credential type (key or cert) is used for service principal. Possible values include: 'ServicePrincipalKey', 'ServicePrincipalCert'.
     *
     * @param aadServicePrincipalCredentialType the aadServicePrincipalCredentialType value to set
     * @return the ODataLinkedService object itself.
     */
    public ODataLinkedService withAadServicePrincipalCredentialType(ODataAadServicePrincipalCredentialType aadServicePrincipalCredentialType) {
        this.aadServicePrincipalCredentialType = aadServicePrincipalCredentialType;
        return this;
    }

    /**
     * Get specify the secret of your application registered in Azure Active Directory. Type: string (or Expression with resultType string).
     *
     * @return the servicePrincipalKey value
     */
    public SecretBase servicePrincipalKey() {
        return this.servicePrincipalKey;
    }

    /**
     * Set specify the secret of your application registered in Azure Active Directory. Type: string (or Expression with resultType string).
     *
     * @param servicePrincipalKey the servicePrincipalKey value to set
     * @return the ODataLinkedService object itself.
     */
    public ODataLinkedService withServicePrincipalKey(SecretBase servicePrincipalKey) {
        this.servicePrincipalKey = servicePrincipalKey;
        return this;
    }

    /**
     * Get specify the base64 encoded certificate of your application registered in Azure Active Directory. Type: string (or Expression with resultType string).
     *
     * @return the servicePrincipalEmbeddedCert value
     */
    public SecretBase servicePrincipalEmbeddedCert() {
        return this.servicePrincipalEmbeddedCert;
    }

    /**
     * Set specify the base64 encoded certificate of your application registered in Azure Active Directory. Type: string (or Expression with resultType string).
     *
     * @param servicePrincipalEmbeddedCert the servicePrincipalEmbeddedCert value to set
     * @return the ODataLinkedService object itself.
     */
    public ODataLinkedService withServicePrincipalEmbeddedCert(SecretBase servicePrincipalEmbeddedCert) {
        this.servicePrincipalEmbeddedCert = servicePrincipalEmbeddedCert;
        return this;
    }

    /**
     * Get specify the password of your certificate if your certificate has a password and you are using AadServicePrincipal authentication. Type: string (or Expression with resultType string).
     *
     * @return the servicePrincipalEmbeddedCertPassword value
     */
    public SecretBase servicePrincipalEmbeddedCertPassword() {
        return this.servicePrincipalEmbeddedCertPassword;
    }

    /**
     * Set specify the password of your certificate if your certificate has a password and you are using AadServicePrincipal authentication. Type: string (or Expression with resultType string).
     *
     * @param servicePrincipalEmbeddedCertPassword the servicePrincipalEmbeddedCertPassword value to set
     * @return the ODataLinkedService object itself.
     */
    public ODataLinkedService withServicePrincipalEmbeddedCertPassword(SecretBase servicePrincipalEmbeddedCertPassword) {
        this.servicePrincipalEmbeddedCertPassword = servicePrincipalEmbeddedCertPassword;
        return this;
    }

    /**
     * Get the encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value
     */
    public Object encryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set
     * @return the ODataLinkedService object itself.
     */
    public ODataLinkedService withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

}