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
pub struct User {
  #[serde(rename = "userId")]
  user_id: Option<String>,
  #[serde(rename = "userName")]
  user_name: Option<String>,
  #[serde(rename = "password")]
  password: Option<String>,
  /// User's role such as [user, admin, trial]
  #[serde(rename = "role")]
  role: Option<String>,
  /// User's scope such as [all, skil, zeppelin]
  #[serde(rename = "scope")]
  scope: Option<String>
}

impl User {
  pub fn new() -> User {
    User {
      user_id: None,
      user_name: None,
      password: None,
      role: None,
      scope: None
    }
  }

  pub fn set_user_id(&mut self, user_id: String) {
    self.user_id = Some(user_id);
  }

  pub fn with_user_id(mut self, user_id: String) -> User {
    self.user_id = Some(user_id);
    self
  }

  pub fn user_id(&self) -> Option<&String> {
    self.user_id.as_ref()
  }

  pub fn reset_user_id(&mut self) {
    self.user_id = None;
  }

  pub fn set_user_name(&mut self, user_name: String) {
    self.user_name = Some(user_name);
  }

  pub fn with_user_name(mut self, user_name: String) -> User {
    self.user_name = Some(user_name);
    self
  }

  pub fn user_name(&self) -> Option<&String> {
    self.user_name.as_ref()
  }

  pub fn reset_user_name(&mut self) {
    self.user_name = None;
  }

  pub fn set_password(&mut self, password: String) {
    self.password = Some(password);
  }

  pub fn with_password(mut self, password: String) -> User {
    self.password = Some(password);
    self
  }

  pub fn password(&self) -> Option<&String> {
    self.password.as_ref()
  }

  pub fn reset_password(&mut self) {
    self.password = None;
  }

  pub fn set_role(&mut self, role: String) {
    self.role = Some(role);
  }

  pub fn with_role(mut self, role: String) -> User {
    self.role = Some(role);
    self
  }

  pub fn role(&self) -> Option<&String> {
    self.role.as_ref()
  }

  pub fn reset_role(&mut self) {
    self.role = None;
  }

  pub fn set_scope(&mut self, scope: String) {
    self.scope = Some(scope);
  }

  pub fn with_scope(mut self, scope: String) -> User {
    self.scope = Some(scope);
    self
  }

  pub fn scope(&self) -> Option<&String> {
    self.scope.as_ref()
  }

  pub fn reset_scope(&mut self) {
    self.scope = None;
  }

}


