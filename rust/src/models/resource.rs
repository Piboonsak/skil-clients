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
pub struct Resource {
  /// ID of the resource
  #[serde(rename = "resourceId")]
  resource_id: Option<i64>,
  /// Resource nickname
  #[serde(rename = "name")]
  name: Option<String>,
  /// Resource type (whether COMPUTE or STORAGE)
  #[serde(rename = "type")]
  _type: Option<String>,
  /// Resource subtype (COMPUTE -> [EMR, DataProc, HDInsight, YARN] | STORAGE -> [S3, GoogleStorage, AzureStorage, HDFS])
  #[serde(rename = "subType")]
  sub_type: Option<String>,
  /// Credentials GUID
  #[serde(rename = "credentialId")]
  credential_id: Option<String>
}

impl Resource {
  pub fn new() -> Resource {
    Resource {
      resource_id: None,
      name: None,
      _type: None,
      sub_type: None,
      credential_id: None
    }
  }

  pub fn set_resource_id(&mut self, resource_id: i64) {
    self.resource_id = Some(resource_id);
  }

  pub fn with_resource_id(mut self, resource_id: i64) -> Resource {
    self.resource_id = Some(resource_id);
    self
  }

  pub fn resource_id(&self) -> Option<&i64> {
    self.resource_id.as_ref()
  }

  pub fn reset_resource_id(&mut self) {
    self.resource_id = None;
  }

  pub fn set_name(&mut self, name: String) {
    self.name = Some(name);
  }

  pub fn with_name(mut self, name: String) -> Resource {
    self.name = Some(name);
    self
  }

  pub fn name(&self) -> Option<&String> {
    self.name.as_ref()
  }

  pub fn reset_name(&mut self) {
    self.name = None;
  }

  pub fn set__type(&mut self, _type: String) {
    self._type = Some(_type);
  }

  pub fn with__type(mut self, _type: String) -> Resource {
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

  pub fn with_sub_type(mut self, sub_type: String) -> Resource {
    self.sub_type = Some(sub_type);
    self
  }

  pub fn sub_type(&self) -> Option<&String> {
    self.sub_type.as_ref()
  }

  pub fn reset_sub_type(&mut self) {
    self.sub_type = None;
  }

  pub fn set_credential_id(&mut self, credential_id: String) {
    self.credential_id = Some(credential_id);
  }

  pub fn with_credential_id(mut self, credential_id: String) -> Resource {
    self.credential_id = Some(credential_id);
    self
  }

  pub fn credential_id(&self) -> Option<&String> {
    self.credential_id.as_ref()
  }

  pub fn reset_credential_id(&mut self) {
    self.credential_id = None;
  }

}



