package org.eurekaclinical.i2b2integration.client.comm;

/*-
 * #%L
 * Eureka Clinical i2b2 Integration Client
 * %%
 * Copyright (C) 2016 Emory University
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import java.util.ArrayList;
import java.util.List;
import org.eurekaclinical.common.comm.User;

/**
 * A bean class to hold information about users in the system.
 *
 * @author Andrew Post
 *
 */
public class I2b2IntegrationUser extends User {

    private List<Long> groups = new ArrayList<>();

    public I2b2IntegrationUser() {
    }

    public List<Long> getGroups() {
        return groups;
    }

    public void setGroups(List<Long> groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "I2b2IntegrationUser{groups=" + groups + ", " + super.toString() + '}';
    }

}
