/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.devopsguru.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Used to filter for insights that have any status.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devops-guru-2020-12-01/ListInsightsAnyStatusFilter"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListInsightsAnyStatusFilter implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Use to filter for either <code>REACTIVE</code> or <code>PROACTIVE</code> insights.
     * </p>
     */
    private String type;
    /**
     * <p>
     * A time range used to specify when the behavior of the filtered insights started.
     * </p>
     */
    private StartTimeRange startTimeRange;

    /**
     * <p>
     * Use to filter for either <code>REACTIVE</code> or <code>PROACTIVE</code> insights.
     * </p>
     * 
     * @param type
     *        Use to filter for either <code>REACTIVE</code> or <code>PROACTIVE</code> insights.
     * @see InsightType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Use to filter for either <code>REACTIVE</code> or <code>PROACTIVE</code> insights.
     * </p>
     * 
     * @return Use to filter for either <code>REACTIVE</code> or <code>PROACTIVE</code> insights.
     * @see InsightType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Use to filter for either <code>REACTIVE</code> or <code>PROACTIVE</code> insights.
     * </p>
     * 
     * @param type
     *        Use to filter for either <code>REACTIVE</code> or <code>PROACTIVE</code> insights.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InsightType
     */

    public ListInsightsAnyStatusFilter withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Use to filter for either <code>REACTIVE</code> or <code>PROACTIVE</code> insights.
     * </p>
     * 
     * @param type
     *        Use to filter for either <code>REACTIVE</code> or <code>PROACTIVE</code> insights.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InsightType
     */

    public ListInsightsAnyStatusFilter withType(InsightType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * A time range used to specify when the behavior of the filtered insights started.
     * </p>
     * 
     * @param startTimeRange
     *        A time range used to specify when the behavior of the filtered insights started.
     */

    public void setStartTimeRange(StartTimeRange startTimeRange) {
        this.startTimeRange = startTimeRange;
    }

    /**
     * <p>
     * A time range used to specify when the behavior of the filtered insights started.
     * </p>
     * 
     * @return A time range used to specify when the behavior of the filtered insights started.
     */

    public StartTimeRange getStartTimeRange() {
        return this.startTimeRange;
    }

    /**
     * <p>
     * A time range used to specify when the behavior of the filtered insights started.
     * </p>
     * 
     * @param startTimeRange
     *        A time range used to specify when the behavior of the filtered insights started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInsightsAnyStatusFilter withStartTimeRange(StartTimeRange startTimeRange) {
        setStartTimeRange(startTimeRange);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getStartTimeRange() != null)
            sb.append("StartTimeRange: ").append(getStartTimeRange());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListInsightsAnyStatusFilter == false)
            return false;
        ListInsightsAnyStatusFilter other = (ListInsightsAnyStatusFilter) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getStartTimeRange() == null ^ this.getStartTimeRange() == null)
            return false;
        if (other.getStartTimeRange() != null && other.getStartTimeRange().equals(this.getStartTimeRange()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getStartTimeRange() == null) ? 0 : getStartTimeRange().hashCode());
        return hashCode;
    }

    @Override
    public ListInsightsAnyStatusFilter clone() {
        try {
            return (ListInsightsAnyStatusFilter) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devopsguru.model.transform.ListInsightsAnyStatusFilterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
