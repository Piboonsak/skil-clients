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
pub struct YarnResourceDetails {
  /// ID of the resource
  #[serde(rename = "resourceId")]
  resource_id: Option<i64>,
  /// Resource type
  #[serde(rename = "type")]
  _type: Option<String>,
  /// Resource subtype
  #[serde(rename = "subType")]
  sub_type: Option<String>,
  /// Local Spark Home path
  #[serde(rename = "localSparkHome")]
  local_spark_home: Option<String>
}

impl YarnResourceDetails {
  pub fn new() -> YarnResourceDetails {
    YarnResourceDetails {
      resource_id: None,
      _type: None,
      sub_type: None,
      local_spark_home: None
    }
  }

  pub fn set_resource_id(&mut self, resource_id: i64) {
    self.resource_id = Some(resource_id);
  }

  pub fn with_resource_id(mut self, resource_id: i64) -> YarnResourceDetails {
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

  pub fn with__type(mut self, _type: String) -> YarnResourceDetails {
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

  pub fn with_sub_type(mut self, sub_type: String) -> YarnResourceDetails {
    self.sub_type = Some(sub_type);
    self
  }

  pub fn sub_type(&self) -> Option<&String> {
    self.sub_type.as_ref()
  }

  pub fn reset_sub_type(&mut self) {
    self.sub_type = None;
  }

  pub fn set_local_spark_home(&mut self, local_spark_home: String) {
    self.local_spark_home = Some(local_spark_home);
  }

  pub fn with_local_spark_home(mut self, local_spark_home: String) -> YarnResourceDetails {
    self.local_spark_home = Some(local_spark_home);
    self
  }

  pub fn local_spark_home(&self) -> Option<&String> {
    self.local_spark_home.as_ref()
  }

  pub fn reset_local_spark_home(&mut self) {
    self.local_spark_home = None;
  }

}



