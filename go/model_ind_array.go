/*
 * Endpoints
 *
 * Endpoints API for different services in SKIL
 *
 * API version: 1.2.0-beta
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */

package skilclient

type IndArray struct {
	Array string `json:"array,omitempty"`
	Shape []int32 `json:"shape,omitempty"`
	Ordering string `json:"ordering,omitempty"`
	Data []float32 `json:"data,omitempty"`
	DataType string `json:"dataType,omitempty"`
}
