/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.nosql.requests;

import com.oracle.bmc.nosql.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/nosql/GetRowExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetRowRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190828")
@lombok.Builder(
    builderClassName = "Builder",
    buildMethodName = "buildWithoutInvocationCallback",
    toBuilder = true
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class GetRowRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * A table name within the compartment, or a table OCID.
     */
    private String tableNameOrId;

    /**
     * An array of strings, each of the format "column-name:value",
     * representing the primary key of the row.
     *
     */
    private java.util.List<String> key;

    /**
     * The ID of a table's compartment. When a table is identified
     * by name, the compartmentId is often needed to provide
     * context for interpreting the name.
     *
     */
    private String compartmentId;

    /**
     * Consistency requirement for a read operation.
     */
    private Consistency consistency;

    /**
     * Consistency requirement for a read operation.
     **/
    public enum Consistency {
        Eventual("EVENTUAL"),
        Absolute("ABSOLUTE"),
        ;

        private final String value;
        private static java.util.Map<String, Consistency> map;

        static {
            map = new java.util.HashMap<>();
            for (Consistency v : Consistency.values()) {
                map.put(v.getValue(), v);
            }
        }

        Consistency(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Consistency create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Consistency: " + key);
        }
    };
    /**
     * Timeout setting for this operation.
     */
    private Integer timeoutInMs;

    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<GetRowRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private java.util.List<String> key = null;

        /**
         * An array of strings, each of the format "column-name:value",
         * representing the primary key of the row.
         *
         * @return this builder instance
         */
        public Builder key(java.util.List<String> key) {
            this.key = key;
            return this;
        }

        /**
         * Singular setter. An array of strings, each of the format "column-name:value",
         * representing the primary key of the row.
         *
         * @return this builder instance
         */
        public Builder key(String singularValue) {
            return this.key(java.util.Arrays.asList(singularValue));
        }

        /**
         * Set the invocation callback for the request to be built.
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                        invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
         * @param retryConfiguration the retry configuration to be used for the request
         * @return this builder instance
         */
        public Builder retryConfiguration(
                com.oracle.bmc.retrier.RetryConfiguration retryConfiguration) {
            this.retryConfiguration = retryConfiguration;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(GetRowRequest o) {
            tableNameOrId(o.getTableNameOrId());
            key(o.getKey());
            compartmentId(o.getCompartmentId());
            consistency(o.getConsistency());
            timeoutInMs(o.getTimeoutInMs());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetRowRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetRowRequest
         */
        public GetRowRequest build() {
            GetRowRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }
    }
}
