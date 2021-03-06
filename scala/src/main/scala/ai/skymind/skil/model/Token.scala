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


case class Token (
  TokenId: Option[Long] = None,
  Issued: Option[Long] = None,
  Expire: Option[Long] = None,
  Token: Option[String] = None,
  UserId: Option[String] = None,
  IsRevoked: Option[Integer] = None
)

