/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlabs.v2016_05_15;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.devtestlabs.v2016_05_15.implementation.LabVirtualMachineInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.devtestlabs.v2016_05_15.implementation.DevTestLabsManager;
import java.util.Map;
import org.joda.time.DateTime;
import java.util.List;
import com.microsoft.azure.management.devtestlabs.v2016_05_15.implementation.ApplicableScheduleInner;

/**
 * Type representing LabVirtualMachine.
 */
public interface LabVirtualMachine extends HasInner<LabVirtualMachineInner>, Indexable, Refreshable<LabVirtualMachine>, Updatable<LabVirtualMachine.Update>, HasManager<DevTestLabsManager> {
    /**
     * @return the allowClaim value.
     */
    Boolean allowClaim();

    /**
     * @return the applicableSchedule value.
     */
    ApplicableSchedule applicableSchedule();

    /**
     * @return the artifactDeploymentStatus value.
     */
    ArtifactDeploymentStatusProperties artifactDeploymentStatus();

    /**
     * @return the artifacts value.
     */
    List<ArtifactInstallProperties> artifacts();

    /**
     * @return the computeId value.
     */
    String computeId();

    /**
     * @return the computeVm value.
     */
    ComputeVmProperties computeVm();

    /**
     * @return the createdByUser value.
     */
    String createdByUser();

    /**
     * @return the createdByUserId value.
     */
    String createdByUserId();

    /**
     * @return the createdDate value.
     */
    DateTime createdDate();

    /**
     * @return the customImageId value.
     */
    String customImageId();

    /**
     * @return the disallowPublicIpAddress value.
     */
    Boolean disallowPublicIpAddress();

    /**
     * @return the environmentId value.
     */
    String environmentId();

    /**
     * @return the expirationDate value.
     */
    DateTime expirationDate();

    /**
     * @return the fqdn value.
     */
    String fqdn();

    /**
     * @return the galleryImageReference value.
     */
    GalleryImageReference galleryImageReference();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the isAuthenticationWithSshKey value.
     */
    Boolean isAuthenticationWithSshKey();

    /**
     * @return the labSubnetName value.
     */
    String labSubnetName();

    /**
     * @return the labVirtualNetworkId value.
     */
    String labVirtualNetworkId();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the networkInterface value.
     */
    NetworkInterfaceProperties networkInterface();

    /**
     * @return the notes value.
     */
    String notes();

    /**
     * @return the osType value.
     */
    String osType();

    /**
     * @return the ownerObjectId value.
     */
    String ownerObjectId();

    /**
     * @return the ownerUserPrincipalName value.
     */
    String ownerUserPrincipalName();

    /**
     * @return the password value.
     */
    String password();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the size value.
     */
    String size();

    /**
     * @return the sshKey value.
     */
    String sshKey();

    /**
     * @return the storageType value.
     */
    String storageType();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the uniqueIdentifier value.
     */
    String uniqueIdentifier();

    /**
     * @return the userName value.
     */
    String userName();

    /**
     * @return the virtualMachineCreationSource value.
     */
    VirtualMachineCreationSource virtualMachineCreationSource();

    /**
     * The entirety of the LabVirtualMachine definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithLab, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of LabVirtualMachine definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a LabVirtualMachine definition.
         */
        interface Blank extends WithLab {
        }

        /**
         * The stage of the labvirtualmachine definition allowing to specify Lab.
         */
        interface WithLab {
           /**
            * Specifies resourceGroupName, labName.
            * @param resourceGroupName The name of the resource group
            * @param labName The name of the lab
            * @return the next definition stage
            */
            WithCreate withExistingLab(String resourceGroupName, String labName);
        }

        /**
         * The stage of the labvirtualmachine definition allowing to specify AllowClaim.
         */
        interface WithAllowClaim {
            /**
             * Specifies allowClaim.
             * @param allowClaim Indicates whether another user can take ownership of the virtual machine
             * @return the next definition stage
             */
            WithCreate withAllowClaim(Boolean allowClaim);
        }

        /**
         * The stage of the labvirtualmachine definition allowing to specify ApplicableSchedule.
         */
        interface WithApplicableSchedule {
            /**
             * Specifies applicableSchedule.
             * @param applicableSchedule The applicable schedule for the virtual machine
             * @return the next definition stage
             */
            WithCreate withApplicableSchedule(ApplicableScheduleInner applicableSchedule);
        }

        /**
         * The stage of the labvirtualmachine definition allowing to specify ArtifactDeploymentStatus.
         */
        interface WithArtifactDeploymentStatus {
            /**
             * Specifies artifactDeploymentStatus.
             * @param artifactDeploymentStatus The artifact deployment status for the virtual machine
             * @return the next definition stage
             */
            WithCreate withArtifactDeploymentStatus(ArtifactDeploymentStatusProperties artifactDeploymentStatus);
        }

        /**
         * The stage of the labvirtualmachine definition allowing to specify Artifacts.
         */
        interface WithArtifacts {
            /**
             * Specifies artifacts.
             * @param artifacts The artifacts to be installed on the virtual machine
             * @return the next definition stage
             */
            WithCreate withArtifacts(List<ArtifactInstallProperties> artifacts);
        }

        /**
         * The stage of the labvirtualmachine definition allowing to specify ComputeVm.
         */
        interface WithComputeVm {
            /**
             * Specifies computeVm.
             * @param computeVm The compute virtual machine properties
             * @return the next definition stage
             */
            WithCreate withComputeVm(ComputeVmProperties computeVm);
        }

        /**
         * The stage of the labvirtualmachine definition allowing to specify CreatedByUser.
         */
        interface WithCreatedByUser {
            /**
             * Specifies createdByUser.
             * @param createdByUser The email address of creator of the virtual machine
             * @return the next definition stage
             */
            WithCreate withCreatedByUser(String createdByUser);
        }

        /**
         * The stage of the labvirtualmachine definition allowing to specify CreatedByUserId.
         */
        interface WithCreatedByUserId {
            /**
             * Specifies createdByUserId.
             * @param createdByUserId The object identifier of the creator of the virtual machine
             * @return the next definition stage
             */
            WithCreate withCreatedByUserId(String createdByUserId);
        }

        /**
         * The stage of the labvirtualmachine definition allowing to specify CreatedDate.
         */
        interface WithCreatedDate {
            /**
             * Specifies createdDate.
             * @param createdDate The creation date of the virtual machine
             * @return the next definition stage
             */
            WithCreate withCreatedDate(DateTime createdDate);
        }

        /**
         * The stage of the labvirtualmachine definition allowing to specify CustomImageId.
         */
        interface WithCustomImageId {
            /**
             * Specifies customImageId.
             * @param customImageId The custom image identifier of the virtual machine
             * @return the next definition stage
             */
            WithCreate withCustomImageId(String customImageId);
        }

        /**
         * The stage of the labvirtualmachine definition allowing to specify DisallowPublicIpAddress.
         */
        interface WithDisallowPublicIpAddress {
            /**
             * Specifies disallowPublicIpAddress.
             * @param disallowPublicIpAddress Indicates whether the virtual machine is to be created without a public IP address
             * @return the next definition stage
             */
            WithCreate withDisallowPublicIpAddress(Boolean disallowPublicIpAddress);
        }

        /**
         * The stage of the labvirtualmachine definition allowing to specify EnvironmentId.
         */
        interface WithEnvironmentId {
            /**
             * Specifies environmentId.
             * @param environmentId The resource ID of the environment that contains this virtual machine, if any
             * @return the next definition stage
             */
            WithCreate withEnvironmentId(String environmentId);
        }

        /**
         * The stage of the labvirtualmachine definition allowing to specify ExpirationDate.
         */
        interface WithExpirationDate {
            /**
             * Specifies expirationDate.
             * @param expirationDate The expiration date for VM
             * @return the next definition stage
             */
            WithCreate withExpirationDate(DateTime expirationDate);
        }

        /**
         * The stage of the labvirtualmachine definition allowing to specify Fqdn.
         */
        interface WithFqdn {
            /**
             * Specifies fqdn.
             * @param fqdn The fully-qualified domain name of the virtual machine
             * @return the next definition stage
             */
            WithCreate withFqdn(String fqdn);
        }

        /**
         * The stage of the labvirtualmachine definition allowing to specify GalleryImageReference.
         */
        interface WithGalleryImageReference {
            /**
             * Specifies galleryImageReference.
             * @param galleryImageReference The Microsoft Azure Marketplace image reference of the virtual machine
             * @return the next definition stage
             */
            WithCreate withGalleryImageReference(GalleryImageReference galleryImageReference);
        }

        /**
         * The stage of the labvirtualmachine definition allowing to specify IsAuthenticationWithSshKey.
         */
        interface WithIsAuthenticationWithSshKey {
            /**
             * Specifies isAuthenticationWithSshKey.
             * @param isAuthenticationWithSshKey Indicates whether this virtual machine uses an SSH key for authentication
             * @return the next definition stage
             */
            WithCreate withIsAuthenticationWithSshKey(Boolean isAuthenticationWithSshKey);
        }

        /**
         * The stage of the labvirtualmachine definition allowing to specify LabSubnetName.
         */
        interface WithLabSubnetName {
            /**
             * Specifies labSubnetName.
             * @param labSubnetName The lab subnet name of the virtual machine
             * @return the next definition stage
             */
            WithCreate withLabSubnetName(String labSubnetName);
        }

        /**
         * The stage of the labvirtualmachine definition allowing to specify LabVirtualNetworkId.
         */
        interface WithLabVirtualNetworkId {
            /**
             * Specifies labVirtualNetworkId.
             * @param labVirtualNetworkId The lab virtual network identifier of the virtual machine
             * @return the next definition stage
             */
            WithCreate withLabVirtualNetworkId(String labVirtualNetworkId);
        }

        /**
         * The stage of the labvirtualmachine definition allowing to specify Location.
         */
        interface WithLocation {
            /**
             * Specifies location.
             * @param location The location of the resource
             * @return the next definition stage
             */
            WithCreate withLocation(String location);
        }

        /**
         * The stage of the labvirtualmachine definition allowing to specify NetworkInterface.
         */
        interface WithNetworkInterface {
            /**
             * Specifies networkInterface.
             * @param networkInterface The network interface properties
             * @return the next definition stage
             */
            WithCreate withNetworkInterface(NetworkInterfaceProperties networkInterface);
        }

        /**
         * The stage of the labvirtualmachine definition allowing to specify Notes.
         */
        interface WithNotes {
            /**
             * Specifies notes.
             * @param notes The notes of the virtual machine
             * @return the next definition stage
             */
            WithCreate withNotes(String notes);
        }

        /**
         * The stage of the labvirtualmachine definition allowing to specify OsType.
         */
        interface WithOsType {
            /**
             * Specifies osType.
             * @param osType The OS type of the virtual machine
             * @return the next definition stage
             */
            WithCreate withOsType(String osType);
        }

        /**
         * The stage of the labvirtualmachine definition allowing to specify OwnerObjectId.
         */
        interface WithOwnerObjectId {
            /**
             * Specifies ownerObjectId.
             * @param ownerObjectId The object identifier of the owner of the virtual machine
             * @return the next definition stage
             */
            WithCreate withOwnerObjectId(String ownerObjectId);
        }

        /**
         * The stage of the labvirtualmachine definition allowing to specify OwnerUserPrincipalName.
         */
        interface WithOwnerUserPrincipalName {
            /**
             * Specifies ownerUserPrincipalName.
             * @param ownerUserPrincipalName The user principal name of the virtual machine owner
             * @return the next definition stage
             */
            WithCreate withOwnerUserPrincipalName(String ownerUserPrincipalName);
        }

        /**
         * The stage of the labvirtualmachine definition allowing to specify Password.
         */
        interface WithPassword {
            /**
             * Specifies password.
             * @param password The password of the virtual machine administrator
             * @return the next definition stage
             */
            WithCreate withPassword(String password);
        }

        /**
         * The stage of the labvirtualmachine definition allowing to specify ProvisioningState.
         */
        interface WithProvisioningState {
            /**
             * Specifies provisioningState.
             * @param provisioningState The provisioning status of the resource
             * @return the next definition stage
             */
            WithCreate withProvisioningState(String provisioningState);
        }

        /**
         * The stage of the labvirtualmachine definition allowing to specify Size.
         */
        interface WithSize {
            /**
             * Specifies size.
             * @param size The size of the virtual machine
             * @return the next definition stage
             */
            WithCreate withSize(String size);
        }

        /**
         * The stage of the labvirtualmachine definition allowing to specify SshKey.
         */
        interface WithSshKey {
            /**
             * Specifies sshKey.
             * @param sshKey The SSH key of the virtual machine administrator
             * @return the next definition stage
             */
            WithCreate withSshKey(String sshKey);
        }

        /**
         * The stage of the labvirtualmachine definition allowing to specify StorageType.
         */
        interface WithStorageType {
            /**
             * Specifies storageType.
             * @param storageType Storage type to use for virtual machine (i.e. Standard, Premium)
             * @return the next definition stage
             */
            WithCreate withStorageType(String storageType);
        }

        /**
         * The stage of the labvirtualmachine definition allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags The tags of the resource
             * @return the next definition stage
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the labvirtualmachine definition allowing to specify UniqueIdentifier.
         */
        interface WithUniqueIdentifier {
            /**
             * Specifies uniqueIdentifier.
             * @param uniqueIdentifier The unique immutable identifier of a resource (Guid)
             * @return the next definition stage
             */
            WithCreate withUniqueIdentifier(String uniqueIdentifier);
        }

        /**
         * The stage of the labvirtualmachine definition allowing to specify UserName.
         */
        interface WithUserName {
            /**
             * Specifies userName.
             * @param userName The user name of the virtual machine
             * @return the next definition stage
             */
            WithCreate withUserName(String userName);
        }

        /**
         * The stage of the labvirtualmachine definition allowing to specify VirtualMachineCreationSource.
         */
        interface WithVirtualMachineCreationSource {
            /**
             * Specifies virtualMachineCreationSource.
             * @param virtualMachineCreationSource Tells source of creation of lab virtual machine. Output property only. Possible values include: 'FromCustomImage', 'FromGalleryImage'
             * @return the next definition stage
             */
            WithCreate withVirtualMachineCreationSource(VirtualMachineCreationSource virtualMachineCreationSource);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<LabVirtualMachine>, DefinitionStages.WithAllowClaim, DefinitionStages.WithApplicableSchedule, DefinitionStages.WithArtifactDeploymentStatus, DefinitionStages.WithArtifacts, DefinitionStages.WithComputeVm, DefinitionStages.WithCreatedByUser, DefinitionStages.WithCreatedByUserId, DefinitionStages.WithCreatedDate, DefinitionStages.WithCustomImageId, DefinitionStages.WithDisallowPublicIpAddress, DefinitionStages.WithEnvironmentId, DefinitionStages.WithExpirationDate, DefinitionStages.WithFqdn, DefinitionStages.WithGalleryImageReference, DefinitionStages.WithIsAuthenticationWithSshKey, DefinitionStages.WithLabSubnetName, DefinitionStages.WithLabVirtualNetworkId, DefinitionStages.WithLocation, DefinitionStages.WithNetworkInterface, DefinitionStages.WithNotes, DefinitionStages.WithOsType, DefinitionStages.WithOwnerObjectId, DefinitionStages.WithOwnerUserPrincipalName, DefinitionStages.WithPassword, DefinitionStages.WithProvisioningState, DefinitionStages.WithSize, DefinitionStages.WithSshKey, DefinitionStages.WithStorageType, DefinitionStages.WithTags, DefinitionStages.WithUniqueIdentifier, DefinitionStages.WithUserName, DefinitionStages.WithVirtualMachineCreationSource {
        }
    }
    /**
     * The template for a LabVirtualMachine update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<LabVirtualMachine>, UpdateStages.WithAllowClaim, UpdateStages.WithApplicableSchedule, UpdateStages.WithArtifactDeploymentStatus, UpdateStages.WithArtifacts, UpdateStages.WithComputeVm, UpdateStages.WithCreatedByUser, UpdateStages.WithCreatedByUserId, UpdateStages.WithCreatedDate, UpdateStages.WithCustomImageId, UpdateStages.WithDisallowPublicIpAddress, UpdateStages.WithEnvironmentId, UpdateStages.WithExpirationDate, UpdateStages.WithFqdn, UpdateStages.WithGalleryImageReference, UpdateStages.WithIsAuthenticationWithSshKey, UpdateStages.WithLabSubnetName, UpdateStages.WithLabVirtualNetworkId, UpdateStages.WithLocation, UpdateStages.WithNetworkInterface, UpdateStages.WithNotes, UpdateStages.WithOsType, UpdateStages.WithOwnerObjectId, UpdateStages.WithOwnerUserPrincipalName, UpdateStages.WithPassword, UpdateStages.WithProvisioningState, UpdateStages.WithSize, UpdateStages.WithSshKey, UpdateStages.WithStorageType, UpdateStages.WithTags, UpdateStages.WithUniqueIdentifier, UpdateStages.WithUserName, UpdateStages.WithVirtualMachineCreationSource {
    }

    /**
     * Grouping of LabVirtualMachine update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the labvirtualmachine update allowing to specify AllowClaim.
         */
        interface WithAllowClaim {
            /**
             * Specifies allowClaim.
             * @param allowClaim Indicates whether another user can take ownership of the virtual machine
             * @return the next update stage
             */
            Update withAllowClaim(Boolean allowClaim);
        }

        /**
         * The stage of the labvirtualmachine update allowing to specify ApplicableSchedule.
         */
        interface WithApplicableSchedule {
            /**
             * Specifies applicableSchedule.
             * @param applicableSchedule The applicable schedule for the virtual machine
             * @return the next update stage
             */
            Update withApplicableSchedule(ApplicableScheduleFragment applicableSchedule);
        }

        /**
         * The stage of the labvirtualmachine update allowing to specify ArtifactDeploymentStatus.
         */
        interface WithArtifactDeploymentStatus {
            /**
             * Specifies artifactDeploymentStatus.
             * @param artifactDeploymentStatus The artifact deployment status for the virtual machine
             * @return the next update stage
             */
            Update withArtifactDeploymentStatus(ArtifactDeploymentStatusPropertiesFragment artifactDeploymentStatus);
        }

        /**
         * The stage of the labvirtualmachine update allowing to specify Artifacts.
         */
        interface WithArtifacts {
            /**
             * Specifies artifacts.
             * @param artifacts The artifacts to be installed on the virtual machine
             * @return the next update stage
             */
            Update withArtifacts(List<ArtifactInstallPropertiesFragment> artifacts);
        }

        /**
         * The stage of the labvirtualmachine update allowing to specify ComputeVm.
         */
        interface WithComputeVm {
            /**
             * Specifies computeVm.
             * @param computeVm The compute virtual machine properties
             * @return the next update stage
             */
            Update withComputeVm(ComputeVmPropertiesFragment computeVm);
        }

        /**
         * The stage of the labvirtualmachine update allowing to specify CreatedByUser.
         */
        interface WithCreatedByUser {
            /**
             * Specifies createdByUser.
             * @param createdByUser The email address of creator of the virtual machine
             * @return the next update stage
             */
            Update withCreatedByUser(String createdByUser);
        }

        /**
         * The stage of the labvirtualmachine update allowing to specify CreatedByUserId.
         */
        interface WithCreatedByUserId {
            /**
             * Specifies createdByUserId.
             * @param createdByUserId The object identifier of the creator of the virtual machine
             * @return the next update stage
             */
            Update withCreatedByUserId(String createdByUserId);
        }

        /**
         * The stage of the labvirtualmachine update allowing to specify CreatedDate.
         */
        interface WithCreatedDate {
            /**
             * Specifies createdDate.
             * @param createdDate The creation date of the virtual machine
             * @return the next update stage
             */
            Update withCreatedDate(DateTime createdDate);
        }

        /**
         * The stage of the labvirtualmachine update allowing to specify CustomImageId.
         */
        interface WithCustomImageId {
            /**
             * Specifies customImageId.
             * @param customImageId The custom image identifier of the virtual machine
             * @return the next update stage
             */
            Update withCustomImageId(String customImageId);
        }

        /**
         * The stage of the labvirtualmachine update allowing to specify DisallowPublicIpAddress.
         */
        interface WithDisallowPublicIpAddress {
            /**
             * Specifies disallowPublicIpAddress.
             * @param disallowPublicIpAddress Indicates whether the virtual machine is to be created without a public IP address
             * @return the next update stage
             */
            Update withDisallowPublicIpAddress(Boolean disallowPublicIpAddress);
        }

        /**
         * The stage of the labvirtualmachine update allowing to specify EnvironmentId.
         */
        interface WithEnvironmentId {
            /**
             * Specifies environmentId.
             * @param environmentId The resource ID of the environment that contains this virtual machine, if any
             * @return the next update stage
             */
            Update withEnvironmentId(String environmentId);
        }

        /**
         * The stage of the labvirtualmachine update allowing to specify ExpirationDate.
         */
        interface WithExpirationDate {
            /**
             * Specifies expirationDate.
             * @param expirationDate The expiration date for VM
             * @return the next update stage
             */
            Update withExpirationDate(DateTime expirationDate);
        }

        /**
         * The stage of the labvirtualmachine update allowing to specify Fqdn.
         */
        interface WithFqdn {
            /**
             * Specifies fqdn.
             * @param fqdn The fully-qualified domain name of the virtual machine
             * @return the next update stage
             */
            Update withFqdn(String fqdn);
        }

        /**
         * The stage of the labvirtualmachine update allowing to specify GalleryImageReference.
         */
        interface WithGalleryImageReference {
            /**
             * Specifies galleryImageReference.
             * @param galleryImageReference The Microsoft Azure Marketplace image reference of the virtual machine
             * @return the next update stage
             */
            Update withGalleryImageReference(GalleryImageReferenceFragment galleryImageReference);
        }

        /**
         * The stage of the labvirtualmachine update allowing to specify IsAuthenticationWithSshKey.
         */
        interface WithIsAuthenticationWithSshKey {
            /**
             * Specifies isAuthenticationWithSshKey.
             * @param isAuthenticationWithSshKey Indicates whether this virtual machine uses an SSH key for authentication
             * @return the next update stage
             */
            Update withIsAuthenticationWithSshKey(Boolean isAuthenticationWithSshKey);
        }

        /**
         * The stage of the labvirtualmachine update allowing to specify LabSubnetName.
         */
        interface WithLabSubnetName {
            /**
             * Specifies labSubnetName.
             * @param labSubnetName The lab subnet name of the virtual machine
             * @return the next update stage
             */
            Update withLabSubnetName(String labSubnetName);
        }

        /**
         * The stage of the labvirtualmachine update allowing to specify LabVirtualNetworkId.
         */
        interface WithLabVirtualNetworkId {
            /**
             * Specifies labVirtualNetworkId.
             * @param labVirtualNetworkId The lab virtual network identifier of the virtual machine
             * @return the next update stage
             */
            Update withLabVirtualNetworkId(String labVirtualNetworkId);
        }

        /**
         * The stage of the labvirtualmachine update allowing to specify Location.
         */
        interface WithLocation {
            /**
             * Specifies location.
             * @param location The location of the resource
             * @return the next update stage
             */
            Update withLocation(String location);
        }

        /**
         * The stage of the labvirtualmachine update allowing to specify NetworkInterface.
         */
        interface WithNetworkInterface {
            /**
             * Specifies networkInterface.
             * @param networkInterface The network interface properties
             * @return the next update stage
             */
            Update withNetworkInterface(NetworkInterfacePropertiesFragment networkInterface);
        }

        /**
         * The stage of the labvirtualmachine update allowing to specify Notes.
         */
        interface WithNotes {
            /**
             * Specifies notes.
             * @param notes The notes of the virtual machine
             * @return the next update stage
             */
            Update withNotes(String notes);
        }

        /**
         * The stage of the labvirtualmachine update allowing to specify OsType.
         */
        interface WithOsType {
            /**
             * Specifies osType.
             * @param osType The OS type of the virtual machine
             * @return the next update stage
             */
            Update withOsType(String osType);
        }

        /**
         * The stage of the labvirtualmachine update allowing to specify OwnerObjectId.
         */
        interface WithOwnerObjectId {
            /**
             * Specifies ownerObjectId.
             * @param ownerObjectId The object identifier of the owner of the virtual machine
             * @return the next update stage
             */
            Update withOwnerObjectId(String ownerObjectId);
        }

        /**
         * The stage of the labvirtualmachine update allowing to specify OwnerUserPrincipalName.
         */
        interface WithOwnerUserPrincipalName {
            /**
             * Specifies ownerUserPrincipalName.
             * @param ownerUserPrincipalName The user principal name of the virtual machine owner
             * @return the next update stage
             */
            Update withOwnerUserPrincipalName(String ownerUserPrincipalName);
        }

        /**
         * The stage of the labvirtualmachine update allowing to specify Password.
         */
        interface WithPassword {
            /**
             * Specifies password.
             * @param password The password of the virtual machine administrator
             * @return the next update stage
             */
            Update withPassword(String password);
        }

        /**
         * The stage of the labvirtualmachine update allowing to specify ProvisioningState.
         */
        interface WithProvisioningState {
            /**
             * Specifies provisioningState.
             * @param provisioningState The provisioning status of the resource
             * @return the next update stage
             */
            Update withProvisioningState(String provisioningState);
        }

        /**
         * The stage of the labvirtualmachine update allowing to specify Size.
         */
        interface WithSize {
            /**
             * Specifies size.
             * @param size The size of the virtual machine
             * @return the next update stage
             */
            Update withSize(String size);
        }

        /**
         * The stage of the labvirtualmachine update allowing to specify SshKey.
         */
        interface WithSshKey {
            /**
             * Specifies sshKey.
             * @param sshKey The SSH key of the virtual machine administrator
             * @return the next update stage
             */
            Update withSshKey(String sshKey);
        }

        /**
         * The stage of the labvirtualmachine update allowing to specify StorageType.
         */
        interface WithStorageType {
            /**
             * Specifies storageType.
             * @param storageType Storage type to use for virtual machine (i.e. Standard, Premium)
             * @return the next update stage
             */
            Update withStorageType(String storageType);
        }

        /**
         * The stage of the labvirtualmachine update allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags The tags of the resource
             * @return the next update stage
             */
            Update withTags(Map<String, String> tags);
        }

        /**
         * The stage of the labvirtualmachine update allowing to specify UniqueIdentifier.
         */
        interface WithUniqueIdentifier {
            /**
             * Specifies uniqueIdentifier.
             * @param uniqueIdentifier The unique immutable identifier of a resource (Guid)
             * @return the next update stage
             */
            Update withUniqueIdentifier(String uniqueIdentifier);
        }

        /**
         * The stage of the labvirtualmachine update allowing to specify UserName.
         */
        interface WithUserName {
            /**
             * Specifies userName.
             * @param userName The user name of the virtual machine
             * @return the next update stage
             */
            Update withUserName(String userName);
        }

        /**
         * The stage of the labvirtualmachine update allowing to specify VirtualMachineCreationSource.
         */
        interface WithVirtualMachineCreationSource {
            /**
             * Specifies virtualMachineCreationSource.
             * @param virtualMachineCreationSource Tells source of creation of lab virtual machine. Output property only. Possible values include: 'FromCustomImage', 'FromGalleryImage'
             * @return the next update stage
             */
            Update withVirtualMachineCreationSource(VirtualMachineCreationSource virtualMachineCreationSource);
        }

    }
}