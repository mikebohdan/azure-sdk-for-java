/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlabs.v2016_05_15.implementation;

import com.microsoft.azure.management.devtestlabs.v2016_05_15.VirtualmachineLabSchedule;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.devtestlabs.v2016_05_15.ScheduleFragment;
import java.util.Map;
import com.microsoft.azure.management.devtestlabs.v2016_05_15.EnableStatus;
import com.microsoft.azure.management.devtestlabs.v2016_05_15.WeekDetails;
import com.microsoft.azure.management.devtestlabs.v2016_05_15.DayDetails;
import com.microsoft.azure.management.devtestlabs.v2016_05_15.HourDetails;
import com.microsoft.azure.management.devtestlabs.v2016_05_15.NotificationSettings;
import org.joda.time.DateTime;
import com.microsoft.azure.management.devtestlabs.v2016_05_15.DayDetailsFragment;
import com.microsoft.azure.management.devtestlabs.v2016_05_15.HourDetailsFragment;
import com.microsoft.azure.management.devtestlabs.v2016_05_15.NotificationSettingsFragment;
import com.microsoft.azure.management.devtestlabs.v2016_05_15.WeekDetailsFragment;
import rx.functions.Func1;

class VirtualmachineLabScheduleImpl extends CreatableUpdatableImpl<VirtualmachineLabSchedule, ScheduleInner, VirtualmachineLabScheduleImpl> implements VirtualmachineLabSchedule, VirtualmachineLabSchedule.Definition, VirtualmachineLabSchedule.Update {
    private final DevTestLabsManager manager;
    private String resourceGroupName;
    private String labName;
    private String virtualMachineName;
    private String name;
    private ScheduleFragment updateParameter;

    VirtualmachineLabScheduleImpl(String name, DevTestLabsManager manager) {
        super(name, new ScheduleInner());
        this.manager = manager;
        // Set resource name
        this.name = name;
        //
        this.updateParameter = new ScheduleFragment();
    }

    VirtualmachineLabScheduleImpl(ScheduleInner inner, DevTestLabsManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.name = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.labName = IdParsingUtils.getValueFromIdByName(inner.id(), "labs");
        this.virtualMachineName = IdParsingUtils.getValueFromIdByName(inner.id(), "virtualmachines");
        this.name = IdParsingUtils.getValueFromIdByName(inner.id(), "schedules");
        //
        this.updateParameter = new ScheduleFragment();
    }

    @Override
    public DevTestLabsManager manager() {
        return this.manager;
    }

    @Override
    public Observable<VirtualmachineLabSchedule> createResourceAsync() {
        VirtualMachineSchedulesInner client = this.manager().inner().virtualMachineSchedules();
        return client.createOrUpdateAsync(this.resourceGroupName, this.labName, this.virtualMachineName, this.name, this.inner())
            .map(new Func1<ScheduleInner, ScheduleInner>() {
               @Override
               public ScheduleInner call(ScheduleInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<VirtualmachineLabSchedule> updateResourceAsync() {
        VirtualMachineSchedulesInner client = this.manager().inner().virtualMachineSchedules();
        return client.updateAsync(this.resourceGroupName, this.labName, this.virtualMachineName, this.name, this.updateParameter)
            .map(new Func1<ScheduleInner, ScheduleInner>() {
               @Override
               public ScheduleInner call(ScheduleInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ScheduleInner> getInnerAsync() {
        VirtualMachineSchedulesInner client = this.manager().inner().virtualMachineSchedules();
        return client.getAsync(this.resourceGroupName, this.labName, this.virtualMachineName, this.name);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new ScheduleFragment();
    }

    @Override
    public DateTime createdDate() {
        return this.inner().createdDate();
    }

    @Override
    public DayDetails dailyRecurrence() {
        return this.inner().dailyRecurrence();
    }

    @Override
    public HourDetails hourlyRecurrence() {
        return this.inner().hourlyRecurrence();
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
    public NotificationSettings notificationSettings() {
        return this.inner().notificationSettings();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public EnableStatus status() {
        return this.inner().status();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public String targetResourceId() {
        return this.inner().targetResourceId();
    }

    @Override
    public String taskType() {
        return this.inner().taskType();
    }

    @Override
    public String timeZoneId() {
        return this.inner().timeZoneId();
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
    public WeekDetails weeklyRecurrence() {
        return this.inner().weeklyRecurrence();
    }

    @Override
    public VirtualmachineLabScheduleImpl withExistingVirtualmachine(String resourceGroupName, String labName, String virtualMachineName) {
        this.resourceGroupName = resourceGroupName;
        this.labName = labName;
        this.virtualMachineName = virtualMachineName;
        return this;
    }

    @Override
    public VirtualmachineLabScheduleImpl withDailyRecurrence(DayDetails dailyRecurrence) {
        this.inner().withDailyRecurrence(dailyRecurrence);
        return this;
    }

    @Override
    public VirtualmachineLabScheduleImpl withHourlyRecurrence(HourDetails hourlyRecurrence) {
        this.inner().withHourlyRecurrence(hourlyRecurrence);
        return this;
    }

    @Override
    public VirtualmachineLabScheduleImpl withNotificationSettings(NotificationSettings notificationSettings) {
        this.inner().withNotificationSettings(notificationSettings);
        return this;
    }

    @Override
    public VirtualmachineLabScheduleImpl withWeeklyRecurrence(WeekDetails weeklyRecurrence) {
        this.inner().withWeeklyRecurrence(weeklyRecurrence);
        return this;
    }

    @Override
    public VirtualmachineLabScheduleImpl withDailyRecurrence(DayDetailsFragment dailyRecurrence) {
        this.updateParameter.withDailyRecurrence(dailyRecurrence);
        return this;
    }

    @Override
    public VirtualmachineLabScheduleImpl withHourlyRecurrence(HourDetailsFragment hourlyRecurrence) {
        this.updateParameter.withHourlyRecurrence(hourlyRecurrence);
        return this;
    }

    @Override
    public VirtualmachineLabScheduleImpl withNotificationSettings(NotificationSettingsFragment notificationSettings) {
        this.updateParameter.withNotificationSettings(notificationSettings);
        return this;
    }

    @Override
    public VirtualmachineLabScheduleImpl withWeeklyRecurrence(WeekDetailsFragment weeklyRecurrence) {
        this.updateParameter.withWeeklyRecurrence(weeklyRecurrence);
        return this;
    }

    @Override
    public VirtualmachineLabScheduleImpl withLocation(String location) {
        if (isInCreateMode()) {
            this.inner().withLocation(location);
        } else {
            this.updateParameter.withLocation(location);
        }
        return this;
    }

    @Override
    public VirtualmachineLabScheduleImpl withProvisioningState(String provisioningState) {
        if (isInCreateMode()) {
            this.inner().withProvisioningState(provisioningState);
        } else {
            this.updateParameter.withProvisioningState(provisioningState);
        }
        return this;
    }

    @Override
    public VirtualmachineLabScheduleImpl withStatus(EnableStatus status) {
        if (isInCreateMode()) {
            this.inner().withStatus(status);
        } else {
            this.updateParameter.withStatus(status);
        }
        return this;
    }

    @Override
    public VirtualmachineLabScheduleImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.inner().withTags(tags);
        } else {
            this.updateParameter.withTags(tags);
        }
        return this;
    }

    @Override
    public VirtualmachineLabScheduleImpl withTargetResourceId(String targetResourceId) {
        if (isInCreateMode()) {
            this.inner().withTargetResourceId(targetResourceId);
        } else {
            this.updateParameter.withTargetResourceId(targetResourceId);
        }
        return this;
    }

    @Override
    public VirtualmachineLabScheduleImpl withTaskType(String taskType) {
        if (isInCreateMode()) {
            this.inner().withTaskType(taskType);
        } else {
            this.updateParameter.withTaskType(taskType);
        }
        return this;
    }

    @Override
    public VirtualmachineLabScheduleImpl withTimeZoneId(String timeZoneId) {
        if (isInCreateMode()) {
            this.inner().withTimeZoneId(timeZoneId);
        } else {
            this.updateParameter.withTimeZoneId(timeZoneId);
        }
        return this;
    }

    @Override
    public VirtualmachineLabScheduleImpl withUniqueIdentifier(String uniqueIdentifier) {
        if (isInCreateMode()) {
            this.inner().withUniqueIdentifier(uniqueIdentifier);
        } else {
            this.updateParameter.withUniqueIdentifier(uniqueIdentifier);
        }
        return this;
    }

}