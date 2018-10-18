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
import ai.skymind.skil.model.INDArray;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * MultiPredictRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-10-17T08:50:23.609+05:00")
public class MultiPredictRequest {
  @SerializedName("id")
  private String id = null;

  @SerializedName("needsPreProcessing")
  private Boolean needsPreProcessing = null;

  @SerializedName("inputs")
  private List<INDArray> inputs = null;

  @SerializedName("inputMasks")
  private List<INDArray> inputMasks = null;

  public MultiPredictRequest id(String id) {
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

  public MultiPredictRequest needsPreProcessing(Boolean needsPreProcessing) {
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

  public MultiPredictRequest inputs(List<INDArray> inputs) {
    this.inputs = inputs;
    return this;
  }

  public MultiPredictRequest addInputsItem(INDArray inputsItem) {
    if (this.inputs == null) {
      this.inputs = new ArrayList<INDArray>();
    }
    this.inputs.add(inputsItem);
    return this;
  }

   /**
   * Get inputs
   * @return inputs
  **/
  @ApiModelProperty(value = "")
  public List<INDArray> getInputs() {
    return inputs;
  }

  public void setInputs(List<INDArray> inputs) {
    this.inputs = inputs;
  }

  public MultiPredictRequest inputMasks(List<INDArray> inputMasks) {
    this.inputMasks = inputMasks;
    return this;
  }

  public MultiPredictRequest addInputMasksItem(INDArray inputMasksItem) {
    if (this.inputMasks == null) {
      this.inputMasks = new ArrayList<INDArray>();
    }
    this.inputMasks.add(inputMasksItem);
    return this;
  }

   /**
   * Get inputMasks
   * @return inputMasks
  **/
  @ApiModelProperty(value = "")
  public List<INDArray> getInputMasks() {
    return inputMasks;
  }

  public void setInputMasks(List<INDArray> inputMasks) {
    this.inputMasks = inputMasks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MultiPredictRequest multiPredictRequest = (MultiPredictRequest) o;
    return Objects.equals(this.id, multiPredictRequest.id) &&
        Objects.equals(this.needsPreProcessing, multiPredictRequest.needsPreProcessing) &&
        Objects.equals(this.inputs, multiPredictRequest.inputs) &&
        Objects.equals(this.inputMasks, multiPredictRequest.inputMasks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, needsPreProcessing, inputs, inputMasks);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiPredictRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    needsPreProcessing: ").append(toIndentedString(needsPreProcessing)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    inputMasks: ").append(toIndentedString(inputMasks)).append("\n");
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
