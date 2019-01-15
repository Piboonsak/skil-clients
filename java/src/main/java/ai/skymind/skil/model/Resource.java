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
 * Resource
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-15T19:45:50.599+05:00")
public class Resource {
  @SerializedName("resourceId")
  private Long resourceId = null;

  @SerializedName("name")
  private String name = null;

  /**
   * Resource type (whether COMPUTE or STORAGE)
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    COMPUTE("COMPUTE"),
    
    STORAGE("STORAGE");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  /**
   * Resource subtype (COMPUTE -&gt; [EMR, DataProc, HDInsight, YARN] | STORAGE -&gt; [S3, GoogleStorage, AzureStorage, HDFS])
   */
  @JsonAdapter(SubTypeEnum.Adapter.class)
  public enum SubTypeEnum {
    EMR("EMR"),
    
    S3("S3"),
    
    GOOGLESTORAGE("GoogleStorage"),
    
    DATAPROC("DataProc"),
    
    HDINSIGHT("HDInsight"),
    
    AZURESTORAGE("AzureStorage"),
    
    HDFS("HDFS"),
    
    YARN("YARN");

    private String value;

    SubTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SubTypeEnum fromValue(String text) {
      for (SubTypeEnum b : SubTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SubTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SubTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SubTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SubTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("subType")
  private SubTypeEnum subType = null;

  @SerializedName("credentialId")
  private String credentialId = null;

  public Resource resourceId(Long resourceId) {
    this.resourceId = resourceId;
    return this;
  }

   /**
   * ID of the resource
   * @return resourceId
  **/
  @ApiModelProperty(value = "ID of the resource")
  public Long getResourceId() {
    return resourceId;
  }

  public void setResourceId(Long resourceId) {
    this.resourceId = resourceId;
  }

  public Resource name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Resource nickname
   * @return name
  **/
  @ApiModelProperty(value = "Resource nickname")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Resource type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Resource type (whether COMPUTE or STORAGE)
   * @return type
  **/
  @ApiModelProperty(value = "Resource type (whether COMPUTE or STORAGE)")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Resource subType(SubTypeEnum subType) {
    this.subType = subType;
    return this;
  }

   /**
   * Resource subtype (COMPUTE -&gt; [EMR, DataProc, HDInsight, YARN] | STORAGE -&gt; [S3, GoogleStorage, AzureStorage, HDFS])
   * @return subType
  **/
  @ApiModelProperty(value = "Resource subtype (COMPUTE -> [EMR, DataProc, HDInsight, YARN] | STORAGE -> [S3, GoogleStorage, AzureStorage, HDFS])")
  public SubTypeEnum getSubType() {
    return subType;
  }

  public void setSubType(SubTypeEnum subType) {
    this.subType = subType;
  }

  public Resource credentialId(String credentialId) {
    this.credentialId = credentialId;
    return this;
  }

   /**
   * Credentials GUID
   * @return credentialId
  **/
  @ApiModelProperty(value = "Credentials GUID")
  public String getCredentialId() {
    return credentialId;
  }

  public void setCredentialId(String credentialId) {
    this.credentialId = credentialId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Resource resource = (Resource) o;
    return Objects.equals(this.resourceId, resource.resourceId) &&
        Objects.equals(this.name, resource.name) &&
        Objects.equals(this.type, resource.type) &&
        Objects.equals(this.subType, resource.subType) &&
        Objects.equals(this.credentialId, resource.credentialId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceId, name, type, subType, credentialId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Resource {\n");
    
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    subType: ").append(toIndentedString(subType)).append("\n");
    sb.append("    credentialId: ").append(toIndentedString(credentialId)).append("\n");
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

