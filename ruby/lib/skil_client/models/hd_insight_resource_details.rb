=begin
#Endpoints

#Endpoints API for different services in SKIL

OpenAPI spec version: 1.2.0-rc1

Generated by: https://github.com/swagger-api/swagger-codegen.git
Swagger Codegen version: 2.4.0-SNAPSHOT

=end

require 'date'

module SkilCient
  class HDInsightResourceDetails
    attr_accessor :_class

    # ID of the resource
    attr_accessor :resource_id

    # Resource type
    attr_accessor :type

    # Resource subtype
    attr_accessor :sub_type

    # Azure subscription ID
    attr_accessor :subscription_id

    # name of the resource group
    attr_accessor :resource_group_name

    # Cluster name
    attr_accessor :cluster_name

    class EnumAttributeValidator
      attr_reader :datatype
      attr_reader :allowable_values

      def initialize(datatype, allowable_values)
        @allowable_values = allowable_values.map do |value|
          case datatype.to_s
          when /Integer/i
            value.to_i
          when /Float/i
            value.to_f
          else
            value
          end
        end
      end

      def valid?(value)
        !value || allowable_values.include?(value)
      end
    end

    # Attribute mapping from ruby-style variable name to JSON key.
    def self.attribute_map
      {
        :'_class' => :'@class',
        :'resource_id' => :'resourceId',
        :'type' => :'type',
        :'sub_type' => :'subType',
        :'subscription_id' => :'subscriptionId',
        :'resource_group_name' => :'resourceGroupName',
        :'cluster_name' => :'clusterName'
      }
    end

    # Attribute type mapping.
    def self.swagger_types
      {
        :'_class' => :'String',
        :'resource_id' => :'Integer',
        :'type' => :'String',
        :'sub_type' => :'String',
        :'subscription_id' => :'String',
        :'resource_group_name' => :'String',
        :'cluster_name' => :'String'
      }
    end

    # Initializes the object
    # @param [Hash] attributes Model attributes in the form of hash
    def initialize(attributes = {})
      return unless attributes.is_a?(Hash)

      # convert string to symbol for hash key
      attributes = attributes.each_with_object({}) { |(k, v), h| h[k.to_sym] = v }

      if attributes.has_key?(:'@class')
        self._class = attributes[:'@class']
      else
        self._class = 'io.skymind.resource.model.subtypes.compute.HDInsightResourceDetails'
      end

      if attributes.has_key?(:'resourceId')
        self.resource_id = attributes[:'resourceId']
      end

      if attributes.has_key?(:'type')
        self.type = attributes[:'type']
      end

      if attributes.has_key?(:'subType')
        self.sub_type = attributes[:'subType']
      end

      if attributes.has_key?(:'subscriptionId')
        self.subscription_id = attributes[:'subscriptionId']
      end

      if attributes.has_key?(:'resourceGroupName')
        self.resource_group_name = attributes[:'resourceGroupName']
      end

      if attributes.has_key?(:'clusterName')
        self.cluster_name = attributes[:'clusterName']
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
      type_validator = EnumAttributeValidator.new('String', ['COMPUTE'])
      return false unless type_validator.valid?(@type)
      sub_type_validator = EnumAttributeValidator.new('String', ['HDInsight'])
      return false unless sub_type_validator.valid?(@sub_type)
      true
    end

    # Custom attribute writer method checking allowed values (enum).
    # @param [Object] type Object to be assigned
    def type=(type)
      validator = EnumAttributeValidator.new('String', ['COMPUTE'])
      unless validator.valid?(type)
        fail ArgumentError, 'invalid value for "type", must be one of #{validator.allowable_values}.'
      end
      @type = type
    end

    # Custom attribute writer method checking allowed values (enum).
    # @param [Object] sub_type Object to be assigned
    def sub_type=(sub_type)
      validator = EnumAttributeValidator.new('String', ['HDInsight'])
      unless validator.valid?(sub_type)
        fail ArgumentError, 'invalid value for "sub_type", must be one of #{validator.allowable_values}.'
      end
      @sub_type = sub_type
    end

    # Checks equality by comparing each attribute.
    # @param [Object] Object to be compared
    def ==(o)
      return true if self.equal?(o)
      self.class == o.class &&
          _class == o._class &&
          resource_id == o.resource_id &&
          type == o.type &&
          sub_type == o.sub_type &&
          subscription_id == o.subscription_id &&
          resource_group_name == o.resource_group_name &&
          cluster_name == o.cluster_name
    end

    # @see the `==` method
    # @param [Object] Object to be compared
    def eql?(o)
      self == o
    end

    # Calculates hash code according to all attributes.
    # @return [Fixnum] Hash code
    def hash
      [_class, resource_id, type, sub_type, subscription_id, resource_group_name, cluster_name].hash
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
