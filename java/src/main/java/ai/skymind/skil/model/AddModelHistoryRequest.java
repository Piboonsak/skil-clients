/*
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

/**
 * AddModelHistoryRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-15T19:45:50.599+05:00")
public class AddModelHistoryRequest {
  @SerializedName("modelName")
  private String modelName = null;

  @SerializedName("modelLabels")
  private String modelLabels = null;

  public AddModelHistoryRequest modelName(String modelName) {
    this.modelName = modelName;
    return this;
  }

   /**
   * Name of the model history / workspace
   * @return modelName
  **/
  @ApiModelProperty(value = "Name of the model history / workspace")
  public String getModelName() {
    return modelName;
  }

  public void setModelName(String modelName) {
    this.modelName = modelName;
  }

  public AddModelHistoryRequest modelLabels(String modelLabels) {
    this.modelLabels = modelLabels;
    return this;
  }

   /**
   * Model history / workspace labels
   * @return modelLabels
  **/
  @ApiModelProperty(value = "Model history / workspace labels")
  public String getModelLabels() {
    return modelLabels;
  }

  public void setModelLabels(String modelLabels) {
    this.modelLabels = modelLabels;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddModelHistoryRequest addModelHistoryRequest = (AddModelHistoryRequest) o;
    return Objects.equals(this.modelName, addModelHistoryRequest.modelName) &&
        Objects.equals(this.modelLabels, addModelHistoryRequest.modelLabels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modelName, modelLabels);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddModelHistoryRequest {\n");
    
    sb.append("    modelName: ").append(toIndentedString(modelName)).append("\n");
    sb.append("    modelLabels: ").append(toIndentedString(modelLabels)).append("\n");
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

