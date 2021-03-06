/*
 * Copyright(c) 2016-2017 IBM, Red Hat, and others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *      http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.microprofile.showcase.bootstrap;

import javax.json.JsonObject;

/**
 * @author Heiko Braun
 * @since 15/09/16
 */
public abstract class JsonWrapper {

    protected JsonObject underlying;

    private String id;

    public JsonWrapper(final JsonObject underlying) {
        this.underlying = underlying;
    }

    JsonObject getUnderlying() {
        return underlying;
    }

    public String getId() {
        return id;
    }

    void setId(final String id) {
        this.id = id;
    }
}
