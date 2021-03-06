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
package com.amazonaws.services.lightsail.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.lightsail.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * CacheSettings JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CacheSettingsJsonUnmarshaller implements Unmarshaller<CacheSettings, JsonUnmarshallerContext> {

    public CacheSettings unmarshall(JsonUnmarshallerContext context) throws Exception {
        CacheSettings cacheSettings = new CacheSettings();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("defaultTTL", targetDepth)) {
                    context.nextToken();
                    cacheSettings.setDefaultTTL(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("minimumTTL", targetDepth)) {
                    context.nextToken();
                    cacheSettings.setMinimumTTL(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("maximumTTL", targetDepth)) {
                    context.nextToken();
                    cacheSettings.setMaximumTTL(context.getUnmarshaller(Long.class).unmarshall(context));
                }
                if (context.testExpression("allowedHTTPMethods", targetDepth)) {
                    context.nextToken();
                    cacheSettings.setAllowedHTTPMethods(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("cachedHTTPMethods", targetDepth)) {
                    context.nextToken();
                    cacheSettings.setCachedHTTPMethods(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("forwardedCookies", targetDepth)) {
                    context.nextToken();
                    cacheSettings.setForwardedCookies(CookieObjectJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("forwardedHeaders", targetDepth)) {
                    context.nextToken();
                    cacheSettings.setForwardedHeaders(HeaderObjectJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("forwardedQueryStrings", targetDepth)) {
                    context.nextToken();
                    cacheSettings.setForwardedQueryStrings(QueryStringObjectJsonUnmarshaller.getInstance().unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return cacheSettings;
    }

    private static CacheSettingsJsonUnmarshaller instance;

    public static CacheSettingsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CacheSettingsJsonUnmarshaller();
        return instance;
    }
}
