/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlabs.v2016_05_15.implementation;

import com.microsoft.azure.management.devtestlabs.v2016_05_15.NotificationChannel;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.devtestlabs.v2016_05_15.NotificationChannelFragment;
import java.util.Map;
import java.util.List;
import com.microsoft.azure.management.devtestlabs.v2016_05_15.Event;
import org.joda.time.DateTime;
import com.microsoft.azure.management.devtestlabs.v2016_05_15.EventFragment;
import rx.functions.Func1;

class NotificationChannelImpl extends CreatableUpdatableImpl<NotificationChannel, NotificationChannelInner, NotificationChannelImpl> implements NotificationChannel, NotificationChannel.Definition, NotificationChannel.Update {
    private final DevTestLabsManager manager;
    private String resourceGroupName;
    private String labName;
    private String name;
    private NotificationChannelFragment updateParameter;

    NotificationChannelImpl(String name, DevTestLabsManager manager) {
        super(name, new NotificationChannelInner());
        this.manager = manager;
        // Set resource name
        this.name = name;
        //
        this.updateParameter = new NotificationChannelFragment();
    }

    NotificationChannelImpl(NotificationChannelInner inner, DevTestLabsManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.name = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.labName = IdParsingUtils.getValueFromIdByName(inner.id(), "labs");
        this.name = IdParsingUtils.getValueFromIdByName(inner.id(), "notificationchannels");
        //
        this.updateParameter = new NotificationChannelFragment();
    }

    @Override
    public DevTestLabsManager manager() {
        return this.manager;
    }

    @Override
    public Observable<NotificationChannel> createResourceAsync() {
        NotificationChannelsInner client = this.manager().inner().notificationChannels();
        return client.createOrUpdateAsync(this.resourceGroupName, this.labName, this.name, this.inner())
            .map(new Func1<NotificationChannelInner, NotificationChannelInner>() {
               @Override
               public NotificationChannelInner call(NotificationChannelInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<NotificationChannel> updateResourceAsync() {
        NotificationChannelsInner client = this.manager().inner().notificationChannels();
        return client.updateAsync(this.resourceGroupName, this.labName, this.name, this.updateParameter)
            .map(new Func1<NotificationChannelInner, NotificationChannelInner>() {
               @Override
               public NotificationChannelInner call(NotificationChannelInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<NotificationChannelInner> getInnerAsync() {
        NotificationChannelsInner client = this.manager().inner().notificationChannels();
        return client.getAsync(this.resourceGroupName, this.labName, this.name);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new NotificationChannelFragment();
    }

    @Override
    public DateTime createdDate() {
        return this.inner().createdDate();
    }

    @Override
    public String description() {
        return this.inner().description();
    }

    @Override
    public List<Event> events() {
        return this.inner().events();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public String uniqueIdentifier() {
        return this.inner().uniqueIdentifier();
    }

    @Override
    public String webHookUrl() {
        return this.inner().webHookUrl();
    }

    @Override
    public NotificationChannelImpl withExistingLab(String resourceGroupName, String labName) {
        this.resourceGroupName = resourceGroupName;
        this.labName = labName;
        return this;
    }

    @Override
    public NotificationChannelImpl withEvents(List<Event> events) {
        this.inner().withEvents(events);
        return this;
    }

    @Override
    public NotificationChannelImpl withEvents(List<EventFragment> events) {
        this.updateParameter.withEvents(events);
        return this;
    }

    @Override
    public NotificationChannelImpl withDescription(String description) {
        if (isInCreateMode()) {
            this.inner().withDescription(description);
        } else {
            this.updateParameter.withDescription(description);
        }
        return this;
    }

    @Override
    public NotificationChannelImpl withLocation(String location) {
        if (isInCreateMode()) {
            this.inner().withLocation(location);
        } else {
            this.updateParameter.withLocation(location);
        }
        return this;
    }

    @Override
    public NotificationChannelImpl withProvisioningState(String provisioningState) {
        if (isInCreateMode()) {
            this.inner().withProvisioningState(provisioningState);
        } else {
            this.updateParameter.withProvisioningState(provisioningState);
        }
        return this;
    }

    @Override
    public NotificationChannelImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.inner().withTags(tags);
        } else {
            this.updateParameter.withTags(tags);
        }
        return this;
    }

    @Override
    public NotificationChannelImpl withUniqueIdentifier(String uniqueIdentifier) {
        if (isInCreateMode()) {
            this.inner().withUniqueIdentifier(uniqueIdentifier);
        } else {
            this.updateParameter.withUniqueIdentifier(uniqueIdentifier);
        }
        return this;
    }

    @Override
    public NotificationChannelImpl withWebHookUrl(String webHookUrl) {
        if (isInCreateMode()) {
            this.inner().withWebHookUrl(webHookUrl);
        } else {
            this.updateParameter.withWebHookUrl(webHookUrl);
        }
        return this;
    }

}