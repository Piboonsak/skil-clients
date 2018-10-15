/**
 * Endpoints
 * Endpoints API for different services in SKIL
 *
 * OpenAPI spec version: 1.1.0-beta
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package ai.skymind.skil.model


case class Prediction (
  Id: Option[String] = None,
  NeedsPreProcessing: Option[Boolean] = None,
  Prediction: Option[INDArray] = None,
  InputMask: Option[INDArray] = None
)

