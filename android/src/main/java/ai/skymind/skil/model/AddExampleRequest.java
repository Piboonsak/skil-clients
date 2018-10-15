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

import ai.skymind.skil.model.MinibatchEntity;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

@ApiModel(description = "")
public class AddExampleRequest implements Serializable {
  
  @SerializedName("minibatch")
  private MinibatchEntity minibatch = null;
  @SerializedName("batchSize")
  private Integer batchSize = null;

  /**
   * the minibatch the examples are going to be associated with
   **/
  @ApiModelProperty(value = "the minibatch the examples are going to be associated with")
  public MinibatchEntity getMinibatch() {
    return minibatch;
  }
  public void setMinibatch(MinibatchEntity minibatch) {
    this.minibatch = minibatch;
  }

  /**
   * the size of the batch to create
   **/
  @ApiModelProperty(value = "the size of the batch to create")
  public Integer getBatchSize() {
    return batchSize;
  }
  public void setBatchSize(Integer batchSize) {
    this.batchSize = batchSize;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddExampleRequest addExampleRequest = (AddExampleRequest) o;
    return (this.minibatch == null ? addExampleRequest.minibatch == null : this.minibatch.equals(addExampleRequest.minibatch)) &&
        (this.batchSize == null ? addExampleRequest.batchSize == null : this.batchSize.equals(addExampleRequest.batchSize));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.minibatch == null ? 0: this.minibatch.hashCode());
    result = 31 * result + (this.batchSize == null ? 0: this.batchSize.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddExampleRequest {\n");
    
    sb.append("  minibatch: ").append(minibatch).append("\n");
    sb.append("  batchSize: ").append(batchSize).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
