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
    /// SingleCSVRecord
    /// </summary>
    [DataContract]
    public partial class SingleCSVRecord :  IEquatable<SingleCSVRecord>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="SingleCSVRecord" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected SingleCSVRecord() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="SingleCSVRecord" /> class.
        /// </summary>
        /// <param name="values">values (required).</param>
        public SingleCSVRecord(List<string> values = default(List<string>))
        {
            // to ensure "values" is required (not null)
            if (values == null)
            {
                throw new InvalidDataException("values is a required property for SingleCSVRecord and cannot be null");
            }
            else
            {
                this.Values = values;
            }
        }
        
        /// <summary>
        /// Gets or Sets Values
        /// </summary>
        [DataMember(Name="values", EmitDefaultValue=false)]
        public List<string> Values { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class SingleCSVRecord {\n");
            sb.Append("  Values: ").Append(Values).Append("\n");
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
            return this.Equals(input as SingleCSVRecord);
        }

        /// <summary>
        /// Returns true if SingleCSVRecord instances are equal
        /// </summary>
        /// <param name="input">Instance of SingleCSVRecord to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(SingleCSVRecord input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Values == input.Values ||
                    this.Values != null &&
                    this.Values.SequenceEqual(input.Values)
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
                if (this.Values != null)
                    hashCode = hashCode * 59 + this.Values.GetHashCode();
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
