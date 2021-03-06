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
package com.amazonaws.services.sagemaker.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.sagemaker.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * DescribeProjectResult JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeProjectResultJsonUnmarshaller implements Unmarshaller<DescribeProjectResult, JsonUnmarshallerContext> {

    public DescribeProjectResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeProjectResult describeProjectResult = new DescribeProjectResult();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return describeProjectResult;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("ProjectArn", targetDepth)) {
                    context.nextToken();
                    describeProjectResult.setProjectArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProjectName", targetDepth)) {
                    context.nextToken();
                    describeProjectResult.setProjectName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProjectId", targetDepth)) {
                    context.nextToken();
                    describeProjectResult.setProjectId(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ProjectDescription", targetDepth)) {
                    context.nextToken();
                    describeProjectResult.setProjectDescription(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("ServiceCatalogProvisioningDetails", targetDepth)) {
                    context.nextToken();
                    describeProjectResult.setServiceCatalogProvisioningDetails(ServiceCatalogProvisioningDetailsJsonUnmarshaller.getInstance().unmarshall(
                            context));
                }
                if (context.testExpression("ServiceCatalogProvisionedProductDetails", targetDepth)) {
                    context.nextToken();
                    describeProjectResult.setServiceCatalogProvisionedProductDetails(ServiceCatalogProvisionedProductDetailsJsonUnmarshaller.getInstance()
                            .unmarshall(context));
                }
                if (context.testExpression("ProjectStatus", targetDepth)) {
                    context.nextToken();
                    describeProjectResult.setProjectStatus(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("CreatedBy", targetDepth)) {
                    context.nextToken();
                    describeProjectResult.setCreatedBy(UserContextJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("CreationTime", targetDepth)) {
                    context.nextToken();
                    describeProjectResult.setCreationTime(DateJsonUnmarshallerFactory.getInstance("unixTimestamp").unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return describeProjectResult;
    }

    private static DescribeProjectResultJsonUnmarshaller instance;

    public static DescribeProjectResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeProjectResultJsonUnmarshaller();
        return instance;
    }
}
