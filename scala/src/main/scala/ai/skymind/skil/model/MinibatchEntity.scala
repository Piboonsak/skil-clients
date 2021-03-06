/**
 * Endpoints
 * Endpoints API for different services in SKIL
 *
 * OpenAPI spec version: 1.2.0-rc1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package ai.skymind.skil.model


case class MinibatchEntity (
  // GUID of mini batch
  MiniBatchId: Option[String] = None,
  // GUID of the evaluation
  EvalId: Option[String] = None,
  // Eval version
  EvalVersion: Option[Integer] = None,
  // Batch version
  BatchVersion: Option[Integer] = None
)

