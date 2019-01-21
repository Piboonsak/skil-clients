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
public class AddModelHistoryRequest implements Serializable {
  
  @SerializedName("modelName")
  private String modelName = null;
  @SerializedName("modelLabels")
  private String modelLabels = null;

  /**
   * Name of the model history / workspace
   **/
  @ApiModelProperty(value = "Name of the model history / workspace")
  public String getModelName() {
    return modelName;
  }
  public void setModelName(String modelName) {
    this.modelName = modelName;
  }

  /**
   * Model history / workspace labels
   **/
  @ApiModelProperty(value = "Model history / workspace labels")
  public String getModelLabels() {
    return modelLabels;
  }
  public void setModelLabels(String modelLabels) {
    this.modelLabels = modelLabels;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddModelHistoryRequest addModelHistoryRequest = (AddModelHistoryRequest) o;
    return (this.modelName == null ? addModelHistoryRequest.modelName == null : this.modelName.equals(addModelHistoryRequest.modelName)) &&
        (this.modelLabels == null ? addModelHistoryRequest.modelLabels == null : this.modelLabels.equals(addModelHistoryRequest.modelLabels));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.modelName == null ? 0: this.modelName.hashCode());
    result = 31 * result + (this.modelLabels == null ? 0: this.modelLabels.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddModelHistoryRequest {\n");
    
    sb.append("  modelName: ").append(modelName).append("\n");
    sb.append("  modelLabels: ").append(modelLabels).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
