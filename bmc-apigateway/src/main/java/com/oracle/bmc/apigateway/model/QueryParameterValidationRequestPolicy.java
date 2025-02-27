/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.model;

/**
 * Validate the URL query parameters on the incoming API requests on a specific route.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = QueryParameterValidationRequestPolicy.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class QueryParameterValidationRequestPolicy {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("parameters")
        private java.util.List<QueryParameterValidationItem> parameters;

        public Builder parameters(java.util.List<QueryParameterValidationItem> parameters) {
            this.parameters = parameters;
            this.__explicitlySet__.add("parameters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("validationMode")
        private ValidationMode validationMode;

        public Builder validationMode(ValidationMode validationMode) {
            this.validationMode = validationMode;
            this.__explicitlySet__.add("validationMode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public QueryParameterValidationRequestPolicy build() {
            QueryParameterValidationRequestPolicy __instance__ =
                    new QueryParameterValidationRequestPolicy(parameters, validationMode);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(QueryParameterValidationRequestPolicy o) {
            Builder copiedBuilder =
                    parameters(o.getParameters()).validationMode(o.getValidationMode());

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

    @com.fasterxml.jackson.annotation.JsonProperty("parameters")
    java.util.List<QueryParameterValidationItem> parameters;
    /**
     * Validation behavior mode.
     * <p>
     * In {@code ENFORCING} mode, upon a validation failure, the request will be rejected with a 4xx response
     * and not sent to the backend.
     * <p>
     * In {@code PERMISSIVE} mode, the result of the validation will be exposed as metrics while the request
     * will follow the normal path.
     * <p>
     * {@code DISABLED} type turns the validation off.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum ValidationMode {
        Enforcing("ENFORCING"),
        Permissive("PERMISSIVE"),
        Disabled("DISABLED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, ValidationMode> map;

        static {
            map = new java.util.HashMap<>();
            for (ValidationMode v : ValidationMode.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ValidationMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ValidationMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ValidationMode', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Validation behavior mode.
     * <p>
     * In {@code ENFORCING} mode, upon a validation failure, the request will be rejected with a 4xx response
     * and not sent to the backend.
     * <p>
     * In {@code PERMISSIVE} mode, the result of the validation will be exposed as metrics while the request
     * will follow the normal path.
     * <p>
     * {@code DISABLED} type turns the validation off.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("validationMode")
    ValidationMode validationMode;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
