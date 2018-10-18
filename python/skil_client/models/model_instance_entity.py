# coding: utf-8

"""
    Endpoints

    Endpoints API for different services in SKIL  # noqa: E501

    OpenAPI spec version: 1.2.0-beta
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


import pprint
import re  # noqa: F401

import six


class ModelInstanceEntity(object):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    """
    Attributes:
      swagger_types (dict): The key is attribute name
                            and the value is attribute type.
      attribute_map (dict): The key is attribute name
                            and the value is json key in definition.
    """
    swagger_types = {
        'uri': 'str',
        'etl_json': 'str',
        'model_id': 'str',
        'model_labels': 'str',
        'input_formats': 'str',
        'created': 'int',
        'notebook_json': 'str',
        'eval_id': 'str',
        'model_name': 'str',
        'original_model_id': 'str',
        'model_version': 'str',
        'experiment_id': 'str'
    }

    attribute_map = {
        'uri': 'uri',
        'etl_json': 'etlJson',
        'model_id': 'modelId',
        'model_labels': 'modelLabels',
        'input_formats': 'inputFormats',
        'created': 'created',
        'notebook_json': 'notebookJson',
        'eval_id': 'evalId',
        'model_name': 'modelName',
        'original_model_id': 'originalModelId',
        'model_version': 'modelVersion',
        'experiment_id': 'experimentId'
    }

    def __init__(self, uri=None, etl_json=None, model_id=None, model_labels=None, input_formats=None, created=None, notebook_json=None, eval_id=None, model_name=None, original_model_id=None, model_version=None, experiment_id=None):  # noqa: E501
        """ModelInstanceEntity - a model defined in Swagger"""  # noqa: E501

        self._uri = None
        self._etl_json = None
        self._model_id = None
        self._model_labels = None
        self._input_formats = None
        self._created = None
        self._notebook_json = None
        self._eval_id = None
        self._model_name = None
        self._original_model_id = None
        self._model_version = None
        self._experiment_id = None
        self.discriminator = None

        if uri is not None:
            self.uri = uri
        if etl_json is not None:
            self.etl_json = etl_json
        if model_id is not None:
            self.model_id = model_id
        if model_labels is not None:
            self.model_labels = model_labels
        if input_formats is not None:
            self.input_formats = input_formats
        if created is not None:
            self.created = created
        if notebook_json is not None:
            self.notebook_json = notebook_json
        if eval_id is not None:
            self.eval_id = eval_id
        if model_name is not None:
            self.model_name = model_name
        if original_model_id is not None:
            self.original_model_id = original_model_id
        if model_version is not None:
            self.model_version = model_version
        if experiment_id is not None:
            self.experiment_id = experiment_id

    @property
    def uri(self):
        """Gets the uri of this ModelInstanceEntity.  # noqa: E501

        The model URI  # noqa: E501

        :return: The uri of this ModelInstanceEntity.  # noqa: E501
        :rtype: str
        """
        return self._uri

    @uri.setter
    def uri(self, uri):
        """Sets the uri of this ModelInstanceEntity.

        The model URI  # noqa: E501

        :param uri: The uri of this ModelInstanceEntity.  # noqa: E501
        :type: str
        """

        self._uri = uri

    @property
    def etl_json(self):
        """Gets the etl_json of this ModelInstanceEntity.  # noqa: E501

        The json string for the ETL (Extract, Transform and Load)  # noqa: E501

        :return: The etl_json of this ModelInstanceEntity.  # noqa: E501
        :rtype: str
        """
        return self._etl_json

    @etl_json.setter
    def etl_json(self, etl_json):
        """Sets the etl_json of this ModelInstanceEntity.

        The json string for the ETL (Extract, Transform and Load)  # noqa: E501

        :param etl_json: The etl_json of this ModelInstanceEntity.  # noqa: E501
        :type: str
        """

        self._etl_json = etl_json

    @property
    def model_id(self):
        """Gets the model_id of this ModelInstanceEntity.  # noqa: E501

        GUID of the model.  # noqa: E501

        :return: The model_id of this ModelInstanceEntity.  # noqa: E501
        :rtype: str
        """
        return self._model_id

    @model_id.setter
    def model_id(self, model_id):
        """Sets the model_id of this ModelInstanceEntity.

        GUID of the model.  # noqa: E501

        :param model_id: The model_id of this ModelInstanceEntity.  # noqa: E501
        :type: str
        """

        self._model_id = model_id

    @property
    def model_labels(self):
        """Gets the model_labels of this ModelInstanceEntity.  # noqa: E501

        Comma-separated labels string for the model  # noqa: E501

        :return: The model_labels of this ModelInstanceEntity.  # noqa: E501
        :rtype: str
        """
        return self._model_labels

    @model_labels.setter
    def model_labels(self, model_labels):
        """Sets the model_labels of this ModelInstanceEntity.

        Comma-separated labels string for the model  # noqa: E501

        :param model_labels: The model_labels of this ModelInstanceEntity.  # noqa: E501
        :type: str
        """

        self._model_labels = model_labels

    @property
    def input_formats(self):
        """Gets the input_formats of this ModelInstanceEntity.  # noqa: E501

        Format for the model input  # noqa: E501

        :return: The input_formats of this ModelInstanceEntity.  # noqa: E501
        :rtype: str
        """
        return self._input_formats

    @input_formats.setter
    def input_formats(self, input_formats):
        """Sets the input_formats of this ModelInstanceEntity.

        Format for the model input  # noqa: E501

        :param input_formats: The input_formats of this ModelInstanceEntity.  # noqa: E501
        :type: str
        """

        self._input_formats = input_formats

    @property
    def created(self):
        """Gets the created of this ModelInstanceEntity.  # noqa: E501

        When the model was created  # noqa: E501

        :return: The created of this ModelInstanceEntity.  # noqa: E501
        :rtype: int
        """
        return self._created

    @created.setter
    def created(self, created):
        """Sets the created of this ModelInstanceEntity.

        When the model was created  # noqa: E501

        :param created: The created of this ModelInstanceEntity.  # noqa: E501
        :type: int
        """

        self._created = created

    @property
    def notebook_json(self):
        """Gets the notebook_json of this ModelInstanceEntity.  # noqa: E501

        JSON string of the associated Zeppelin Notebook  # noqa: E501

        :return: The notebook_json of this ModelInstanceEntity.  # noqa: E501
        :rtype: str
        """
        return self._notebook_json

    @notebook_json.setter
    def notebook_json(self, notebook_json):
        """Sets the notebook_json of this ModelInstanceEntity.

        JSON string of the associated Zeppelin Notebook  # noqa: E501

        :param notebook_json: The notebook_json of this ModelInstanceEntity.  # noqa: E501
        :type: str
        """

        self._notebook_json = notebook_json

    @property
    def eval_id(self):
        """Gets the eval_id of this ModelInstanceEntity.  # noqa: E501

        GUID for the model evaluation  # noqa: E501

        :return: The eval_id of this ModelInstanceEntity.  # noqa: E501
        :rtype: str
        """
        return self._eval_id

    @eval_id.setter
    def eval_id(self, eval_id):
        """Sets the eval_id of this ModelInstanceEntity.

        GUID for the model evaluation  # noqa: E501

        :param eval_id: The eval_id of this ModelInstanceEntity.  # noqa: E501
        :type: str
        """

        self._eval_id = eval_id

    @property
    def model_name(self):
        """Gets the model_name of this ModelInstanceEntity.  # noqa: E501

        Model's name  # noqa: E501

        :return: The model_name of this ModelInstanceEntity.  # noqa: E501
        :rtype: str
        """
        return self._model_name

    @model_name.setter
    def model_name(self, model_name):
        """Sets the model_name of this ModelInstanceEntity.

        Model's name  # noqa: E501

        :param model_name: The model_name of this ModelInstanceEntity.  # noqa: E501
        :type: str
        """

        self._model_name = model_name

    @property
    def original_model_id(self):
        """Gets the original_model_id of this ModelInstanceEntity.  # noqa: E501

        Original GUID of the model (used for maintaining revisions of a particular model)  # noqa: E501

        :return: The original_model_id of this ModelInstanceEntity.  # noqa: E501
        :rtype: str
        """
        return self._original_model_id

    @original_model_id.setter
    def original_model_id(self, original_model_id):
        """Sets the original_model_id of this ModelInstanceEntity.

        Original GUID of the model (used for maintaining revisions of a particular model)  # noqa: E501

        :param original_model_id: The original_model_id of this ModelInstanceEntity.  # noqa: E501
        :type: str
        """

        self._original_model_id = original_model_id

    @property
    def model_version(self):
        """Gets the model_version of this ModelInstanceEntity.  # noqa: E501

        Model version  # noqa: E501

        :return: The model_version of this ModelInstanceEntity.  # noqa: E501
        :rtype: str
        """
        return self._model_version

    @model_version.setter
    def model_version(self, model_version):
        """Sets the model_version of this ModelInstanceEntity.

        Model version  # noqa: E501

        :param model_version: The model_version of this ModelInstanceEntity.  # noqa: E501
        :type: str
        """

        self._model_version = model_version

    @property
    def experiment_id(self):
        """Gets the experiment_id of this ModelInstanceEntity.  # noqa: E501

        GUID of the Experiment which is associated with the model.  # noqa: E501

        :return: The experiment_id of this ModelInstanceEntity.  # noqa: E501
        :rtype: str
        """
        return self._experiment_id

    @experiment_id.setter
    def experiment_id(self, experiment_id):
        """Sets the experiment_id of this ModelInstanceEntity.

        GUID of the Experiment which is associated with the model.  # noqa: E501

        :param experiment_id: The experiment_id of this ModelInstanceEntity.  # noqa: E501
        :type: str
        """

        self._experiment_id = experiment_id

    def to_dict(self):
        """Returns the model properties as a dict"""
        result = {}

        for attr, _ in six.iteritems(self.swagger_types):
            value = getattr(self, attr)
            if isinstance(value, list):
                result[attr] = list(map(
                    lambda x: x.to_dict() if hasattr(x, "to_dict") else x,
                    value
                ))
            elif hasattr(value, "to_dict"):
                result[attr] = value.to_dict()
            elif isinstance(value, dict):
                result[attr] = dict(map(
                    lambda item: (item[0], item[1].to_dict())
                    if hasattr(item[1], "to_dict") else item,
                    value.items()
                ))
            else:
                result[attr] = value

        return result

    def to_str(self):
        """Returns the string representation of the model"""
        return pprint.pformat(self.to_dict())

    def __repr__(self):
        """For `print` and `pprint`"""
        return self.to_str()

    def __eq__(self, other):
        """Returns true if both objects are equal"""
        if not isinstance(other, ModelInstanceEntity):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other