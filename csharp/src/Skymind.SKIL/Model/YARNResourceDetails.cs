/* 
 * Endpoints
 *
 * Endpoints API for different services in SKIL
 *
 * OpenAPI spec version: 1.2.0-beta
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using SwaggerDateConverter = Skymind.SKIL.Client.SwaggerDateConverter;

namespace Skymind.SKIL.Model
{
    /// <summary>
    /// YARNResourceDetails
    /// </summary>
    [DataContract]
    public partial class YARNResourceDetails :  IEquatable<YARNResourceDetails>, IValidatableObject
    {
        /// <summary>
        /// Resource type
        /// </summary>
        /// <value>Resource type</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum TypeEnum
        {
            
            /// <summary>
            /// Enum COMPUTE for value: COMPUTE
            /// </summary>
            [EnumMember(Value = "COMPUTE")]
            COMPUTE = 1
        }

        /// <summary>
        /// Resource type
        /// </summary>
        /// <value>Resource type</value>
        [DataMember(Name="type", EmitDefaultValue=false)]
        public TypeEnum? Type { get; set; }
        /// <summary>
        /// Resource subtype
        /// </summary>
        /// <value>Resource subtype</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum SubTypeEnum
        {
            
            /// <summary>
            /// Enum YARN for value: YARN
            /// </summary>
            [EnumMember(Value = "YARN")]
            YARN = 1
        }

        /// <summary>
        /// Resource subtype
        /// </summary>
        /// <value>Resource subtype</value>
        [DataMember(Name="subType", EmitDefaultValue=false)]
        public SubTypeEnum? SubType { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="YARNResourceDetails" /> class.
        /// </summary>
        /// <param name="resourceId">ID of the resource.</param>
        /// <param name="type">Resource type.</param>
        /// <param name="subType">Resource subtype.</param>
        /// <param name="localSparkHome">Local Spark Home path.</param>
        public YARNResourceDetails(long? resourceId = default(long?), TypeEnum? type = default(TypeEnum?), SubTypeEnum? subType = default(SubTypeEnum?), string localSparkHome = default(string))
        {
            this.ResourceId = resourceId;
            this.Type = type;
            this.SubType = subType;
            this.LocalSparkHome = localSparkHome;
        }
        
        /// <summary>
        /// ID of the resource
        /// </summary>
        /// <value>ID of the resource</value>
        [DataMember(Name="resourceId", EmitDefaultValue=false)]
        public long? ResourceId { get; set; }



        /// <summary>
        /// Local Spark Home path
        /// </summary>
        /// <value>Local Spark Home path</value>
        [DataMember(Name="localSparkHome", EmitDefaultValue=false)]
        public string LocalSparkHome { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class YARNResourceDetails {\n");
            sb.Append("  ResourceId: ").Append(ResourceId).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  SubType: ").Append(SubType).Append("\n");
            sb.Append("  LocalSparkHome: ").Append(LocalSparkHome).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as YARNResourceDetails);
        }

        /// <summary>
        /// Returns true if YARNResourceDetails instances are equal
        /// </summary>
        /// <param name="input">Instance of YARNResourceDetails to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(YARNResourceDetails input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.ResourceId == input.ResourceId ||
                    (this.ResourceId != null &&
                    this.ResourceId.Equals(input.ResourceId))
                ) && 
                (
                    this.Type == input.Type ||
                    (this.Type != null &&
                    this.Type.Equals(input.Type))
                ) && 
                (
                    this.SubType == input.SubType ||
                    (this.SubType != null &&
                    this.SubType.Equals(input.SubType))
                ) && 
                (
                    this.LocalSparkHome == input.LocalSparkHome ||
                    (this.LocalSparkHome != null &&
                    this.LocalSparkHome.Equals(input.LocalSparkHome))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.ResourceId != null)
                    hashCode = hashCode * 59 + this.ResourceId.GetHashCode();
                if (this.Type != null)
                    hashCode = hashCode * 59 + this.Type.GetHashCode();
                if (this.SubType != null)
                    hashCode = hashCode * 59 + this.SubType.GetHashCode();
                if (this.LocalSparkHome != null)
                    hashCode = hashCode * 59 + this.LocalSparkHome.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
