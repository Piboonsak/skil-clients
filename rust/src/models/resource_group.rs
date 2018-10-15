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
pub struct ResourceGroup {
  /// ID of the resource group
  #[serde(rename = "groupId")]
  group_id: Option<i64>,
  /// Name of the resource group
  #[serde(rename = "groupName")]
  group_name: Option<String>,
  /// Milliseconds in Long when the resource group was added
  #[serde(rename = "added")]
  added: Option<i64>,
  /// Milliseconds in Long when the resource group was updated
  #[serde(rename = "updated")]
  updated: Option<i64>
}

impl ResourceGroup {
  pub fn new() -> ResourceGroup {
    ResourceGroup {
      group_id: None,
      group_name: None,
      added: None,
      updated: None
    }
  }

  pub fn set_group_id(&mut self, group_id: i64) {
    self.group_id = Some(group_id);
  }

  pub fn with_group_id(mut self, group_id: i64) -> ResourceGroup {
    self.group_id = Some(group_id);
    self
  }

  pub fn group_id(&self) -> Option<&i64> {
    self.group_id.as_ref()
  }

  pub fn reset_group_id(&mut self) {
    self.group_id = None;
  }

  pub fn set_group_name(&mut self, group_name: String) {
    self.group_name = Some(group_name);
  }

  pub fn with_group_name(mut self, group_name: String) -> ResourceGroup {
    self.group_name = Some(group_name);
    self
  }

  pub fn group_name(&self) -> Option<&String> {
    self.group_name.as_ref()
  }

  pub fn reset_group_name(&mut self) {
    self.group_name = None;
  }

  pub fn set_added(&mut self, added: i64) {
    self.added = Some(added);
  }

  pub fn with_added(mut self, added: i64) -> ResourceGroup {
    self.added = Some(added);
    self
  }

  pub fn added(&self) -> Option<&i64> {
    self.added.as_ref()
  }

  pub fn reset_added(&mut self) {
    self.added = None;
  }

  pub fn set_updated(&mut self, updated: i64) {
    self.updated = Some(updated);
  }

  pub fn with_updated(mut self, updated: i64) -> ResourceGroup {
    self.updated = Some(updated);
    self
  }

  pub fn updated(&self) -> Option<&i64> {
    self.updated.as_ref()
  }

  pub fn reset_updated(&mut self) {
    self.updated = None;
  }

}



