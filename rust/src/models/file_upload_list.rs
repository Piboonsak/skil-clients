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
pub struct FileUploadList {
  #[serde(rename = "fileUploadResponseList")]
  file_upload_response_list: Option<Vec<::models::FileUpload>>
}

impl FileUploadList {
  pub fn new() -> FileUploadList {
    FileUploadList {
      file_upload_response_list: None
    }
  }

  pub fn set_file_upload_response_list(&mut self, file_upload_response_list: Vec<::models::FileUpload>) {
    self.file_upload_response_list = Some(file_upload_response_list);
  }

  pub fn with_file_upload_response_list(mut self, file_upload_response_list: Vec<::models::FileUpload>) -> FileUploadList {
    self.file_upload_response_list = Some(file_upload_response_list);
    self
  }

  pub fn file_upload_response_list(&self) -> Option<&Vec<::models::FileUpload>> {
    self.file_upload_response_list.as_ref()
  }

  pub fn reset_file_upload_response_list(&mut self) {
    self.file_upload_response_list = None;
  }

}



