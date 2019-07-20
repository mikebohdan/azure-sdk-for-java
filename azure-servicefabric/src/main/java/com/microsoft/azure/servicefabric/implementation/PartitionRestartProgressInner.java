/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric.implementation;

import com.microsoft.azure.servicefabric.OperationState;
import com.microsoft.azure.servicefabric.RestartPartitionResult;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Information about a partition restart user-induced operation.
 */
public class PartitionRestartProgressInner {
    /**
     * The state of the operation. Possible values include: 'Invalid',
     * 'Running', 'RollingBack', 'Completed', 'Faulted', 'Cancelled',
     * 'ForceCancelled'.
     */
    @JsonProperty(value = "State")
    private OperationState state;

    /**
     * Represents information about an operation in a terminal state (Completed
     * or Faulted).
     */
    @JsonProperty(value = "RestartPartitionResult")
    private RestartPartitionResult restartPartitionResult;

    /**
     * Get the state of the operation. Possible values include: 'Invalid', 'Running', 'RollingBack', 'Completed', 'Faulted', 'Cancelled', 'ForceCancelled'.
     *
     * @return the state value
     */
    public OperationState state() {
        return this.state;
    }

    /**
     * Set the state of the operation. Possible values include: 'Invalid', 'Running', 'RollingBack', 'Completed', 'Faulted', 'Cancelled', 'ForceCancelled'.
     *
     * @param state the state value to set
     * @return the PartitionRestartProgressInner object itself.
     */
    public PartitionRestartProgressInner withState(OperationState state) {
        this.state = state;
        return this;
    }

    /**
     * Get represents information about an operation in a terminal state (Completed or Faulted).
     *
     * @return the restartPartitionResult value
     */
    public RestartPartitionResult restartPartitionResult() {
        return this.restartPartitionResult;
    }

    /**
     * Set represents information about an operation in a terminal state (Completed or Faulted).
     *
     * @param restartPartitionResult the restartPartitionResult value to set
     * @return the PartitionRestartProgressInner object itself.
     */
    public PartitionRestartProgressInner withRestartPartitionResult(RestartPartitionResult restartPartitionResult) {
        this.restartPartitionResult = restartPartitionResult;
        return this;
    }

}