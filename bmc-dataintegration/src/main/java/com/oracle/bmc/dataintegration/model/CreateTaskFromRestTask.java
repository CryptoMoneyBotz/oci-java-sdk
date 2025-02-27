/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The information about the Generic REST task. The endpoint and cancelEndpoint  properties are deprecated, use the properties executeRestCallConfig, cancelRestCallConfig and pollRestCallConfig for execute, cancel and polling of the calls.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateTaskFromRestTask.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "modelType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CreateTaskFromRestTask extends CreateTaskDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
        private String modelVersion;

        public Builder modelVersion(String modelVersion) {
            this.modelVersion = modelVersion;
            this.__explicitlySet__.add("modelVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parentRef")
        private ParentReference parentRef;

        public Builder parentRef(ParentReference parentRef) {
            this.parentRef = parentRef;
            this.__explicitlySet__.add("parentRef");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
        private Integer objectStatus;

        public Builder objectStatus(Integer objectStatus) {
            this.objectStatus = objectStatus;
            this.__explicitlySet__.add("objectStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("identifier")
        private String identifier;

        public Builder identifier(String identifier) {
            this.identifier = identifier;
            this.__explicitlySet__.add("identifier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("inputPorts")
        private java.util.List<InputPort> inputPorts;

        public Builder inputPorts(java.util.List<InputPort> inputPorts) {
            this.inputPorts = inputPorts;
            this.__explicitlySet__.add("inputPorts");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("outputPorts")
        private java.util.List<OutputPort> outputPorts;

        public Builder outputPorts(java.util.List<OutputPort> outputPorts) {
            this.outputPorts = outputPorts;
            this.__explicitlySet__.add("outputPorts");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parameters")
        private java.util.List<Parameter> parameters;

        public Builder parameters(java.util.List<Parameter> parameters) {
            this.parameters = parameters;
            this.__explicitlySet__.add("parameters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("opConfigValues")
        private ConfigValues opConfigValues;

        public Builder opConfigValues(ConfigValues opConfigValues) {
            this.opConfigValues = opConfigValues;
            this.__explicitlySet__.add("opConfigValues");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("configProviderDelegate")
        private CreateConfigProvider configProviderDelegate;

        public Builder configProviderDelegate(CreateConfigProvider configProviderDelegate) {
            this.configProviderDelegate = configProviderDelegate;
            this.__explicitlySet__.add("configProviderDelegate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("registryMetadata")
        private RegistryMetadata registryMetadata;

        public Builder registryMetadata(RegistryMetadata registryMetadata) {
            this.registryMetadata = registryMetadata;
            this.__explicitlySet__.add("registryMetadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("authDetails")
        private AuthDetails authDetails;

        public Builder authDetails(AuthDetails authDetails) {
            this.authDetails = authDetails;
            this.__explicitlySet__.add("authDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("endpoint")
        private Expression endpoint;

        public Builder endpoint(Expression endpoint) {
            this.endpoint = endpoint;
            this.__explicitlySet__.add("endpoint");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("methodType")
        private MethodType methodType;

        public Builder methodType(MethodType methodType) {
            this.methodType = methodType;
            this.__explicitlySet__.add("methodType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("headers")
        private Object headers;

        public Builder headers(Object headers) {
            this.headers = headers;
            this.__explicitlySet__.add("headers");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("jsonData")
        private String jsonData;

        public Builder jsonData(String jsonData) {
            this.jsonData = jsonData;
            this.__explicitlySet__.add("jsonData");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("apiCallMode")
        private ApiCallMode apiCallMode;

        public Builder apiCallMode(ApiCallMode apiCallMode) {
            this.apiCallMode = apiCallMode;
            this.__explicitlySet__.add("apiCallMode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cancelEndpoint")
        private Expression cancelEndpoint;

        public Builder cancelEndpoint(Expression cancelEndpoint) {
            this.cancelEndpoint = cancelEndpoint;
            this.__explicitlySet__.add("cancelEndpoint");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cancelMethodType")
        private CancelMethodType cancelMethodType;

        public Builder cancelMethodType(CancelMethodType cancelMethodType) {
            this.cancelMethodType = cancelMethodType;
            this.__explicitlySet__.add("cancelMethodType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("executeRestCallConfig")
        private ExecuteRestCallConfig executeRestCallConfig;

        public Builder executeRestCallConfig(ExecuteRestCallConfig executeRestCallConfig) {
            this.executeRestCallConfig = executeRestCallConfig;
            this.__explicitlySet__.add("executeRestCallConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cancelRestCallConfig")
        private CancelRestCallConfig cancelRestCallConfig;

        public Builder cancelRestCallConfig(CancelRestCallConfig cancelRestCallConfig) {
            this.cancelRestCallConfig = cancelRestCallConfig;
            this.__explicitlySet__.add("cancelRestCallConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateTaskFromRestTask build() {
            CreateTaskFromRestTask __instance__ =
                    new CreateTaskFromRestTask(
                            key,
                            modelVersion,
                            parentRef,
                            name,
                            description,
                            objectStatus,
                            identifier,
                            inputPorts,
                            outputPorts,
                            parameters,
                            opConfigValues,
                            configProviderDelegate,
                            registryMetadata,
                            authDetails,
                            endpoint,
                            methodType,
                            headers,
                            jsonData,
                            apiCallMode,
                            cancelEndpoint,
                            cancelMethodType,
                            executeRestCallConfig,
                            cancelRestCallConfig);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateTaskFromRestTask o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .modelVersion(o.getModelVersion())
                            .parentRef(o.getParentRef())
                            .name(o.getName())
                            .description(o.getDescription())
                            .objectStatus(o.getObjectStatus())
                            .identifier(o.getIdentifier())
                            .inputPorts(o.getInputPorts())
                            .outputPorts(o.getOutputPorts())
                            .parameters(o.getParameters())
                            .opConfigValues(o.getOpConfigValues())
                            .configProviderDelegate(o.getConfigProviderDelegate())
                            .registryMetadata(o.getRegistryMetadata())
                            .authDetails(o.getAuthDetails())
                            .endpoint(o.getEndpoint())
                            .methodType(o.getMethodType())
                            .headers(o.getHeaders())
                            .jsonData(o.getJsonData())
                            .apiCallMode(o.getApiCallMode())
                            .cancelEndpoint(o.getCancelEndpoint())
                            .cancelMethodType(o.getCancelMethodType())
                            .executeRestCallConfig(o.getExecuteRestCallConfig())
                            .cancelRestCallConfig(o.getCancelRestCallConfig());

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
    public CreateTaskFromRestTask(
            String key,
            String modelVersion,
            ParentReference parentRef,
            String name,
            String description,
            Integer objectStatus,
            String identifier,
            java.util.List<InputPort> inputPorts,
            java.util.List<OutputPort> outputPorts,
            java.util.List<Parameter> parameters,
            ConfigValues opConfigValues,
            CreateConfigProvider configProviderDelegate,
            RegistryMetadata registryMetadata,
            AuthDetails authDetails,
            Expression endpoint,
            MethodType methodType,
            Object headers,
            String jsonData,
            ApiCallMode apiCallMode,
            Expression cancelEndpoint,
            CancelMethodType cancelMethodType,
            ExecuteRestCallConfig executeRestCallConfig,
            CancelRestCallConfig cancelRestCallConfig) {
        super(
                key,
                modelVersion,
                parentRef,
                name,
                description,
                objectStatus,
                identifier,
                inputPorts,
                outputPorts,
                parameters,
                opConfigValues,
                configProviderDelegate,
                registryMetadata);
        this.authDetails = authDetails;
        this.endpoint = endpoint;
        this.methodType = methodType;
        this.headers = headers;
        this.jsonData = jsonData;
        this.apiCallMode = apiCallMode;
        this.cancelEndpoint = cancelEndpoint;
        this.cancelMethodType = cancelMethodType;
        this.executeRestCallConfig = executeRestCallConfig;
        this.cancelRestCallConfig = cancelRestCallConfig;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("authDetails")
    AuthDetails authDetails;

    @com.fasterxml.jackson.annotation.JsonProperty("endpoint")
    Expression endpoint;
    /**
     * The REST method to use. This property is deprecated, use ExecuteRestCallConfig's methodType property instead.
     **/
    public enum MethodType {
        Get("GET"),
        Post("POST"),
        Patch("PATCH"),
        Delete("DELETE"),
        Put("PUT"),
        ;

        private final String value;
        private static java.util.Map<String, MethodType> map;

        static {
            map = new java.util.HashMap<>();
            for (MethodType v : MethodType.values()) {
                map.put(v.getValue(), v);
            }
        }

        MethodType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static MethodType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid MethodType: " + key);
        }
    };
    /**
     * The REST method to use. This property is deprecated, use ExecuteRestCallConfig's methodType property instead.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("methodType")
    MethodType methodType;

    @com.fasterxml.jackson.annotation.JsonProperty("headers")
    Object headers;

    /**
     * JSON data for payload body. This property is deprecated, use ExecuteRestCallConfig's payload config param instead.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("jsonData")
    String jsonData;
    /**
     * The REST invocation pattern to use. ASYNC_OCI_WORKREQUEST is being deprecated as well as cancelEndpoint/MethodType.
     **/
    public enum ApiCallMode {
        Synchronous("SYNCHRONOUS"),
        AsyncOciWorkrequest("ASYNC_OCI_WORKREQUEST"),
        AsyncGeneric("ASYNC_GENERIC"),
        ;

        private final String value;
        private static java.util.Map<String, ApiCallMode> map;

        static {
            map = new java.util.HashMap<>();
            for (ApiCallMode v : ApiCallMode.values()) {
                map.put(v.getValue(), v);
            }
        }

        ApiCallMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ApiCallMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ApiCallMode: " + key);
        }
    };
    /**
     * The REST invocation pattern to use. ASYNC_OCI_WORKREQUEST is being deprecated as well as cancelEndpoint/MethodType.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("apiCallMode")
    ApiCallMode apiCallMode;

    @com.fasterxml.jackson.annotation.JsonProperty("cancelEndpoint")
    Expression cancelEndpoint;
    /**
     * The REST method to use for canceling the original request.
     **/
    public enum CancelMethodType {
        Get("GET"),
        Post("POST"),
        Patch("PATCH"),
        Delete("DELETE"),
        Put("PUT"),
        ;

        private final String value;
        private static java.util.Map<String, CancelMethodType> map;

        static {
            map = new java.util.HashMap<>();
            for (CancelMethodType v : CancelMethodType.values()) {
                map.put(v.getValue(), v);
            }
        }

        CancelMethodType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static CancelMethodType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid CancelMethodType: " + key);
        }
    };
    /**
     * The REST method to use for canceling the original request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cancelMethodType")
    CancelMethodType cancelMethodType;

    @com.fasterxml.jackson.annotation.JsonProperty("executeRestCallConfig")
    ExecuteRestCallConfig executeRestCallConfig;

    @com.fasterxml.jackson.annotation.JsonProperty("cancelRestCallConfig")
    CancelRestCallConfig cancelRestCallConfig;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
