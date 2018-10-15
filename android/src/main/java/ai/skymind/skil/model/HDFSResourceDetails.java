/**
 * Endpoints
 * Endpoints API for different services in SKIL
 *
 * OpenAPI spec version: 1.2.0-beta
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
public class HDFSResourceDetails implements Serializable {
  
  @SerializedName("resourceId")
  private Long resourceId = null;
  public enum TypeEnum {
     STORAGE, 
  };
  @SerializedName("type")
  private TypeEnum type = null;
  public enum SubTypeEnum {
     HDFS, 
  };
  @SerializedName("subType")
  private SubTypeEnum subType = null;
  @SerializedName("nameNodeHost")
  private String nameNodeHost = null;
  @SerializedName("nameNodePort")
  private String nameNodePort = null;

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
   * Resource type
   **/
  @ApiModelProperty(value = "Resource type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * Resource subtype
   **/
  @ApiModelProperty(value = "Resource subtype")
  public SubTypeEnum getSubType() {
    return subType;
  }
  public void setSubType(SubTypeEnum subType) {
    this.subType = subType;
  }

  /**
   * Host of the node running the NameNode
   **/
  @ApiModelProperty(value = "Host of the node running the NameNode")
  public String getNameNodeHost() {
    return nameNodeHost;
  }
  public void setNameNodeHost(String nameNodeHost) {
    this.nameNodeHost = nameNodeHost;
  }

  /**
   * Port of the node running the NameNode
   **/
  @ApiModelProperty(value = "Port of the node running the NameNode")
  public String getNameNodePort() {
    return nameNodePort;
  }
  public void setNameNodePort(String nameNodePort) {
    this.nameNodePort = nameNodePort;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HDFSResourceDetails hDFSResourceDetails = (HDFSResourceDetails) o;
    return (this.resourceId == null ? hDFSResourceDetails.resourceId == null : this.resourceId.equals(hDFSResourceDetails.resourceId)) &&
        (this.type == null ? hDFSResourceDetails.type == null : this.type.equals(hDFSResourceDetails.type)) &&
        (this.subType == null ? hDFSResourceDetails.subType == null : this.subType.equals(hDFSResourceDetails.subType)) &&
        (this.nameNodeHost == null ? hDFSResourceDetails.nameNodeHost == null : this.nameNodeHost.equals(hDFSResourceDetails.nameNodeHost)) &&
        (this.nameNodePort == null ? hDFSResourceDetails.nameNodePort == null : this.nameNodePort.equals(hDFSResourceDetails.nameNodePort));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.resourceId == null ? 0: this.resourceId.hashCode());
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.subType == null ? 0: this.subType.hashCode());
    result = 31 * result + (this.nameNodeHost == null ? 0: this.nameNodeHost.hashCode());
    result = 31 * result + (this.nameNodePort == null ? 0: this.nameNodePort.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class HDFSResourceDetails {\n");
    
    sb.append("  resourceId: ").append(resourceId).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  subType: ").append(subType).append("\n");
    sb.append("  nameNodeHost: ").append(nameNodeHost).append("\n");
    sb.append("  nameNodePort: ").append(nameNodePort).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
