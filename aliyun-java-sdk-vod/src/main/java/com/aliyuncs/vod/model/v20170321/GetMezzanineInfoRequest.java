/*
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
 */

package com.aliyuncs.vod.model.v20170321;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class GetMezzanineInfoRequest extends RpcAcsRequest<GetMezzanineInfoResponse> {
	
	public GetMezzanineInfoRequest() {
		super("vod", "2017-03-21", "GetMezzanineInfo", "vod");
	}

	private Long resourceOwnerId;

	private String resourceOwnerAccount;

	private String videoId;

	private Boolean previewSegment;

	private String outputType;

	private String additionType;

	private Long ownerId;

	private Long authTimeout;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getVideoId() {
		return this.videoId;
	}

	public void setVideoId(String videoId) {
		this.videoId = videoId;
		if(videoId != null){
			putQueryParameter("VideoId", videoId);
		}
	}

	public Boolean getPreviewSegment() {
		return this.previewSegment;
	}

	public void setPreviewSegment(Boolean previewSegment) {
		this.previewSegment = previewSegment;
		if(previewSegment != null){
			putQueryParameter("PreviewSegment", previewSegment.toString());
		}
	}

	public String getOutputType() {
		return this.outputType;
	}

	public void setOutputType(String outputType) {
		this.outputType = outputType;
		if(outputType != null){
			putQueryParameter("OutputType", outputType);
		}
	}

	public String getAdditionType() {
		return this.additionType;
	}

	public void setAdditionType(String additionType) {
		this.additionType = additionType;
		if(additionType != null){
			putQueryParameter("AdditionType", additionType);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public Long getAuthTimeout() {
		return this.authTimeout;
	}

	public void setAuthTimeout(Long authTimeout) {
		this.authTimeout = authTimeout;
		if(authTimeout != null){
			putQueryParameter("AuthTimeout", authTimeout.toString());
		}
	}

	@Override
	public Class<GetMezzanineInfoResponse> getResponseClass() {
		return GetMezzanineInfoResponse.class;
	}

}
