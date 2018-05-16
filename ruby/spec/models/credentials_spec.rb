=begin
#Predict

#Endpoints API for classification and other prediction services in SKIL

OpenAPI spec version: 1.1.0-beta

Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.3.1

=end

require 'spec_helper'
require 'json'
require 'date'

# Unit tests for SkilCient::Credentials
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'Credentials' do
  before do
    # run before each test
    @instance = SkilCient::Credentials.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of Credentials' do
    it 'should create an instance of Credentials' do
      expect(@instance).to be_instance_of(SkilCient::Credentials)
    end
  end
  describe 'test attribute "user_id"' do
    it 'should work' do
       # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "password"' do
    it 'should work' do
       # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end

