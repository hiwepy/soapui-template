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
package com.smartbear.soapui.template.setting;

public class SoapuiHttpSettings {

	/**
	 * Select HTTP Version to use
	 */
	private SoapuiHttpVersion httpVersion = SoapuiHttpVersion.HTTP_VERSION_1_1;
	/**
	 * User-Agent HTTP header to send, blank will send default
	 */
	private String useragent;
	/**
	 * Request compression
	 */
	private SoapuiHttpRequestCompression requestCompression = SoapuiHttpRequestCompression.ALG_NONE;
	/**
	 * Accept compressed responses from hosts
	 */
	private boolean responseCompression = true;
	/**
	 * Disable decompression of compressed responses
	 */
	private boolean disableResponseDecompression = false;
	/**
	 * Closes the HTTP connection after each SOAP request
	 */
	private boolean closeConnections;
	/**
	 * Uses content-chunking for requests larger than threshold, blank to disable
	 */
	private int chunkingThreshold = -1;
	/**
	 * Adds authentication information to outgoing request
	 */
	private boolean authenticatePreemptively;
	/**
	 * Adds Expect-Continue header to outgoing request
	 */
	private boolean expectContinue;
	/**
	 * URI contains encoded endpoints, don't try to re-encode
	 */
	private boolean encodedUrls;
	/**
	 * Replaces duplicate forward slashes in HTTP request endpoints with a single
	 * slash
	 */
	private boolean forwardSlashes;
	/**
	 * Default local address to bind to when sending requests
	 */
	private String bindAddress;
	/**
	 * Includes the time it took to write the request in time-taken
	 */
	private boolean includeRequestInTimeTaken;
	/**
	 * Includes the time it took to read the entire response in time-taken
	 */
	private boolean includeResponseInTimeTaken;
	/**
	 * Socket timeout in milliseconds
	 */
	private int socketTimeout;
	/**
	 * Maximum size to read from response (0 = no limit)
	 */
	private int maxResponseSize = 0;
	/**
	 * Maximum number of Connections Per Host
	 */
	private int maxConnectionsPerHost = 500;
	/**
	 * Maximum number of Total Connections
	 */
	private int maxTotalConnections = 2000;
	/**
	 * Leave MockEngine running when stopping MockServices
	 */
	private boolean leaveMockengine = true;
	/**
	 * Logs wire content of all mock requests
	 */
	private boolean enableMockWireLog;
	/**
	 * Start REST MockService after creation
	 */
	private boolean startMockService = false;

	public SoapuiHttpVersion getHttpVersion() {
		return httpVersion;
	}

	public void setHttpVersion(SoapuiHttpVersion httpVersion) {
		this.httpVersion = httpVersion;
	}

	public String getUseragent() {
		return useragent;
	}

	public void setUseragent(String useragent) {
		this.useragent = useragent;
	}

	public SoapuiHttpRequestCompression getRequestCompression() {
		return requestCompression;
	}

	public void setRequestCompression(SoapuiHttpRequestCompression requestCompression) {
		this.requestCompression = requestCompression;
	}

	public boolean isResponseCompression() {
		return responseCompression;
	}

	public void setResponseCompression(boolean responseCompression) {
		this.responseCompression = responseCompression;
	}

	public boolean isDisableResponseDecompression() {
		return disableResponseDecompression;
	}

	public void setDisableResponseDecompression(boolean disableResponseDecompression) {
		this.disableResponseDecompression = disableResponseDecompression;
	}

	public boolean isCloseConnections() {
		return closeConnections;
	}

	public void setCloseConnections(boolean closeConnections) {
		this.closeConnections = closeConnections;
	}

	public int getChunkingThreshold() {
		return chunkingThreshold;
	}

	public void setChunkingThreshold(int chunkingThreshold) {
		this.chunkingThreshold = chunkingThreshold;
	}

	public boolean isAuthenticatePreemptively() {
		return authenticatePreemptively;
	}

	public void setAuthenticatePreemptively(boolean authenticatePreemptively) {
		this.authenticatePreemptively = authenticatePreemptively;
	}

	public boolean isExpectContinue() {
		return expectContinue;
	}

	public void setExpectContinue(boolean expectContinue) {
		this.expectContinue = expectContinue;
	}

	public boolean isEncodedUrls() {
		return encodedUrls;
	}

	public void setEncodedUrls(boolean encodedUrls) {
		this.encodedUrls = encodedUrls;
	}

	public boolean isForwardSlashes() {
		return forwardSlashes;
	}

	public void setForwardSlashes(boolean forwardSlashes) {
		this.forwardSlashes = forwardSlashes;
	}

	public String getBindAddress() {
		return bindAddress;
	}

	public void setBindAddress(String bindAddress) {
		this.bindAddress = bindAddress;
	}

	public boolean isIncludeRequestInTimeTaken() {
		return includeRequestInTimeTaken;
	}

	public void setIncludeRequestInTimeTaken(boolean includeRequestInTimeTaken) {
		this.includeRequestInTimeTaken = includeRequestInTimeTaken;
	}

	public boolean isIncludeResponseInTimeTaken() {
		return includeResponseInTimeTaken;
	}

	public void setIncludeResponseInTimeTaken(boolean includeResponseInTimeTaken) {
		this.includeResponseInTimeTaken = includeResponseInTimeTaken;
	}

	public int getSocketTimeout() {
		return socketTimeout;
	}

	public void setSocketTimeout(int socketTimeout) {
		this.socketTimeout = socketTimeout;
	}

	public int getMaxResponseSize() {
		return maxResponseSize;
	}

	public void setMaxResponseSize(int maxResponseSize) {
		this.maxResponseSize = maxResponseSize;
	}

	public int getMaxConnectionsPerHost() {
		return maxConnectionsPerHost;
	}

	public void setMaxConnectionsPerHost(int maxConnectionsPerHost) {
		this.maxConnectionsPerHost = maxConnectionsPerHost;
	}

	public int getMaxTotalConnections() {
		return maxTotalConnections;
	}

	public void setMaxTotalConnections(int maxTotalConnections) {
		this.maxTotalConnections = maxTotalConnections;
	}

	public boolean isLeaveMockengine() {
		return leaveMockengine;
	}

	public void setLeaveMockengine(boolean leaveMockengine) {
		this.leaveMockengine = leaveMockengine;
	}

	public boolean isEnableMockWireLog() {
		return enableMockWireLog;
	}

	public void setEnableMockWireLog(boolean enableMockWireLog) {
		this.enableMockWireLog = enableMockWireLog;
	}

	public boolean isStartMockService() {
		return startMockService;
	}

	public void setStartMockService(boolean startMockService) {
		this.startMockService = startMockService;
	}

}
