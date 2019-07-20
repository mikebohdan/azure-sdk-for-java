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

/**
 * Represents health evaluation for a service, containing information about the
 * data and the algorithm used by health store to evaluate health. The
 * evaluation is returned only when the aggregated health state is either Error
 * or Warning.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Kind")
@JsonTypeName("Service")
public class ServiceHealthEvaluation extends HealthEvaluation {
    /**
     * Name of the service whose health evaluation is described by this object.
     */
    @JsonProperty(value = "ServiceName")
    private String serviceName;

    /**
     * List of unhealthy evaluations that led to the current aggregated health
     * state of the service. The types of the unhealthy evaluations can be
     * PartitionsHealthEvaluation or EventHealthEvaluation.
     */
    @JsonProperty(value = "UnhealthyEvaluations")
    private List<HealthEvaluationWrapper> unhealthyEvaluations;

    /**
     * Get name of the service whose health evaluation is described by this object.
     *
     * @return the serviceName value
     */
    public String serviceName() {
        return this.serviceName;
    }

    /**
     * Set name of the service whose health evaluation is described by this object.
     *
     * @param serviceName the serviceName value to set
     * @return the ServiceHealthEvaluation object itself.
     */
    public ServiceHealthEvaluation withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * Get list of unhealthy evaluations that led to the current aggregated health state of the service. The types of the unhealthy evaluations can be PartitionsHealthEvaluation or EventHealthEvaluation.
     *
     * @return the unhealthyEvaluations value
     */
    public List<HealthEvaluationWrapper> unhealthyEvaluations() {
        return this.unhealthyEvaluations;
    }

    /**
     * Set list of unhealthy evaluations that led to the current aggregated health state of the service. The types of the unhealthy evaluations can be PartitionsHealthEvaluation or EventHealthEvaluation.
     *
     * @param unhealthyEvaluations the unhealthyEvaluations value to set
     * @return the ServiceHealthEvaluation object itself.
     */
    public ServiceHealthEvaluation withUnhealthyEvaluations(List<HealthEvaluationWrapper> unhealthyEvaluations) {
        this.unhealthyEvaluations = unhealthyEvaluations;
        return this;
    }

}