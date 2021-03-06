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
pub struct ExampleEntity {
  /// the GUID of the example
  #[serde(rename = "exampleId")]
  example_id: Option<String>,
  /// Example version
  #[serde(rename = "exampleVersion")]
  example_version: Option<i32>,
  /// Row Number
  #[serde(rename = "rowNumber")]
  row_number: Option<i32>,
  /// when the example was created
  #[serde(rename = "created")]
  created: Option<i64>,
  /// The GUID of the minibatch
  #[serde(rename = "miniBatchId")]
  mini_batch_id: Option<String>,
  /// minibatch version
  #[serde(rename = "miniBatchVersion")]
  mini_batch_version: Option<i32>
}

impl ExampleEntity {
  pub fn new() -> ExampleEntity {
    ExampleEntity {
      example_id: None,
      example_version: None,
      row_number: None,
      created: None,
      mini_batch_id: None,
      mini_batch_version: None
    }
  }

  pub fn set_example_id(&mut self, example_id: String) {
    self.example_id = Some(example_id);
  }

  pub fn with_example_id(mut self, example_id: String) -> ExampleEntity {
    self.example_id = Some(example_id);
    self
  }

  pub fn example_id(&self) -> Option<&String> {
    self.example_id.as_ref()
  }

  pub fn reset_example_id(&mut self) {
    self.example_id = None;
  }

  pub fn set_example_version(&mut self, example_version: i32) {
    self.example_version = Some(example_version);
  }

  pub fn with_example_version(mut self, example_version: i32) -> ExampleEntity {
    self.example_version = Some(example_version);
    self
  }

  pub fn example_version(&self) -> Option<&i32> {
    self.example_version.as_ref()
  }

  pub fn reset_example_version(&mut self) {
    self.example_version = None;
  }

  pub fn set_row_number(&mut self, row_number: i32) {
    self.row_number = Some(row_number);
  }

  pub fn with_row_number(mut self, row_number: i32) -> ExampleEntity {
    self.row_number = Some(row_number);
    self
  }

  pub fn row_number(&self) -> Option<&i32> {
    self.row_number.as_ref()
  }

  pub fn reset_row_number(&mut self) {
    self.row_number = None;
  }

  pub fn set_created(&mut self, created: i64) {
    self.created = Some(created);
  }

  pub fn with_created(mut self, created: i64) -> ExampleEntity {
    self.created = Some(created);
    self
  }

  pub fn created(&self) -> Option<&i64> {
    self.created.as_ref()
  }

  pub fn reset_created(&mut self) {
    self.created = None;
  }

  pub fn set_mini_batch_id(&mut self, mini_batch_id: String) {
    self.mini_batch_id = Some(mini_batch_id);
  }

  pub fn with_mini_batch_id(mut self, mini_batch_id: String) -> ExampleEntity {
    self.mini_batch_id = Some(mini_batch_id);
    self
  }

  pub fn mini_batch_id(&self) -> Option<&String> {
    self.mini_batch_id.as_ref()
  }

  pub fn reset_mini_batch_id(&mut self) {
    self.mini_batch_id = None;
  }

  pub fn set_mini_batch_version(&mut self, mini_batch_version: i32) {
    self.mini_batch_version = Some(mini_batch_version);
  }

  pub fn with_mini_batch_version(mut self, mini_batch_version: i32) -> ExampleEntity {
    self.mini_batch_version = Some(mini_batch_version);
    self
  }

  pub fn mini_batch_version(&self) -> Option<&i32> {
    self.mini_batch_version.as_ref()
  }

  pub fn reset_mini_batch_version(&mut self) {
    self.mini_batch_version = None;
  }

}



