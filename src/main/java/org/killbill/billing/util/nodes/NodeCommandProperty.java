/*
 * Copyright 2010-2013 Ning, Inc.
 * Copyright 2015-2020 Groupon, Inc
 * Copyright 2015-2020 The Billing Project, LLC
 *
 * The Billing Project licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package org.killbill.billing.util.nodes;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class NodeCommandProperty {

    private String key;
    private Object value;

    // For Jackson
    public NodeCommandProperty() { }

    @JsonCreator
    public NodeCommandProperty(@JsonProperty("key") final String key,
                               @JsonProperty("value") final Object value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public Object getValue() {
        return value;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("NodeCommandProperty{");
        sb.append("key='").append(key).append('\'');
        sb.append(", value=").append(value);
        sb.append('}');
        return sb.toString();
    }
}
