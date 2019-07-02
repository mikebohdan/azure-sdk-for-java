/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A rule that specifies a set of actions and conditions.
 */
public class DeliveryRule {
    /**
     * Name of the rule.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * The order in which the rules are applied for the endpoint. Possible
     * values {0,1,2,3,………}. A rule with a lesser order will be applied before
     * a rule with a greater order. Rule with order 0 is a special rule. It
     * does not require any condition and actions listed in it will always be
     * applied.
     */
    @JsonProperty(value = "order", required = true)
    private int order;

    /**
     * A list of conditions that must be matched for the actions to be
     * executed.
     */
    @JsonProperty(value = "conditions")
    private List<DeliveryRuleCondition> conditions;

    /**
     * A list of actions that are executed when all the conditions of a rule
     * are satisfied.
     */
    @JsonProperty(value = "actions", required = true)
    private List<DeliveryRuleAction> actions;

    /**
     * Get name of the rule.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of the rule.
     *
     * @param name the name value to set
     * @return the DeliveryRule object itself.
     */
    public DeliveryRule withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the order in which the rules are applied for the endpoint. Possible values {0,1,2,3,………}. A rule with a lesser order will be applied before a rule with a greater order. Rule with order 0 is a special rule. It does not require any condition and actions listed in it will always be applied.
     *
     * @return the order value
     */
    public int order() {
        return this.order;
    }

    /**
     * Set the order in which the rules are applied for the endpoint. Possible values {0,1,2,3,………}. A rule with a lesser order will be applied before a rule with a greater order. Rule with order 0 is a special rule. It does not require any condition and actions listed in it will always be applied.
     *
     * @param order the order value to set
     * @return the DeliveryRule object itself.
     */
    public DeliveryRule withOrder(int order) {
        this.order = order;
        return this;
    }

    /**
     * Get a list of conditions that must be matched for the actions to be executed.
     *
     * @return the conditions value
     */
    public List<DeliveryRuleCondition> conditions() {
        return this.conditions;
    }

    /**
     * Set a list of conditions that must be matched for the actions to be executed.
     *
     * @param conditions the conditions value to set
     * @return the DeliveryRule object itself.
     */
    public DeliveryRule withConditions(List<DeliveryRuleCondition> conditions) {
        this.conditions = conditions;
        return this;
    }

    /**
     * Get a list of actions that are executed when all the conditions of a rule are satisfied.
     *
     * @return the actions value
     */
    public List<DeliveryRuleAction> actions() {
        return this.actions;
    }

    /**
     * Set a list of actions that are executed when all the conditions of a rule are satisfied.
     *
     * @param actions the actions value to set
     * @return the DeliveryRule object itself.
     */
    public DeliveryRule withActions(List<DeliveryRuleAction> actions) {
        this.actions = actions;
        return this;
    }

}
