/**
 *
 * (c) 2003-2012 MuleSoft, Inc. This software is protected under international
 * copyright law. All use of this software is subject to MuleSoft's Master
 * Subscription Agreement (or other Terms of Service) separately entered
 * into between you and MuleSoft. If such an agreement is not in
 * place, you may not use the software.
 */

package org.mule.module.kindling.model.comment;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;

public enum KindlingCommentType {
	USER("user"),
	MODERATOR("moderator");
	
	static final private Log logger = LogFactory.getLog(KindlingCommentType.class);
	
	@JsonCreator
	static public KindlingCommentType getValueOf(String arg) {
		
		for (KindlingCommentType k : KindlingCommentType.values()) {
			if (k.value.equalsIgnoreCase(arg)) return k;
		}
		
		logger.warn(String.format("Value %s not found in enum", arg));
		return null;
	}
	
	private String value;
		
	private KindlingCommentType(String value) {
		this.value = value;
	}
	
	@JsonValue
	public String getValue() { return value; }
}