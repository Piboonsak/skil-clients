/*
 * Endpoints
 *
 * Endpoints API for different services in SKIL
 *
 * API version: 1.2.0-beta
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */

package skilclient

type DetectionResult struct {
	Id string `json:"id,omitempty"`
	Objects []DetectedObject `json:"objects,omitempty"`
}
