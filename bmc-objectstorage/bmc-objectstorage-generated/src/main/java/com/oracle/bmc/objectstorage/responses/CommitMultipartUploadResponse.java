/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.responses;

import com.oracle.bmc.objectstorage.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Builder(builderClassName = "Builder")
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class CommitMultipartUploadResponse extends com.oracle.bmc.responses.BmcResponse {
    /**
     * Echoes back the value passed in the opc-client-request-id header, for use by clients when debugging.
     */
    private String opcClientRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular
     * request, provide this request ID.
     *
     */
    private String opcRequestId;

    /**
     * Base-64 representation of the multipart object hash.
     * The multipart object hash is calculated by taking the MD5 hashes of the parts passed to this call,
     * concatenating the binary representation of those hashes in order of their part numbers,
     * and then calculating the MD5 hash of the concatenated values. The multipart object hash is followed
     * by a hyphen and the total number of parts (for example, '-6').
     *
     */
    private String opcMultipartMd5;

    /**
     * The entity tag (ETag) for the object.
     */
    private String eTag;

    /**
     * The time the object was last modified, as described in [RFC 2616](https://tools.ietf.org/html/rfc2616#section-14.29).
     */
    private java.util.Date lastModified;

    /**
     * VersionId of the newly created object
     */
    private String versionId;

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "opcClientRequestId",
        "opcRequestId",
        "opcMultipartMd5",
        "eTag",
        "lastModified",
        "versionId"
    })
    private CommitMultipartUploadResponse(
            int __httpStatusCode__,
            String opcClientRequestId,
            String opcRequestId,
            String opcMultipartMd5,
            String eTag,
            java.util.Date lastModified,
            String versionId) {
        super(__httpStatusCode__);
        this.opcClientRequestId = opcClientRequestId;
        this.opcRequestId = opcRequestId;
        this.opcMultipartMd5 = opcMultipartMd5;
        this.eTag = eTag;
        this.lastModified = lastModified;
        this.versionId = versionId;
    }

    public static class Builder {
        private int __httpStatusCode__;

        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(CommitMultipartUploadResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            opcClientRequestId(o.getOpcClientRequestId());
            opcRequestId(o.getOpcRequestId());
            opcMultipartMd5(o.getOpcMultipartMd5());
            eTag(o.getETag());
            lastModified(o.getLastModified());
            versionId(o.getVersionId());

            return this;
        }

        public CommitMultipartUploadResponse build() {
            return new CommitMultipartUploadResponse(
                    __httpStatusCode__,
                    opcClientRequestId,
                    opcRequestId,
                    opcMultipartMd5,
                    eTag,
                    lastModified,
                    versionId);
        }
    }
}
