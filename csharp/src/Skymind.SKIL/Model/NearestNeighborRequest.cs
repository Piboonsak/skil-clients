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
    /// NearestNeighborRequest
    /// </summary>
    [DataContract]
    public partial class NearestNeighborRequest :  IEquatable<NearestNeighborRequest>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="NearestNeighborRequest" /> class.
        /// </summary>
        /// <param name="k">the number of results.</param>
        /// <param name="inputIndex">the index of the EXISTING ndarray to run a search on.</param>
        public NearestNeighborRequest(int? k = default(int?), int? inputIndex = default(int?))
        {
            this.K = k;
            this.InputIndex = inputIndex;
        }
        
        /// <summary>
        /// the number of results
        /// </summary>
        /// <value>the number of results</value>
        [DataMember(Name="k", EmitDefaultValue=false)]
        public int? K { get; set; }

        /// <summary>
        /// the index of the EXISTING ndarray to run a search on
        /// </summary>
        /// <value>the index of the EXISTING ndarray to run a search on</value>
        [DataMember(Name="inputIndex", EmitDefaultValue=false)]
        public int? InputIndex { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class NearestNeighborRequest {\n");
            sb.Append("  K: ").Append(K).Append("\n");
            sb.Append("  InputIndex: ").Append(InputIndex).Append("\n");
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
            return this.Equals(input as NearestNeighborRequest);
        }

        /// <summary>
        /// Returns true if NearestNeighborRequest instances are equal
        /// </summary>
        /// <param name="input">Instance of NearestNeighborRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(NearestNeighborRequest input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.K == input.K ||
                    (this.K != null &&
                    this.K.Equals(input.K))
                ) && 
                (
                    this.InputIndex == input.InputIndex ||
                    (this.InputIndex != null &&
                    this.InputIndex.Equals(input.InputIndex))
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
                if (this.K != null)
                    hashCode = hashCode * 59 + this.K.GetHashCode();
                if (this.InputIndex != null)
                    hashCode = hashCode * 59 + this.InputIndex.GetHashCode();
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
