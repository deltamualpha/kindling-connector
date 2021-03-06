/**
 * (c) 2003-2015 MuleSoft, Inc. The software in this package is published under
 * the terms of the CPAL v1.0 license, a copy of which has been included with this
 * distribution in the LICENSE.md file.
 */

package org.mule.module.kindling.client.authentication;

import com.sun.jersey.api.client.Client;

public interface KindlingAuthentication {
	
	Client generateClientAndAuthenticate();
	String getUsername();
	String getToken();
}
