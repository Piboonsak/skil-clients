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
pub struct MinibatchEntity {
  /// GUID of mini batch
  #[serde(rename = "miniBatchId")]
  mini_batch_id: Option<String>,
  /// GUID of the evaluation
  #[serde(rename = "evalId")]
  eval_id: Option<String>,
  /// Eval version
  #[serde(rename = "evalVersion")]
  eval_version: Option<i32>,
  /// Batch version
  #[serde(rename = "batchVersion")]
  batch_version: Option<i32>
}

impl MinibatchEntity {
  pub fn new() -> MinibatchEntity {
    MinibatchEntity {
      mini_batch_id: None,
      eval_id: None,
      eval_version: None,
      batch_version: None
    }
  }

  pub fn set_mini_batch_id(&mut self, mini_batch_id: String) {
    self.mini_batch_id = Some(mini_batch_id);
  }

  pub fn with_mini_batch_id(mut self, mini_batch_id: String) -> MinibatchEntity {
    self.mini_batch_id = Some(mini_batch_id);
    self
  }

  pub fn mini_batch_id(&self) -> Option<&String> {
    self.mini_batch_id.as_ref()
  }

  pub fn reset_mini_batch_id(&mut self) {
    self.mini_batch_id = None;
  }

  pub fn set_eval_id(&mut self, eval_id: String) {
    self.eval_id = Some(eval_id);
  }

  pub fn with_eval_id(mut self, eval_id: String) -> MinibatchEntity {
    self.eval_id = Some(eval_id);
    self
  }

  pub fn eval_id(&self) -> Option<&String> {
    self.eval_id.as_ref()
  }

  pub fn reset_eval_id(&mut self) {
    self.eval_id = None;
  }

  pub fn set_eval_version(&mut self, eval_version: i32) {
    self.eval_version = Some(eval_version);
  }

  pub fn with_eval_version(mut self, eval_version: i32) -> MinibatchEntity {
    self.eval_version = Some(eval_version);
    self
  }

  pub fn eval_version(&self) -> Option<&i32> {
    self.eval_version.as_ref()
  }

  pub fn reset_eval_version(&mut self) {
    self.eval_version = None;
  }

  pub fn set_batch_version(&mut self, batch_version: i32) {
    self.batch_version = Some(batch_version);
  }

  pub fn with_batch_version(mut self, batch_version: i32) -> MinibatchEntity {
    self.batch_version = Some(batch_version);
    self
  }

  pub fn batch_version(&self) -> Option<&i32> {
    self.batch_version.as_ref()
  }

  pub fn reset_batch_version(&mut self) {
    self.batch_version = None;
  }

}



