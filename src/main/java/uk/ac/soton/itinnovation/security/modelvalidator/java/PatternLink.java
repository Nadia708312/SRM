/////////////////////////////////////////////////////////////////////////
//
// © University of Southampton IT Innovation Centre, 2019
//
// Copyright in this software belongs to University of Southampton
// IT Innovation Centre of Gamma House, Enterprise Road,
// Chilworth Science Park, Southampton, SO16 7NS, UK.
//
// This software may not be used, sold, licensed, transferred, copied
// or reproduced in whole or in part in any manner or form or in or
// on any media by any person other than in accordance with the terms
// of the Licence Agreement supplied with the software, or otherwise
// without the prior written consent of the copyright owners.
//
// This software is distributed WITHOUT ANY WARRANTY, without even the
// implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR
// PURPOSE, except where stated in the Licence Agreement supplied with
// the software.
//
//      Created By :            Lee Mason
//      Created Date :          05/08/2019
//      Created for Project :   RESTASSURED
//
/////////////////////////////////////////////////////////////////////////
package uk.ac.soton.itinnovation.security.modelvalidator.java;

import lombok.Data;

@Data
public class PatternLink {
	private String fromNode;
	private String toNode;
	private String linkType;
	
	public PatternLink(String fromNode, String toNode, String linkType) {
		this.fromNode = fromNode;
		this.toNode = toNode;
		this.linkType = linkType;
	}
}
