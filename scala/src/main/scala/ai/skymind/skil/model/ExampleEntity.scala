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


case class ExampleEntity (
  // the GUID of the example
  ExampleId: Option[String] = None,
  // Example version
  ExampleVersion: Option[Integer] = None,
  // Row Number
  RowNumber: Option[Integer] = None,
  // when the example was created
  Created: Option[Long] = None,
  // The GUID of the minibatch
  MiniBatchId: Option[String] = None,
  // minibatch version
  MiniBatchVersion: Option[Integer] = None
)

