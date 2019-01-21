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
pub struct ModelInstanceEntity {
  /// The model URI
  #[serde(rename = "uri")]
  uri: Option<String>,
  /// The json string for the ETL (Extract, Transform and Load)
  #[serde(rename = "etlJson")]
  etl_json: Option<String>,
  /// GUID of the model.
  #[serde(rename = "modelId")]
  model_id: Option<String>,
  /// Comma-separated labels string for the model
  #[serde(rename = "modelLabels")]
  model_labels: Option<String>,
  /// Format for the model input
  #[serde(rename = "inputFormats")]
  input_formats: Option<String>,
  /// When the model was created
  #[serde(rename = "created")]
  created: Option<i64>,
  /// JSON string of the associated Zeppelin Notebook
  #[serde(rename = "notebookJson")]
  notebook_json: Option<String>,
  /// GUID for the model evaluation
  #[serde(rename = "evalId")]
  eval_id: Option<String>,
  /// Model's name
  #[serde(rename = "modelName")]
  model_name: Option<String>,
  /// Original GUID of the model (used for maintaining revisions of a particular model)
  #[serde(rename = "originalModelId")]
  original_model_id: Option<String>,
  /// Model version
  #[serde(rename = "modelVersion")]
  model_version: Option<String>,
  /// GUID of the Experiment which is associated with the model.
  #[serde(rename = "experimentId")]
  experiment_id: Option<String>
}

impl ModelInstanceEntity {
  pub fn new() -> ModelInstanceEntity {
    ModelInstanceEntity {
      uri: None,
      etl_json: None,
      model_id: None,
      model_labels: None,
      input_formats: None,
      created: None,
      notebook_json: None,
      eval_id: None,
      model_name: None,
      original_model_id: None,
      model_version: None,
      experiment_id: None
    }
  }

  pub fn set_uri(&mut self, uri: String) {
    self.uri = Some(uri);
  }

  pub fn with_uri(mut self, uri: String) -> ModelInstanceEntity {
    self.uri = Some(uri);
    self
  }

  pub fn uri(&self) -> Option<&String> {
    self.uri.as_ref()
  }

  pub fn reset_uri(&mut self) {
    self.uri = None;
  }

  pub fn set_etl_json(&mut self, etl_json: String) {
    self.etl_json = Some(etl_json);
  }

  pub fn with_etl_json(mut self, etl_json: String) -> ModelInstanceEntity {
    self.etl_json = Some(etl_json);
    self
  }

  pub fn etl_json(&self) -> Option<&String> {
    self.etl_json.as_ref()
  }

  pub fn reset_etl_json(&mut self) {
    self.etl_json = None;
  }

  pub fn set_model_id(&mut self, model_id: String) {
    self.model_id = Some(model_id);
  }

  pub fn with_model_id(mut self, model_id: String) -> ModelInstanceEntity {
    self.model_id = Some(model_id);
    self
  }

  pub fn model_id(&self) -> Option<&String> {
    self.model_id.as_ref()
  }

  pub fn reset_model_id(&mut self) {
    self.model_id = None;
  }

  pub fn set_model_labels(&mut self, model_labels: String) {
    self.model_labels = Some(model_labels);
  }

  pub fn with_model_labels(mut self, model_labels: String) -> ModelInstanceEntity {
    self.model_labels = Some(model_labels);
    self
  }

  pub fn model_labels(&self) -> Option<&String> {
    self.model_labels.as_ref()
  }

  pub fn reset_model_labels(&mut self) {
    self.model_labels = None;
  }

  pub fn set_input_formats(&mut self, input_formats: String) {
    self.input_formats = Some(input_formats);
  }

  pub fn with_input_formats(mut self, input_formats: String) -> ModelInstanceEntity {
    self.input_formats = Some(input_formats);
    self
  }

  pub fn input_formats(&self) -> Option<&String> {
    self.input_formats.as_ref()
  }

  pub fn reset_input_formats(&mut self) {
    self.input_formats = None;
  }

  pub fn set_created(&mut self, created: i64) {
    self.created = Some(created);
  }

  pub fn with_created(mut self, created: i64) -> ModelInstanceEntity {
    self.created = Some(created);
    self
  }

  pub fn created(&self) -> Option<&i64> {
    self.created.as_ref()
  }

  pub fn reset_created(&mut self) {
    self.created = None;
  }

  pub fn set_notebook_json(&mut self, notebook_json: String) {
    self.notebook_json = Some(notebook_json);
  }

  pub fn with_notebook_json(mut self, notebook_json: String) -> ModelInstanceEntity {
    self.notebook_json = Some(notebook_json);
    self
  }

  pub fn notebook_json(&self) -> Option<&String> {
    self.notebook_json.as_ref()
  }

  pub fn reset_notebook_json(&mut self) {
    self.notebook_json = None;
  }

  pub fn set_eval_id(&mut self, eval_id: String) {
    self.eval_id = Some(eval_id);
  }

  pub fn with_eval_id(mut self, eval_id: String) -> ModelInstanceEntity {
    self.eval_id = Some(eval_id);
    self
  }

  pub fn eval_id(&self) -> Option<&String> {
    self.eval_id.as_ref()
  }

  pub fn reset_eval_id(&mut self) {
    self.eval_id = None;
  }

  pub fn set_model_name(&mut self, model_name: String) {
    self.model_name = Some(model_name);
  }

  pub fn with_model_name(mut self, model_name: String) -> ModelInstanceEntity {
    self.model_name = Some(model_name);
    self
  }

  pub fn model_name(&self) -> Option<&String> {
    self.model_name.as_ref()
  }

  pub fn reset_model_name(&mut self) {
    self.model_name = None;
  }

  pub fn set_original_model_id(&mut self, original_model_id: String) {
    self.original_model_id = Some(original_model_id);
  }

  pub fn with_original_model_id(mut self, original_model_id: String) -> ModelInstanceEntity {
    self.original_model_id = Some(original_model_id);
    self
  }

  pub fn original_model_id(&self) -> Option<&String> {
    self.original_model_id.as_ref()
  }

  pub fn reset_original_model_id(&mut self) {
    self.original_model_id = None;
  }

  pub fn set_model_version(&mut self, model_version: String) {
    self.model_version = Some(model_version);
  }

  pub fn with_model_version(mut self, model_version: String) -> ModelInstanceEntity {
    self.model_version = Some(model_version);
    self
  }

  pub fn model_version(&self) -> Option<&String> {
    self.model_version.as_ref()
  }

  pub fn reset_model_version(&mut self) {
    self.model_version = None;
  }

  pub fn set_experiment_id(&mut self, experiment_id: String) {
    self.experiment_id = Some(experiment_id);
  }

  pub fn with_experiment_id(mut self, experiment_id: String) -> ModelInstanceEntity {
    self.experiment_id = Some(experiment_id);
    self
  }

  pub fn experiment_id(&self) -> Option<&String> {
    self.experiment_id.as_ref()
  }

  pub fn reset_experiment_id(&mut self) {
    self.experiment_id = None;
  }

}



