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
pub struct BatchCsvRecord {
  #[serde(rename = "records")]
  records: Option<Vec<::models::SingleCsvRecord>>
}

impl BatchCsvRecord {
  pub fn new() -> BatchCsvRecord {
    BatchCsvRecord {
      records: None
    }
  }

  pub fn set_records(&mut self, records: Vec<::models::SingleCsvRecord>) {
    self.records = Some(records);
  }

  pub fn with_records(mut self, records: Vec<::models::SingleCsvRecord>) -> BatchCsvRecord {
    self.records = Some(records);
    self
  }

  pub fn records(&self) -> Option<&Vec<::models::SingleCsvRecord>> {
    self.records.as_ref()
  }

  pub fn reset_records(&mut self) {
    self.records = None;
  }

}



