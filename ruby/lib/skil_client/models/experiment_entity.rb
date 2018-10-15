=begin
#Endpoints

#Endpoints API for different services in SKIL

OpenAPI spec version: 1.1.0-beta

Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.0-SNAPSHOT

=end

require 'date'

module SkilCient
  class ExperimentEntity
    # GUID of the best selected model in an experiment
    attr_accessor :best_model_id

    # Input data URI
    attr_accessor :input_data_uri

    # GUID of the experiment
    attr_accessor :experiment_id

    # Experiment's name
    attr_accessor :experiment_name

    # Experiment's description
    attr_accessor :experiment_description

    # The associated Zeppelin notebook JSON string
    attr_accessor :notebook_json

    # URL of the associated Zeppelin notebook
    attr_accessor :notebook_url

    # Zeppelin ID
    attr_accessor :zeppelin_id

    # Id of the model history / workspace
    attr_accessor :model_history_id

    # Indicates the time when experiment was last updated
    attr_accessor :last_updated

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'best_model_id' => :'bestModelId',
        :'input_data_uri' => :'inputDataUri',
        :'experiment_id' => :'experimentId',
        :'experiment_name' => :'experimentName',
        :'experiment_description' => :'experimentDescription',
        :'notebook_json' => :'notebookJson',
        :'notebook_url' => :'notebookUrl',
        :'zeppelin_id' => :'zeppelinId',
        :'model_history_id' => :'modelHistoryId',
        :'last_updated' => :'lastUpdated'
      }
    end

    # Attribute type mapping.
    def self.swagger_types
      {
        :'best_model_id' => :'String',
        :'input_data_uri' => :'String',
        :'experiment_id' => :'String',
        :'experiment_name' => :'String',
        :'experiment_description' => :'String',
        :'notebook_json' => :'String',
        :'notebook_url' => :'String',
        :'zeppelin_id' => :'String',
        :'model_history_id' => :'String',
        :'last_updated' => :'Integer'
      }
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      return unless attributes.is_a?(Hash)

      # convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h| h[k.to_sym] = v }

      if attributes.has_key?(:'bestModelId')
        self.best_model_id = attributes[:'bestModelId']
      end

      if attributes.has_key?(:'inputDataUri')
        self.input_data_uri = attributes[:'inputDataUri']
      end

      if attributes.has_key?(:'experimentId')
        self.experiment_id = attributes[:'experimentId']
      end

      if attributes.has_key?(:'experimentName')
        self.experiment_name = attributes[:'experimentName']
      end

      if attributes.has_key?(:'experimentDescription')
        self.experiment_description = attributes[:'experimentDescription']
      end

      if attributes.has_key?(:'notebookJson')
        self.notebook_json = attributes[:'notebookJson']
      end

      if attributes.has_key?(:'notebookUrl')
        self.notebook_url = attributes[:'notebookUrl']
      end

      if attributes.has_key?(:'zeppelinId')
        self.zeppelin_id = attributes[:'zeppelinId']
      end

      if attributes.has_key?(:'modelHistoryId')
        self.model_history_id = attributes[:'modelHistoryId']
      end

      if attributes.has_key?(:'lastUpdated')
        self.last_updated = attributes[:'lastUpdated']
      end
    end

    # Show invalid properties with the reasons. Usually used together with valid?
    # @return Array for valid properties with the reasons
    def list_invalid_properties
      invalid_properties = Array.new
      invalid_properties
    end

    # Check to see if the all the properties in the model are valid
    # @return true if the model is valid
    def valid?
      true
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          best_model_id == o.best_model_id &&
          input_data_uri == o.input_data_uri &&
          experiment_id == o.experiment_id &&
          experiment_name == o.experiment_name &&
          experiment_description == o.experiment_description &&
          notebook_json == o.notebook_json &&
          notebook_url == o.notebook_url &&
          zeppelin_id == o.zeppelin_id &&
          model_history_id == o.model_history_id &&
          last_updated == o.last_updated
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Fixnum] Hash code
    def hash
      [best_model_id, input_data_uri, experiment_id, experiment_name, experiment_description, notebook_json, notebook_url, zeppelin_id, model_history_id, last_updated].hash
    end

    # Builds the object from hash
    # @param [Hash] attributes Model attributes in the form of hash
    # @return [Object] Returns the model itself
    def build_from_hash(attributes)
      return nil unless attributes.is_a?(Hash)
      self.class.swagger_types.each_pair do |key, type|
        if type =~ /\AArray<(.*)>/i
          # check to ensure the input is an array given that the the attribute
          # is documented as an array but the input is not
          if attributes[self.class.attribute_map[key]].is_a?(Array)
            self.send("#{key}=", attributes[self.class.attribute_map[key]].map { |v| _deserialize($1, v) })
          end
        elsif !attributes[self.class.attribute_map[key]].nil?
          self.send("#{key}=", _deserialize(type, attributes[self.class.attribute_map[key]]))
        end # or else data not found in attributes(hash), not an issue as the data can be optional
      end

      self
    end

    # Deserializes the data based on type
    # @param string type Data type
    # @param string value Value to be deserialized
    # @return [Object] Deserialized data
    def _deserialize(type, value)
      case type.to_sym
      when :DateTime
        DateTime.parse(value)
      when :Date
        Date.parse(value)
      when :String
        value.to_s
      when :Integer
        value.to_i
      when :Float
        value.to_f
      when :BOOLEAN
        if value.to_s =~ /\A(true|t|yes|y|1)\z/i
          true
        else
          false
        end
      when :Object
        # generic object (usually a Hash), return directly
        value
      when /\AArray<(?<inner_type>.+)>\z/
        inner_type = Regexp.last_match[:inner_type]
        value.map { |v| _deserialize(inner_type, v) }
      when /\AHash<(?<k_type>.+?), (?<v_type>.+)>\z/
        k_type = Regexp.last_match[:k_type]
        v_type = Regexp.last_match[:v_type]
        {}.tap do |hash|
          value.each do |k, v|
            hash[_deserialize(k_type, k)] = _deserialize(v_type, v)
          end
        end
      else # model
        temp_model = SkilCient.const_get(type).new
        temp_model.build_from_hash(value)
      end
    end

    # Returns the string representation of the object
    # @return [String] String presentation of the object
    def to_s
      to_hash.to_s
    end

    # to_body is an alias to to_hash (backward compatibility)
    # @return [Hash] Returns the object in the form of hash
    def to_body
      to_hash
    end

    # Returns the object in the form of hash
    # @return [Hash] Returns the object in the form of hash
    def to_hash
      hash = {}
      self.class.attribute_map.each_pair do |attr, param|
        value = self.send(attr)
        next if value.nil?
        hash[param] = _to_hash(value)
      end
      hash
    end

    # Outputs non-array value in the form of hash
    # For object, use to_hash. Otherwise, just return the value
    # @param [Object] value Any valid value
    # @return [Hash] Returns the value in the form of hash
    def _to_hash(value)
      if value.is_a?(Array)
        value.compact.map { |v| _to_hash(v) }
      elsif value.is_a?(Hash)
        {}.tap do |hash|
          value.each { |k, v| hash[k] = _to_hash(v) }
        end
      elsif value.respond_to? :to_hash
        value.to_hash
      else
        value
      end
    end
  end
end
