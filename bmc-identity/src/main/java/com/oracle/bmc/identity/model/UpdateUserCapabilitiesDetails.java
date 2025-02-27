/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.model;

/**
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
    builder = UpdateUserCapabilitiesDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class UpdateUserCapabilitiesDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("canUseConsolePassword")
        private Boolean canUseConsolePassword;

        public Builder canUseConsolePassword(Boolean canUseConsolePassword) {
            this.canUseConsolePassword = canUseConsolePassword;
            this.__explicitlySet__.add("canUseConsolePassword");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("canUseApiKeys")
        private Boolean canUseApiKeys;

        public Builder canUseApiKeys(Boolean canUseApiKeys) {
            this.canUseApiKeys = canUseApiKeys;
            this.__explicitlySet__.add("canUseApiKeys");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("canUseAuthTokens")
        private Boolean canUseAuthTokens;

        public Builder canUseAuthTokens(Boolean canUseAuthTokens) {
            this.canUseAuthTokens = canUseAuthTokens;
            this.__explicitlySet__.add("canUseAuthTokens");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("canUseSmtpCredentials")
        private Boolean canUseSmtpCredentials;

        public Builder canUseSmtpCredentials(Boolean canUseSmtpCredentials) {
            this.canUseSmtpCredentials = canUseSmtpCredentials;
            this.__explicitlySet__.add("canUseSmtpCredentials");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("canUseDBCredentials")
        private Boolean canUseDBCredentials;

        public Builder canUseDBCredentials(Boolean canUseDBCredentials) {
            this.canUseDBCredentials = canUseDBCredentials;
            this.__explicitlySet__.add("canUseDBCredentials");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("canUseCustomerSecretKeys")
        private Boolean canUseCustomerSecretKeys;

        public Builder canUseCustomerSecretKeys(Boolean canUseCustomerSecretKeys) {
            this.canUseCustomerSecretKeys = canUseCustomerSecretKeys;
            this.__explicitlySet__.add("canUseCustomerSecretKeys");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("canUseOAuth2ClientCredentials")
        private Boolean canUseOAuth2ClientCredentials;

        public Builder canUseOAuth2ClientCredentials(Boolean canUseOAuth2ClientCredentials) {
            this.canUseOAuth2ClientCredentials = canUseOAuth2ClientCredentials;
            this.__explicitlySet__.add("canUseOAuth2ClientCredentials");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateUserCapabilitiesDetails build() {
            UpdateUserCapabilitiesDetails __instance__ =
                    new UpdateUserCapabilitiesDetails(
                            canUseConsolePassword,
                            canUseApiKeys,
                            canUseAuthTokens,
                            canUseSmtpCredentials,
                            canUseDBCredentials,
                            canUseCustomerSecretKeys,
                            canUseOAuth2ClientCredentials);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateUserCapabilitiesDetails o) {
            Builder copiedBuilder =
                    canUseConsolePassword(o.getCanUseConsolePassword())
                            .canUseApiKeys(o.getCanUseApiKeys())
                            .canUseAuthTokens(o.getCanUseAuthTokens())
                            .canUseSmtpCredentials(o.getCanUseSmtpCredentials())
                            .canUseDBCredentials(o.getCanUseDBCredentials())
                            .canUseCustomerSecretKeys(o.getCanUseCustomerSecretKeys())
                            .canUseOAuth2ClientCredentials(o.getCanUseOAuth2ClientCredentials());

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
     * Indicates if the user can log in to the console.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("canUseConsolePassword")
    Boolean canUseConsolePassword;

    /**
     * Indicates if the user can use API keys.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("canUseApiKeys")
    Boolean canUseApiKeys;

    /**
     * Indicates if the user can use SWIFT passwords / auth tokens.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("canUseAuthTokens")
    Boolean canUseAuthTokens;

    /**
     * Indicates if the user can use SMTP passwords.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("canUseSmtpCredentials")
    Boolean canUseSmtpCredentials;

    /**
     * Indicates if the user can use DB passwords.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("canUseDBCredentials")
    Boolean canUseDBCredentials;

    /**
     * Indicates if the user can use SigV4 symmetric keys.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("canUseCustomerSecretKeys")
    Boolean canUseCustomerSecretKeys;

    /**
     * Indicates if the user can use OAuth2 credentials and tokens.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("canUseOAuth2ClientCredentials")
    Boolean canUseOAuth2ClientCredentials;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
