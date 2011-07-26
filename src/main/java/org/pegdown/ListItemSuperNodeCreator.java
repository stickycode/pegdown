/**
 * Copyright (c) 2011 RedEngine Ltd, http://www.RedEngine.co.nz. All rights reserved.
 *
 * This program is licensed to you under the Apache License Version 2.0,
 * and you may not use this file except in compliance with the Apache License Version 2.0.
 * You may obtain a copy of the Apache License Version 2.0 at http://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the Apache License Version 2.0 is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Apache License Version 2.0 for the specific language governing permissions and limitations there under.
 */
package org.pegdown;

import org.pegdown.Parser.SuperNodeCreator;
import org.pegdown.ast.ListItemNode;
import org.pegdown.ast.Node;
import org.pegdown.ast.SuperNode;

public class ListItemSuperNodeCreator
    implements SuperNodeCreator {

  public SuperNode create(Node child) {
      return new ListItemNode(child);
  }
}