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
pub struct NearestNeighborsResult {
  #[serde(rename = "index")]
  index: Option<i32>,
  #[serde(rename = "distance")]
  distance: Option<f32>,
  #[serde(rename = "label")]
  label: Option<String>
}

impl NearestNeighborsResult {
  pub fn new() -> NearestNeighborsResult {
    NearestNeighborsResult {
      index: None,
      distance: None,
      label: None
    }
  }

  pub fn set_index(&mut self, index: i32) {
    self.index = Some(index);
  }

  pub fn with_index(mut self, index: i32) -> NearestNeighborsResult {
    self.index = Some(index);
    self
  }

  pub fn index(&self) -> Option<&i32> {
    self.index.as_ref()
  }

  pub fn reset_index(&mut self) {
    self.index = None;
  }

  pub fn set_distance(&mut self, distance: f32) {
    self.distance = Some(distance);
  }

  pub fn with_distance(mut self, distance: f32) -> NearestNeighborsResult {
    self.distance = Some(distance);
    self
  }

  pub fn distance(&self) -> Option<&f32> {
    self.distance.as_ref()
  }

  pub fn reset_distance(&mut self) {
    self.distance = None;
  }

  pub fn set_label(&mut self, label: String) {
    self.label = Some(label);
  }

  pub fn with_label(mut self, label: String) -> NearestNeighborsResult {
    self.label = Some(label);
    self
  }

  pub fn label(&self) -> Option<&String> {
    self.label.as_ref()
  }

  pub fn reset_label(&mut self) {
    self.label = None;
  }

}



