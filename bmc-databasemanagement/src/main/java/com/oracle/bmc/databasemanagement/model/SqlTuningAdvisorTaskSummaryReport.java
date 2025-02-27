/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The content of the SQL Tuning Advisor summary report.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SqlTuningAdvisorTaskSummaryReport.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class SqlTuningAdvisorTaskSummaryReport {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("taskInfo")
        private SqlTuningAdvisorTaskSummaryReportTaskInfo taskInfo;

        public Builder taskInfo(SqlTuningAdvisorTaskSummaryReportTaskInfo taskInfo) {
            this.taskInfo = taskInfo;
            this.__explicitlySet__.add("taskInfo");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("statistics")
        private SqlTuningAdvisorTaskSummaryReportStatistics statistics;

        public Builder statistics(SqlTuningAdvisorTaskSummaryReportStatistics statistics) {
            this.statistics = statistics;
            this.__explicitlySet__.add("statistics");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectStatFindings")
        private java.util.List<SqlTuningAdvisorTaskSummaryReportObjectStatFindingSummary>
                objectStatFindings;

        public Builder objectStatFindings(
                java.util.List<SqlTuningAdvisorTaskSummaryReportObjectStatFindingSummary>
                        objectStatFindings) {
            this.objectStatFindings = objectStatFindings;
            this.__explicitlySet__.add("objectStatFindings");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("indexFindings")
        private java.util.List<SqlTuningAdvisorTaskSummaryReportIndexFindingSummary> indexFindings;

        public Builder indexFindings(
                java.util.List<SqlTuningAdvisorTaskSummaryReportIndexFindingSummary>
                        indexFindings) {
            this.indexFindings = indexFindings;
            this.__explicitlySet__.add("indexFindings");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlTuningAdvisorTaskSummaryReport build() {
            SqlTuningAdvisorTaskSummaryReport __instance__ =
                    new SqlTuningAdvisorTaskSummaryReport(
                            taskInfo, statistics, objectStatFindings, indexFindings);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlTuningAdvisorTaskSummaryReport o) {
            Builder copiedBuilder =
                    taskInfo(o.getTaskInfo())
                            .statistics(o.getStatistics())
                            .objectStatFindings(o.getObjectStatFindings())
                            .indexFindings(o.getIndexFindings());

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

    @com.fasterxml.jackson.annotation.JsonProperty("taskInfo")
    SqlTuningAdvisorTaskSummaryReportTaskInfo taskInfo;

    @com.fasterxml.jackson.annotation.JsonProperty("statistics")
    SqlTuningAdvisorTaskSummaryReportStatistics statistics;

    /**
     * The list of object findings related to statistics.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectStatFindings")
    java.util.List<SqlTuningAdvisorTaskSummaryReportObjectStatFindingSummary> objectStatFindings;

    /**
     * The list of object findings related to indexes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("indexFindings")
    java.util.List<SqlTuningAdvisorTaskSummaryReportIndexFindingSummary> indexFindings;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
