/* 
 * Endpoints
 *
 * Endpoints API for different services in SKIL
 *
 * OpenAPI spec version: 1.1.0-beta
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */


#[allow(unused_imports)]
use serde_json::Value;

#[derive(Debug, Serialize, Deserialize)]
pub struct S3ResourceDetails {
  /// ID of the resource
  #[serde(rename = "resourceId")]
  resource_id: Option<i64>,
  /// Resource type
  #[serde(rename = "type")]
  _type: Option<String>,
  /// Resource subtype
  #[serde(rename = "subType")]
  sub_type: Option<String>,
  /// S3 Bucket Name
  #[serde(rename = "bucket")]
  bucket: Option<String>,
  /// Region name where the S3 bucket is present
  #[serde(rename = "region")]
  region: Option<String>
}

impl S3ResourceDetails {
  pub fn new() -> S3ResourceDetails {
    S3ResourceDetails {
      resource_id: None,
      _type: None,
      sub_type: None,
      bucket: None,
      region: None
    }
  }

  pub fn set_resource_id(&mut self, resource_id: i64) {
    self.resource_id = Some(resource_id);
  }

  pub fn with_resource_id(mut self, resource_id: i64) -> S3ResourceDetails {
    self.resource_id = Some(resource_id);
    self
  }

  pub fn resource_id(&self) -> Option<&i64> {
    self.resource_id.as_ref()
  }

  pub fn reset_resource_id(&mut self) {
    self.resource_id = None;
  }

  pub fn set__type(&mut self, _type: String) {
    self._type = Some(_type);
  }

  pub fn with__type(mut self, _type: String) -> S3ResourceDetails {
    self._type = Some(_type);
    self
  }

  pub fn _type(&self) -> Option<&String> {
    self._type.as_ref()
  }

  pub fn reset__type(&mut self) {
    self._type = None;
  }

  pub fn set_sub_type(&mut self, sub_type: String) {
    self.sub_type = Some(sub_type);
  }

  pub fn with_sub_type(mut self, sub_type: String) -> S3ResourceDetails {
    self.sub_type = Some(sub_type);
    self
  }

  pub fn sub_type(&self) -> Option<&String> {
    self.sub_type.as_ref()
  }

  pub fn reset_sub_type(&mut self) {
    self.sub_type = None;
  }

  pub fn set_bucket(&mut self, bucket: String) {
    self.bucket = Some(bucket);
  }

  pub fn with_bucket(mut self, bucket: String) -> S3ResourceDetails {
    self.bucket = Some(bucket);
    self
  }

  pub fn bucket(&self) -> Option<&String> {
    self.bucket.as_ref()
  }

  pub fn reset_bucket(&mut self) {
    self.bucket = None;
  }

  pub fn set_region(&mut self, region: String) {
    self.region = Some(region);
  }

  pub fn with_region(mut self, region: String) -> S3ResourceDetails {
    self.region = Some(region);
    self
  }

  pub fn region(&self) -> Option<&String> {
    self.region.as_ref()
  }

  pub fn reset_region(&mut self) {
    self.region = None;
  }

}



