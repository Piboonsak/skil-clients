/*
 * Endpoints
 *
 * Endpoints API for different services in SKIL
 *
 * API version: 1.2.0-beta
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */

package skilclient

type JobEntity struct {
	// Job ID
	JobId int64 `json:"jobId,omitempty"`
	// Whether a job is for training or inference
	JobType string `json:"jobType,omitempty"`
	// Compute resource ID
	ComputeResourceId int64 `json:"computeResourceId,omitempty"`
	// Storage resource ID
	StorageResourceId int64 `json:"storageResourceId,omitempty"`
	// SKILSparkMain class arguments
	SkilSparkMainArgs string `json:"skilSparkMainArgs,omitempty"`
	// Job run ID
	RunId string `json:"runId,omitempty"`
	// Job's status
	Status string `json:"status,omitempty"`
	// Output file name
	OutputFileName string `json:"outputFileName,omitempty"`
}
