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


class ModelFeedBackRequest(object):
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
        'batch_id': 'str',
        'guesses': 'list[str]',
        'correct': 'list[str]'
    }

    attribute_map = {
        'batch_id': 'batchId',
        'guesses': 'guesses',
        'correct': 'correct'
    }

    def __init__(self, batch_id=None, guesses=None, correct=None):  # noqa: E501
        """ModelFeedBackRequest - a model defined in Swagger"""  # noqa: E501

        self._batch_id = None
        self._guesses = None
        self._correct = None
        self.discriminator = None

        if batch_id is not None:
            self.batch_id = batch_id
        if guesses is not None:
            self.guesses = guesses
        if correct is not None:
            self.correct = correct

    @property
    def batch_id(self):
        """Gets the batch_id of this ModelFeedBackRequest.  # noqa: E501

        The GUID of the minibatch this feedback corresponds to  # noqa: E501

        :return: The batch_id of this ModelFeedBackRequest.  # noqa: E501
        :rtype: str
        """
        return self._batch_id

    @batch_id.setter
    def batch_id(self, batch_id):
        """Sets the batch_id of this ModelFeedBackRequest.

        The GUID of the minibatch this feedback corresponds to  # noqa: E501

        :param batch_id: The batch_id of this ModelFeedBackRequest.  # noqa: E501
        :type: str
        """

        self._batch_id = batch_id

    @property
    def guesses(self):
        """Gets the guesses of this ModelFeedBackRequest.  # noqa: E501

        The guessed label IDs by the model  # noqa: E501

        :return: The guesses of this ModelFeedBackRequest.  # noqa: E501
        :rtype: list[str]
        """
        return self._guesses

    @guesses.setter
    def guesses(self, guesses):
        """Sets the guesses of this ModelFeedBackRequest.

        The guessed label IDs by the model  # noqa: E501

        :param guesses: The guesses of this ModelFeedBackRequest.  # noqa: E501
        :type: list[str]
        """

        self._guesses = guesses

    @property
    def correct(self):
        """Gets the correct of this ModelFeedBackRequest.  # noqa: E501

        The actual label IDs  # noqa: E501

        :return: The correct of this ModelFeedBackRequest.  # noqa: E501
        :rtype: list[str]
        """
        return self._correct

    @correct.setter
    def correct(self, correct):
        """Sets the correct of this ModelFeedBackRequest.

        The actual label IDs  # noqa: E501

        :param correct: The correct of this ModelFeedBackRequest.  # noqa: E501
        :type: list[str]
        """

        self._correct = correct

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
        if not isinstance(other, ModelFeedBackRequest):
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        """Returns true if both objects are not equal"""
        return not self == other
