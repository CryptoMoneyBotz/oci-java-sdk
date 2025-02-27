/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Options for defining the availability of a VM instance after a maintenance event that impacts the underlying
 * hardware, including whether to live migrate supported VM instances when possible without sending a prior customer notification.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateInstanceAvailabilityConfigDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class UpdateInstanceAvailabilityConfigDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("isLiveMigrationPreferred")
        private Boolean isLiveMigrationPreferred;

        public Builder isLiveMigrationPreferred(Boolean isLiveMigrationPreferred) {
            this.isLiveMigrationPreferred = isLiveMigrationPreferred;
            this.__explicitlySet__.add("isLiveMigrationPreferred");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("recoveryAction")
        private RecoveryAction recoveryAction;

        public Builder recoveryAction(RecoveryAction recoveryAction) {
            this.recoveryAction = recoveryAction;
            this.__explicitlySet__.add("recoveryAction");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateInstanceAvailabilityConfigDetails build() {
            UpdateInstanceAvailabilityConfigDetails __instance__ =
                    new UpdateInstanceAvailabilityConfigDetails(
                            isLiveMigrationPreferred, recoveryAction);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateInstanceAvailabilityConfigDetails o) {
            Builder copiedBuilder =
                    isLiveMigrationPreferred(o.getIsLiveMigrationPreferred())
                            .recoveryAction(o.getRecoveryAction());

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
     * Whether to live migrate supported VM instances to a healthy physical VM host without
     * disrupting running instances during infrastructure maintenance events. If null, Oracle
     * chooses the best option for migrating the VM during infrastructure maintenance events.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isLiveMigrationPreferred")
    Boolean isLiveMigrationPreferred;
    /**
     * The lifecycle state for an instance when it is recovered after infrastructure maintenance.
     * * {@code RESTORE_INSTANCE} - The instance is restored to the lifecycle state it was in before the maintenance event.
     * If the instance was running, it is automatically rebooted. This is the default action when a value is not set.
     * * {@code STOP_INSTANCE} - The instance is recovered in the stopped state.
     *
     **/
    public enum RecoveryAction {
        RestoreInstance("RESTORE_INSTANCE"),
        StopInstance("STOP_INSTANCE"),
        ;

        private final String value;
        private static java.util.Map<String, RecoveryAction> map;

        static {
            map = new java.util.HashMap<>();
            for (RecoveryAction v : RecoveryAction.values()) {
                map.put(v.getValue(), v);
            }
        }

        RecoveryAction(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static RecoveryAction create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid RecoveryAction: " + key);
        }
    };
    /**
     * The lifecycle state for an instance when it is recovered after infrastructure maintenance.
     * * {@code RESTORE_INSTANCE} - The instance is restored to the lifecycle state it was in before the maintenance event.
     * If the instance was running, it is automatically rebooted. This is the default action when a value is not set.
     * * {@code STOP_INSTANCE} - The instance is recovered in the stopped state.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recoveryAction")
    RecoveryAction recoveryAction;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
