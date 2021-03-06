/*
 * Endpoints
 *
 * Endpoints API for different services in SKIL
 *
 * API version: 1.2.0-rc1
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */

package skilclient

type TokenGenerateRequest struct {
	UserId string `json:"userId,omitempty"`
	Expiry int64 `json:"expiry,omitempty"`
}
