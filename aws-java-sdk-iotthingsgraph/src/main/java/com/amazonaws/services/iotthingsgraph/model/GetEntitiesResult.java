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
package com.amazonaws.services.iotthingsgraph.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotthingsgraph-2018-09-06/GetEntities" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetEntitiesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of descriptions for the specified entities.
     * </p>
     */
    private java.util.List<EntityDescription> descriptions;

    /**
     * <p>
     * An array of descriptions for the specified entities.
     * </p>
     * 
     * @return An array of descriptions for the specified entities.
     */

    public java.util.List<EntityDescription> getDescriptions() {
        return descriptions;
    }

    /**
     * <p>
     * An array of descriptions for the specified entities.
     * </p>
     * 
     * @param descriptions
     *        An array of descriptions for the specified entities.
     */

    public void setDescriptions(java.util.Collection<EntityDescription> descriptions) {
        if (descriptions == null) {
            this.descriptions = null;
            return;
        }

        this.descriptions = new java.util.ArrayList<EntityDescription>(descriptions);
    }

    /**
     * <p>
     * An array of descriptions for the specified entities.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDescriptions(java.util.Collection)} or {@link #withDescriptions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param descriptions
     *        An array of descriptions for the specified entities.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEntitiesResult withDescriptions(EntityDescription... descriptions) {
        if (this.descriptions == null) {
            setDescriptions(new java.util.ArrayList<EntityDescription>(descriptions.length));
        }
        for (EntityDescription ele : descriptions) {
            this.descriptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of descriptions for the specified entities.
     * </p>
     * 
     * @param descriptions
     *        An array of descriptions for the specified entities.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEntitiesResult withDescriptions(java.util.Collection<EntityDescription> descriptions) {
        setDescriptions(descriptions);
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
        if (getDescriptions() != null)
            sb.append("Descriptions: ").append(getDescriptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetEntitiesResult == false)
            return false;
        GetEntitiesResult other = (GetEntitiesResult) obj;
        if (other.getDescriptions() == null ^ this.getDescriptions() == null)
            return false;
        if (other.getDescriptions() != null && other.getDescriptions().equals(this.getDescriptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescriptions() == null) ? 0 : getDescriptions().hashCode());
        return hashCode;
    }

    @Override
    public GetEntitiesResult clone() {
        try {
            return (GetEntitiesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
