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
 * Base64NDArrayBodyKNN
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-15T19:45:50.599+05:00")
public class Base64NDArrayBodyKNN {
  @SerializedName("ndarray")
  private String ndarray = null;

  @SerializedName("k")
  private Integer k = null;

  @SerializedName("forceFillK")
  private Boolean forceFillK = null;

  public Base64NDArrayBodyKNN ndarray(String ndarray) {
    this.ndarray = ndarray;
    return this;
  }

   /**
   * the array to run the search on. Note that this must be a row vector
   * @return ndarray
  **/
  @ApiModelProperty(required = true, value = "the array to run the search on. Note that this must be a row vector")
  public String getNdarray() {
    return ndarray;
  }

  public void setNdarray(String ndarray) {
    this.ndarray = ndarray;
  }

  public Base64NDArrayBodyKNN k(Integer k) {
    this.k = k;
    return this;
  }

   /**
   * the number of results to retrieve
   * @return k
  **/
  @ApiModelProperty(example = "2", required = true, value = "the number of results to retrieve")
  public Integer getK() {
    return k;
  }

  public void setK(Integer k) {
    this.k = k;
  }

  public Base64NDArrayBodyKNN forceFillK(Boolean forceFillK) {
    this.forceFillK = forceFillK;
    return this;
  }

   /**
   * If &#39;True&#39; it will brute force search for running search relative to a target but forced to fill the result list until the desired k is matched.
   * @return forceFillK
  **/
  @ApiModelProperty(example = "false", value = "If 'True' it will brute force search for running search relative to a target but forced to fill the result list until the desired k is matched.")
  public Boolean isForceFillK() {
    return forceFillK;
  }

  public void setForceFillK(Boolean forceFillK) {
    this.forceFillK = forceFillK;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Base64NDArrayBodyKNN base64NDArrayBodyKNN = (Base64NDArrayBodyKNN) o;
    return Objects.equals(this.ndarray, base64NDArrayBodyKNN.ndarray) &&
        Objects.equals(this.k, base64NDArrayBodyKNN.k) &&
        Objects.equals(this.forceFillK, base64NDArrayBodyKNN.forceFillK);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ndarray, k, forceFillK);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Base64NDArrayBodyKNN {\n");
    
    sb.append("    ndarray: ").append(toIndentedString(ndarray)).append("\n");
    sb.append("    k: ").append(toIndentedString(k)).append("\n");
    sb.append("    forceFillK: ").append(toIndentedString(forceFillK)).append("\n");
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

