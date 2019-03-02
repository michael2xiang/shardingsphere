/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.shardingproxy.transport.mysql.packet.command;

import com.google.common.base.Optional;
import org.apache.shardingsphere.shardingproxy.transport.common.packet.TransportResponse;
import org.apache.shardingsphere.shardingproxy.transport.mysql.packet.MySQLPacket;

import java.sql.SQLException;

/**
 * MySQL command packet.
 *
 * @author zhangliang
 * @author wangkai
 */
public interface MySQLCommandPacket extends MySQLPacket {
    
    /**
     * Execute command.
     * 
     * @return transport response to be sent
     * @throws SQLException SQL exception
     */
    Optional<TransportResponse> execute() throws SQLException;
}