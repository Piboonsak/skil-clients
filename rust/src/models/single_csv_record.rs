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
pub struct SingleCsvRecord {
  #[serde(rename = "values")]
  values: Vec<String>
}

impl SingleCsvRecord {
  pub fn new(values: Vec<String>) -> SingleCsvRecord {
    SingleCsvRecord {
      values: values
    }
  }

  pub fn set_values(&mut self, values: Vec<String>) {
    self.values = values;
  }

  pub fn with_values(mut self, values: Vec<String>) -> SingleCsvRecord {
    self.values = values;
    self
  }

  pub fn values(&self) -> &Vec<String> {
    &self.values
  }


}



