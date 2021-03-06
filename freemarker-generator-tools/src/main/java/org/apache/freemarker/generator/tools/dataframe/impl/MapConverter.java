/*
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
package org.apache.freemarker.generator.tools.dataframe.impl;

import de.unknownreality.dataframe.DataFrame;
import org.apache.freemarker.generator.base.table.Table;

import java.util.Collection;
import java.util.Map;

public class MapConverter {

    /**
     * Create a data frame from a list of maps. It is assumed
     * that the map represent tabular data.
     *
     * @param maps list of map to build the data frame
     * @return <code>DataFrame</code>
     */
    public static DataFrame toDataFrame(Collection<Map<String, Object>> maps) {
        final Table table = Table.fromMaps(maps);
        return ConverterUtils.toDataFrame(table);
    }
}
