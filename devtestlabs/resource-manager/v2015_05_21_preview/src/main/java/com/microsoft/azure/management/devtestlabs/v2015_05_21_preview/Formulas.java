/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlabs.v2015_05_21_preview;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.devtestlabs.v2015_05_21_preview.implementation.FormulasInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Formulas.
 */
public interface Formulas extends SupportsCreating<Formula.DefinitionStages.Blank>, HasInner<FormulasInner> {
    /**
     * Get formula.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the formula.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Formula> getResourceAsync(String resourceGroupName, String labName, String name);

    /**
     * List formulas.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Formula> listAsync(final String resourceGroupName, final String labName);

    /**
     * Delete formula.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the formula.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteResourceAsync(String resourceGroupName, String labName, String name);

}