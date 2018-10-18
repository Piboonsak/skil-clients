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
pub struct BatchCsvRecord {
  #[serde(rename = "records")]
  records: Vec<::models::SingleCsvRecord>
}

impl BatchCsvRecord {
  pub fn new(records: Vec<::models::SingleCsvRecord>) -> BatchCsvRecord {
    BatchCsvRecord {
      records: records
    }
  }

  pub fn set_records(&mut self, records: Vec<::models::SingleCsvRecord>) {
    self.records = records;
  }

  pub fn with_records(mut self, records: Vec<::models::SingleCsvRecord>) -> BatchCsvRecord {
    self.records = records;
    self
  }

  pub fn records(&self) -> &Vec<::models::SingleCsvRecord> {
    &self.records
  }


}


