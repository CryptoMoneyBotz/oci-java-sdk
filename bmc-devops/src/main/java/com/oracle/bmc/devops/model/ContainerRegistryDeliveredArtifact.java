/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Details of the container registry artifacts delivered through the Deliver Artifacts stage.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ContainerRegistryDeliveredArtifact.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "artifactType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ContainerRegistryDeliveredArtifact extends DeliveredArtifact {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("deployArtifactId")
        private String deployArtifactId;

        public Builder deployArtifactId(String deployArtifactId) {
            this.deployArtifactId = deployArtifactId;
            this.__explicitlySet__.add("deployArtifactId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("outputArtifactName")
        private String outputArtifactName;

        public Builder outputArtifactName(String outputArtifactName) {
            this.outputArtifactName = outputArtifactName;
            this.__explicitlySet__.add("outputArtifactName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("deliveredArtifactHash")
        private String deliveredArtifactHash;

        public Builder deliveredArtifactHash(String deliveredArtifactHash) {
            this.deliveredArtifactHash = deliveredArtifactHash;
            this.__explicitlySet__.add("deliveredArtifactHash");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("imageUri")
        private String imageUri;

        public Builder imageUri(String imageUri) {
            this.imageUri = imageUri;
            this.__explicitlySet__.add("imageUri");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ContainerRegistryDeliveredArtifact build() {
            ContainerRegistryDeliveredArtifact __instance__ =
                    new ContainerRegistryDeliveredArtifact(
                            deployArtifactId, outputArtifactName, deliveredArtifactHash, imageUri);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ContainerRegistryDeliveredArtifact o) {
            Builder copiedBuilder =
                    deployArtifactId(o.getDeployArtifactId())
                            .outputArtifactName(o.getOutputArtifactName())
                            .deliveredArtifactHash(o.getDeliveredArtifactHash())
                            .imageUri(o.getImageUri());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    @Deprecated
    public ContainerRegistryDeliveredArtifact(
            String deployArtifactId,
            String outputArtifactName,
            String deliveredArtifactHash,
            String imageUri) {
        super(deployArtifactId, outputArtifactName);
        this.deliveredArtifactHash = deliveredArtifactHash;
        this.imageUri = imageUri;
    }

    /**
     * The hash of the container registry artifact pushed by the Deliver Artifacts stage.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("deliveredArtifactHash")
    String deliveredArtifactHash;

    /**
     * The imageUri of the OCIR artifact pushed by the DeliverArtifactStage
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("imageUri")
    String imageUri;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
