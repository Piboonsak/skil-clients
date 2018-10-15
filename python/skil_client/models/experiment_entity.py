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


class ExperimentEntity(object):
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
        'best_model_id': 'str',
        'input_data_uri': 'str',
        'experiment_id': 'str',
        'experiment_name': 'str',
        'experiment_description': 'str',
        'notebook_json': 'str',
        'notebook_url': 'str',
        'zeppelin_id': 'str',
        'model_history_id': 'str',
        'last_updated': 'int'
    }

    attribute_map = {
        'best_model_id': 'bestModelId',
        'input_data_uri': 'inputDataUri',
        'experiment_id': 'experimentId',
        'experiment_name': 'experimentName',
        'experiment_description': 'experimentDescription',
        'notebook_json': 'notebookJson',
        'notebook_url': 'notebookUrl',
        'zeppelin_id': 'zeppelinId',
        'model_history_id': 'modelHistoryId',
        'last_updated': 'lastUpdated'
    }

    def __init__(self, best_model_id=None, input_data_uri=None, experiment_id=None, experiment_name=None, experiment_description=None, notebook_json=None, notebook_url=None, zeppelin_id=None, model_history_id=None, last_updated=None):  # noqa: E501
        """ExperimentEntity - a model defined in Swagger"""  # noqa: E501

        self._best_model_id = None
        self._input_data_uri = None
        self._experiment_id = None
        self._experiment_name = None
        self._experiment_description = None
        self._notebook_json = None
        self._notebook_url = None
        self._zeppelin_id = None
        self._model_history_id = None
        self._last_updated = None
        self.discriminator = None

        if best_model_id is not None:
            self.best_model_id = best_model_id
        if input_data_uri is not None:
            self.input_data_uri = input_data_uri
        if experiment_id is not None:
            self.experiment_id = experiment_id
        if experiment_name is not None:
            self.experiment_name = experiment_name
        if experiment_description is not None:
            self.experiment_description = experiment_description
        if notebook_json is not None:
            self.notebook_json = notebook_json
        if notebook_url is not None:
            self.notebook_url = notebook_url
        if zeppelin_id is not None:
            self.zeppelin_id = zeppelin_id
        if model_history_id is not None:
            self.model_history_id = model_history_id
        if last_updated is not None:
            self.last_updated = last_updated

    @property
    def best_model_id(self):
        """Gets the best_model_id of this ExperimentEntity.  # noqa: E501

        GUID of the best selected model in an experiment  # noqa: E501

        :return: The best_model_id of this ExperimentEntity.  # noqa: E501
        :rtype: str
        """
        return self._best_model_id

    @best_model_id.setter
    def best_model_id(self, best_model_id):
        """Sets the best_model_id of this ExperimentEntity.

        GUID of the best selected model in an experiment  # noqa: E501

        :param best_model_id: The best_model_id of this ExperimentEntity.  # noqa: E501
        :type: str
        """

        self._best_model_id = best_model_id

    @property
    def input_data_uri(self):
        """Gets the input_data_uri of this ExperimentEntity.  # noqa: E501

        Input data URI  # noqa: E501

        :return: The input_data_uri of this ExperimentEntity.  # noqa: E501
        :rtype: str
        """
        return self._input_data_uri

    @input_data_uri.setter
    def input_data_uri(self, input_data_uri):
        """Sets the input_data_uri of this ExperimentEntity.

        Input data URI  # noqa: E501

        :param input_data_uri: The input_data_uri of this ExperimentEntity.  # noqa: E501
        :type: str
        """

        self._input_data_uri = input_data_uri

    @property
    def experiment_id(self):
        """Gets the experiment_id of this ExperimentEntity.  # noqa: E501

        GUID of the experiment  # noqa: E501

        :return: The experiment_id of this ExperimentEntity.  # noqa: E501
        :rtype: str
        """
        return self._experiment_id

    @experiment_id.setter
    def experiment_id(self, experiment_id):
        """Sets the experiment_id of this ExperimentEntity.

        GUID of the experiment  # noqa: E501

        :param experiment_id: The experiment_id of this ExperimentEntity.  # noqa: E501
        :type: str
        """

        self._experiment_id = experiment_id

    @property
    def experiment_name(self):
        """Gets the experiment_name of this ExperimentEntity.  # noqa: E501

        Experiment's name  # noqa: E501

        :return: The experiment_name of this ExperimentEntity.  # noqa: E501
        :rtype: str
        """
        return self._experiment_name

    @experiment_name.setter
    def experiment_name(self, experiment_name):
        """Sets the experiment_name of this ExperimentEntity.

        Experiment's name  # noqa: E501

        :param experiment_name: The experiment_name of this ExperimentEntity.  # noqa: E501
        :type: str
        """

        self._experiment_name = experiment_name

    @property
    def experiment_description(self):
        """Gets the experiment_description of this ExperimentEntity.  # noqa: E501

        Experiment's description  # noqa: E501

        :return: The experiment_description of this ExperimentEntity.  # noqa: E501
        :rtype: str
        """
        return self._experiment_description

    @experiment_description.setter
    def experiment_description(self, experiment_description):
        """Sets the experiment_description of this ExperimentEntity.

        Experiment's description  # noqa: E501

        :param experiment_description: The experiment_description of this ExperimentEntity.  # noqa: E501
        :type: str
        """

        self._experiment_description = experiment_description

    @property
    def notebook_json(self):
        """Gets the notebook_json of this ExperimentEntity.  # noqa: E501

        The associated Zeppelin notebook JSON string  # noqa: E501

        :return: The notebook_json of this ExperimentEntity.  # noqa: E501
        :rtype: str
        """
        return self._notebook_json

    @notebook_json.setter
    def notebook_json(self, notebook_json):
        """Sets the notebook_json of this ExperimentEntity.

        The associated Zeppelin notebook JSON string  # noqa: E501

        :param notebook_json: The notebook_json of this ExperimentEntity.  # noqa: E501
        :type: str
        """

        self._notebook_json = notebook_json

    @property
    def notebook_url(self):
        """Gets the notebook_url of this ExperimentEntity.  # noqa: E501

        URL of the associated Zeppelin notebook  # noqa: E501

        :return: The notebook_url of this ExperimentEntity.  # noqa: E501
        :rtype: str
        """
        return self._notebook_url

    @notebook_url.setter
    def notebook_url(self, notebook_url):
        """Sets the notebook_url of this ExperimentEntity.

        URL of the associated Zeppelin notebook  # noqa: E501

        :param notebook_url: The notebook_url of this ExperimentEntity.  # noqa: E501
        :type: str
        """

        self._notebook_url = notebook_url

    @property
    def zeppelin_id(self):
        """Gets the zeppelin_id of this ExperimentEntity.  # noqa: E501

        Zeppelin ID  # noqa: E501

        :return: The zeppelin_id of this ExperimentEntity.  # noqa: E501
        :rtype: str
        """
        return self._zeppelin_id

    @zeppelin_id.setter
    def zeppelin_id(self, zeppelin_id):
        """Sets the zeppelin_id of this ExperimentEntity.

        Zeppelin ID  # noqa: E501

        :param zeppelin_id: The zeppelin_id of this ExperimentEntity.  # noqa: E501
        :type: str
        """

        self._zeppelin_id = zeppelin_id

    @property
    def model_history_id(self):
        """Gets the model_history_id of this ExperimentEntity.  # noqa: E501

        Id of the model history / workspace  # noqa: E501

        :return: The model_history_id of this ExperimentEntity.  # noqa: E501
        :rtype: str
        """
        return self._model_history_id

    @model_history_id.setter
    def model_history_id(self, model_history_id):
        """Sets the model_history_id of this ExperimentEntity.

        Id of the model history / workspace  # noqa: E501

        :param model_history_id: The model_history_id of this ExperimentEntity.  # noqa: E501
        :type: str
        """

        self._model_history_id = model_history_id

    @property
    def last_updated(self):
        """Gets the last_updated of this ExperimentEntity.  # noqa: E501

        Indicates the time when experiment was last updated  # noqa: E501

        :return: The last_updated of this ExperimentEntity.  # noqa: E501
        :rtype: int
        """
        return self._last_updated

    @last_updated.setter
    def last_updated(self, last_updated):
        """Sets the last_updated of this ExperimentEntity.

        Indicates the time when experiment was last updated  # noqa: E501

        :param last_updated: The last_updated of this ExperimentEntity.  # noqa: E501
        :type: int
        """

        self._last_updated = last_updated

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
        if not isinstance(other, ExperimentEntity):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
