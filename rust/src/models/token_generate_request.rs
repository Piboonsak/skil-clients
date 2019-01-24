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
pub struct TokenGenerateRequest {
  #[serde(rename = "userId")]
  user_id: Option<String>,
  #[serde(rename = "expiry")]
  expiry: Option<i64>
}

impl TokenGenerateRequest {
  pub fn new() -> TokenGenerateRequest {
    TokenGenerateRequest {
      user_id: None,
      expiry: None
    }
  }

  pub fn set_user_id(&mut self, user_id: String) {
    self.user_id = Some(user_id);
  }

  pub fn with_user_id(mut self, user_id: String) -> TokenGenerateRequest {
    self.user_id = Some(user_id);
    self
  }

  pub fn user_id(&self) -> Option<&String> {
    self.user_id.as_ref()
  }

  pub fn reset_user_id(&mut self) {
    self.user_id = None;
  }

  pub fn set_expiry(&mut self, expiry: i64) {
    self.expiry = Some(expiry);
  }

  pub fn with_expiry(mut self, expiry: i64) -> TokenGenerateRequest {
    self.expiry = Some(expiry);
    self
  }

  pub fn expiry(&self) -> Option<&i64> {
    self.expiry.as_ref()
  }

  pub fn reset_expiry(&mut self) {
    self.expiry = None;
  }

}


