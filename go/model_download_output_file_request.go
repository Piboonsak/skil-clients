/*
 * Endpoints
 *
 * Endpoints API for different services in SKIL
 *
 * API version: 1.2.0-rc1
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */

package skilclient

type DownloadOutputFileRequest struct {
	// Local path where the file is to be downloaded
	LocalDownloadPath string `json:"localDownloadPath,omitempty"`
}
