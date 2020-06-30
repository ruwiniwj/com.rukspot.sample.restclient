/*
 * WSO2 API Manager - Store
 * This document specifies a **RESTful API** for WSO2 **API Manager** - Store.  It is written with [swagger 2](http://swagger.io/). 
 *
 * OpenAPI spec version: v1.1
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.am.integration.clients.store.api.v1.dto;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.wso2.am.integration.clients.store.api.v1.dto.KeyManagerApplicationConfigurationDTO;

/**
 * KeyManagerInfoDTO
 */

public class KeyManagerInfoDTO {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("displayName")
  private String displayName = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("availableGrantTypes")
  private List<String> availableGrantTypes = null;

  @SerializedName("tokenEndpoint")
  private String tokenEndpoint = null;

  @SerializedName("revokeEndpoint")
  private String revokeEndpoint = null;

  @SerializedName("userInfoEndpoint")
  private String userInfoEndpoint = null;

  @SerializedName("enableTokenGeneration")
  private Boolean enableTokenGeneration = null;

  @SerializedName("enableTokenEncryption")
  private Boolean enableTokenEncryption = false;

  @SerializedName("enableTokenHashing")
  private Boolean enableTokenHashing = false;

  @SerializedName("enableOAuthAppCreation")
  private Boolean enableOAuthAppCreation = true;

  @SerializedName("enableMapOAuthConsumerApps")
  private Boolean enableMapOAuthConsumerApps = false;

  @SerializedName("applicationConfiguration")
  private List<KeyManagerApplicationConfigurationDTO> applicationConfiguration = null;

  @SerializedName("additionalProperties")
  private List<Object> additionalProperties = null;

  public KeyManagerInfoDTO id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "01234567-0123-0123-0123-012345678901", value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public KeyManagerInfoDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "WSO2 IS", required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public KeyManagerInfoDTO type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "IS", required = true, value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public KeyManagerInfoDTO displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * display name of Keymanager 
   * @return displayName
  **/
  @ApiModelProperty(example = "Keymanager1", value = "display name of Keymanager ")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public KeyManagerInfoDTO description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "This is a key manager for Developers", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public KeyManagerInfoDTO enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @ApiModelProperty(example = "true", value = "")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public KeyManagerInfoDTO availableGrantTypes(List<String> availableGrantTypes) {
    this.availableGrantTypes = availableGrantTypes;
    return this;
  }

  public KeyManagerInfoDTO addAvailableGrantTypesItem(String availableGrantTypesItem) {
    if (this.availableGrantTypes == null) {
      this.availableGrantTypes = new ArrayList<>();
    }
    this.availableGrantTypes.add(availableGrantTypesItem);
    return this;
  }

   /**
   * Get availableGrantTypes
   * @return availableGrantTypes
  **/
  @ApiModelProperty(value = "")
  public List<String> getAvailableGrantTypes() {
    return availableGrantTypes;
  }

  public void setAvailableGrantTypes(List<String> availableGrantTypes) {
    this.availableGrantTypes = availableGrantTypes;
  }

  public KeyManagerInfoDTO tokenEndpoint(String tokenEndpoint) {
    this.tokenEndpoint = tokenEndpoint;
    return this;
  }

   /**
   * Get tokenEndpoint
   * @return tokenEndpoint
  **/
  @ApiModelProperty(value = "")
  public String getTokenEndpoint() {
    return tokenEndpoint;
  }

  public void setTokenEndpoint(String tokenEndpoint) {
    this.tokenEndpoint = tokenEndpoint;
  }

  public KeyManagerInfoDTO revokeEndpoint(String revokeEndpoint) {
    this.revokeEndpoint = revokeEndpoint;
    return this;
  }

   /**
   * Get revokeEndpoint
   * @return revokeEndpoint
  **/
  @ApiModelProperty(value = "")
  public String getRevokeEndpoint() {
    return revokeEndpoint;
  }

  public void setRevokeEndpoint(String revokeEndpoint) {
    this.revokeEndpoint = revokeEndpoint;
  }

  public KeyManagerInfoDTO userInfoEndpoint(String userInfoEndpoint) {
    this.userInfoEndpoint = userInfoEndpoint;
    return this;
  }

   /**
   * Get userInfoEndpoint
   * @return userInfoEndpoint
  **/
  @ApiModelProperty(value = "")
  public String getUserInfoEndpoint() {
    return userInfoEndpoint;
  }

  public void setUserInfoEndpoint(String userInfoEndpoint) {
    this.userInfoEndpoint = userInfoEndpoint;
  }

  public KeyManagerInfoDTO enableTokenGeneration(Boolean enableTokenGeneration) {
    this.enableTokenGeneration = enableTokenGeneration;
    return this;
  }

   /**
   * Get enableTokenGeneration
   * @return enableTokenGeneration
  **/
  @ApiModelProperty(example = "true", value = "")
  public Boolean isEnableTokenGeneration() {
    return enableTokenGeneration;
  }

  public void setEnableTokenGeneration(Boolean enableTokenGeneration) {
    this.enableTokenGeneration = enableTokenGeneration;
  }

  public KeyManagerInfoDTO enableTokenEncryption(Boolean enableTokenEncryption) {
    this.enableTokenEncryption = enableTokenEncryption;
    return this;
  }

   /**
   * Get enableTokenEncryption
   * @return enableTokenEncryption
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isEnableTokenEncryption() {
    return enableTokenEncryption;
  }

  public void setEnableTokenEncryption(Boolean enableTokenEncryption) {
    this.enableTokenEncryption = enableTokenEncryption;
  }

  public KeyManagerInfoDTO enableTokenHashing(Boolean enableTokenHashing) {
    this.enableTokenHashing = enableTokenHashing;
    return this;
  }

   /**
   * Get enableTokenHashing
   * @return enableTokenHashing
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isEnableTokenHashing() {
    return enableTokenHashing;
  }

  public void setEnableTokenHashing(Boolean enableTokenHashing) {
    this.enableTokenHashing = enableTokenHashing;
  }

  public KeyManagerInfoDTO enableOAuthAppCreation(Boolean enableOAuthAppCreation) {
    this.enableOAuthAppCreation = enableOAuthAppCreation;
    return this;
  }

   /**
   * Get enableOAuthAppCreation
   * @return enableOAuthAppCreation
  **/
  @ApiModelProperty(example = "true", value = "")
  public Boolean isEnableOAuthAppCreation() {
    return enableOAuthAppCreation;
  }

  public void setEnableOAuthAppCreation(Boolean enableOAuthAppCreation) {
    this.enableOAuthAppCreation = enableOAuthAppCreation;
  }

  public KeyManagerInfoDTO enableMapOAuthConsumerApps(Boolean enableMapOAuthConsumerApps) {
    this.enableMapOAuthConsumerApps = enableMapOAuthConsumerApps;
    return this;
  }

   /**
   * Get enableMapOAuthConsumerApps
   * @return enableMapOAuthConsumerApps
  **/
  @ApiModelProperty(example = "false", value = "")
  public Boolean isEnableMapOAuthConsumerApps() {
    return enableMapOAuthConsumerApps;
  }

  public void setEnableMapOAuthConsumerApps(Boolean enableMapOAuthConsumerApps) {
    this.enableMapOAuthConsumerApps = enableMapOAuthConsumerApps;
  }

  public KeyManagerInfoDTO applicationConfiguration(List<KeyManagerApplicationConfigurationDTO> applicationConfiguration) {
    this.applicationConfiguration = applicationConfiguration;
    return this;
  }

  public KeyManagerInfoDTO addApplicationConfigurationItem(KeyManagerApplicationConfigurationDTO applicationConfigurationItem) {
    if (this.applicationConfiguration == null) {
      this.applicationConfiguration = new ArrayList<>();
    }
    this.applicationConfiguration.add(applicationConfigurationItem);
    return this;
  }

   /**
   * Get applicationConfiguration
   * @return applicationConfiguration
  **/
  @ApiModelProperty(value = "")
  public List<KeyManagerApplicationConfigurationDTO> getApplicationConfiguration() {
    return applicationConfiguration;
  }

  public void setApplicationConfiguration(List<KeyManagerApplicationConfigurationDTO> applicationConfiguration) {
    this.applicationConfiguration = applicationConfiguration;
  }

  public KeyManagerInfoDTO additionalProperties(List<Object> additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }

  public KeyManagerInfoDTO addAdditionalPropertiesItem(Object additionalPropertiesItem) {
    if (this.additionalProperties == null) {
      this.additionalProperties = new ArrayList<>();
    }
    this.additionalProperties.add(additionalPropertiesItem);
    return this;
  }

   /**
   * Get additionalProperties
   * @return additionalProperties
  **/
  @ApiModelProperty(value = "")
  public List<Object> getAdditionalProperties() {
    return additionalProperties;
  }

  public void setAdditionalProperties(List<Object> additionalProperties) {
    this.additionalProperties = additionalProperties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeyManagerInfoDTO keyManagerInfo = (KeyManagerInfoDTO) o;
    return Objects.equals(this.id, keyManagerInfo.id) &&
        Objects.equals(this.name, keyManagerInfo.name) &&
        Objects.equals(this.type, keyManagerInfo.type) &&
        Objects.equals(this.displayName, keyManagerInfo.displayName) &&
        Objects.equals(this.description, keyManagerInfo.description) &&
        Objects.equals(this.enabled, keyManagerInfo.enabled) &&
        Objects.equals(this.availableGrantTypes, keyManagerInfo.availableGrantTypes) &&
        Objects.equals(this.tokenEndpoint, keyManagerInfo.tokenEndpoint) &&
        Objects.equals(this.revokeEndpoint, keyManagerInfo.revokeEndpoint) &&
        Objects.equals(this.userInfoEndpoint, keyManagerInfo.userInfoEndpoint) &&
        Objects.equals(this.enableTokenGeneration, keyManagerInfo.enableTokenGeneration) &&
        Objects.equals(this.enableTokenEncryption, keyManagerInfo.enableTokenEncryption) &&
        Objects.equals(this.enableTokenHashing, keyManagerInfo.enableTokenHashing) &&
        Objects.equals(this.enableOAuthAppCreation, keyManagerInfo.enableOAuthAppCreation) &&
        Objects.equals(this.enableMapOAuthConsumerApps, keyManagerInfo.enableMapOAuthConsumerApps) &&
        Objects.equals(this.applicationConfiguration, keyManagerInfo.applicationConfiguration) &&
        Objects.equals(this.additionalProperties, keyManagerInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, type, displayName, description, enabled, availableGrantTypes, tokenEndpoint, revokeEndpoint, userInfoEndpoint, enableTokenGeneration, enableTokenEncryption, enableTokenHashing, enableOAuthAppCreation, enableMapOAuthConsumerApps, applicationConfiguration, additionalProperties);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyManagerInfoDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    availableGrantTypes: ").append(toIndentedString(availableGrantTypes)).append("\n");
    sb.append("    tokenEndpoint: ").append(toIndentedString(tokenEndpoint)).append("\n");
    sb.append("    revokeEndpoint: ").append(toIndentedString(revokeEndpoint)).append("\n");
    sb.append("    userInfoEndpoint: ").append(toIndentedString(userInfoEndpoint)).append("\n");
    sb.append("    enableTokenGeneration: ").append(toIndentedString(enableTokenGeneration)).append("\n");
    sb.append("    enableTokenEncryption: ").append(toIndentedString(enableTokenEncryption)).append("\n");
    sb.append("    enableTokenHashing: ").append(toIndentedString(enableTokenHashing)).append("\n");
    sb.append("    enableOAuthAppCreation: ").append(toIndentedString(enableOAuthAppCreation)).append("\n");
    sb.append("    enableMapOAuthConsumerApps: ").append(toIndentedString(enableMapOAuthConsumerApps)).append("\n");
    sb.append("    applicationConfiguration: ").append(toIndentedString(applicationConfiguration)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
