/* 
 * Endpoints
 *
 * Endpoints API for different services in SKIL
 *
 * OpenAPI spec version: 1.2.0-beta
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */


#[allow(unused_imports)]
use serde_json::Value;

#[derive(Debug, Serialize, Deserialize)]
pub struct GoogleStorageResourceDetails {
  /// ID of the resource
  #[serde(rename = "resourceId")]
  resource_id: Option<i64>,
  /// Resource type
  #[serde(rename = "type")]
  _type: Option<String>,
  /// Resource subtype
  #[serde(rename = "subType")]
  sub_type: Option<String>,
  /// Project ID
  #[serde(rename = "projectId")]
  project_id: Option<String>,
  /// Name of the storage bucket
  #[serde(rename = "bucketName")]
  bucket_name: Option<String>
}

impl GoogleStorageResourceDetails {
  pub fn new() -> GoogleStorageResourceDetails {
    GoogleStorageResourceDetails {
      resource_id: None,
      _type: None,
      sub_type: None,
      project_id: None,
      bucket_name: None
    }
  }

  pub fn set_resource_id(&mut self, resource_id: i64) {
    self.resource_id = Some(resource_id);
  }

  pub fn with_resource_id(mut self, resource_id: i64) -> GoogleStorageResourceDetails {
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

  pub fn with__type(mut self, _type: String) -> GoogleStorageResourceDetails {
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

  pub fn with_sub_type(mut self, sub_type: String) -> GoogleStorageResourceDetails {
    self.sub_type = Some(sub_type);
    self
  }

  pub fn sub_type(&self) -> Option<&String> {
    self.sub_type.as_ref()
  }

  pub fn reset_sub_type(&mut self) {
    self.sub_type = None;
  }

  pub fn set_project_id(&mut self, project_id: String) {
    self.project_id = Some(project_id);
  }

  pub fn with_project_id(mut self, project_id: String) -> GoogleStorageResourceDetails {
    self.project_id = Some(project_id);
    self
  }

  pub fn project_id(&self) -> Option<&String> {
    self.project_id.as_ref()
  }

  pub fn reset_project_id(&mut self) {
    self.project_id = None;
  }

  pub fn set_bucket_name(&mut self, bucket_name: String) {
    self.bucket_name = Some(bucket_name);
  }

  pub fn with_bucket_name(mut self, bucket_name: String) -> GoogleStorageResourceDetails {
    self.bucket_name = Some(bucket_name);
    self
  }

  pub fn bucket_name(&self) -> Option<&String> {
    self.bucket_name.as_ref()
  }

  pub fn reset_bucket_name(&mut self) {
    self.bucket_name = None;
  }

}



