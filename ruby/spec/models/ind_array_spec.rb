=begin
#Endpoints

#Endpoints API for different services in SKIL

OpenAPI spec version: 1.1.0-beta

Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.0-SNAPSHOT

=end

require 'spec_helper'
require 'json'
require 'date'

# Unit tests for SkilCient::INDArray
# Automatically generated by swagger-codegen (github.com/swagger-api/swagger-codegen)
# Please update as you see appropriate
describe 'INDArray' do
  before do
    # run before each test
    @instance = SkilCient::INDArray.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of INDArray' do
    it 'should create an instance of INDArray' do
      expect(@instance).to be_instance_of(SkilCient::INDArray)
    end
  end
  describe 'test attribute "array"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "shape"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "ordering"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
      # validator = Petstore::EnumTest::EnumAttributeValidator.new('String', ["f", "c"])
      # validator.allowable_values.each do |value|
      #   expect { @instance.ordering = value }.not_to raise_error
      # end
    end
  end

  describe 'test attribute "data"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "data_type"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
      # validator = Petstore::EnumTest::EnumAttributeValidator.new('String', ["INT8", "UINT8", "INT16", "FLOAT16"])
      # validator.allowable_values.each do |value|
      #   expect { @instance.data_type = value }.not_to raise_error
      # end
    end
  end

end
