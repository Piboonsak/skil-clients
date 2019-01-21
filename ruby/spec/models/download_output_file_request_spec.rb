=begin
#Endpoints

#Endpoints API for different services in SKIL

OpenAPI spec version: 1.2.0-rc1

Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.0-SNAPSHOT

=end

require 'spec_helper'
require 'json'
require 'date'

# Unit tests for SkilCient::DownloadOutputFileRequest
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'DownloadOutputFileRequest' do
  before do
    # run before each test
    @instance = SkilCient::DownloadOutputFileRequest.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of DownloadOutputFileRequest' do
    it 'should create an instance of DownloadOutputFileRequest' do
      expect(@instance).to be_instance_of(SkilCient::DownloadOutputFileRequest)
    end
  end
  describe 'test attribute "local_download_path"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end
