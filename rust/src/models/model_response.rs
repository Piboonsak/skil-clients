/* 
 * Endpoints
 *
 * Endpoints API for different services in SKIL
 *
 * OpenAPI spec version: 1.2.0-rc1
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */


#[allow(unused_imports)]
use serde_json::Value;

#[derive(Debug, Serialize, Deserialize)]
pub struct ModelResponse {
  #[serde(rename = "id")]
  id: Option<String>,
  #[serde(rename = "name")]
  name: Option<String>,
  #[serde(rename = "status")]
  status: Option<String>,
  #[serde(rename = "scale")]
  scale: Option<i32>,
  #[serde(rename = "uri")]
  uri: Option<Vec<String>>
}

impl ModelResponse {
  pub fn new() -> ModelResponse {
    ModelResponse {
      id: None,
      name: None,
      status: None,
      scale: None,
      uri: None
    }
  }

  pub fn set_id(&mut self, id: String) {
    self.id = Some(id);
  }

  pub fn with_id(mut self, id: String) -> ModelResponse {
    self.id = Some(id);
    self
  }

  pub fn id(&self) -> Option<&String> {
    self.id.as_ref()
  }

  pub fn reset_id(&mut self) {
    self.id = None;
  }

  pub fn set_name(&mut self, name: String) {
    self.name = Some(name);
  }

  pub fn with_name(mut self, name: String) -> ModelResponse {
    self.name = Some(name);
    self
  }

  pub fn name(&self) -> Option<&String> {
    self.name.as_ref()
  }

  pub fn reset_name(&mut self) {
    self.name = None;
  }

  pub fn set_status(&mut self, status: String) {
    self.status = Some(status);
  }

  pub fn with_status(mut self, status: String) -> ModelResponse {
    self.status = Some(status);
    self
  }

  pub fn status(&self) -> Option<&String> {
    self.status.as_ref()
  }

  pub fn reset_status(&mut self) {
    self.status = None;
  }

  pub fn set_scale(&mut self, scale: i32) {
    self.scale = Some(scale);
  }

  pub fn with_scale(mut self, scale: i32) -> ModelResponse {
    self.scale = Some(scale);
    self
  }

  pub fn scale(&self) -> Option<&i32> {
    self.scale.as_ref()
  }

  pub fn reset_scale(&mut self) {
    self.scale = None;
  }

  pub fn set_uri(&mut self, uri: Vec<String>) {
    self.uri = Some(uri);
  }

  pub fn with_uri(mut self, uri: Vec<String>) -> ModelResponse {
    self.uri = Some(uri);
    self
  }

  pub fn uri(&self) -> Option<&Vec<String>> {
    self.uri.as_ref()
  }

  pub fn reset_uri(&mut self) {
    self.uri = None;
  }

}



