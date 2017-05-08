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

import java.util.List;
import org.eurekaclinical.common.comm.Group;

/**
 *
 * @author Andrew Post
 */
public class I2b2IntegrationGroup extends Group {
    private List<Long> i2b2Roles;
    private List<Long> i2b2Projects;

    public List<Long> getI2b2Roles() {
        return i2b2Roles;
    }

    public void setI2b2Roles(List<Long> i2b2Roles) {
        this.i2b2Roles = i2b2Roles;
    }

    public List<Long> getI2b2Projects() {
        return i2b2Projects;
    }

    public void setI2b2Projects(List<Long> i2b2Projects) {
        this.i2b2Projects = i2b2Projects;
    }
    
}
