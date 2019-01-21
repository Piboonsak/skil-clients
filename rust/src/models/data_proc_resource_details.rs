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
pub struct DataProcResourceDetails {
  #[serde(rename = "@class")]
  class: Option<String>,
  /// ID of the resource
  #[serde(rename = "resourceId")]
  resource_id: Option<i64>,
  /// Resource type
  #[serde(rename = "type")]
  _type: Option<String>,
  /// Resource subtype
  #[serde(rename = "subType")]
  sub_type: Option<String>,
  /// Project ID
  #[serde(rename = "projectId")]
  project_id: Option<String>,
  /// DataProc region
  #[serde(rename = "region")]
  region: Option<String>,
  /// Name of the spark cluster
  #[serde(rename = "sparkClusterName")]
  spark_cluster_name: Option<String>
}

impl DataProcResourceDetails {
  pub fn new() -> DataProcResourceDetails {
    DataProcResourceDetails {
      class: None,
      resource_id: None,
      _type: None,
      sub_type: None,
      project_id: None,
      region: None,
      spark_cluster_name: None
    }
  }

  pub fn set_class(&mut self, class: String) {
    self.class = Some(class);
  }

  pub fn with_class(mut self, class: String) -> DataProcResourceDetails {
    self.class = Some(class);
    self
  }

  pub fn class(&self) -> Option<&String> {
    self.class.as_ref()
  }

  pub fn reset_class(&mut self) {
    self.class = None;
  }

  pub fn set_resource_id(&mut self, resource_id: i64) {
    self.resource_id = Some(resource_id);
  }

  pub fn with_resource_id(mut self, resource_id: i64) -> DataProcResourceDetails {
    self.resource_id = Some(resource_id);
    self
  }

  pub fn resource_id(&self) -> Option<&i64> {
    self.resource_id.as_ref()
  }

  pub fn reset_resource_id(&mut self) {
    self.resource_id = None;
  }

  pub fn set__type(&mut self, _type: String) {
    self._type = Some(_type);
  }

  pub fn with__type(mut self, _type: String) -> DataProcResourceDetails {
    self._type = Some(_type);
    self
  }

  pub fn _type(&self) -> Option<&String> {
    self._type.as_ref()
  }

  pub fn reset__type(&mut self) {
    self._type = None;
  }

  pub fn set_sub_type(&mut self, sub_type: String) {
    self.sub_type = Some(sub_type);
  }

  pub fn with_sub_type(mut self, sub_type: String) -> DataProcResourceDetails {
    self.sub_type = Some(sub_type);
    self
  }

  pub fn sub_type(&self) -> Option<&String> {
    self.sub_type.as_ref()
  }

  pub fn reset_sub_type(&mut self) {
    self.sub_type = None;
  }

  pub fn set_project_id(&mut self, project_id: String) {
    self.project_id = Some(project_id);
  }

  pub fn with_project_id(mut self, project_id: String) -> DataProcResourceDetails {
    self.project_id = Some(project_id);
    self
  }

  pub fn project_id(&self) -> Option<&String> {
    self.project_id.as_ref()
  }

  pub fn reset_project_id(&mut self) {
    self.project_id = None;
  }

  pub fn set_region(&mut self, region: String) {
    self.region = Some(region);
  }

  pub fn with_region(mut self, region: String) -> DataProcResourceDetails {
    self.region = Some(region);
    self
  }

  pub fn region(&self) -> Option<&String> {
    self.region.as_ref()
  }

  pub fn reset_region(&mut self) {
    self.region = None;
  }

  pub fn set_spark_cluster_name(&mut self, spark_cluster_name: String) {
    self.spark_cluster_name = Some(spark_cluster_name);
  }

  pub fn with_spark_cluster_name(mut self, spark_cluster_name: String) -> DataProcResourceDetails {
    self.spark_cluster_name = Some(spark_cluster_name);
    self
  }

  pub fn spark_cluster_name(&self) -> Option<&String> {
    self.spark_cluster_name.as_ref()
  }

  pub fn reset_spark_cluster_name(&mut self) {
    self.spark_cluster_name = None;
  }

}



