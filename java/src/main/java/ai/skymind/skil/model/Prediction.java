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
import ai.skymind.skil.model.INDArray;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Prediction
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-28T00:52:55.977+05:00")
public class Prediction {
  @SerializedName("id")
  private String id = null;

  @SerializedName("needsPreProcessing")
  private Boolean needsPreProcessing = null;

  @SerializedName("prediction")
  private INDArray prediction = null;

  @SerializedName("inputMask")
  private INDArray inputMask = null;

  public Prediction id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Prediction needsPreProcessing(Boolean needsPreProcessing) {
    this.needsPreProcessing = needsPreProcessing;
    return this;
  }

   /**
   * Get needsPreProcessing
   * @return needsPreProcessing
  **/
  @ApiModelProperty(value = "")
  public Boolean isNeedsPreProcessing() {
    return needsPreProcessing;
  }

  public void setNeedsPreProcessing(Boolean needsPreProcessing) {
    this.needsPreProcessing = needsPreProcessing;
  }

  public Prediction prediction(INDArray prediction) {
    this.prediction = prediction;
    return this;
  }

   /**
   * Get prediction
   * @return prediction
  **/
  @ApiModelProperty(value = "")
  public INDArray getPrediction() {
    return prediction;
  }

  public void setPrediction(INDArray prediction) {
    this.prediction = prediction;
  }

  public Prediction inputMask(INDArray inputMask) {
    this.inputMask = inputMask;
    return this;
  }

   /**
   * Get inputMask
   * @return inputMask
  **/
  @ApiModelProperty(value = "")
  public INDArray getInputMask() {
    return inputMask;
  }

  public void setInputMask(INDArray inputMask) {
    this.inputMask = inputMask;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Prediction prediction = (Prediction) o;
    return Objects.equals(this.id, prediction.id) &&
        Objects.equals(this.needsPreProcessing, prediction.needsPreProcessing) &&
        Objects.equals(this.prediction, prediction.prediction) &&
        Objects.equals(this.inputMask, prediction.inputMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, needsPreProcessing, prediction, inputMask);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Prediction {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    needsPreProcessing: ").append(toIndentedString(needsPreProcessing)).append("\n");
    sb.append("    prediction: ").append(toIndentedString(prediction)).append("\n");
    sb.append("    inputMask: ").append(toIndentedString(inputMask)).append("\n");
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

