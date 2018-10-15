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
pub struct HdfsResourceDetails {
  /// ID of the resource
  #[serde(rename = "resourceId")]
  resource_id: Option<i64>,
  /// Resource type
  #[serde(rename = "type")]
  _type: Option<String>,
  /// Resource subtype
  #[serde(rename = "subType")]
  sub_type: Option<String>,
  /// Host of the node running the NameNode
  #[serde(rename = "nameNodeHost")]
  name_node_host: Option<String>,
  /// Port of the node running the NameNode
  #[serde(rename = "nameNodePort")]
  name_node_port: Option<String>
}

impl HdfsResourceDetails {
  pub fn new() -> HdfsResourceDetails {
    HdfsResourceDetails {
      resource_id: None,
      _type: None,
      sub_type: None,
      name_node_host: None,
      name_node_port: None
    }
  }

  pub fn set_resource_id(&mut self, resource_id: i64) {
    self.resource_id = Some(resource_id);
  }

  pub fn with_resource_id(mut self, resource_id: i64) -> HdfsResourceDetails {
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

  pub fn with__type(mut self, _type: String) -> HdfsResourceDetails {
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

  pub fn with_sub_type(mut self, sub_type: String) -> HdfsResourceDetails {
    self.sub_type = Some(sub_type);
    self
  }

  pub fn sub_type(&self) -> Option<&String> {
    self.sub_type.as_ref()
  }

  pub fn reset_sub_type(&mut self) {
    self.sub_type = None;
  }

  pub fn set_name_node_host(&mut self, name_node_host: String) {
    self.name_node_host = Some(name_node_host);
  }

  pub fn with_name_node_host(mut self, name_node_host: String) -> HdfsResourceDetails {
    self.name_node_host = Some(name_node_host);
    self
  }

  pub fn name_node_host(&self) -> Option<&String> {
    self.name_node_host.as_ref()
  }

  pub fn reset_name_node_host(&mut self) {
    self.name_node_host = None;
  }

  pub fn set_name_node_port(&mut self, name_node_port: String) {
    self.name_node_port = Some(name_node_port);
  }

  pub fn with_name_node_port(mut self, name_node_port: String) -> HdfsResourceDetails {
    self.name_node_port = Some(name_node_port);
    self
  }

  pub fn name_node_port(&self) -> Option<&String> {
    self.name_node_port.as_ref()
  }

  pub fn reset_name_node_port(&mut self) {
    self.name_node_port = None;
  }

}



