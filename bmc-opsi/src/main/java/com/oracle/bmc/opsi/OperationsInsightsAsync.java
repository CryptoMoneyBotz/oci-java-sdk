/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi;

import com.oracle.bmc.opsi.requests.*;
import com.oracle.bmc.opsi.responses.*;

/**
 * Use the Operations Insights API to perform data extraction operations to obtain database
 * resource utilization, performance statistics, and reference information. For more information,
 * see [About Oracle Cloud Infrastructure Operations Insights](https://docs.cloud.oracle.com/en-us/iaas/operations-insights/doc/operations-insights.html).
 *
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public interface OperationsInsightsAsync extends AutoCloseable {

    /**
     * Sets the endpoint to call (ex, https://www.example.com).
     * @param endpoint The endpoint of the serice.
     */
    void setEndpoint(String endpoint);

    /**
     * Gets the set endpoint for REST call (ex, https://www.example.com)
     */
    String getEndpoint();

    /**
     * Sets the region to call (ex, Region.US_PHOENIX_1).
     * <p>
     * Note, this will call {@link #setEndpoint(String) setEndpoint} after resolving the endpoint.  If the service is not available in this region, however, an IllegalArgumentException will be raised.
     * @param region The region of the service.
     */
    void setRegion(com.oracle.bmc.Region region);

    /**
     * Sets the region to call (ex, 'us-phoenix-1').
     * <p>
     * Note, this will first try to map the region ID to a known Region and call
     * {@link #setRegion(Region) setRegion}.
     * <p>
     * If no known Region could be determined, it will create an endpoint based on the
     * default endpoint format ({@link com.oracle.bmc.Region#formatDefaultRegionEndpoint(Service, String)}
     * and then call {@link #setEndpoint(String) setEndpoint}.
     * @param regionId The public region ID.
     */
    void setRegion(String regionId);

    /**
     * Add new members (e.g. databases and hosts) to an Exadata system in Operations Insights. Exadata-related metric collection and analysis will be started.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<AddExadataInsightMembersResponse> addExadataInsightMembers(
            AddExadataInsightMembersRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            AddExadataInsightMembersRequest, AddExadataInsightMembersResponse>
                    handler);

    /**
     * Moves a DatabaseInsight resource from one compartment identifier to another. When provided, If-Match is checked against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeDatabaseInsightCompartmentResponse>
            changeDatabaseInsightCompartment(
                    ChangeDatabaseInsightCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeDatabaseInsightCompartmentRequest,
                                    ChangeDatabaseInsightCompartmentResponse>
                            handler);

    /**
     * Moves a EnterpriseManagerBridge resource from one compartment to another. When provided, If-Match is checked against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeEnterpriseManagerBridgeCompartmentResponse>
            changeEnterpriseManagerBridgeCompartment(
                    ChangeEnterpriseManagerBridgeCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeEnterpriseManagerBridgeCompartmentRequest,
                                    ChangeEnterpriseManagerBridgeCompartmentResponse>
                            handler);

    /**
     * Moves an Exadata insight resource from one compartment identifier to another. When provided, If-Match is checked against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeExadataInsightCompartmentResponse>
            changeExadataInsightCompartment(
                    ChangeExadataInsightCompartmentRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ChangeExadataInsightCompartmentRequest,
                                    ChangeExadataInsightCompartmentResponse>
                            handler);

    /**
     * Moves a HostInsight resource from one compartment identifier to another. When provided, If-Match is checked against ETag values of the resource.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ChangeHostInsightCompartmentResponse> changeHostInsightCompartment(
            ChangeHostInsightCompartmentRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ChangeHostInsightCompartmentRequest,
                            ChangeHostInsightCompartmentResponse>
                    handler);

    /**
     * Create a AWR hub resource for the tenant in Operations Insights.
     * This resource will be created in root compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateAwrHubResponse> createAwrHub(
            CreateAwrHubRequest request,
            com.oracle.bmc.responses.AsyncHandler<CreateAwrHubRequest, CreateAwrHubResponse>
                    handler);

    /**
     * Create a Database Insight resource for a database in Operations Insights. The database will be enabled in Operations Insights. Database metric collection and analysis will be started.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateDatabaseInsightResponse> createDatabaseInsight(
            CreateDatabaseInsightRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateDatabaseInsightRequest, CreateDatabaseInsightResponse>
                    handler);

    /**
     * Create a Enterprise Manager bridge in Operations Insights.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateEnterpriseManagerBridgeResponse>
            createEnterpriseManagerBridge(
                    CreateEnterpriseManagerBridgeRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateEnterpriseManagerBridgeRequest,
                                    CreateEnterpriseManagerBridgeResponse>
                            handler);

    /**
     * Create an Exadata insight resource for an Exadata system in Operations Insights. The Exadata system will be enabled in Operations Insights. Exadata-related metric collection and analysis will be started.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateExadataInsightResponse> createExadataInsight(
            CreateExadataInsightRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateExadataInsightRequest, CreateExadataInsightResponse>
                    handler);

    /**
     * Create a Host Insight resource for a host in Operations Insights. The host will be enabled in Operations Insights. Host metric collection and analysis will be started.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateHostInsightResponse> createHostInsight(
            CreateHostInsightRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            CreateHostInsightRequest, CreateHostInsightResponse>
                    handler);

    /**
     * Create a Operations Insights Warehouse resource for the tenant in Operations Insights. New ADW will be provisioned for this tenant.
     * There is only expected to be 1 warehouse per tenant. The warehouse is expected to be in the root compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateOperationsInsightsWarehouseResponse>
            createOperationsInsightsWarehouse(
                    CreateOperationsInsightsWarehouseRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateOperationsInsightsWarehouseRequest,
                                    CreateOperationsInsightsWarehouseResponse>
                            handler);

    /**
     * Create a Operations Insights Warehouse user resource for the tenant in Operations Insights.
     * This resource will be created in root compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<CreateOperationsInsightsWarehouseUserResponse>
            createOperationsInsightsWarehouseUser(
                    CreateOperationsInsightsWarehouseUserRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    CreateOperationsInsightsWarehouseUserRequest,
                                    CreateOperationsInsightsWarehouseUserResponse>
                            handler);

    /**
     * Deletes an AWR hub.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteAwrHubResponse> deleteAwrHub(
            DeleteAwrHubRequest request,
            com.oracle.bmc.responses.AsyncHandler<DeleteAwrHubRequest, DeleteAwrHubResponse>
                    handler);

    /**
     * Deletes a database insight. The database insight will be deleted and cannot be enabled again.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteDatabaseInsightResponse> deleteDatabaseInsight(
            DeleteDatabaseInsightRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteDatabaseInsightRequest, DeleteDatabaseInsightResponse>
                    handler);

    /**
     * Deletes an Operations Insights Enterprise Manager bridge. If any database insight is still referencing this bridge, the operation will fail.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteEnterpriseManagerBridgeResponse>
            deleteEnterpriseManagerBridge(
                    DeleteEnterpriseManagerBridgeRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteEnterpriseManagerBridgeRequest,
                                    DeleteEnterpriseManagerBridgeResponse>
                            handler);

    /**
     * Deletes an Exadata insight. The Exadata insight will be deleted and cannot be enabled again.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteExadataInsightResponse> deleteExadataInsight(
            DeleteExadataInsightRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteExadataInsightRequest, DeleteExadataInsightResponse>
                    handler);

    /**
     * Deletes a host insight. The host insight will be deleted and cannot be enabled again.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteHostInsightResponse> deleteHostInsight(
            DeleteHostInsightRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DeleteHostInsightRequest, DeleteHostInsightResponse>
                    handler);

    /**
     * Deletes an Operations Insights Warehouse. There is only expected to be 1 warehouse per tenant.
     * The warehouse is expected to be in the root compartment.
     * User must delete AWR Hub resource for this warehouse before calling this operation.
     * User must delete the warehouse users before calling this operation.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteOperationsInsightsWarehouseResponse>
            deleteOperationsInsightsWarehouse(
                    DeleteOperationsInsightsWarehouseRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteOperationsInsightsWarehouseRequest,
                                    DeleteOperationsInsightsWarehouseResponse>
                            handler);

    /**
     * Deletes an Operations Insights Warehouse User.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DeleteOperationsInsightsWarehouseUserResponse>
            deleteOperationsInsightsWarehouseUser(
                    DeleteOperationsInsightsWarehouseUserRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DeleteOperationsInsightsWarehouseUserRequest,
                                    DeleteOperationsInsightsWarehouseUserResponse>
                            handler);

    /**
     * Disables a database in Operations Insights. Database metric collection and analysis will be stopped.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DisableDatabaseInsightResponse> disableDatabaseInsight(
            DisableDatabaseInsightRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DisableDatabaseInsightRequest, DisableDatabaseInsightResponse>
                    handler);

    /**
     * Disables an Exadata system in Operations Insights. Exadata-related metric collection and analysis will be stopped.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DisableExadataInsightResponse> disableExadataInsight(
            DisableExadataInsightRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DisableExadataInsightRequest, DisableExadataInsightResponse>
                    handler);

    /**
     * Disables a host in Operations Insights. Host metric collection and analysis will be stopped.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DisableHostInsightResponse> disableHostInsight(
            DisableHostInsightRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            DisableHostInsightRequest, DisableHostInsightResponse>
                    handler);

    /**
     * Download the ADW wallet for Operations Insights Warehouse using which the Hub data is exposed.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<DownloadOperationsInsightsWarehouseWalletResponse>
            downloadOperationsInsightsWarehouseWallet(
                    DownloadOperationsInsightsWarehouseWalletRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    DownloadOperationsInsightsWarehouseWalletRequest,
                                    DownloadOperationsInsightsWarehouseWalletResponse>
                            handler);

    /**
     * Enables a database in Operations Insights. Database metric collection and analysis will be started.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<EnableDatabaseInsightResponse> enableDatabaseInsight(
            EnableDatabaseInsightRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            EnableDatabaseInsightRequest, EnableDatabaseInsightResponse>
                    handler);

    /**
     * Enables an Exadata system in Operations Insights. Exadata-related metric collection and analysis will be started.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<EnableExadataInsightResponse> enableExadataInsight(
            EnableExadataInsightRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            EnableExadataInsightRequest, EnableExadataInsightResponse>
                    handler);

    /**
     * Enables a host in Operations Insights. Host metric collection and analysis will be started.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<EnableHostInsightResponse> enableHostInsight(
            EnableHostInsightRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            EnableHostInsightRequest, EnableHostInsightResponse>
                    handler);

    /**
     * Gets details of an AWR hub.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetAwrHubResponse> getAwrHub(
            GetAwrHubRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetAwrHubRequest, GetAwrHubResponse> handler);

    /**
     * Gets the AWR report for the specified source database in the AWR hub. The difference between the timeGreaterThanOrEqualTo and timeLessThanOrEqualTo should not be greater than 7 days.
     * Either beginSnapshotIdentifierGreaterThanOrEqualTo & endSnapshotIdentifierLessThanOrEqualTo params Or timeGreaterThanOrEqualTo & timeLessThanOrEqualTo params are required.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetAwrReportResponse> getAwrReport(
            GetAwrReportRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetAwrReportRequest, GetAwrReportResponse>
                    handler);

    /**
     * Gets details of a database insight.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetDatabaseInsightResponse> getDatabaseInsight(
            GetDatabaseInsightRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetDatabaseInsightRequest, GetDatabaseInsightResponse>
                    handler);

    /**
     * Gets details of an Operations Insights Enterprise Manager bridge.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetEnterpriseManagerBridgeResponse> getEnterpriseManagerBridge(
            GetEnterpriseManagerBridgeRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetEnterpriseManagerBridgeRequest, GetEnterpriseManagerBridgeResponse>
                    handler);

    /**
     * Gets details of an Exadata insight.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetExadataInsightResponse> getExadataInsight(
            GetExadataInsightRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            GetExadataInsightRequest, GetExadataInsightResponse>
                    handler);

    /**
     * Gets details of a host insight.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetHostInsightResponse> getHostInsight(
            GetHostInsightRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetHostInsightRequest, GetHostInsightResponse>
                    handler);

    /**
     * Gets details of an Operations Insights Warehouse.
     * There is only expected to be 1 warehouse per tenant. The warehouse is expected to be in the root compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetOperationsInsightsWarehouseResponse>
            getOperationsInsightsWarehouse(
                    GetOperationsInsightsWarehouseRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetOperationsInsightsWarehouseRequest,
                                    GetOperationsInsightsWarehouseResponse>
                            handler);

    /**
     * Gets details of an Operations Insights Warehouse User.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetOperationsInsightsWarehouseUserResponse>
            getOperationsInsightsWarehouseUser(
                    GetOperationsInsightsWarehouseUserRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    GetOperationsInsightsWarehouseUserRequest,
                                    GetOperationsInsightsWarehouseUserResponse>
                            handler);

    /**
     * Gets the status of the work request with the given ID.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<GetWorkRequestResponse> getWorkRequest(
            GetWorkRequestRequest request,
            com.oracle.bmc.responses.AsyncHandler<GetWorkRequestRequest, GetWorkRequestResponse>
                    handler);

    /**
     * This is a generic ingest endpoint for all database configuration metrics.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<IngestDatabaseConfigurationResponse> ingestDatabaseConfiguration(
            IngestDatabaseConfigurationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            IngestDatabaseConfigurationRequest, IngestDatabaseConfigurationResponse>
                    handler);

    /**
     * This is a generic ingest endpoint for all the host configuration metrics
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<IngestHostConfigurationResponse> ingestHostConfiguration(
            IngestHostConfigurationRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            IngestHostConfigurationRequest, IngestHostConfigurationResponse>
                    handler);

    /**
     * This is a generic ingest endpoint for all the host performance metrics
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<IngestHostMetricsResponse> ingestHostMetrics(
            IngestHostMetricsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            IngestHostMetricsRequest, IngestHostMetricsResponse>
                    handler);

    /**
     * The sqlbucket endpoint takes in a JSON payload, persists it in Operations Insights ingest pipeline.
     * Either databaseId or id must be specified.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<IngestSqlBucketResponse> ingestSqlBucket(
            IngestSqlBucketRequest request,
            com.oracle.bmc.responses.AsyncHandler<IngestSqlBucketRequest, IngestSqlBucketResponse>
                    handler);

    /**
     * The SqlPlanLines endpoint takes in a JSON payload, persists it in Operation Insights ingest pipeline.
     * Either databaseId or id must be specified.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<IngestSqlPlanLinesResponse> ingestSqlPlanLines(
            IngestSqlPlanLinesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            IngestSqlPlanLinesRequest, IngestSqlPlanLinesResponse>
                    handler);

    /**
     * The SQL Stats endpoint takes in a JSON payload, persists it in Operations Insights ingest pipeline.
     * Either databaseId or id must be specified.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<IngestSqlStatsResponse> ingestSqlStats(
            IngestSqlStatsRequest request,
            com.oracle.bmc.responses.AsyncHandler<IngestSqlStatsRequest, IngestSqlStatsResponse>
                    handler);

    /**
     * The SqlText endpoint takes in a JSON payload, persists it in Operation Insights ingest pipeline.
     * Either databaseId or id must be specified.
     * Disclaimer: SQL text being uploaded explicitly via APIs is not masked. Any sensitive literals contained in the sqlFullText column should be masked prior to ingestion.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<IngestSqlTextResponse> ingestSqlText(
            IngestSqlTextRequest request,
            com.oracle.bmc.responses.AsyncHandler<IngestSqlTextRequest, IngestSqlTextResponse>
                    handler);

    /**
     * Gets a list of AWR hubs. Either compartmentId or id must be specified. All these resources are expected to be in root compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAwrHubsResponse> listAwrHubs(
            ListAwrHubsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListAwrHubsRequest, ListAwrHubsResponse> handler);

    /**
     * Lists AWR snapshots for the specified source database in the AWR hub. The difference between the timeGreaterThanOrEqualTo and timeLessThanOrEqualTo should not exceed an elapsed range of 1 day.
     * The timeGreaterThanOrEqualTo & timeLessThanOrEqualTo params are optional. If these params are not provided, by default last 1 day snapshots will be returned.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListAwrSnapshotsResponse> listAwrSnapshots(
            ListAwrSnapshotsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListAwrSnapshotsRequest, ListAwrSnapshotsResponse>
                    handler);

    /**
     * Gets a list of database insight configurations based on the query parameters specified. Either compartmentId or databaseInsightId query parameter must be specified.
     * When both compartmentId and compartmentIdInSubtree are specified, a list of database insight configurations in that compartment and in all sub-compartments will be returned.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListDatabaseConfigurationsResponse> listDatabaseConfigurations(
            ListDatabaseConfigurationsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListDatabaseConfigurationsRequest, ListDatabaseConfigurationsResponse>
                    handler);

    /**
     * Gets a list of database insights based on the query parameters specified. Either compartmentId or id query parameter must be specified.
     * When both compartmentId and compartmentIdInSubtree are specified, a list of database insights in that compartment and in all sub-compartments will be returned.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListDatabaseInsightsResponse> listDatabaseInsights(
            ListDatabaseInsightsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListDatabaseInsightsRequest, ListDatabaseInsightsResponse>
                    handler);

    /**
     * Gets a list of Operations Insights Enterprise Manager bridges. Either compartmentId or id must be specified.
     * When both compartmentId and compartmentIdInSubtree are specified, a list of bridges in that compartment and in all sub-compartments will be returned.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListEnterpriseManagerBridgesResponse> listEnterpriseManagerBridges(
            ListEnterpriseManagerBridgesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListEnterpriseManagerBridgesRequest,
                            ListEnterpriseManagerBridgesResponse>
                    handler);

    /**
     * Gets a list of exadata insight configurations. Either compartmentId or exadataInsightsId query parameter must be specified.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListExadataConfigurationsResponse> listExadataConfigurations(
            ListExadataConfigurationsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListExadataConfigurationsRequest, ListExadataConfigurationsResponse>
                    handler);

    /**
     * Gets a list of Exadata insights based on the query parameters specified. Either compartmentId or id query parameter must be specified.
     * When both compartmentId and compartmentIdInSubtree are specified, a list of Exadata insights in that compartment and in all sub-compartments will be returned.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListExadataInsightsResponse> listExadataInsights(
            ListExadataInsightsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListExadataInsightsRequest, ListExadataInsightsResponse>
                    handler);

    /**
     * Gets a list of host insight configurations based on the query parameters specified. Either compartmentId or hostInsightId query parameter must be specified.
     * When both compartmentId and compartmentIdInSubtree are specified, a list of host insight configurations in that compartment and in all sub-compartments will be returned.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListHostConfigurationsResponse> listHostConfigurations(
            ListHostConfigurationsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListHostConfigurationsRequest, ListHostConfigurationsResponse>
                    handler);

    /**
     * Gets a list of host insights based on the query parameters specified. Either compartmentId or id query parameter must be specified.
     * When both compartmentId and compartmentIdInSubtree are specified, a list of host insights in that compartment and in all sub-compartments will be returned.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListHostInsightsResponse> listHostInsights(
            ListHostInsightsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListHostInsightsRequest, ListHostInsightsResponse>
                    handler);

    /**
     * Get a list of hosted entities details.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListHostedEntitiesResponse> listHostedEntities(
            ListHostedEntitiesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListHostedEntitiesRequest, ListHostedEntitiesResponse>
                    handler);

    /**
     * Gets a list of agent entities available to add a new hostInsight.  An agent entity is \"available\"
     * and will be shown if all the following conditions are true:
     *    1.  The agent OCID is not already being used for an existing hostInsight.
     *    2.  The agent availabilityStatus = 'ACTIVE'
     *    3.  The agent lifecycleState = 'ACTIVE'
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListImportableAgentEntitiesResponse> listImportableAgentEntities(
            ListImportableAgentEntitiesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListImportableAgentEntitiesRequest, ListImportableAgentEntitiesResponse>
                    handler);

    /**
     * Gets a list of importable entities for an Operations Insights Enterprise Manager bridge that have not been imported before.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListImportableEnterpriseManagerEntitiesResponse>
            listImportableEnterpriseManagerEntities(
                    ListImportableEnterpriseManagerEntitiesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListImportableEnterpriseManagerEntitiesRequest,
                                    ListImportableEnterpriseManagerEntitiesResponse>
                            handler);

    /**
     * Gets a list of Operations Insights Warehouse users. Either compartmentId or id must be specified. All these resources are expected to be in root compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListOperationsInsightsWarehouseUsersResponse>
            listOperationsInsightsWarehouseUsers(
                    ListOperationsInsightsWarehouseUsersRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListOperationsInsightsWarehouseUsersRequest,
                                    ListOperationsInsightsWarehouseUsersResponse>
                            handler);

    /**
     * Gets a list of Operations Insights warehouses. Either compartmentId or id must be specified.
     * There is only expected to be 1 warehouse per tenant. The warehouse is expected to be in the root compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListOperationsInsightsWarehousesResponse>
            listOperationsInsightsWarehouses(
                    ListOperationsInsightsWarehousesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    ListOperationsInsightsWarehousesRequest,
                                    ListOperationsInsightsWarehousesResponse>
                            handler);

    /**
     * Query SQL Warehouse to list the plan xml for a given SQL execution plan. This returns a SqlPlanCollection object, but is currently limited to a single plan.
     * Either databaseId or id must be specified.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListSqlPlansResponse> listSqlPlans(
            ListSqlPlansRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListSqlPlansRequest, ListSqlPlansResponse>
                    handler);

    /**
     * Search SQL by SQL Identifier across databases in a compartment and in all sub-compartments if specified.
     * And get the SQL Text and the details of the databases executing the SQL for a given time period.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListSqlSearchesResponse> listSqlSearches(
            ListSqlSearchesRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListSqlSearchesRequest, ListSqlSearchesResponse>
                    handler);

    /**
     * Query SQL Warehouse to get the full SQL Text for a SQL in a compartment and in all sub-compartments if specified.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListSqlTextsResponse> listSqlTexts(
            ListSqlTextsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListSqlTextsRequest, ListSqlTextsResponse>
                    handler);

    /**
     * Return a (paginated) list of errors for a given work request.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestErrorsResponse> listWorkRequestErrors(
            ListWorkRequestErrorsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestErrorsRequest, ListWorkRequestErrorsResponse>
                    handler);

    /**
     * Return a (paginated) list of logs for a given work request.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestLogsResponse> listWorkRequestLogs(
            ListWorkRequestLogsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            ListWorkRequestLogsRequest, ListWorkRequestLogsResponse>
                    handler);

    /**
     * Lists the work requests in a compartment. Either compartmentId or id must be specified. Only one of id, resourceId or relatedResourceId can be specified optionally.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<ListWorkRequestsResponse> listWorkRequests(
            ListWorkRequestsRequest request,
            com.oracle.bmc.responses.AsyncHandler<ListWorkRequestsRequest, ListWorkRequestsResponse>
                    handler);

    /**
     * Rotate the ADW wallet for Operations Insights Warehouse using which the Hub data is exposed.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<RotateOperationsInsightsWarehouseWalletResponse>
            rotateOperationsInsightsWarehouseWallet(
                    RotateOperationsInsightsWarehouseWalletRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    RotateOperationsInsightsWarehouseWalletRequest,
                                    RotateOperationsInsightsWarehouseWalletResponse>
                            handler);

    /**
     * Gets a list of summary of AWR Sources.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeAwrSourcesSummariesResponse> summarizeAwrSourcesSummaries(
            SummarizeAwrSourcesSummariesRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            SummarizeAwrSourcesSummariesRequest,
                            SummarizeAwrSourcesSummariesResponse>
                    handler);

    /**
     * Returns response with time series data (endTimestamp, capacity, baseCapacity) for the time period specified.
     * The maximum time range for analysis is 2 years, hence this is intentionally not paginated.
     * If compartmentIdInSubtree is specified, aggregates resources in a compartment and in all sub-compartments.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeDatabaseInsightResourceCapacityTrendResponse>
            summarizeDatabaseInsightResourceCapacityTrend(
                    SummarizeDatabaseInsightResourceCapacityTrendRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeDatabaseInsightResourceCapacityTrendRequest,
                                    SummarizeDatabaseInsightResourceCapacityTrendResponse>
                            handler);

    /**
     * Get Forecast predictions for CPU and Storage resources since a time in the past.
     * If compartmentIdInSubtree is specified, aggregates resources in a compartment and in all sub-compartments.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeDatabaseInsightResourceForecastTrendResponse>
            summarizeDatabaseInsightResourceForecastTrend(
                    SummarizeDatabaseInsightResourceForecastTrendRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeDatabaseInsightResourceForecastTrendRequest,
                                    SummarizeDatabaseInsightResourceForecastTrendResponse>
                            handler);

    /**
     * Lists the Resource statistics (usage,capacity, usage change percent, utilization percent, base capacity, isAutoScalingEnabled)
     * for each database filtered by utilization level in a compartment and in all sub-compartments if specified.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeDatabaseInsightResourceStatisticsResponse>
            summarizeDatabaseInsightResourceStatistics(
                    SummarizeDatabaseInsightResourceStatisticsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeDatabaseInsightResourceStatisticsRequest,
                                    SummarizeDatabaseInsightResourceStatisticsResponse>
                            handler);

    /**
     * A cumulative distribution function is used to rank the usage data points per database within the specified time period.
     * For each database, the minimum data point with a ranking > the percentile value is included in the summation.
     * Linear regression functions are used to calculate the usage change percentage.
     * If compartmentIdInSubtree is specified, aggregates resources in a compartment and in all sub-compartments.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeDatabaseInsightResourceUsageResponse>
            summarizeDatabaseInsightResourceUsage(
                    SummarizeDatabaseInsightResourceUsageRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeDatabaseInsightResourceUsageRequest,
                                    SummarizeDatabaseInsightResourceUsageResponse>
                            handler);

    /**
     * Returns response with time series data (endTimestamp, usage, capacity) for the time period specified.
     * The maximum time range for analysis is 2 years, hence this is intentionally not paginated.
     * If compartmentIdInSubtree is specified, aggregates resources in a compartment and in all sub-compartments.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeDatabaseInsightResourceUsageTrendResponse>
            summarizeDatabaseInsightResourceUsageTrend(
                    SummarizeDatabaseInsightResourceUsageTrendRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeDatabaseInsightResourceUsageTrendRequest,
                                    SummarizeDatabaseInsightResourceUsageTrendResponse>
                            handler);

    /**
     * Gets resources with current utilization (high and low) and projected utilization (high and low) for a resource type over specified time period.
     * If compartmentIdInSubtree is specified, aggregates resources in a compartment and in all sub-compartments.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeDatabaseInsightResourceUtilizationInsightResponse>
            summarizeDatabaseInsightResourceUtilizationInsight(
                    SummarizeDatabaseInsightResourceUtilizationInsightRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeDatabaseInsightResourceUtilizationInsightRequest,
                                    SummarizeDatabaseInsightResourceUtilizationInsightResponse>
                            handler);

    /**
     * Returns response with usage time series data (endTimestamp, usage, capacity) with breakdown by tablespaceName for the time period specified.
     * The maximum time range for analysis is 2 years, hence this is intentionally not paginated.
     * Either databaseId or id must be specified.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeDatabaseInsightTablespaceUsageTrendResponse>
            summarizeDatabaseInsightTablespaceUsageTrend(
                    SummarizeDatabaseInsightTablespaceUsageTrendRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeDatabaseInsightTablespaceUsageTrendRequest,
                                    SummarizeDatabaseInsightTablespaceUsageTrendResponse>
                            handler);

    /**
     * Returns response with time series data (endTimestamp, capacity) for the time period specified for an exadata system for a resource metric.
     * Additionally resources can be filtered using databaseInsightId, hostInsightId or storageServerName query parameters.
     * Top five resources are returned if total exceeds the limit specified.
     * Valid values for ResourceType DATABASE are CPU,MEMORY,IO and STORAGE. Database name is returned in name field. DatabaseInsightId, cdbName and hostName query parameter applies to ResourceType DATABASE.
     * Valid values for ResourceType HOST are CPU and MEMORY. HostName is returned in name field. HostInsightId and hostName query parameter applies to ResourceType HOST.
     * Valid values for ResourceType STORAGE_SERVER are STORAGE, IOPS and THROUGHPUT. Storage server name is returned in name field for resourceMetric IOPS and THROUGHPUT
     * and asmName is returned in name field for resourceMetric STORAGE. StorageServerName query parameter applies to ResourceType STORAGE_SERVER.
     * Valid values for ResourceType DISKGROUP is STORAGE. Comma delimited (asmName,diskgroupName) is returned in name field.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeExadataInsightResourceCapacityTrendResponse>
            summarizeExadataInsightResourceCapacityTrend(
                    SummarizeExadataInsightResourceCapacityTrendRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeExadataInsightResourceCapacityTrendRequest,
                                    SummarizeExadataInsightResourceCapacityTrendResponse>
                            handler);

    /**
     * Returns response with time series data (endTimestamp, capacity) for the time period specified for an exadata system or fleet aggregation for a resource metric.
     * The maximum time range for analysis is 2 years, hence this is intentionally not paginated.
     * Valid values for ResourceType DATABASE are CPU,MEMORY,IO and STORAGE.
     * Valid values for ResourceType HOST are CPU and MEMORY.
     * Valid values for ResourceType STORAGE_SERVER are STORAGE, IOPS and THROUGHPUT.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeExadataInsightResourceCapacityTrendAggregatedResponse>
            summarizeExadataInsightResourceCapacityTrendAggregated(
                    SummarizeExadataInsightResourceCapacityTrendAggregatedRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeExadataInsightResourceCapacityTrendAggregatedRequest,
                                    SummarizeExadataInsightResourceCapacityTrendAggregatedResponse>
                            handler);

    /**
     * Get historical usage and forecast predictions for an exadata system with breakdown by databases, hosts or storage servers.
     * Additionally resources can be filtered using databaseInsightId, hostInsightId or storageServerName query parameters.
     * Top five resources are returned if total exceeds the limit specified.
     * Valid values for ResourceType DATABASE are CPU,MEMORY,IO and STORAGE. Database name is returned in name field. DatabaseInsightId , cdbName and hostName query parameter applies to ResourceType DATABASE.
     * Valid values for ResourceType HOST are CPU and MEMORY. HostName s returned in name field. HostInsightId and hostName query parameter applies to ResourceType HOST.
     * Valid values for ResourceType STORAGE_SERVER are STORAGE, IOPS and THROUGHPUT. Storage server name is returned in name field for resourceMetric IOPS and THROUGHPUT
     * and asmName is returned in name field for resourceMetric STORAGE. StorageServerName query parameter applies to ResourceType STORAGE_SERVER.
     * Valid value for ResourceType DISKGROUP is STORAGE. Comma delimited (asmName,diskgroupName) is returned in name field.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeExadataInsightResourceForecastTrendResponse>
            summarizeExadataInsightResourceForecastTrend(
                    SummarizeExadataInsightResourceForecastTrendRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeExadataInsightResourceForecastTrendRequest,
                                    SummarizeExadataInsightResourceForecastTrendResponse>
                            handler);

    /**
     * Get aggregated historical usage and forecast predictions for resources. Either compartmentId or exadataInsightsId query parameter must be specified.
     * Valid values for ResourceType DATABASE are CPU,MEMORY,IO and STORAGE.
     * Valid values for ResourceType HOST are CPU and MEMORY.
     * Valid values for ResourceType STORAGE_SERVER are STORAGE, IOPS and THROUGHPUT.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeExadataInsightResourceForecastTrendAggregatedResponse>
            summarizeExadataInsightResourceForecastTrendAggregated(
                    SummarizeExadataInsightResourceForecastTrendAggregatedRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeExadataInsightResourceForecastTrendAggregatedRequest,
                                    SummarizeExadataInsightResourceForecastTrendAggregatedResponse>
                            handler);

    /**
     * Lists the Resource statistics (usage, capacity, usage change percent, utilization percent) for each resource based on resourceMetric filtered by utilization level.
     * Valid values for ResourceType DATABASE are CPU,MEMORY,IO and STORAGE.
     * Valid values for ResourceType HOST are CPU and MEMORY.
     * Valid values for ResourceType STORAGE_SERVER are STORAGE, IOPS, THROUGHPUT.
     * Valid value for ResourceType DISKGROUP is STORAGE.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeExadataInsightResourceStatisticsResponse>
            summarizeExadataInsightResourceStatistics(
                    SummarizeExadataInsightResourceStatisticsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeExadataInsightResourceStatisticsRequest,
                                    SummarizeExadataInsightResourceStatisticsResponse>
                            handler);

    /**
     * A cumulative distribution function is used to rank the usage data points per resource within the specified time period.
     * For each resource, the minimum data point with a ranking > the percentile value is included in the summation.
     * Linear regression functions are used to calculate the usage change percentage.
     * Valid values for ResourceType DATABASE are CPU,MEMORY,IO and STORAGE.
     * Valid values for ResourceType HOST are CPU and MEMORY.
     * Valid values for ResourceType STORAGE_SERVER are STORAGE, IOPS and THROUGHPUT.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeExadataInsightResourceUsageResponse>
            summarizeExadataInsightResourceUsage(
                    SummarizeExadataInsightResourceUsageRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeExadataInsightResourceUsageRequest,
                                    SummarizeExadataInsightResourceUsageResponse>
                            handler);

    /**
     * A cumulative distribution function is used to rank the usage data points per database within the specified time period.
     * For each database, the minimum data point with a ranking > the percentile value is included in the summation.
     * Linear regression functions are used to calculate the usage change percentage.
     * Valid values for ResourceType DATABASE are CPU,MEMORY,IO and STORAGE.
     * Valid values for ResourceType HOST are CPU and MEMORY.
     * Valid values for ResourceType STORAGE_SERVER are STORAGE, IOPS and THROUGHPUT.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeExadataInsightResourceUsageAggregatedResponse>
            summarizeExadataInsightResourceUsageAggregated(
                    SummarizeExadataInsightResourceUsageAggregatedRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeExadataInsightResourceUsageAggregatedRequest,
                                    SummarizeExadataInsightResourceUsageAggregatedResponse>
                            handler);

    /**
     * Gets current utilization, projected utilization and days to reach projectedUtilization for an exadata system over specified time period. Valid values for ResourceType DATABASE are CPU,MEMORY,IO and STORAGE. Valid values for ResourceType HOST are CPU and MEMORY. Valid values for ResourceType STORAGE_SERVER are STORAGE, IOPS and THROUGHPUT.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeExadataInsightResourceUtilizationInsightResponse>
            summarizeExadataInsightResourceUtilizationInsight(
                    SummarizeExadataInsightResourceUtilizationInsightRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeExadataInsightResourceUtilizationInsightRequest,
                                    SummarizeExadataInsightResourceUtilizationInsightResponse>
                            handler);

    /**
     * Lists the software and hardware inventory of the Exadata System.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeExadataMembersResponse> summarizeExadataMembers(
            SummarizeExadataMembersRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            SummarizeExadataMembersRequest, SummarizeExadataMembersResponse>
                    handler);

    /**
     * Returns response with time series data (endTimestamp, capacity) for the time period specified.
     * The maximum time range for analysis is 2 years, hence this is intentionally not paginated.
     * If compartmentIdInSubtree is specified, aggregates resources in a compartment and in all sub-compartments.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeHostInsightResourceCapacityTrendResponse>
            summarizeHostInsightResourceCapacityTrend(
                    SummarizeHostInsightResourceCapacityTrendRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeHostInsightResourceCapacityTrendRequest,
                                    SummarizeHostInsightResourceCapacityTrendResponse>
                            handler);

    /**
     * Get Forecast predictions for CPU or memory resources since a time in the past.
     * If compartmentIdInSubtree is specified, aggregates resources in a compartment and in all sub-compartments.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeHostInsightResourceForecastTrendResponse>
            summarizeHostInsightResourceForecastTrend(
                    SummarizeHostInsightResourceForecastTrendRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeHostInsightResourceForecastTrendRequest,
                                    SummarizeHostInsightResourceForecastTrendResponse>
                            handler);

    /**
     * Lists the resource statistics (usage, capacity, usage change percent, utilization percent, load) for each host filtered
     * by utilization level in a compartment and in all sub-compartments if specified.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeHostInsightResourceStatisticsResponse>
            summarizeHostInsightResourceStatistics(
                    SummarizeHostInsightResourceStatisticsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeHostInsightResourceStatisticsRequest,
                                    SummarizeHostInsightResourceStatisticsResponse>
                            handler);

    /**
     * A cumulative distribution function is used to rank the usage data points per host within the specified time period.
     * For each host, the minimum data point with a ranking > the percentile value is included in the summation.
     * Linear regression functions are used to calculate the usage change percentage.
     * If compartmentIdInSubtree is specified, aggregates resources in a compartment and in all sub-compartments.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeHostInsightResourceUsageResponse>
            summarizeHostInsightResourceUsage(
                    SummarizeHostInsightResourceUsageRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeHostInsightResourceUsageRequest,
                                    SummarizeHostInsightResourceUsageResponse>
                            handler);

    /**
     * Returns response with time series data (endTimestamp, usage, capacity) for the time period specified.
     * The maximum time range for analysis is 2 years, hence this is intentionally not paginated.
     * If compartmentIdInSubtree is specified, aggregates resources in a compartment and in all sub-compartments.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeHostInsightResourceUsageTrendResponse>
            summarizeHostInsightResourceUsageTrend(
                    SummarizeHostInsightResourceUsageTrendRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeHostInsightResourceUsageTrendRequest,
                                    SummarizeHostInsightResourceUsageTrendResponse>
                            handler);

    /**
     * Gets resources with current utilization (high and low) and projected utilization (high and low) for a resource type over specified time period.
     * If compartmentIdInSubtree is specified, aggregates resources in a compartment and in all sub-compartments.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeHostInsightResourceUtilizationInsightResponse>
            summarizeHostInsightResourceUtilizationInsight(
                    SummarizeHostInsightResourceUtilizationInsightRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeHostInsightResourceUtilizationInsightRequest,
                                    SummarizeHostInsightResourceUtilizationInsightResponse>
                            handler);

    /**
     * Gets the details of resources used by an Operations Insights Warehouse.
     * There is only expected to be 1 warehouse per tenant. The warehouse is expected to be in the root compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeOperationsInsightsWarehouseResourceUsageResponse>
            summarizeOperationsInsightsWarehouseResourceUsage(
                    SummarizeOperationsInsightsWarehouseResourceUsageRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeOperationsInsightsWarehouseResourceUsageRequest,
                                    SummarizeOperationsInsightsWarehouseResourceUsageResponse>
                            handler);

    /**
     * Query SQL Warehouse to get the performance insights for SQLs taking greater than X% database time for a given
     * time period across the given databases or database types in a compartment and in all sub-compartments if specified.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeSqlInsightsResponse> summarizeSqlInsights(
            SummarizeSqlInsightsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            SummarizeSqlInsightsRequest, SummarizeSqlInsightsResponse>
                    handler);

    /**
     * Query SQL Warehouse to get the performance insights on the execution plans for a given SQL for a given time period.
     * Either databaseId or id must be specified.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeSqlPlanInsightsResponse> summarizeSqlPlanInsights(
            SummarizeSqlPlanInsightsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            SummarizeSqlPlanInsightsRequest, SummarizeSqlPlanInsightsResponse>
                    handler);

    /**
     * Query SQL Warehouse to summarize the response time distribution of query executions for a given SQL for a given time period.
     * Either databaseId or id must be specified.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeSqlResponseTimeDistributionsResponse>
            summarizeSqlResponseTimeDistributions(
                    SummarizeSqlResponseTimeDistributionsRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeSqlResponseTimeDistributionsRequest,
                                    SummarizeSqlResponseTimeDistributionsResponse>
                            handler);

    /**
     * Query SQL Warehouse to get the performance statistics for SQLs taking greater than X% database time for a given
     * time period across the given databases or database types in a compartment and in all sub-compartments if specified.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeSqlStatisticsResponse> summarizeSqlStatistics(
            SummarizeSqlStatisticsRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            SummarizeSqlStatisticsRequest, SummarizeSqlStatisticsResponse>
                    handler);

    /**
     * Query SQL Warehouse to get the performance statistics time series for a given SQL across given databases for a
     * given time period in a compartment and in all sub-compartments if specified.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeSqlStatisticsTimeSeriesResponse>
            summarizeSqlStatisticsTimeSeries(
                    SummarizeSqlStatisticsTimeSeriesRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeSqlStatisticsTimeSeriesRequest,
                                    SummarizeSqlStatisticsTimeSeriesResponse>
                            handler);

    /**
     * Query SQL Warehouse to get the performance statistics time series for a given SQL by execution plans for a given time period.
     * Either databaseId or id must be specified.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<SummarizeSqlStatisticsTimeSeriesByPlanResponse>
            summarizeSqlStatisticsTimeSeriesByPlan(
                    SummarizeSqlStatisticsTimeSeriesByPlanRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    SummarizeSqlStatisticsTimeSeriesByPlanRequest,
                                    SummarizeSqlStatisticsTimeSeriesByPlanResponse>
                            handler);

    /**
     * Updates the configuration of a hub .
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateAwrHubResponse> updateAwrHub(
            UpdateAwrHubRequest request,
            com.oracle.bmc.responses.AsyncHandler<UpdateAwrHubRequest, UpdateAwrHubResponse>
                    handler);

    /**
     * Updates configuration of a database insight.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateDatabaseInsightResponse> updateDatabaseInsight(
            UpdateDatabaseInsightRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateDatabaseInsightRequest, UpdateDatabaseInsightResponse>
                    handler);

    /**
     * Updates configuration of an Operations Insights Enterprise Manager bridge.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateEnterpriseManagerBridgeResponse>
            updateEnterpriseManagerBridge(
                    UpdateEnterpriseManagerBridgeRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateEnterpriseManagerBridgeRequest,
                                    UpdateEnterpriseManagerBridgeResponse>
                            handler);

    /**
     * Updates configuration of an Exadata insight.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateExadataInsightResponse> updateExadataInsight(
            UpdateExadataInsightRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateExadataInsightRequest, UpdateExadataInsightResponse>
                    handler);

    /**
     * Updates configuration of a host insight.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateHostInsightResponse> updateHostInsight(
            UpdateHostInsightRequest request,
            com.oracle.bmc.responses.AsyncHandler<
                            UpdateHostInsightRequest, UpdateHostInsightResponse>
                    handler);

    /**
     * Updates the configuration of an Operations Insights Warehouse.
     * There is only expected to be 1 warehouse per tenant. The warehouse is expected to be in the root compartment.
     *
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateOperationsInsightsWarehouseResponse>
            updateOperationsInsightsWarehouse(
                    UpdateOperationsInsightsWarehouseRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateOperationsInsightsWarehouseRequest,
                                    UpdateOperationsInsightsWarehouseResponse>
                            handler);

    /**
     * Updates the configuration of an Operations Insights Warehouse User.
     *
     * @param request The request object containing the details to send
     * @param handler The request handler to invoke upon completion, may be null.
     * @return A Future that can be used to get the response if no AsyncHandler was
     *         provided. Note, if you provide an AsyncHandler and use the Future, some
     *         types of responses (like java.io.InputStream) may not be able to be read in
     *         both places as the underlying stream may only be consumed once.
     */
    java.util.concurrent.Future<UpdateOperationsInsightsWarehouseUserResponse>
            updateOperationsInsightsWarehouseUser(
                    UpdateOperationsInsightsWarehouseUserRequest request,
                    com.oracle.bmc.responses.AsyncHandler<
                                    UpdateOperationsInsightsWarehouseUserRequest,
                                    UpdateOperationsInsightsWarehouseUserResponse>
                            handler);
}
