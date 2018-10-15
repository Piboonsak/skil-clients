/**
 * Endpoints
 * Endpoints API for different services in SKIL
 *
 * OpenAPI spec version: 1.1.0-beta
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package ai.skymind.skil.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@ApiModel(description = "")
public class Resource implements Serializable {
  
  @SerializedName("resourceId")
  private Long resourceId = null;
  @SerializedName("name")
  private String name = null;
  public enum TypeEnum {
     COMPUTE,  STORAGE, 
  };
  @SerializedName("type")
  private TypeEnum type = null;
  public enum SubTypeEnum {
     EMR,  S3,  GoogleStorage,  DataProc,  HDInsight,  AzureStorage,  HDFS,  YARN, 
  };
  @SerializedName("subType")
  private SubTypeEnum subType = null;
  @SerializedName("credentialId")
  private String credentialId = null;

  /**
   * ID of the resource
   **/
  @ApiModelProperty(value = "ID of the resource")
  public Long getResourceId() {
    return resourceId;
  }
  public void setResourceId(Long resourceId) {
    this.resourceId = resourceId;
  }

  /**
   * Resource nickname
   **/
  @ApiModelProperty(value = "Resource nickname")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Resource type (whether COMPUTE or STORAGE)
   **/
  @ApiModelProperty(value = "Resource type (whether COMPUTE or STORAGE)")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * Resource subtype (COMPUTE -> [EMR, DataProc, HDInsight, YARN] | STORAGE -> [S3, GoogleStorage, AzureStorage, HDFS])
   **/
  @ApiModelProperty(value = "Resource subtype (COMPUTE -> [EMR, DataProc, HDInsight, YARN] | STORAGE -> [S3, GoogleStorage, AzureStorage, HDFS])")
  public SubTypeEnum getSubType() {
    return subType;
  }
  public void setSubType(SubTypeEnum subType) {
    this.subType = subType;
  }

  /**
   * Credentials GUID
   **/
  @ApiModelProperty(value = "Credentials GUID")
  public String getCredentialId() {
    return credentialId;
  }
  public void setCredentialId(String credentialId) {
    this.credentialId = credentialId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Resource resource = (Resource) o;
    return (this.resourceId == null ? resource.resourceId == null : this.resourceId.equals(resource.resourceId)) &&
        (this.name == null ? resource.name == null : this.name.equals(resource.name)) &&
        (this.type == null ? resource.type == null : this.type.equals(resource.type)) &&
        (this.subType == null ? resource.subType == null : this.subType.equals(resource.subType)) &&
        (this.credentialId == null ? resource.credentialId == null : this.credentialId.equals(resource.credentialId));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.resourceId == null ? 0: this.resourceId.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.subType == null ? 0: this.subType.hashCode());
    result = 31 * result + (this.credentialId == null ? 0: this.credentialId.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Resource {\n");
    
    sb.append("  resourceId: ").append(resourceId).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  subType: ").append(subType).append("\n");
    sb.append("  credentialId: ").append(credentialId).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
