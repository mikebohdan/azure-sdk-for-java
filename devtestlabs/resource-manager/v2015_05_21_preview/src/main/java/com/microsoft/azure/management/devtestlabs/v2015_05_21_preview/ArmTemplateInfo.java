/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlabs.v2015_05_21_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.devtestlabs.v2015_05_21_preview.implementation.DevTestLabsManager;
import com.microsoft.azure.management.devtestlabs.v2015_05_21_preview.implementation.ArmTemplateInfoInner;

/**
 * Type representing ArmTemplateInfo.
 */
public interface ArmTemplateInfo extends HasInner<ArmTemplateInfoInner>, HasManager<DevTestLabsManager> {
    /**
     * @return the parameters value.
     */
    Object parameters();

    /**
     * @return the template value.
     */
    Object template();

}