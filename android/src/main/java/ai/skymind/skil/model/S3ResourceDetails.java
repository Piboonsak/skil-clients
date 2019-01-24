/**
 * Endpoints
 * Endpoints API for different services in SKIL
 *
 * OpenAPI spec version: 1.2.0-rc1
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
public class S3ResourceDetails implements Serializable {
  
  @SerializedName("@class")
  private String _class = null;
  @SerializedName("resourceId")
  private Long resourceId = null;
  public enum TypeEnum {
     STORAGE, 
  };
  @SerializedName("type")
  private TypeEnum type = null;
  public enum SubTypeEnum {
     S3, 
  };
  @SerializedName("subType")
  private SubTypeEnum subType = null;
  @SerializedName("bucket")
  private String bucket = null;
  @SerializedName("region")
  private String region = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getClass() {
    return _class;
  }
  public void setClass(String _class) {
    this._class = _class;
  }

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
   * S3 Bucket Name
   **/
  @ApiModelProperty(value = "S3 Bucket Name")
  public String getBucket() {
    return bucket;
  }
  public void setBucket(String bucket) {
    this.bucket = bucket;
  }

  /**
   * Region name where the S3 bucket is present
   **/
  @ApiModelProperty(value = "Region name where the S3 bucket is present")
  public String getRegion() {
    return region;
  }
  public void setRegion(String region) {
    this.region = region;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    S3ResourceDetails s3ResourceDetails = (S3ResourceDetails) o;
    return (this._class == null ? s3ResourceDetails._class == null : this._class.equals(s3ResourceDetails._class)) &&
        (this.resourceId == null ? s3ResourceDetails.resourceId == null : this.resourceId.equals(s3ResourceDetails.resourceId)) &&
        (this.type == null ? s3ResourceDetails.type == null : this.type.equals(s3ResourceDetails.type)) &&
        (this.subType == null ? s3ResourceDetails.subType == null : this.subType.equals(s3ResourceDetails.subType)) &&
        (this.bucket == null ? s3ResourceDetails.bucket == null : this.bucket.equals(s3ResourceDetails.bucket)) &&
        (this.region == null ? s3ResourceDetails.region == null : this.region.equals(s3ResourceDetails.region));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this._class == null ? 0: this._class.hashCode());
    result = 31 * result + (this.resourceId == null ? 0: this.resourceId.hashCode());
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.subType == null ? 0: this.subType.hashCode());
    result = 31 * result + (this.bucket == null ? 0: this.bucket.hashCode());
    result = 31 * result + (this.region == null ? 0: this.region.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class S3ResourceDetails {\n");
    
    sb.append("  _class: ").append(_class).append("\n");
    sb.append("  resourceId: ").append(resourceId).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  subType: ").append(subType).append("\n");
    sb.append("  bucket: ").append(bucket).append("\n");
    sb.append("  region: ").append(region).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}