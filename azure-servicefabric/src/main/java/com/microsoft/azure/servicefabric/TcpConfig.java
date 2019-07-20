/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes the tcp configuration for external connectivity for this network.
 */
public class TcpConfig {
    /**
     * tcp gateway config name.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Specifies the port at which the service endpoint below needs to be
     * exposed.
     */
    @JsonProperty(value = "port", required = true)
    private int port;

    /**
     * Describes destination endpoint for routing traffic.
     */
    @JsonProperty(value = "destination", required = true)
    private GatewayDestination destination;

    /**
     * Get tcp gateway config name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set tcp gateway config name.
     *
     * @param name the name value to set
     * @return the TcpConfig object itself.
     */
    public TcpConfig withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get specifies the port at which the service endpoint below needs to be exposed.
     *
     * @return the port value
     */
    public int port() {
        return this.port;
    }

    /**
     * Set specifies the port at which the service endpoint below needs to be exposed.
     *
     * @param port the port value to set
     * @return the TcpConfig object itself.
     */
    public TcpConfig withPort(int port) {
        this.port = port;
        return this;
    }

    /**
     * Get describes destination endpoint for routing traffic.
     *
     * @return the destination value
     */
    public GatewayDestination destination() {
        return this.destination;
    }

    /**
     * Set describes destination endpoint for routing traffic.
     *
     * @param destination the destination value to set
     * @return the TcpConfig object itself.
     */
    public TcpConfig withDestination(GatewayDestination destination) {
        this.destination = destination;
        return this;
    }

}