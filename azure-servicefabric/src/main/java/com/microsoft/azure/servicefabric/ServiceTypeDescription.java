/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Describes a service type defined in the service manifest of a provisioned
 * application type. The properties the ones defined in the service manifest.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("ServiceTypeDescription")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Stateful", value = StatefulServiceTypeDescription.class),
    @JsonSubTypes.Type(name = "Stateless", value = StatelessServiceTypeDescription.class)
})
public class ServiceTypeDescription {
    /**
     * Indicates whether the service type is a stateful service type or a
     * stateless service type. This property is true if the service type is a
     * stateful service type, false otherwise.
     */
    @JsonProperty(value = "IsStateful")
    private Boolean isStateful;

    /**
     * Name of the service type as specified in the service manifest.
     */
    @JsonProperty(value = "ServiceTypeName")
    private String serviceTypeName;

    /**
     * The placement constraint to be used when instantiating this service in a
     * Service Fabric cluster.
     */
    @JsonProperty(value = "PlacementConstraints")
    private String placementConstraints;

    /**
     * The service load metrics is given as an array of
     * ServiceLoadMetricDescription objects.
     */
    @JsonProperty(value = "LoadMetrics")
    private List<ServiceLoadMetricDescription> loadMetrics;

    /**
     * List of service placement policy descriptions.
     */
    @JsonProperty(value = "ServicePlacementPolicies")
    private List<ServicePlacementPolicyDescription> servicePlacementPolicies;

    /**
     * List of service type extensions.
     */
    @JsonProperty(value = "Extensions")
    private List<ServiceTypeExtensionDescription> extensions;

    /**
     * Get indicates whether the service type is a stateful service type or a stateless service type. This property is true if the service type is a stateful service type, false otherwise.
     *
     * @return the isStateful value
     */
    public Boolean isStateful() {
        return this.isStateful;
    }

    /**
     * Set indicates whether the service type is a stateful service type or a stateless service type. This property is true if the service type is a stateful service type, false otherwise.
     *
     * @param isStateful the isStateful value to set
     * @return the ServiceTypeDescription object itself.
     */
    public ServiceTypeDescription withIsStateful(Boolean isStateful) {
        this.isStateful = isStateful;
        return this;
    }

    /**
     * Get name of the service type as specified in the service manifest.
     *
     * @return the serviceTypeName value
     */
    public String serviceTypeName() {
        return this.serviceTypeName;
    }

    /**
     * Set name of the service type as specified in the service manifest.
     *
     * @param serviceTypeName the serviceTypeName value to set
     * @return the ServiceTypeDescription object itself.
     */
    public ServiceTypeDescription withServiceTypeName(String serviceTypeName) {
        this.serviceTypeName = serviceTypeName;
        return this;
    }

    /**
     * Get the placement constraint to be used when instantiating this service in a Service Fabric cluster.
     *
     * @return the placementConstraints value
     */
    public String placementConstraints() {
        return this.placementConstraints;
    }

    /**
     * Set the placement constraint to be used when instantiating this service in a Service Fabric cluster.
     *
     * @param placementConstraints the placementConstraints value to set
     * @return the ServiceTypeDescription object itself.
     */
    public ServiceTypeDescription withPlacementConstraints(String placementConstraints) {
        this.placementConstraints = placementConstraints;
        return this;
    }

    /**
     * Get the service load metrics is given as an array of ServiceLoadMetricDescription objects.
     *
     * @return the loadMetrics value
     */
    public List<ServiceLoadMetricDescription> loadMetrics() {
        return this.loadMetrics;
    }

    /**
     * Set the service load metrics is given as an array of ServiceLoadMetricDescription objects.
     *
     * @param loadMetrics the loadMetrics value to set
     * @return the ServiceTypeDescription object itself.
     */
    public ServiceTypeDescription withLoadMetrics(List<ServiceLoadMetricDescription> loadMetrics) {
        this.loadMetrics = loadMetrics;
        return this;
    }

    /**
     * Get list of service placement policy descriptions.
     *
     * @return the servicePlacementPolicies value
     */
    public List<ServicePlacementPolicyDescription> servicePlacementPolicies() {
        return this.servicePlacementPolicies;
    }

    /**
     * Set list of service placement policy descriptions.
     *
     * @param servicePlacementPolicies the servicePlacementPolicies value to set
     * @return the ServiceTypeDescription object itself.
     */
    public ServiceTypeDescription withServicePlacementPolicies(List<ServicePlacementPolicyDescription> servicePlacementPolicies) {
        this.servicePlacementPolicies = servicePlacementPolicies;
        return this;
    }

    /**
     * Get list of service type extensions.
     *
     * @return the extensions value
     */
    public List<ServiceTypeExtensionDescription> extensions() {
        return this.extensions;
    }

    /**
     * Set list of service type extensions.
     *
     * @param extensions the extensions value to set
     * @return the ServiceTypeDescription object itself.
     */
    public ServiceTypeDescription withExtensions(List<ServiceTypeExtensionDescription> extensions) {
        this.extensions = extensions;
        return this;
    }

}