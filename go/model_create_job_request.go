/*
 * Endpoints
 *
 * Endpoints API for different services in SKIL
 *
 * API version: 1.2.0-beta
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */

package skilclient

type CreateJobRequest struct {
	// Compute resource ID
	ComputeResourceId int64 `json:"computeResourceId,omitempty"`
	// Storage resource ID
	StorageResourceId int64 `json:"storageResourceId,omitempty"`
	// SKILSparkMain class arguments
	SkilSparkMainArgs string `json:"skilSparkMainArgs,omitempty"`
	// Output file name
	OutputFileName string `json:"outputFileName,omitempty"`
}
