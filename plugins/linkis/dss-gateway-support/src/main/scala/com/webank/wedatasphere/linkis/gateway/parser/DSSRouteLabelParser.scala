/*
 * Copyright 2019 WeBank
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.apache.linkis.gateway.parser

import java.util

import org.apache.linkis.gateway.http.GatewayContext
import org.apache.linkis.gateway.ujes.route.label.RouteLabelParser
import org.apache.linkis.manager.label.builder.factory.LabelBuilderFactoryContext
import org.apache.linkis.manager.label.entity.Label
import org.apache.linkis.manager.label.entity.route.RouteLabel
import org.apache.linkis.protocol.constants.TaskConstant
import org.apache.linkis.server.BDPJettyServerHelper
import org.springframework.stereotype.Component

import scala.collection.JavaConversions._


@Component
class DSSRouteLabelParser  extends RouteLabelParser{
  override def parse(gatewayContext: GatewayContext): util.List[RouteLabel] = {
    new util.ArrayList[RouteLabel]()
  }
}
