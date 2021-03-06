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
package com.amazonaws.services.mediaconvert.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mediaconvert.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * NoiseReducerTemporalFilterSettingsMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class NoiseReducerTemporalFilterSettingsMarshaller {

    private static final MarshallingInfo<Integer> AGGRESSIVEMODE_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("aggressiveMode").build();
    private static final MarshallingInfo<String> POSTTEMPORALSHARPENING_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("postTemporalSharpening").build();
    private static final MarshallingInfo<Integer> SPEED_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("speed").build();
    private static final MarshallingInfo<Integer> STRENGTH_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("strength").build();

    private static final NoiseReducerTemporalFilterSettingsMarshaller instance = new NoiseReducerTemporalFilterSettingsMarshaller();

    public static NoiseReducerTemporalFilterSettingsMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(NoiseReducerTemporalFilterSettings noiseReducerTemporalFilterSettings, ProtocolMarshaller protocolMarshaller) {

        if (noiseReducerTemporalFilterSettings == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(noiseReducerTemporalFilterSettings.getAggressiveMode(), AGGRESSIVEMODE_BINDING);
            protocolMarshaller.marshall(noiseReducerTemporalFilterSettings.getPostTemporalSharpening(), POSTTEMPORALSHARPENING_BINDING);
            protocolMarshaller.marshall(noiseReducerTemporalFilterSettings.getSpeed(), SPEED_BINDING);
            protocolMarshaller.marshall(noiseReducerTemporalFilterSettings.getStrength(), STRENGTH_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
