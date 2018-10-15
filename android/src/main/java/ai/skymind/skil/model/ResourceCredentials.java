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
public class ResourceCredentials implements Serializable {
  
  @SerializedName("credentialId")
  private Long credentialId = null;
  public enum TypeEnum {
     AWS,  Azure,  GoogleCloud,  Hadoop, 
  };
  @SerializedName("type")
  private TypeEnum type = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("uri")
  private String uri = null;

  /**
   * ID of the credentials
   **/
  @ApiModelProperty(value = "ID of the credentials")
  public Long getCredentialId() {
    return credentialId;
  }
  public void setCredentialId(Long credentialId) {
    this.credentialId = credentialId;
  }

  /**
   * Type of the credentials
   **/
  @ApiModelProperty(value = "Type of the credentials")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * Name of the credentials
   **/
  @ApiModelProperty(value = "Name of the credentials")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * URI of the credentials
   **/
  @ApiModelProperty(value = "URI of the credentials")
  public String getUri() {
    return uri;
  }
  public void setUri(String uri) {
    this.uri = uri;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceCredentials resourceCredentials = (ResourceCredentials) o;
    return (this.credentialId == null ? resourceCredentials.credentialId == null : this.credentialId.equals(resourceCredentials.credentialId)) &&
        (this.type == null ? resourceCredentials.type == null : this.type.equals(resourceCredentials.type)) &&
        (this.name == null ? resourceCredentials.name == null : this.name.equals(resourceCredentials.name)) &&
        (this.uri == null ? resourceCredentials.uri == null : this.uri.equals(resourceCredentials.uri));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.credentialId == null ? 0: this.credentialId.hashCode());
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.uri == null ? 0: this.uri.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceCredentials {\n");
    
    sb.append("  credentialId: ").append(credentialId).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  uri: ").append(uri).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
