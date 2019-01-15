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
 * RevisionsWritten
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-15T19:45:50.599+05:00")
public class RevisionsWritten {
  @SerializedName("numRevisions")
  private Integer numRevisions = null;

  public RevisionsWritten numRevisions(Integer numRevisions) {
    this.numRevisions = numRevisions;
    return this;
  }

   /**
   * Get numRevisions
   * @return numRevisions
  **/
  @ApiModelProperty(value = "")
  public Integer getNumRevisions() {
    return numRevisions;
  }

  public void setNumRevisions(Integer numRevisions) {
    this.numRevisions = numRevisions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RevisionsWritten revisionsWritten = (RevisionsWritten) o;
    return Objects.equals(this.numRevisions, revisionsWritten.numRevisions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numRevisions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RevisionsWritten {\n");
    
    sb.append("    numRevisions: ").append(toIndentedString(numRevisions)).append("\n");
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

