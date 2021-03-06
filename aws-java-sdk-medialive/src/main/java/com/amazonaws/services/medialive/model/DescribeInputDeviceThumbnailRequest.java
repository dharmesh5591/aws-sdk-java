/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Placeholder documentation for DescribeInputDeviceThumbnailRequest
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/DescribeInputDeviceThumbnail"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeInputDeviceThumbnailRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The unique ID of this input device. For example, hd-123456789abcdef. */
    private String inputDeviceId;
    /** The HTTP Accept header. Indicates the requested type for the thumbnail. */
    private String accept;

    /**
     * The unique ID of this input device. For example, hd-123456789abcdef.
     * 
     * @param inputDeviceId
     *        The unique ID of this input device. For example, hd-123456789abcdef.
     */

    public void setInputDeviceId(String inputDeviceId) {
        this.inputDeviceId = inputDeviceId;
    }

    /**
     * The unique ID of this input device. For example, hd-123456789abcdef.
     * 
     * @return The unique ID of this input device. For example, hd-123456789abcdef.
     */

    public String getInputDeviceId() {
        return this.inputDeviceId;
    }

    /**
     * The unique ID of this input device. For example, hd-123456789abcdef.
     * 
     * @param inputDeviceId
     *        The unique ID of this input device. For example, hd-123456789abcdef.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeInputDeviceThumbnailRequest withInputDeviceId(String inputDeviceId) {
        setInputDeviceId(inputDeviceId);
        return this;
    }

    /**
     * The HTTP Accept header. Indicates the requested type for the thumbnail.
     * 
     * @param accept
     *        The HTTP Accept header. Indicates the requested type for the thumbnail.
     * @see AcceptHeader
     */

    public void setAccept(String accept) {
        this.accept = accept;
    }

    /**
     * The HTTP Accept header. Indicates the requested type for the thumbnail.
     * 
     * @return The HTTP Accept header. Indicates the requested type for the thumbnail.
     * @see AcceptHeader
     */

    public String getAccept() {
        return this.accept;
    }

    /**
     * The HTTP Accept header. Indicates the requested type for the thumbnail.
     * 
     * @param accept
     *        The HTTP Accept header. Indicates the requested type for the thumbnail.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AcceptHeader
     */

    public DescribeInputDeviceThumbnailRequest withAccept(String accept) {
        setAccept(accept);
        return this;
    }

    /**
     * The HTTP Accept header. Indicates the requested type for the thumbnail.
     * 
     * @param accept
     *        The HTTP Accept header. Indicates the requested type for the thumbnail.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AcceptHeader
     */

    public DescribeInputDeviceThumbnailRequest withAccept(AcceptHeader accept) {
        this.accept = accept.toString();
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getInputDeviceId() != null)
            sb.append("InputDeviceId: ").append(getInputDeviceId()).append(",");
        if (getAccept() != null)
            sb.append("Accept: ").append(getAccept());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeInputDeviceThumbnailRequest == false)
            return false;
        DescribeInputDeviceThumbnailRequest other = (DescribeInputDeviceThumbnailRequest) obj;
        if (other.getInputDeviceId() == null ^ this.getInputDeviceId() == null)
            return false;
        if (other.getInputDeviceId() != null && other.getInputDeviceId().equals(this.getInputDeviceId()) == false)
            return false;
        if (other.getAccept() == null ^ this.getAccept() == null)
            return false;
        if (other.getAccept() != null && other.getAccept().equals(this.getAccept()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInputDeviceId() == null) ? 0 : getInputDeviceId().hashCode());
        hashCode = prime * hashCode + ((getAccept() == null) ? 0 : getAccept().hashCode());
        return hashCode;
    }

    @Override
    public DescribeInputDeviceThumbnailRequest clone() {
        return (DescribeInputDeviceThumbnailRequest) super.clone();
    }

}
