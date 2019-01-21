/*
 * Endpoints
 *
 * Endpoints API for different services in SKIL
 *
 * API version: 1.2.0-rc1
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */

package skilclient

type AzureStorageResourceDetails struct {
	Class string `json:"@class,omitempty"`
	// ID of the resource
	ResourceId int64 `json:"resourceId,omitempty"`
	// Resource type
	Type_ string `json:"type,omitempty"`
	// Resource subtype
	SubType string `json:"subType,omitempty"`
	// Storage container name
	ContainerName string `json:"containerName,omitempty"`
}
