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
    /// JobEntity
    /// </summary>
    [DataContract]
    public partial class JobEntity :  IEquatable<JobEntity>, IValidatableObject
    {
        /// <summary>
        /// Whether a job is for training or inference
        /// </summary>
        /// <value>Whether a job is for training or inference</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum JobTypeEnum
        {
            
            /// <summary>
            /// Enum TRAINING for value: TRAINING
            /// </summary>
            [EnumMember(Value = "TRAINING")]
            TRAINING = 1,
            
            /// <summary>
            /// Enum INFERENCE for value: INFERENCE
            /// </summary>
            [EnumMember(Value = "INFERENCE")]
            INFERENCE = 2
        }

        /// <summary>
        /// Whether a job is for training or inference
        /// </summary>
        /// <value>Whether a job is for training or inference</value>
        [DataMember(Name="jobType", EmitDefaultValue=false)]
        public JobTypeEnum? JobType { get; set; }
        /// <summary>
        /// Job&#39;s status
        /// </summary>
        /// <value>Job&#39;s status</value>
        [JsonConverter(typeof(StringEnumConverter))]
        public enum StatusEnum
        {
            
            /// <summary>
            /// Enum PENDING for value: PENDING
            /// </summary>
            [EnumMember(Value = "PENDING")]
            PENDING = 1,
            
            /// <summary>
            /// Enum RUNNING for value: RUNNING
            /// </summary>
            [EnumMember(Value = "RUNNING")]
            RUNNING = 2,
            
            /// <summary>
            /// Enum CONTINUE for value: CONTINUE
            /// </summary>
            [EnumMember(Value = "CONTINUE")]
            CONTINUE = 3,
            
            /// <summary>
            /// Enum COMPLETED for value: COMPLETED
            /// </summary>
            [EnumMember(Value = "COMPLETED")]
            COMPLETED = 4,
            
            /// <summary>
            /// Enum CANCELLED for value: CANCELLED
            /// </summary>
            [EnumMember(Value = "CANCELLED")]
            CANCELLED = 5,
            
            /// <summary>
            /// Enum FAILED for value: FAILED
            /// </summary>
            [EnumMember(Value = "FAILED")]
            FAILED = 6,
            
            /// <summary>
            /// Enum INTERRUPTED for value: INTERRUPTED
            /// </summary>
            [EnumMember(Value = "INTERRUPTED")]
            INTERRUPTED = 7
        }

        /// <summary>
        /// Job&#39;s status
        /// </summary>
        /// <value>Job&#39;s status</value>
        [DataMember(Name="status", EmitDefaultValue=false)]
        public StatusEnum? Status { get; set; }
        /// <summary>
        /// Initializes a new instance of the <see cref="JobEntity" /> class.
        /// </summary>
        /// <param name="jobId">Job ID.</param>
        /// <param name="jobType">Whether a job is for training or inference.</param>
        /// <param name="computeResourceId">Compute resource ID.</param>
        /// <param name="storageResourceId">Storage resource ID.</param>
        /// <param name="jobArgs">Job arguments.</param>
        /// <param name="runId">Job run ID.</param>
        /// <param name="status">Job&#39;s status.</param>
        /// <param name="outputFileName">Output file name.</param>
        public JobEntity(long? jobId = default(long?), JobTypeEnum? jobType = default(JobTypeEnum?), long? computeResourceId = default(long?), long? storageResourceId = default(long?), string jobArgs = default(string), string runId = default(string), StatusEnum? status = default(StatusEnum?), string outputFileName = default(string))
        {
            this.JobId = jobId;
            this.JobType = jobType;
            this.ComputeResourceId = computeResourceId;
            this.StorageResourceId = storageResourceId;
            this.JobArgs = jobArgs;
            this.RunId = runId;
            this.Status = status;
            this.OutputFileName = outputFileName;
        }
        
        /// <summary>
        /// Job ID
        /// </summary>
        /// <value>Job ID</value>
        [DataMember(Name="jobId", EmitDefaultValue=false)]
        public long? JobId { get; set; }


        /// <summary>
        /// Compute resource ID
        /// </summary>
        /// <value>Compute resource ID</value>
        [DataMember(Name="computeResourceId", EmitDefaultValue=false)]
        public long? ComputeResourceId { get; set; }

        /// <summary>
        /// Storage resource ID
        /// </summary>
        /// <value>Storage resource ID</value>
        [DataMember(Name="storageResourceId", EmitDefaultValue=false)]
        public long? StorageResourceId { get; set; }

        /// <summary>
        /// Job arguments
        /// </summary>
        /// <value>Job arguments</value>
        [DataMember(Name="jobArgs", EmitDefaultValue=false)]
        public string JobArgs { get; set; }

        /// <summary>
        /// Job run ID
        /// </summary>
        /// <value>Job run ID</value>
        [DataMember(Name="runId", EmitDefaultValue=false)]
        public string RunId { get; set; }


        /// <summary>
        /// Output file name
        /// </summary>
        /// <value>Output file name</value>
        [DataMember(Name="outputFileName", EmitDefaultValue=false)]
        public string OutputFileName { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class JobEntity {\n");
            sb.Append("  JobId: ").Append(JobId).Append("\n");
            sb.Append("  JobType: ").Append(JobType).Append("\n");
            sb.Append("  ComputeResourceId: ").Append(ComputeResourceId).Append("\n");
            sb.Append("  StorageResourceId: ").Append(StorageResourceId).Append("\n");
            sb.Append("  JobArgs: ").Append(JobArgs).Append("\n");
            sb.Append("  RunId: ").Append(RunId).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
            sb.Append("  OutputFileName: ").Append(OutputFileName).Append("\n");
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
            return this.Equals(input as JobEntity);
        }

        /// <summary>
        /// Returns true if JobEntity instances are equal
        /// </summary>
        /// <param name="input">Instance of JobEntity to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(JobEntity input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.JobId == input.JobId ||
                    (this.JobId != null &&
                    this.JobId.Equals(input.JobId))
                ) && 
                (
                    this.JobType == input.JobType ||
                    (this.JobType != null &&
                    this.JobType.Equals(input.JobType))
                ) && 
                (
                    this.ComputeResourceId == input.ComputeResourceId ||
                    (this.ComputeResourceId != null &&
                    this.ComputeResourceId.Equals(input.ComputeResourceId))
                ) && 
                (
                    this.StorageResourceId == input.StorageResourceId ||
                    (this.StorageResourceId != null &&
                    this.StorageResourceId.Equals(input.StorageResourceId))
                ) && 
                (
                    this.JobArgs == input.JobArgs ||
                    (this.JobArgs != null &&
                    this.JobArgs.Equals(input.JobArgs))
                ) && 
                (
                    this.RunId == input.RunId ||
                    (this.RunId != null &&
                    this.RunId.Equals(input.RunId))
                ) && 
                (
                    this.Status == input.Status ||
                    (this.Status != null &&
                    this.Status.Equals(input.Status))
                ) && 
                (
                    this.OutputFileName == input.OutputFileName ||
                    (this.OutputFileName != null &&
                    this.OutputFileName.Equals(input.OutputFileName))
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
                if (this.JobId != null)
                    hashCode = hashCode * 59 + this.JobId.GetHashCode();
                if (this.JobType != null)
                    hashCode = hashCode * 59 + this.JobType.GetHashCode();
                if (this.ComputeResourceId != null)
                    hashCode = hashCode * 59 + this.ComputeResourceId.GetHashCode();
                if (this.StorageResourceId != null)
                    hashCode = hashCode * 59 + this.StorageResourceId.GetHashCode();
                if (this.JobArgs != null)
                    hashCode = hashCode * 59 + this.JobArgs.GetHashCode();
                if (this.RunId != null)
                    hashCode = hashCode * 59 + this.RunId.GetHashCode();
                if (this.Status != null)
                    hashCode = hashCode * 59 + this.Status.GetHashCode();
                if (this.OutputFileName != null)
                    hashCode = hashCode * 59 + this.OutputFileName.GetHashCode();
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
