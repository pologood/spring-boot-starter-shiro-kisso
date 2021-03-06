/*
 * Copyright (c) 2018, vindell (https://github.com/vindell).
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.apache.shiro.spring.boot.kisso.token;

import org.apache.shiro.authc.HostAuthenticationToken;

import com.baomidou.kisso.security.token.SSOToken;

/**
 * KISSO Access Token
 * @author 		： <a href="https://github.com/vindell">vindell</a>
 */
@SuppressWarnings("serial")
public class KissoAccessToken implements HostAuthenticationToken {

	// 客户端IP
	private String host;
	// SSO Token 令牌
	private SSOToken token;
	
	public KissoAccessToken(String host, SSOToken token) {
		this.host = host;
		this.token = token;
	}

	@Override
	public Object getPrincipal() {
		return this.token;
	}

	@Override
	public Object getCredentials() {
		return this.token;
	}
	
	@Override
	public String getHost() {
		return host;
	}

	public SSOToken getToken() {
		return token;
	}
	
}
