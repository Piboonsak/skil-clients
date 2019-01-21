/*
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
 * AccumulatedResults
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-21T16:19:29.200+05:00")
public class AccumulatedResults {
  @SerializedName("accumulatedDataWithLabels")
  private Integer accumulatedDataWithLabels = null;

  @SerializedName("accumulatedDataWithOutLabels")
  private Integer accumulatedDataWithOutLabels = null;

  public AccumulatedResults accumulatedDataWithLabels(Integer accumulatedDataWithLabels) {
    this.accumulatedDataWithLabels = accumulatedDataWithLabels;
    return this;
  }

   /**
   * Get accumulatedDataWithLabels
   * @return accumulatedDataWithLabels
  **/
  @ApiModelProperty(value = "")
  public Integer getAccumulatedDataWithLabels() {
    return accumulatedDataWithLabels;
  }

  public void setAccumulatedDataWithLabels(Integer accumulatedDataWithLabels) {
    this.accumulatedDataWithLabels = accumulatedDataWithLabels;
  }

  public AccumulatedResults accumulatedDataWithOutLabels(Integer accumulatedDataWithOutLabels) {
    this.accumulatedDataWithOutLabels = accumulatedDataWithOutLabels;
    return this;
  }

   /**
   * Get accumulatedDataWithOutLabels
   * @return accumulatedDataWithOutLabels
  **/
  @ApiModelProperty(value = "")
  public Integer getAccumulatedDataWithOutLabels() {
    return accumulatedDataWithOutLabels;
  }

  public void setAccumulatedDataWithOutLabels(Integer accumulatedDataWithOutLabels) {
    this.accumulatedDataWithOutLabels = accumulatedDataWithOutLabels;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccumulatedResults accumulatedResults = (AccumulatedResults) o;
    return Objects.equals(this.accumulatedDataWithLabels, accumulatedResults.accumulatedDataWithLabels) &&
        Objects.equals(this.accumulatedDataWithOutLabels, accumulatedResults.accumulatedDataWithOutLabels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accumulatedDataWithLabels, accumulatedDataWithOutLabels);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccumulatedResults {\n");
    
    sb.append("    accumulatedDataWithLabels: ").append(toIndentedString(accumulatedDataWithLabels)).append("\n");
    sb.append("    accumulatedDataWithOutLabels: ").append(toIndentedString(accumulatedDataWithOutLabels)).append("\n");
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

