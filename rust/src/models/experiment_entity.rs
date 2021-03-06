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
pub struct ExperimentEntity {
  /// GUID of the best selected model in an experiment
  #[serde(rename = "bestModelId")]
  best_model_id: Option<String>,
  /// Input data URI
  #[serde(rename = "inputDataUri")]
  input_data_uri: Option<String>,
  /// GUID of the experiment
  #[serde(rename = "experimentId")]
  experiment_id: Option<String>,
  /// Experiment's name
  #[serde(rename = "experimentName")]
  experiment_name: Option<String>,
  /// Experiment's description
  #[serde(rename = "experimentDescription")]
  experiment_description: Option<String>,
  /// The associated Zeppelin notebook JSON string
  #[serde(rename = "notebookJson")]
  notebook_json: Option<String>,
  /// URL of the associated Zeppelin notebook
  #[serde(rename = "notebookUrl")]
  notebook_url: Option<String>,
  /// Zeppelin ID
  #[serde(rename = "zeppelinId")]
  zeppelin_id: Option<String>,
  /// Id of the model history / workspace
  #[serde(rename = "modelHistoryId")]
  model_history_id: Option<String>,
  /// Indicates the time when experiment was last updated
  #[serde(rename = "lastUpdated")]
  last_updated: Option<i64>
}

impl ExperimentEntity {
  pub fn new() -> ExperimentEntity {
    ExperimentEntity {
      best_model_id: None,
      input_data_uri: None,
      experiment_id: None,
      experiment_name: None,
      experiment_description: None,
      notebook_json: None,
      notebook_url: None,
      zeppelin_id: None,
      model_history_id: None,
      last_updated: None
    }
  }

  pub fn set_best_model_id(&mut self, best_model_id: String) {
    self.best_model_id = Some(best_model_id);
  }

  pub fn with_best_model_id(mut self, best_model_id: String) -> ExperimentEntity {
    self.best_model_id = Some(best_model_id);
    self
  }

  pub fn best_model_id(&self) -> Option<&String> {
    self.best_model_id.as_ref()
  }

  pub fn reset_best_model_id(&mut self) {
    self.best_model_id = None;
  }

  pub fn set_input_data_uri(&mut self, input_data_uri: String) {
    self.input_data_uri = Some(input_data_uri);
  }

  pub fn with_input_data_uri(mut self, input_data_uri: String) -> ExperimentEntity {
    self.input_data_uri = Some(input_data_uri);
    self
  }

  pub fn input_data_uri(&self) -> Option<&String> {
    self.input_data_uri.as_ref()
  }

  pub fn reset_input_data_uri(&mut self) {
    self.input_data_uri = None;
  }

  pub fn set_experiment_id(&mut self, experiment_id: String) {
    self.experiment_id = Some(experiment_id);
  }

  pub fn with_experiment_id(mut self, experiment_id: String) -> ExperimentEntity {
    self.experiment_id = Some(experiment_id);
    self
  }

  pub fn experiment_id(&self) -> Option<&String> {
    self.experiment_id.as_ref()
  }

  pub fn reset_experiment_id(&mut self) {
    self.experiment_id = None;
  }

  pub fn set_experiment_name(&mut self, experiment_name: String) {
    self.experiment_name = Some(experiment_name);
  }

  pub fn with_experiment_name(mut self, experiment_name: String) -> ExperimentEntity {
    self.experiment_name = Some(experiment_name);
    self
  }

  pub fn experiment_name(&self) -> Option<&String> {
    self.experiment_name.as_ref()
  }

  pub fn reset_experiment_name(&mut self) {
    self.experiment_name = None;
  }

  pub fn set_experiment_description(&mut self, experiment_description: String) {
    self.experiment_description = Some(experiment_description);
  }

  pub fn with_experiment_description(mut self, experiment_description: String) -> ExperimentEntity {
    self.experiment_description = Some(experiment_description);
    self
  }

  pub fn experiment_description(&self) -> Option<&String> {
    self.experiment_description.as_ref()
  }

  pub fn reset_experiment_description(&mut self) {
    self.experiment_description = None;
  }

  pub fn set_notebook_json(&mut self, notebook_json: String) {
    self.notebook_json = Some(notebook_json);
  }

  pub fn with_notebook_json(mut self, notebook_json: String) -> ExperimentEntity {
    self.notebook_json = Some(notebook_json);
    self
  }

  pub fn notebook_json(&self) -> Option<&String> {
    self.notebook_json.as_ref()
  }

  pub fn reset_notebook_json(&mut self) {
    self.notebook_json = None;
  }

  pub fn set_notebook_url(&mut self, notebook_url: String) {
    self.notebook_url = Some(notebook_url);
  }

  pub fn with_notebook_url(mut self, notebook_url: String) -> ExperimentEntity {
    self.notebook_url = Some(notebook_url);
    self
  }

  pub fn notebook_url(&self) -> Option<&String> {
    self.notebook_url.as_ref()
  }

  pub fn reset_notebook_url(&mut self) {
    self.notebook_url = None;
  }

  pub fn set_zeppelin_id(&mut self, zeppelin_id: String) {
    self.zeppelin_id = Some(zeppelin_id);
  }

  pub fn with_zeppelin_id(mut self, zeppelin_id: String) -> ExperimentEntity {
    self.zeppelin_id = Some(zeppelin_id);
    self
  }

  pub fn zeppelin_id(&self) -> Option<&String> {
    self.zeppelin_id.as_ref()
  }

  pub fn reset_zeppelin_id(&mut self) {
    self.zeppelin_id = None;
  }

  pub fn set_model_history_id(&mut self, model_history_id: String) {
    self.model_history_id = Some(model_history_id);
  }

  pub fn with_model_history_id(mut self, model_history_id: String) -> ExperimentEntity {
    self.model_history_id = Some(model_history_id);
    self
  }

  pub fn model_history_id(&self) -> Option<&String> {
    self.model_history_id.as_ref()
  }

  pub fn reset_model_history_id(&mut self) {
    self.model_history_id = None;
  }

  pub fn set_last_updated(&mut self, last_updated: i64) {
    self.last_updated = Some(last_updated);
  }

  pub fn with_last_updated(mut self, last_updated: i64) -> ExperimentEntity {
    self.last_updated = Some(last_updated);
    self
  }

  pub fn last_updated(&self) -> Option<&i64> {
    self.last_updated.as_ref()
  }

  pub fn reset_last_updated(&mut self) {
    self.last_updated = None;
  }

}



