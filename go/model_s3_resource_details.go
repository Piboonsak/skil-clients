/*
 * Endpoints
 *
 * Endpoints API for different services in SKIL
 *
 * API version: 1.2.0-rc1
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */

package skilclient

type S3ResourceDetails struct {
	Class string `json:"@class,omitempty"`
	// ID of the resource
	ResourceId int64 `json:"resourceId,omitempty"`
	// Resource type
	Type_ string `json:"type,omitempty"`
	// Resource subtype
	SubType string `json:"subType,omitempty"`
	// S3 Bucket Name
	Bucket string `json:"bucket,omitempty"`
	// Region name where the S3 bucket is present
	Region string `json:"region,omitempty"`
}
