/* 
 * Endpoints
 *
 * Endpoints API for different services in SKIL
 *
 * OpenAPI spec version: 1.2.0-rc1
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
    /// AddCredentialsRequest
    /// </summary>
    [DataContract]
    public partial class AddCredentialsRequest :  IEquatable<AddCredentialsRequest>, IValidatableObject
    {
        /// <summary>
        /// Type of the credentials
        /// </summary>
        /// <value>Type of the credentials</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum TypeEnum
        {
            
            /// <summary>
            /// Enum AWS for value: AWS
            /// </summary>
            [EnumMember(Value = "AWS")]
            AWS = 1,
            
            /// <summary>
            /// Enum Azure for value: Azure
            /// </summary>
            [EnumMember(Value = "Azure")]
            Azure = 2,
            
            /// <summary>
            /// Enum GoogleCloud for value: GoogleCloud
            /// </summary>
            [EnumMember(Value = "GoogleCloud")]
            GoogleCloud = 3,
            
            /// <summary>
            /// Enum Hadoop for value: Hadoop
            /// </summary>
            [EnumMember(Value = "Hadoop")]
            Hadoop = 4
        }

        /// <summary>
        /// Type of the credentials
        /// </summary>
        /// <value>Type of the credentials</value>
        [DataMember(Name="type", EmitDefaultValue=false)]
        public TypeEnum? Type { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="AddCredentialsRequest" /> class.
        /// </summary>
        /// <param name="type">Type of the credentials.</param>
        /// <param name="name">Name of the credentials.</param>
        /// <param name="uri">URI of the credentials.</param>
        public AddCredentialsRequest(TypeEnum? type = default(TypeEnum?), string name = default(string), string uri = default(string))
        {
            this.Type = type;
            this.Name = name;
            this.Uri = uri;
        }
        

        /// <summary>
        /// Name of the credentials
        /// </summary>
        /// <value>Name of the credentials</value>
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// URI of the credentials
        /// </summary>
        /// <value>URI of the credentials</value>
        [DataMember(Name="uri", EmitDefaultValue=false)]
        public string Uri { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class AddCredentialsRequest {\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Uri: ").Append(Uri).Append("\n");
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
            return this.Equals(input as AddCredentialsRequest);
        }

        /// <summary>
        /// Returns true if AddCredentialsRequest instances are equal
        /// </summary>
        /// <param name="input">Instance of AddCredentialsRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(AddCredentialsRequest input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Type == input.Type ||
                    (this.Type != null &&
                    this.Type.Equals(input.Type))
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.Uri == input.Uri ||
                    (this.Uri != null &&
                    this.Uri.Equals(input.Uri))
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
                if (this.Type != null)
                    hashCode = hashCode * 59 + this.Type.GetHashCode();
                if (this.Name != null)
                    hashCode = hashCode * 59 + this.Name.GetHashCode();
                if (this.Uri != null)
                    hashCode = hashCode * 59 + this.Uri.GetHashCode();
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
