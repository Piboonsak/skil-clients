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

from skil_client.models.minibatch_entity import MinibatchEntity  # noqa: F401,E501


class AddExampleRequest(object):
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
        'minibatch': 'MinibatchEntity',
        'batch_size': 'int'
    }

    attribute_map = {
        'minibatch': 'minibatch',
        'batch_size': 'batchSize'
    }

    def __init__(self, minibatch=None, batch_size=None):  # noqa: E501
        """AddExampleRequest - a model defined in Swagger"""  # noqa: E501

        self._minibatch = None
        self._batch_size = None
        self.discriminator = None

        if minibatch is not None:
            self.minibatch = minibatch
        if batch_size is not None:
            self.batch_size = batch_size

    @property
    def minibatch(self):
        """Gets the minibatch of this AddExampleRequest.  # noqa: E501

        the minibatch the examples are going to be associated with  # noqa: E501

        :return: The minibatch of this AddExampleRequest.  # noqa: E501
        :rtype: MinibatchEntity
        """
        return self._minibatch

    @minibatch.setter
    def minibatch(self, minibatch):
        """Sets the minibatch of this AddExampleRequest.

        the minibatch the examples are going to be associated with  # noqa: E501

        :param minibatch: The minibatch of this AddExampleRequest.  # noqa: E501
        :type: MinibatchEntity
        """

        self._minibatch = minibatch

    @property
    def batch_size(self):
        """Gets the batch_size of this AddExampleRequest.  # noqa: E501

        the size of the batch to create  # noqa: E501

        :return: The batch_size of this AddExampleRequest.  # noqa: E501
        :rtype: int
        """
        return self._batch_size

    @batch_size.setter
    def batch_size(self, batch_size):
        """Sets the batch_size of this AddExampleRequest.

        the size of the batch to create  # noqa: E501

        :param batch_size: The batch_size of this AddExampleRequest.  # noqa: E501
        :type: int
        """

        self._batch_size = batch_size

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
        if not isinstance(other, AddExampleRequest):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
