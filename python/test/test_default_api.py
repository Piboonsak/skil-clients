# coding: utf-8

"""
    Endpoints

    Endpoints API for different services in SKIL  # noqa: E501

    OpenAPI spec version: 1.1.0-beta
    
    Generated by: https://github.com/swagger-api/swagger-codegen.git
"""


from __future__ import absolute_import

import unittest
import uuid
from pprint import pprint

import skil_client
from skil_client import Configuration, ApiClient
from skil_client.rest import ApiException


class TestDefaultApi(unittest.TestCase):
    """DefaultApi unit test stubs"""
    @classmethod
    def setUpClass(cls):
        cls.config = Configuration()
        cls.config.host = "localhost:9008" # change this!
        cls.config.debug = True
        cls.api_client = ApiClient(configuration=cls.config)
        cls.unique_id = str(uuid.uuid4())[:8]
        # create an instance of the API class
        cls.api_instance = skil_client.DefaultApi(api_client=cls.api_client)
        # authenticate
        try:
            print("Authenticating with SKIL API...")
            creds = skil_client.Credentials(user_id="admin", password="admin")
            token = cls.api_instance.login(creds)
            pprint(token)
            # add credentials to config
            cls.config.api_key['authorization'] = token.token
            cls.config.api_key_prefix['authorization'] = "Bearer"
        except ApiException as e:
            print("Exception when calling DefaultApi->login: %s\n" % e)



    @classmethod
    def tearDownClass(cls):
        pass

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def test_add_evaluation_result(self):
        """Test case for add_evaluation_result

        Adds an evaluation result  # noqa: E501
        """
        pass

    def test_add_example_for_batch(self):
        """Test case for add_example_for_batch

        Adds a number of examples to a minibatch ID given an AddExampleRequest.  # noqa: E501
        """
        pass

    def test_add_example_to_minibatch(self):
        """Test case for add_example_to_minibatch

        Adds an example to a minibatch  # noqa: E501
        """
        pass

    def test_add_experiment(self):
        """Test case for add_experiment

        Add an experiment, given an experiment entity  # noqa: E501
        """
        pass

    def test_add_minibatch(self):
        """Test case for add_minibatch

        Adds a minibatch  # noqa: E501
        """
        pass

    def test_add_model_history(self):
        """Test case for add_model_history

        Add a model history / workspace  # noqa: E501
        """
        pass

    def test_add_model_instance(self):
        """Test case for add_model_instance

        Adds a model  # noqa: E501
        """
        pass

    def test_aggregate_model_results(self):
        """Test case for aggregate_model_results

        Aggregates the evaluaition results of a model instance, based on the evaluation type  # noqa: E501
        """
        pass

    def test_classify(self):
        """Test case for classify

        Use the deployed model to classify the input  # noqa: E501
        """
        pass

    def test_classifyarray(self):
        """Test case for classifyarray

        Same as /classify but returns the output as Base64NDArrayBody  # noqa: E501
        """
        pass

    def test_classifyimage(self):
        """Test case for classifyimage

        Use the deployed model to classify the input, using input image file from multipart form data.  # noqa: E501
        """
        pass

    def test_create_model_history(self):
        """Test case for create_model_history

        Creates model History  # noqa: E501
        """
        pass

    def test_delete_experiment(self):
        """Test case for delete_experiment

        Deletes an experiment, given an experiment entity  # noqa: E501
        """
        pass

    def test_delete_model(self):
        """Test case for delete_model

        Delete a model by deployment and model id  # noqa: E501
        """
        pass

    def test_delete_model_history(self):
        """Test case for delete_model_history

        Deletes a model history / workspace, given its ID  # noqa: E501
        """
        pass

    def test_delete_model_instance(self):
        """Test case for delete_model_instance

        Deletes a model instance, given its ID  # noqa: E501
        """
        pass

    def test_deploy_model(self):
        """Test case for deploy_model

        Deploy a model in a deployment group.  # noqa: E501
        """
        pass

    def test_deployment_create(self):
        """Test case for deployment_create

        Create a new deployment group.  # noqa: E501
        """
        pass

    def test_deployment_delete(self):
        """Test case for deployment_delete

        Delete a deployment by id  # noqa: E501
        """
        pass

    def test_deployment_get(self):
        """Test case for deployment_get

        Get a deployment details by id  # noqa: E501
        """
        pass

    def test_deployments(self):
        """Test case for deployments

        Get a list of deployments  # noqa: E501
        """
        pprint(self.api_instance.deployments())
        pass

    def test_detectobjects(self):
        """Test case for detectobjects

        Detect the objects, given a (input) prediction request  # noqa: E501
        """
        pass

    def test_get_best_model_among_model_ids(self):
        """Test case for get_best_model_among_model_ids

        Gets the best model among the given model instance IDs, based on the evaluation type and column metric  # noqa: E501
        """
        pass

    def test_get_evaluation_for_model_id(self):
        """Test case for get_evaluation_for_model_id

        Gets the list of evaluation results entity, given a model instance ID  # noqa: E501
        """
        pass

    def test_get_examples_for_minibatch(self):
        """Test case for get_examples_for_minibatch

        Gets all the examples for a minibatch ID  # noqa: E501
        """
        pass

    def test_get_experiment(self):
        """Test case for get_experiment

        Obtain an experiment's details, given its ID  # noqa: E501
        """
        pass

    def test_get_experiments_for_model_history(self):
        """Test case for get_experiments_for_model_history

        Obtain all experiments for a model history / workspace  # noqa: E501
        """
        pass

    def test_get_minibatch(self):
        """Test case for get_minibatch

        Gets a minibatch for the model  # noqa: E501
        """
        pass

    def test_get_model_history(self):
        """Test case for get_model_history

        Gets a model history, given its ID  # noqa: E501
        """
        pass

    def test_get_model_instance(self):
        """Test case for get_model_instance

        Gets a model instance, given its ID  # noqa: E501
        """
        pass

    def test_get_models_for_experiment(self):
        """Test case for get_models_for_experiment

        Obtain a list of all the models for an experiment  # noqa: E501
        """
        pass

    def test_imagetransformprocess_get(self):
        """Test case for imagetransformprocess_get

        Retrieves the image transform process JSON string  # noqa: E501
        """
        pass

    def test_imagetransformprocess_post(self):
        """Test case for imagetransformprocess_post

        Sets the image transform process through the provided JSON string  # noqa: E501
        """
        pass

    def test_jsonarray(self):
        """Test case for jsonarray

        Run inference on the input and returns it as a JsonArrayResponse  # noqa: E501
        """
        pass

    def test_knn(self):
        """Test case for knn

        Runs knn on the given index with the given k  # noqa: E501
        """
        pass

    def test_knnnew(self):
        """Test case for knnnew

        Run a k nearest neighbors search on a NEW data point  # noqa: E501
        """
        pass

    def test_list_all_experiments(self):
        """Test case for list_all_experiments

        List all of the experiments in every model history / workspace  # noqa: E501
        """
        pass

    def test_logfilepath(self):
        """Test case for logfilepath

        Get logs file path  # noqa: E501
        """
        pass

    def test_login(self):
        """Test case for login

        Post JSON credentials and obtain a JWT authorization token.  # noqa: E501
        """
        pass

    def test_logs(self):
        """Test case for logs

        Get logs  # noqa: E501
        """
        pass

    def test_meta_get(self):
        """Test case for meta_get

        this method can be used to get the meta data for the current model which set to the server  # noqa: E501
        """
        pass

    def test_meta_post(self):
        """Test case for meta_post

        This method can be used to set meta data for the current model which is set to the server  # noqa: E501
        """
        pass

    def test_model_state_change(self):
        """Test case for model_state_change

        Modify the state (start/stop) of a deployed model  # noqa: E501
        """
        pass

    def test_models(self):
        """Test case for models

        Retrieve a list of all the deployed models given a deployment id  # noqa: E501
        """
        pass

    def test_modelset(self):
        """Test case for modelset

        Set the model to be served  # noqa: E501
        """
        pass

    def test_modelupdate(self):
        """Test case for modelupdate

        Update the model to be served  # noqa: E501
        """
        pass

    def test_multiclassify(self):
        """Test case for multiclassify

        Represents all of the labels for a given classification  # noqa: E501
        """
        pass

    def test_multipredict(self):
        """Test case for multipredict

        Get the output from the network, based on the given INDArray[] input  # noqa: E501
        """
        pass

    def test_predict(self):
        """Test case for predict

        Run inference on the input array.  # noqa: E501
        """
        pass

    def test_predictimage(self):
        """Test case for predictimage

        Run inference on the input array, using input image file from multipart form data.  # noqa: E501
        """
        pass

    def test_predictwithpreprocess(self):
        """Test case for predictwithpreprocess

        Preprocesses the input and run inference on it  # noqa: E501
        """
        pass

    def test_predictwithpreprocessjson(self):
        """Test case for predictwithpreprocessjson

        Preprocesses the input and run inference on it and returns it as a JsonArrayResponse  # noqa: E501
        """
        pass

    def test_reimport_model(self):
        """Test case for reimport_model

        Reimport a model to a previous deployed model in a deployment  # noqa: E501
        """
        pass

    def test_transform_csv(self):
        """Test case for transform_csv

        Takes a BatchCSVRecord and returns the transformed array as BatchCSVRecord  # noqa: E501
        """
        pass

    def test_transformarray_csv(self):
        """Test case for transformarray_csv

        Takes a batch input arrays and transforms it  # noqa: E501
        """
        pass

    def test_transformarray_image(self):
        """Test case for transformarray_image

        Takes a batch of images uri and transforms it and returns Base64NDArrayBody  # noqa: E501
        """
        pass

    def test_transformimage(self):
        """Test case for transformimage

        Takes multiple multipart image file to transform and returns Base64NDArrayBody  # noqa: E501
        """
        pass

    def test_transformincremental_csv(self):
        """Test case for transformincremental_csv

        Takes SingleCSVRecord as input and returns the transformed array as SingleCSVRecord  # noqa: E501
        """
        pass

    def test_transformincrementalarray_csv(self):
        """Test case for transformincrementalarray_csv

        Same as /transformincremental but returns Base64NDArrayBody  # noqa: E501
        """
        pass

    def test_transformincrementalarray_image(self):
        """Test case for transformincrementalarray_image

        Takes SingleImageRecord to transform and returns Base64NDArrayBody  # noqa: E501
        """
        pass

    def test_transformincrementalimage(self):
        """Test case for transformincrementalimage

        Takes a single multipart image file to transform and returns Base64NDArrayBody  # noqa: E501
        """
        pass

    def test_transformprocess_get(self):
        """Test case for transformprocess_get

        Gets the JSON string of the deployed transform process  # noqa: E501
        """
        pass

    def test_transformprocess_post(self):
        """Test case for transformprocess_post

        Sets the deployed transform process through the provided JSON string  # noqa: E501
        """
        pass

    def test_update_best_model_for_experiment(self):
        """Test case for update_best_model_for_experiment

        Updates the best model for an experiment  # noqa: E501
        """
        pass

    def test_update_experiment(self):
        """Test case for update_experiment

        Updates an experiment, given an experiment entity  # noqa: E501
        """
        pass

    def test_update_model_history(self):
        """Test case for update_model_history

        Update a model history / workspace  # noqa: E501
        """
        pass

    def test_upload(self):
        """Test case for upload

        Upload a model file to SKIL for import.  # noqa: E501
        """
        pass


if __name__ == '__main__':
    unittest.main()
