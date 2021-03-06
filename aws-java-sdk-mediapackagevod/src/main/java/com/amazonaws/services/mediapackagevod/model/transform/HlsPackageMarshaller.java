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
package com.amazonaws.services.mediapackagevod.model.transform;

import java.util.List;
import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.mediapackagevod.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * HlsPackageMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class HlsPackageMarshaller {

    private static final MarshallingInfo<StructuredPojo> ENCRYPTION_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("encryption").build();
    private static final MarshallingInfo<List> HLSMANIFESTS_BINDING = MarshallingInfo.builder(MarshallingType.LIST).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("hlsManifests").build();
    private static final MarshallingInfo<Integer> SEGMENTDURATIONSECONDS_BINDING = MarshallingInfo.builder(MarshallingType.INTEGER)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("segmentDurationSeconds").build();
    private static final MarshallingInfo<Boolean> USEAUDIORENDITIONGROUP_BINDING = MarshallingInfo.builder(MarshallingType.BOOLEAN)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("useAudioRenditionGroup").build();

    private static final HlsPackageMarshaller instance = new HlsPackageMarshaller();

    public static HlsPackageMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(HlsPackage hlsPackage, ProtocolMarshaller protocolMarshaller) {

        if (hlsPackage == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(hlsPackage.getEncryption(), ENCRYPTION_BINDING);
            protocolMarshaller.marshall(hlsPackage.getHlsManifests(), HLSMANIFESTS_BINDING);
            protocolMarshaller.marshall(hlsPackage.getSegmentDurationSeconds(), SEGMENTDURATIONSECONDS_BINDING);
            protocolMarshaller.marshall(hlsPackage.getUseAudioRenditionGroup(), USEAUDIORENDITIONGROUP_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
