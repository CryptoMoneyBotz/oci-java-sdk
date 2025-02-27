/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerengine.model;

/**
 * The properties that define a request to create a cluster.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180222")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateClusterDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CreateClusterDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("endpointConfig")
        private CreateClusterEndpointConfigDetails endpointConfig;

        public Builder endpointConfig(CreateClusterEndpointConfigDetails endpointConfig) {
            this.endpointConfig = endpointConfig;
            this.__explicitlySet__.add("endpointConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
        private String vcnId;

        public Builder vcnId(String vcnId) {
            this.vcnId = vcnId;
            this.__explicitlySet__.add("vcnId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("kubernetesVersion")
        private String kubernetesVersion;

        public Builder kubernetesVersion(String kubernetesVersion) {
            this.kubernetesVersion = kubernetesVersion;
            this.__explicitlySet__.add("kubernetesVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
        private String kmsKeyId;

        public Builder kmsKeyId(String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            this.__explicitlySet__.add("kmsKeyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("options")
        private ClusterCreateOptions options;

        public Builder options(ClusterCreateOptions options) {
            this.options = options;
            this.__explicitlySet__.add("options");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("imagePolicyConfig")
        private CreateImagePolicyConfigDetails imagePolicyConfig;

        public Builder imagePolicyConfig(CreateImagePolicyConfigDetails imagePolicyConfig) {
            this.imagePolicyConfig = imagePolicyConfig;
            this.__explicitlySet__.add("imagePolicyConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateClusterDetails build() {
            CreateClusterDetails __instance__ =
                    new CreateClusterDetails(
                            name,
                            compartmentId,
                            endpointConfig,
                            vcnId,
                            kubernetesVersion,
                            kmsKeyId,
                            options,
                            imagePolicyConfig);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateClusterDetails o) {
            Builder copiedBuilder =
                    name(o.getName())
                            .compartmentId(o.getCompartmentId())
                            .endpointConfig(o.getEndpointConfig())
                            .vcnId(o.getVcnId())
                            .kubernetesVersion(o.getKubernetesVersion())
                            .kmsKeyId(o.getKmsKeyId())
                            .options(o.getOptions())
                            .imagePolicyConfig(o.getImagePolicyConfig());

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

    /**
     * The name of the cluster. Avoid entering confidential information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * The OCID of the compartment in which to create the cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The network configuration for access to the Cluster control plane.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("endpointConfig")
    CreateClusterEndpointConfigDetails endpointConfig;

    /**
     * The OCID of the virtual cloud network (VCN) in which to create the cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
    String vcnId;

    /**
     * The version of Kubernetes to install into the cluster masters.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("kubernetesVersion")
    String kubernetesVersion;

    /**
     * The OCID of the KMS key to be used as the master encryption key for Kubernetes secret encryption.
     * When used, {@code kubernetesVersion} must be at least {@code v1.13.0}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
    String kmsKeyId;

    /**
     * Optional attributes for the cluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("options")
    ClusterCreateOptions options;

    /**
     * The image verification policy for signature validation. Once a policy is created and enabled with
     * one or more kms keys, the policy will ensure all images deployed has been signed with the key(s)
     * attached to the policy.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("imagePolicyConfig")
    CreateImagePolicyConfigDetails imagePolicyConfig;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
