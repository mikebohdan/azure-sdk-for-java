/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.customvision.training.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Export model.
 */
public class Export {
    /**
     * Platform of the export. Possible values include: 'CoreML', 'TensorFlow',
     * 'DockerFile', 'ONNX', 'VAIDK'.
     */
    @JsonProperty(value = "platform", access = JsonProperty.Access.WRITE_ONLY)
    private ExportPlatform platform;

    /**
     * Status of the export. Possible values include: 'Exporting', 'Failed',
     * 'Done'.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private ExportStatus status;

    /**
     * URI used to download the model.
     */
    @JsonProperty(value = "downloadUri", access = JsonProperty.Access.WRITE_ONLY)
    private String downloadUri;

    /**
     * Flavor of the export. Possible values include: 'Linux', 'Windows',
     * 'ONNX10', 'ONNX12', 'ARM'.
     */
    @JsonProperty(value = "flavor", access = JsonProperty.Access.WRITE_ONLY)
    private ExportFlavor flavor;

    /**
     * Indicates an updated version of the export package is available and
     * should be re-exported for the latest changes.
     */
    @JsonProperty(value = "newerVersionAvailable", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean newerVersionAvailable;

    /**
     * Get platform of the export. Possible values include: 'CoreML', 'TensorFlow', 'DockerFile', 'ONNX', 'VAIDK'.
     *
     * @return the platform value
     */
    public ExportPlatform platform() {
        return this.platform;
    }

    /**
     * Get status of the export. Possible values include: 'Exporting', 'Failed', 'Done'.
     *
     * @return the status value
     */
    public ExportStatus status() {
        return this.status;
    }

    /**
     * Get uRI used to download the model.
     *
     * @return the downloadUri value
     */
    public String downloadUri() {
        return this.downloadUri;
    }

    /**
     * Get flavor of the export. Possible values include: 'Linux', 'Windows', 'ONNX10', 'ONNX12', 'ARM'.
     *
     * @return the flavor value
     */
    public ExportFlavor flavor() {
        return this.flavor;
    }

    /**
     * Get indicates an updated version of the export package is available and should be re-exported for the latest changes.
     *
     * @return the newerVersionAvailable value
     */
    public Boolean newerVersionAvailable() {
        return this.newerVersionAvailable;
    }

}
