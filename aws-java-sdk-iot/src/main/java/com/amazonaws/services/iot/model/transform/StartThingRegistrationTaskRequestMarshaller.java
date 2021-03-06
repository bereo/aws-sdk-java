/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.iot.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.iot.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * StartThingRegistrationTaskRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class StartThingRegistrationTaskRequestMarshaller {

    private static final MarshallingInfo<String> TEMPLATEBODY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("templateBody").build();
    private static final MarshallingInfo<String> INPUTFILEBUCKET_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("inputFileBucket").build();
    private static final MarshallingInfo<String> INPUTFILEKEY_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("inputFileKey").build();
    private static final MarshallingInfo<String> ROLEARN_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("roleArn").build();

    private static final StartThingRegistrationTaskRequestMarshaller instance = new StartThingRegistrationTaskRequestMarshaller();

    public static StartThingRegistrationTaskRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(StartThingRegistrationTaskRequest startThingRegistrationTaskRequest, ProtocolMarshaller protocolMarshaller) {

        if (startThingRegistrationTaskRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(startThingRegistrationTaskRequest.getTemplateBody(), TEMPLATEBODY_BINDING);
            protocolMarshaller.marshall(startThingRegistrationTaskRequest.getInputFileBucket(), INPUTFILEBUCKET_BINDING);
            protocolMarshaller.marshall(startThingRegistrationTaskRequest.getInputFileKey(), INPUTFILEKEY_BINDING);
            protocolMarshaller.marshall(startThingRegistrationTaskRequest.getRoleArn(), ROLEARN_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
