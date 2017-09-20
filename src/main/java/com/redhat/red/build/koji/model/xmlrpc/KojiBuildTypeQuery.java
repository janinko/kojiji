/**
 * Copyright (C) 2015 Red Hat, Inc. (jcasey@redhat.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.redhat.red.build.koji.model.xmlrpc;

import com.redhat.red.build.koji.model.converter.KojiBuildTypeQueryConverter;
import org.commonjava.rwx.anno.Converter;
import org.commonjava.rwx.anno.DataKey;
import org.commonjava.rwx.anno.StructPart;

import static com.redhat.red.build.koji.model.xmlrpc.KojiQuery.__STARSTAR;

@StructPart
@Converter( KojiBuildTypeQueryConverter.class )
public class KojiBuildTypeQuery extends KojiQuery
{
    private String name;

    private Integer id;

    public KojiBuildTypeQuery()
    {
    }

    public void setId( Integer id )
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    public KojiBuildTypeQuery withName( String name )
    {
        this.name = name;
        return this;
    }

    public Integer getId()
    {
        return id;
    }

    public void setId( int id )
    {
        this.id = id;
    }

    public KojiBuildTypeQuery withId( int id )
    {
        this.id = id;
        return this;
    }

    @Override
    public String toString() {
        return "KojiBuildTypeQuery{name='" + name + "', id=" + id + "}";
    }
}
