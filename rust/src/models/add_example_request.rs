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
pub struct AddExampleRequest {
  /// the minibatch the examples are going to be associated with
  #[serde(rename = "minibatch")]
  minibatch: Option<::models::MinibatchEntity>,
  /// the size of the batch to create
  #[serde(rename = "batchSize")]
  batch_size: Option<i32>
}

impl AddExampleRequest {
  pub fn new() -> AddExampleRequest {
    AddExampleRequest {
      minibatch: None,
      batch_size: None
    }
  }

  pub fn set_minibatch(&mut self, minibatch: ::models::MinibatchEntity) {
    self.minibatch = Some(minibatch);
  }

  pub fn with_minibatch(mut self, minibatch: ::models::MinibatchEntity) -> AddExampleRequest {
    self.minibatch = Some(minibatch);
    self
  }

  pub fn minibatch(&self) -> Option<&::models::MinibatchEntity> {
    self.minibatch.as_ref()
  }

  pub fn reset_minibatch(&mut self) {
    self.minibatch = None;
  }

  pub fn set_batch_size(&mut self, batch_size: i32) {
    self.batch_size = Some(batch_size);
  }

  pub fn with_batch_size(mut self, batch_size: i32) -> AddExampleRequest {
    self.batch_size = Some(batch_size);
    self
  }

  pub fn batch_size(&self) -> Option<&i32> {
    self.batch_size.as_ref()
  }

  pub fn reset_batch_size(&mut self) {
    self.batch_size = None;
  }

}


