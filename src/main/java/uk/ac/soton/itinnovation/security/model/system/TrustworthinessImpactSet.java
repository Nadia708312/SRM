/////////////////////////////////////////////////////////////////////////
//
// © University of Southampton IT Innovation Centre, 2017
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
//      Created By :            Stefanie Cox
//      Created Date :          2017-12-27
//      Created for Project :   SHiELD
//
/////////////////////////////////////////////////////////////////////////
package uk.ac.soton.itinnovation.security.model.system;

import uk.ac.soton.itinnovation.security.model.Level;
import uk.ac.soton.itinnovation.security.model.SemanticEntity;

public class TrustworthinessImpactSet extends SemanticEntity {

	private MisbehaviourSet misbehaviourSet;

	private TrustworthinessAttributeSet trustworthinessAttributeSet;

	private Level impactLevel;

	public TrustworthinessImpactSet() {}

	public MisbehaviourSet getMisbehaviourSet() {
		return misbehaviourSet;
	}

	public void setMisbehaviourSet(MisbehaviourSet misbehaviourSet) {
		this.misbehaviourSet = misbehaviourSet;
	}

	public TrustworthinessAttributeSet getTrustworthinessAttributeSet() {
		return trustworthinessAttributeSet;
	}

	public void setTrustworthinessAttributeSet(TrustworthinessAttributeSet trustworthinessAttributeSet) {
		this.trustworthinessAttributeSet = trustworthinessAttributeSet;
	}

	public Level getImpactLevel() {
		return impactLevel;
	}

	public void setImpactLevel(Level impactLevel) {
		this.impactLevel = impactLevel;
	}
}
