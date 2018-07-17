/*
 * Endpoints
 *
 * Endpoints API for different services in SKIL
 *
 * API version: 1.1.0-beta
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */

package skilclient

type ModelFeedBackRequest struct {
	// The GUID of the minibatch this feedback corresponds to
	BatchId string `json:"batchId,omitempty"`
	// The guessed label IDs by the model
	Guesses []string `json:"guesses,omitempty"`
	// The actual label IDs
	Correct []string `json:"correct,omitempty"`
}