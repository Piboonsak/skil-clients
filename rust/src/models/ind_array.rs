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
pub struct IndArray {
  #[serde(rename = "array")]
  array: Option<String>,
  #[serde(rename = "shape")]
  shape: Option<Vec<i32>>,
  #[serde(rename = "ordering")]
  ordering: Option<String>,
  #[serde(rename = "data")]
  data: Option<Vec<f32>>,
  #[serde(rename = "dataType")]
  data_type: Option<String>
}

impl IndArray {
  pub fn new() -> IndArray {
    IndArray {
      array: None,
      shape: None,
      ordering: None,
      data: None,
      data_type: None
    }
  }

  pub fn set_array(&mut self, array: String) {
    self.array = Some(array);
  }

  pub fn with_array(mut self, array: String) -> IndArray {
    self.array = Some(array);
    self
  }

  pub fn array(&self) -> Option<&String> {
    self.array.as_ref()
  }

  pub fn reset_array(&mut self) {
    self.array = None;
  }

  pub fn set_shape(&mut self, shape: Vec<i32>) {
    self.shape = Some(shape);
  }

  pub fn with_shape(mut self, shape: Vec<i32>) -> IndArray {
    self.shape = Some(shape);
    self
  }

  pub fn shape(&self) -> Option<&Vec<i32>> {
    self.shape.as_ref()
  }

  pub fn reset_shape(&mut self) {
    self.shape = None;
  }

  pub fn set_ordering(&mut self, ordering: String) {
    self.ordering = Some(ordering);
  }

  pub fn with_ordering(mut self, ordering: String) -> IndArray {
    self.ordering = Some(ordering);
    self
  }

  pub fn ordering(&self) -> Option<&String> {
    self.ordering.as_ref()
  }

  pub fn reset_ordering(&mut self) {
    self.ordering = None;
  }

  pub fn set_data(&mut self, data: Vec<f32>) {
    self.data = Some(data);
  }

  pub fn with_data(mut self, data: Vec<f32>) -> IndArray {
    self.data = Some(data);
    self
  }

  pub fn data(&self) -> Option<&Vec<f32>> {
    self.data.as_ref()
  }

  pub fn reset_data(&mut self) {
    self.data = None;
  }

  pub fn set_data_type(&mut self, data_type: String) {
    self.data_type = Some(data_type);
  }

  pub fn with_data_type(mut self, data_type: String) -> IndArray {
    self.data_type = Some(data_type);
    self
  }

  pub fn data_type(&self) -> Option<&String> {
    self.data_type.as_ref()
  }

  pub fn reset_data_type(&mut self) {
    self.data_type = None;
  }

}



