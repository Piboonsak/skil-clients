/* 
 * Endpoints
 *
 * Endpoints API for different services in SKIL
 *
 * OpenAPI spec version: 1.2.0-beta
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */


#[allow(unused_imports)]
use serde_json::Value;

#[derive(Debug, Serialize, Deserialize)]
pub struct CreateJobRequest {
  /// Compute resource ID
  #[serde(rename = "computeResourceId")]
  compute_resource_id: Option<i64>,
  /// Storage resource ID
  #[serde(rename = "storageResourceId")]
  storage_resource_id: Option<i64>,
  /// SKILSparkMain class arguments
  #[serde(rename = "skilSparkMainArgs")]
  skil_spark_main_args: Option<String>,
  /// Output file name
  #[serde(rename = "outputFileName")]
  output_file_name: Option<String>
}

impl CreateJobRequest {
  pub fn new() -> CreateJobRequest {
    CreateJobRequest {
      compute_resource_id: None,
      storage_resource_id: None,
      skil_spark_main_args: None,
      output_file_name: None
    }
  }

  pub fn set_compute_resource_id(&mut self, compute_resource_id: i64) {
    self.compute_resource_id = Some(compute_resource_id);
  }

  pub fn with_compute_resource_id(mut self, compute_resource_id: i64) -> CreateJobRequest {
    self.compute_resource_id = Some(compute_resource_id);
    self
  }

  pub fn compute_resource_id(&self) -> Option<&i64> {
    self.compute_resource_id.as_ref()
  }

  pub fn reset_compute_resource_id(&mut self) {
    self.compute_resource_id = None;
  }

  pub fn set_storage_resource_id(&mut self, storage_resource_id: i64) {
    self.storage_resource_id = Some(storage_resource_id);
  }

  pub fn with_storage_resource_id(mut self, storage_resource_id: i64) -> CreateJobRequest {
    self.storage_resource_id = Some(storage_resource_id);
    self
  }

  pub fn storage_resource_id(&self) -> Option<&i64> {
    self.storage_resource_id.as_ref()
  }

  pub fn reset_storage_resource_id(&mut self) {
    self.storage_resource_id = None;
  }

  pub fn set_skil_spark_main_args(&mut self, skil_spark_main_args: String) {
    self.skil_spark_main_args = Some(skil_spark_main_args);
  }

  pub fn with_skil_spark_main_args(mut self, skil_spark_main_args: String) -> CreateJobRequest {
    self.skil_spark_main_args = Some(skil_spark_main_args);
    self
  }

  pub fn skil_spark_main_args(&self) -> Option<&String> {
    self.skil_spark_main_args.as_ref()
  }

  pub fn reset_skil_spark_main_args(&mut self) {
    self.skil_spark_main_args = None;
  }

  pub fn set_output_file_name(&mut self, output_file_name: String) {
    self.output_file_name = Some(output_file_name);
  }

  pub fn with_output_file_name(mut self, output_file_name: String) -> CreateJobRequest {
    self.output_file_name = Some(output_file_name);
    self
  }

  pub fn output_file_name(&self) -> Option<&String> {
    self.output_file_name.as_ref()
  }

  pub fn reset_output_file_name(&mut self) {
    self.output_file_name = None;
  }

}


