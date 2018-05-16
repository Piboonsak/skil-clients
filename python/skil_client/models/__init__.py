# coding: utf-8

# flake8: noqa
"""
    Predict

    Endpoints API for classification and other prediction services in SKIL  # noqa: E501

    OpenAPI spec version: 1.1.0-beta
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from __future__ import absolute_import

# import models into model package
from skil_client.models.base64_nd_array_body import Base64NDArrayBody
from skil_client.models.classification_result import ClassificationResult
from skil_client.models.credentials import Credentials
from skil_client.models.deploy_model import DeployModel
from skil_client.models.deployment import Deployment
from skil_client.models.deployment_objects import DeploymentObjects
from skil_client.models.file_upload import FileUpload
from skil_client.models.file_upload_list import FileUploadList
from skil_client.models.ind_array import INDArray
from skil_client.models.json_array_response import JsonArrayResponse
from skil_client.models.log_batch import LogBatch
from skil_client.models.log_request import LogRequest
from skil_client.models.model_status import ModelStatus
from skil_client.models.multi_class_classification_result import MultiClassClassificationResult
from skil_client.models.new_deployment import NewDeployment
from skil_client.models.prediction import Prediction
from skil_client.models.token import Token
