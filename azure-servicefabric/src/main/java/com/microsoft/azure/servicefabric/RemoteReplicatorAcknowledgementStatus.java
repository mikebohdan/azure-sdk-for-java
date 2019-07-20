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
 * Provides details about the remote replicators from the primary replicator's
 * point of view.
 */
public class RemoteReplicatorAcknowledgementStatus {
    /**
     * Details about the acknowledgements for operations that are part of the
     * replication stream data.
     */
    @JsonProperty(value = "ReplicationStreamAcknowledgementDetail")
    private RemoteReplicatorAcknowledgementDetail replicationStreamAcknowledgementDetail;

    /**
     * Details about the acknowledgements for operations that are part of the
     * copy stream data.
     */
    @JsonProperty(value = "CopyStreamAcknowledgementDetail")
    private RemoteReplicatorAcknowledgementDetail copyStreamAcknowledgementDetail;

    /**
     * Get details about the acknowledgements for operations that are part of the replication stream data.
     *
     * @return the replicationStreamAcknowledgementDetail value
     */
    public RemoteReplicatorAcknowledgementDetail replicationStreamAcknowledgementDetail() {
        return this.replicationStreamAcknowledgementDetail;
    }

    /**
     * Set details about the acknowledgements for operations that are part of the replication stream data.
     *
     * @param replicationStreamAcknowledgementDetail the replicationStreamAcknowledgementDetail value to set
     * @return the RemoteReplicatorAcknowledgementStatus object itself.
     */
    public RemoteReplicatorAcknowledgementStatus withReplicationStreamAcknowledgementDetail(RemoteReplicatorAcknowledgementDetail replicationStreamAcknowledgementDetail) {
        this.replicationStreamAcknowledgementDetail = replicationStreamAcknowledgementDetail;
        return this;
    }

    /**
     * Get details about the acknowledgements for operations that are part of the copy stream data.
     *
     * @return the copyStreamAcknowledgementDetail value
     */
    public RemoteReplicatorAcknowledgementDetail copyStreamAcknowledgementDetail() {
        return this.copyStreamAcknowledgementDetail;
    }

    /**
     * Set details about the acknowledgements for operations that are part of the copy stream data.
     *
     * @param copyStreamAcknowledgementDetail the copyStreamAcknowledgementDetail value to set
     * @return the RemoteReplicatorAcknowledgementStatus object itself.
     */
    public RemoteReplicatorAcknowledgementStatus withCopyStreamAcknowledgementDetail(RemoteReplicatorAcknowledgementDetail copyStreamAcknowledgementDetail) {
        this.copyStreamAcknowledgementDetail = copyStreamAcknowledgementDetail;
        return this;
    }

}