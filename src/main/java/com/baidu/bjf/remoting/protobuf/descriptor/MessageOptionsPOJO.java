/*
 * Copyright (c) Baidu Inc. All rights reserved.
 * 
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.baidu.bjf.remoting.protobuf.descriptor;

import java.util.List;

import com.baidu.bjf.remoting.protobuf.FieldType;
import com.baidu.bjf.remoting.protobuf.annotation.Protobuf;
import com.google.protobuf.DescriptorProtos.MessageOptions;

/**
 * JProtobuf supports for {@link MessageOptions}.
 *
 * @author xiemalin
 * @since 2.0.1
 */
public class MessageOptionsPOJO {

    /** The message set wire format. */
    @Protobuf(order = MessageOptions.MESSAGE_SET_WIRE_FORMAT_FIELD_NUMBER)
    public Boolean messageSetWireFormat;
    
    /** The no standard descriptor accessor. */
    @Protobuf(order = MessageOptions.NO_STANDARD_DESCRIPTOR_ACCESSOR_FIELD_NUMBER)
    public Boolean noStandardDescriptorAccessor;
    
    /** The deprecated. */
    @Protobuf(order = MessageOptions.DEPRECATED_FIELD_NUMBER)
    public Boolean deprecated;
    
    /** The map entry. */
    @Protobuf(order = MessageOptions.MAP_ENTRY_FIELD_NUMBER)
    public Boolean mapEntry;
    
    /** The uninterpreted options. */
    @Protobuf(order = MessageOptions.UNINTERPRETED_OPTION_FIELD_NUMBER, fieldType = FieldType.OBJECT)
    public List<UninterpretedOptionPOJO> uninterpretedOptions;

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "MessageOptionsPOJO [messageSetWireFormat=" + messageSetWireFormat + ", noStandardDescriptorAccessor="
                + noStandardDescriptorAccessor + ", deprecated=" + deprecated + ", mapEntry=" + mapEntry
                + ", uninterpretedOptions=" + uninterpretedOptions + "]";
    }
    
    
}
