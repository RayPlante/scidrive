/*******************************************************************************
 * Copyright 2013 Johns Hopkins University
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package edu.jhu.pha.vospace.node;

import edu.jhu.pha.vospace.oauth.SciDriveUser;

public class LinkNode extends DataNode {

	public LinkNode(VospaceId id, SciDriveUser username) {
		super(id, username);
	}

    /**
     * Construct a Node from the byte array
     * @param req The byte array containing the Node
     */
	public LinkNode(byte[] bytes, SciDriveUser username, VospaceId id)  {
        super(bytes, username, id);
    }

	@Override
	public NodeType getType() {
		return NodeType.LINK_NODE;
	}

	@Override
	public void makeNodeStructured(boolean isStructured) {
		throw new AssertionError("Can't change ContainerNode type to DataNode");
	}


}
