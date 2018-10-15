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
public class SingleImageRecord implements Serializable {
  
  @SerializedName("uri")
  private String uri = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
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
    SingleImageRecord singleImageRecord = (SingleImageRecord) o;
    return (this.uri == null ? singleImageRecord.uri == null : this.uri.equals(singleImageRecord.uri));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.uri == null ? 0: this.uri.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SingleImageRecord {\n");
    
    sb.append("  uri: ").append(uri).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
