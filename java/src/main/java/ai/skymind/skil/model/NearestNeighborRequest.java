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
 * NearestNeighborRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-15T19:37:15.471+05:00")
public class NearestNeighborRequest {
  @SerializedName("k")
  private Integer k = null;

  @SerializedName("inputIndex")
  private Integer inputIndex = null;

  public NearestNeighborRequest k(Integer k) {
    this.k = k;
    return this;
  }

   /**
   * the number of results
   * @return k
  **/
  @ApiModelProperty(example = "2", value = "the number of results")
  public Integer getK() {
    return k;
  }

  public void setK(Integer k) {
    this.k = k;
  }

  public NearestNeighborRequest inputIndex(Integer inputIndex) {
    this.inputIndex = inputIndex;
    return this;
  }

   /**
   * the index of the EXISTING ndarray to run a search on
   * @return inputIndex
  **/
  @ApiModelProperty(example = "3", value = "the index of the EXISTING ndarray to run a search on")
  public Integer getInputIndex() {
    return inputIndex;
  }

  public void setInputIndex(Integer inputIndex) {
    this.inputIndex = inputIndex;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NearestNeighborRequest nearestNeighborRequest = (NearestNeighborRequest) o;
    return Objects.equals(this.k, nearestNeighborRequest.k) &&
        Objects.equals(this.inputIndex, nearestNeighborRequest.inputIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(k, inputIndex);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NearestNeighborRequest {\n");
    
    sb.append("    k: ").append(toIndentedString(k)).append("\n");
    sb.append("    inputIndex: ").append(toIndentedString(inputIndex)).append("\n");
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

