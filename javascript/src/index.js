/**
 * Endpoints
 * Endpoints API for different services in SKIL
 *
 * OpenAPI spec version: 1.2.0-rc1
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.4.0-SNAPSHOT
 *
 * Do not edit the class manually.
 *
 */

(function(factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'ai/skymind/skil/model/AccumulatedResults', 'ai/skymind/skil/model/AddCredentialsRequest', 'ai/skymind/skil/model/AddExampleRequest', 'ai/skymind/skil/model/AddModelHistoryRequest', 'ai/skymind/skil/model/AddResourceRequest', 'ai/skymind/skil/model/AggregatePrediction', 'ai/skymind/skil/model/AuthPolicy', 'ai/skymind/skil/model/AzureStorageResourceDetails', 'ai/skymind/skil/model/Base64NDArrayBody', 'ai/skymind/skil/model/Base64NDArrayBodyKNN', 'ai/skymind/skil/model/BatchCSVRecord', 'ai/skymind/skil/model/BatchRecord', 'ai/skymind/skil/model/BestModel', 'ai/skymind/skil/model/ChangePasswordRequest', 'ai/skymind/skil/model/ClassificationResult', 'ai/skymind/skil/model/CreateDeploymentRequest', 'ai/skymind/skil/model/CreateJobRequest', 'ai/skymind/skil/model/DataProcResourceDetails', 'ai/skymind/skil/model/DeploymentObjects', 'ai/skymind/skil/model/DeploymentResponse', 'ai/skymind/skil/model/DetectedObject', 'ai/skymind/skil/model/DetectionResult', 'ai/skymind/skil/model/DownloadOutputFileRequest', 'ai/skymind/skil/model/EMRResourceDetails', 'ai/skymind/skil/model/EvaluationResultsEntity', 'ai/skymind/skil/model/ExampleEntity', 'ai/skymind/skil/model/ExperimentEntity', 'ai/skymind/skil/model/FeedbackResponse', 'ai/skymind/skil/model/FileUpload', 'ai/skymind/skil/model/FileUploadList', 'ai/skymind/skil/model/GoogleStorageResourceDetails', 'ai/skymind/skil/model/HDFSResourceDetails', 'ai/skymind/skil/model/HDInsightResourceDetails', 'ai/skymind/skil/model/INDArray', 'ai/skymind/skil/model/ImageTransformProcess', 'ai/skymind/skil/model/ImportModelRequest', 'ai/skymind/skil/model/InlineResponse200', 'ai/skymind/skil/model/JobEntity', 'ai/skymind/skil/model/JsonArrayResponse', 'ai/skymind/skil/model/LogBatch', 'ai/skymind/skil/model/LogRequest', 'ai/skymind/skil/model/LoginRequest', 'ai/skymind/skil/model/LoginResponse', 'ai/skymind/skil/model/MetaData', 'ai/skymind/skil/model/MinibatchEntity', 'ai/skymind/skil/model/ModelEntity', 'ai/skymind/skil/model/ModelFeedBackRequest', 'ai/skymind/skil/model/ModelHistoryEntity', 'ai/skymind/skil/model/ModelInstanceEntity', 'ai/skymind/skil/model/ModelResponse', 'ai/skymind/skil/model/ModelStatus', 'ai/skymind/skil/model/MultiClassClassificationResult', 'ai/skymind/skil/model/MultiPredictRequest', 'ai/skymind/skil/model/MultiPredictResponse', 'ai/skymind/skil/model/NearestNeighborRequest', 'ai/skymind/skil/model/NearestNeighborsResult', 'ai/skymind/skil/model/NearestNeighborsResults', 'ai/skymind/skil/model/NewDeployment', 'ai/skymind/skil/model/Prediction', 'ai/skymind/skil/model/Resource', 'ai/skymind/skil/model/ResourceCredentials', 'ai/skymind/skil/model/ResourceGroup', 'ai/skymind/skil/model/RetrainingStatus', 'ai/skymind/skil/model/RevisionsWritten', 'ai/skymind/skil/model/Role', 'ai/skymind/skil/model/RollbackStatus', 'ai/skymind/skil/model/S3ResourceDetails', 'ai/skymind/skil/model/SetState', 'ai/skymind/skil/model/SingleCSVRecord', 'ai/skymind/skil/model/SingleRecord', 'ai/skymind/skil/model/Token', 'ai/skymind/skil/model/TokenGenerateRequest', 'ai/skymind/skil/model/TransformProcess', 'ai/skymind/skil/model/UpdateBestModel', 'ai/skymind/skil/model/User', 'ai/skymind/skil/model/YARNResourceDetails', 'ai/skymind/skil/DefaultApi'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('./ApiClient'), require('./ai/skymind/skil/model/AccumulatedResults'), require('./ai/skymind/skil/model/AddCredentialsRequest'), require('./ai/skymind/skil/model/AddExampleRequest'), require('./ai/skymind/skil/model/AddModelHistoryRequest'), require('./ai/skymind/skil/model/AddResourceRequest'), require('./ai/skymind/skil/model/AggregatePrediction'), require('./ai/skymind/skil/model/AuthPolicy'), require('./ai/skymind/skil/model/AzureStorageResourceDetails'), require('./ai/skymind/skil/model/Base64NDArrayBody'), require('./ai/skymind/skil/model/Base64NDArrayBodyKNN'), require('./ai/skymind/skil/model/BatchCSVRecord'), require('./ai/skymind/skil/model/BatchRecord'), require('./ai/skymind/skil/model/BestModel'), require('./ai/skymind/skil/model/ChangePasswordRequest'), require('./ai/skymind/skil/model/ClassificationResult'), require('./ai/skymind/skil/model/CreateDeploymentRequest'), require('./ai/skymind/skil/model/CreateJobRequest'), require('./ai/skymind/skil/model/DataProcResourceDetails'), require('./ai/skymind/skil/model/DeploymentObjects'), require('./ai/skymind/skil/model/DeploymentResponse'), require('./ai/skymind/skil/model/DetectedObject'), require('./ai/skymind/skil/model/DetectionResult'), require('./ai/skymind/skil/model/DownloadOutputFileRequest'), require('./ai/skymind/skil/model/EMRResourceDetails'), require('./ai/skymind/skil/model/EvaluationResultsEntity'), require('./ai/skymind/skil/model/ExampleEntity'), require('./ai/skymind/skil/model/ExperimentEntity'), require('./ai/skymind/skil/model/FeedbackResponse'), require('./ai/skymind/skil/model/FileUpload'), require('./ai/skymind/skil/model/FileUploadList'), require('./ai/skymind/skil/model/GoogleStorageResourceDetails'), require('./ai/skymind/skil/model/HDFSResourceDetails'), require('./ai/skymind/skil/model/HDInsightResourceDetails'), require('./ai/skymind/skil/model/INDArray'), require('./ai/skymind/skil/model/ImageTransformProcess'), require('./ai/skymind/skil/model/ImportModelRequest'), require('./ai/skymind/skil/model/InlineResponse200'), require('./ai/skymind/skil/model/JobEntity'), require('./ai/skymind/skil/model/JsonArrayResponse'), require('./ai/skymind/skil/model/LogBatch'), require('./ai/skymind/skil/model/LogRequest'), require('./ai/skymind/skil/model/LoginRequest'), require('./ai/skymind/skil/model/LoginResponse'), require('./ai/skymind/skil/model/MetaData'), require('./ai/skymind/skil/model/MinibatchEntity'), require('./ai/skymind/skil/model/ModelEntity'), require('./ai/skymind/skil/model/ModelFeedBackRequest'), require('./ai/skymind/skil/model/ModelHistoryEntity'), require('./ai/skymind/skil/model/ModelInstanceEntity'), require('./ai/skymind/skil/model/ModelResponse'), require('./ai/skymind/skil/model/ModelStatus'), require('./ai/skymind/skil/model/MultiClassClassificationResult'), require('./ai/skymind/skil/model/MultiPredictRequest'), require('./ai/skymind/skil/model/MultiPredictResponse'), require('./ai/skymind/skil/model/NearestNeighborRequest'), require('./ai/skymind/skil/model/NearestNeighborsResult'), require('./ai/skymind/skil/model/NearestNeighborsResults'), require('./ai/skymind/skil/model/NewDeployment'), require('./ai/skymind/skil/model/Prediction'), require('./ai/skymind/skil/model/Resource'), require('./ai/skymind/skil/model/ResourceCredentials'), require('./ai/skymind/skil/model/ResourceGroup'), require('./ai/skymind/skil/model/RetrainingStatus'), require('./ai/skymind/skil/model/RevisionsWritten'), require('./ai/skymind/skil/model/Role'), require('./ai/skymind/skil/model/RollbackStatus'), require('./ai/skymind/skil/model/S3ResourceDetails'), require('./ai/skymind/skil/model/SetState'), require('./ai/skymind/skil/model/SingleCSVRecord'), require('./ai/skymind/skil/model/SingleRecord'), require('./ai/skymind/skil/model/Token'), require('./ai/skymind/skil/model/TokenGenerateRequest'), require('./ai/skymind/skil/model/TransformProcess'), require('./ai/skymind/skil/model/UpdateBestModel'), require('./ai/skymind/skil/model/User'), require('./ai/skymind/skil/model/YARNResourceDetails'), require('./ai/skymind/skil/DefaultApi'));
  }
}(function(ApiClient, AccumulatedResults, AddCredentialsRequest, AddExampleRequest, AddModelHistoryRequest, AddResourceRequest, AggregatePrediction, AuthPolicy, AzureStorageResourceDetails, Base64NDArrayBody, Base64NDArrayBodyKNN, BatchCSVRecord, BatchRecord, BestModel, ChangePasswordRequest, ClassificationResult, CreateDeploymentRequest, CreateJobRequest, DataProcResourceDetails, DeploymentObjects, DeploymentResponse, DetectedObject, DetectionResult, DownloadOutputFileRequest, EMRResourceDetails, EvaluationResultsEntity, ExampleEntity, ExperimentEntity, FeedbackResponse, FileUpload, FileUploadList, GoogleStorageResourceDetails, HDFSResourceDetails, HDInsightResourceDetails, INDArray, ImageTransformProcess, ImportModelRequest, InlineResponse200, JobEntity, JsonArrayResponse, LogBatch, LogRequest, LoginRequest, LoginResponse, MetaData, MinibatchEntity, ModelEntity, ModelFeedBackRequest, ModelHistoryEntity, ModelInstanceEntity, ModelResponse, ModelStatus, MultiClassClassificationResult, MultiPredictRequest, MultiPredictResponse, NearestNeighborRequest, NearestNeighborsResult, NearestNeighborsResults, NewDeployment, Prediction, Resource, ResourceCredentials, ResourceGroup, RetrainingStatus, RevisionsWritten, Role, RollbackStatus, S3ResourceDetails, SetState, SingleCSVRecord, SingleRecord, Token, TokenGenerateRequest, TransformProcess, UpdateBestModel, User, YARNResourceDetails, DefaultApi) {
  'use strict';

  /**
   * Endpoints_API_for_different_services_in_SKIL.<br>
   * The <code>index</code> module provides access to constructors for all the classes which comprise the public API.
   * <p>
   * An AMD (recommended!) or CommonJS application will generally do something equivalent to the following:
   * <pre>
   * var SkilClient = require('index'); // See note below*.
   * var xxxSvc = new SkilClient.XxxApi(); // Allocate the API class we're going to use.
   * var yyyModel = new SkilClient.Yyy(); // Construct a model instance.
   * yyyModel.someProperty = 'someValue';
   * ...
   * var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
   * ...
   * </pre>
   * <em>*NOTE: For a top-level AMD script, use require(['index'], function(){...})
   * and put the application logic within the callback function.</em>
   * </p>
   * <p>
   * A non-AMD browser application (discouraged) might do something like this:
   * <pre>
   * var xxxSvc = new SkilClient.XxxApi(); // Allocate the API class we're going to use.
   * var yyy = new SkilClient.Yyy(); // Construct a model instance.
   * yyyModel.someProperty = 'someValue';
   * ...
   * var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
   * ...
   * </pre>
   * </p>
   * @module index
   * @version 1.2.1.3
   */
  var exports = {
    /**
     * The ApiClient constructor.
     * @property {module:ApiClient}
     */
    ApiClient: ApiClient,
    /**
     * The AccumulatedResults model constructor.
     * @property {module:ai/skymind/skil/model/AccumulatedResults}
     */
    AccumulatedResults: AccumulatedResults,
    /**
     * The AddCredentialsRequest model constructor.
     * @property {module:ai/skymind/skil/model/AddCredentialsRequest}
     */
    AddCredentialsRequest: AddCredentialsRequest,
    /**
     * The AddExampleRequest model constructor.
     * @property {module:ai/skymind/skil/model/AddExampleRequest}
     */
    AddExampleRequest: AddExampleRequest,
    /**
     * The AddModelHistoryRequest model constructor.
     * @property {module:ai/skymind/skil/model/AddModelHistoryRequest}
     */
    AddModelHistoryRequest: AddModelHistoryRequest,
    /**
     * The AddResourceRequest model constructor.
     * @property {module:ai/skymind/skil/model/AddResourceRequest}
     */
    AddResourceRequest: AddResourceRequest,
    /**
     * The AggregatePrediction model constructor.
     * @property {module:ai/skymind/skil/model/AggregatePrediction}
     */
    AggregatePrediction: AggregatePrediction,
    /**
     * The AuthPolicy model constructor.
     * @property {module:ai/skymind/skil/model/AuthPolicy}
     */
    AuthPolicy: AuthPolicy,
    /**
     * The AzureStorageResourceDetails model constructor.
     * @property {module:ai/skymind/skil/model/AzureStorageResourceDetails}
     */
    AzureStorageResourceDetails: AzureStorageResourceDetails,
    /**
     * The Base64NDArrayBody model constructor.
     * @property {module:ai/skymind/skil/model/Base64NDArrayBody}
     */
    Base64NDArrayBody: Base64NDArrayBody,
    /**
     * The Base64NDArrayBodyKNN model constructor.
     * @property {module:ai/skymind/skil/model/Base64NDArrayBodyKNN}
     */
    Base64NDArrayBodyKNN: Base64NDArrayBodyKNN,
    /**
     * The BatchCSVRecord model constructor.
     * @property {module:ai/skymind/skil/model/BatchCSVRecord}
     */
    BatchCSVRecord: BatchCSVRecord,
    /**
     * The BatchRecord model constructor.
     * @property {module:ai/skymind/skil/model/BatchRecord}
     */
    BatchRecord: BatchRecord,
    /**
     * The BestModel model constructor.
     * @property {module:ai/skymind/skil/model/BestModel}
     */
    BestModel: BestModel,
    /**
     * The ChangePasswordRequest model constructor.
     * @property {module:ai/skymind/skil/model/ChangePasswordRequest}
     */
    ChangePasswordRequest: ChangePasswordRequest,
    /**
     * The ClassificationResult model constructor.
     * @property {module:ai/skymind/skil/model/ClassificationResult}
     */
    ClassificationResult: ClassificationResult,
    /**
     * The CreateDeploymentRequest model constructor.
     * @property {module:ai/skymind/skil/model/CreateDeploymentRequest}
     */
    CreateDeploymentRequest: CreateDeploymentRequest,
    /**
     * The CreateJobRequest model constructor.
     * @property {module:ai/skymind/skil/model/CreateJobRequest}
     */
    CreateJobRequest: CreateJobRequest,
    /**
     * The DataProcResourceDetails model constructor.
     * @property {module:ai/skymind/skil/model/DataProcResourceDetails}
     */
    DataProcResourceDetails: DataProcResourceDetails,
    /**
     * The DeploymentObjects model constructor.
     * @property {module:ai/skymind/skil/model/DeploymentObjects}
     */
    DeploymentObjects: DeploymentObjects,
    /**
     * The DeploymentResponse model constructor.
     * @property {module:ai/skymind/skil/model/DeploymentResponse}
     */
    DeploymentResponse: DeploymentResponse,
    /**
     * The DetectedObject model constructor.
     * @property {module:ai/skymind/skil/model/DetectedObject}
     */
    DetectedObject: DetectedObject,
    /**
     * The DetectionResult model constructor.
     * @property {module:ai/skymind/skil/model/DetectionResult}
     */
    DetectionResult: DetectionResult,
    /**
     * The DownloadOutputFileRequest model constructor.
     * @property {module:ai/skymind/skil/model/DownloadOutputFileRequest}
     */
    DownloadOutputFileRequest: DownloadOutputFileRequest,
    /**
     * The EMRResourceDetails model constructor.
     * @property {module:ai/skymind/skil/model/EMRResourceDetails}
     */
    EMRResourceDetails: EMRResourceDetails,
    /**
     * The EvaluationResultsEntity model constructor.
     * @property {module:ai/skymind/skil/model/EvaluationResultsEntity}
     */
    EvaluationResultsEntity: EvaluationResultsEntity,
    /**
     * The ExampleEntity model constructor.
     * @property {module:ai/skymind/skil/model/ExampleEntity}
     */
    ExampleEntity: ExampleEntity,
    /**
     * The ExperimentEntity model constructor.
     * @property {module:ai/skymind/skil/model/ExperimentEntity}
     */
    ExperimentEntity: ExperimentEntity,
    /**
     * The FeedbackResponse model constructor.
     * @property {module:ai/skymind/skil/model/FeedbackResponse}
     */
    FeedbackResponse: FeedbackResponse,
    /**
     * The FileUpload model constructor.
     * @property {module:ai/skymind/skil/model/FileUpload}
     */
    FileUpload: FileUpload,
    /**
     * The FileUploadList model constructor.
     * @property {module:ai/skymind/skil/model/FileUploadList}
     */
    FileUploadList: FileUploadList,
    /**
     * The GoogleStorageResourceDetails model constructor.
     * @property {module:ai/skymind/skil/model/GoogleStorageResourceDetails}
     */
    GoogleStorageResourceDetails: GoogleStorageResourceDetails,
    /**
     * The HDFSResourceDetails model constructor.
     * @property {module:ai/skymind/skil/model/HDFSResourceDetails}
     */
    HDFSResourceDetails: HDFSResourceDetails,
    /**
     * The HDInsightResourceDetails model constructor.
     * @property {module:ai/skymind/skil/model/HDInsightResourceDetails}
     */
    HDInsightResourceDetails: HDInsightResourceDetails,
    /**
     * The INDArray model constructor.
     * @property {module:ai/skymind/skil/model/INDArray}
     */
    INDArray: INDArray,
    /**
     * The ImageTransformProcess model constructor.
     * @property {module:ai/skymind/skil/model/ImageTransformProcess}
     */
    ImageTransformProcess: ImageTransformProcess,
    /**
     * The ImportModelRequest model constructor.
     * @property {module:ai/skymind/skil/model/ImportModelRequest}
     */
    ImportModelRequest: ImportModelRequest,
    /**
     * The InlineResponse200 model constructor.
     * @property {module:ai/skymind/skil/model/InlineResponse200}
     */
    InlineResponse200: InlineResponse200,
    /**
     * The JobEntity model constructor.
     * @property {module:ai/skymind/skil/model/JobEntity}
     */
    JobEntity: JobEntity,
    /**
     * The JsonArrayResponse model constructor.
     * @property {module:ai/skymind/skil/model/JsonArrayResponse}
     */
    JsonArrayResponse: JsonArrayResponse,
    /**
     * The LogBatch model constructor.
     * @property {module:ai/skymind/skil/model/LogBatch}
     */
    LogBatch: LogBatch,
    /**
     * The LogRequest model constructor.
     * @property {module:ai/skymind/skil/model/LogRequest}
     */
    LogRequest: LogRequest,
    /**
     * The LoginRequest model constructor.
     * @property {module:ai/skymind/skil/model/LoginRequest}
     */
    LoginRequest: LoginRequest,
    /**
     * The LoginResponse model constructor.
     * @property {module:ai/skymind/skil/model/LoginResponse}
     */
    LoginResponse: LoginResponse,
    /**
     * The MetaData model constructor.
     * @property {module:ai/skymind/skil/model/MetaData}
     */
    MetaData: MetaData,
    /**
     * The MinibatchEntity model constructor.
     * @property {module:ai/skymind/skil/model/MinibatchEntity}
     */
    MinibatchEntity: MinibatchEntity,
    /**
     * The ModelEntity model constructor.
     * @property {module:ai/skymind/skil/model/ModelEntity}
     */
    ModelEntity: ModelEntity,
    /**
     * The ModelFeedBackRequest model constructor.
     * @property {module:ai/skymind/skil/model/ModelFeedBackRequest}
     */
    ModelFeedBackRequest: ModelFeedBackRequest,
    /**
     * The ModelHistoryEntity model constructor.
     * @property {module:ai/skymind/skil/model/ModelHistoryEntity}
     */
    ModelHistoryEntity: ModelHistoryEntity,
    /**
     * The ModelInstanceEntity model constructor.
     * @property {module:ai/skymind/skil/model/ModelInstanceEntity}
     */
    ModelInstanceEntity: ModelInstanceEntity,
    /**
     * The ModelResponse model constructor.
     * @property {module:ai/skymind/skil/model/ModelResponse}
     */
    ModelResponse: ModelResponse,
    /**
     * The ModelStatus model constructor.
     * @property {module:ai/skymind/skil/model/ModelStatus}
     */
    ModelStatus: ModelStatus,
    /**
     * The MultiClassClassificationResult model constructor.
     * @property {module:ai/skymind/skil/model/MultiClassClassificationResult}
     */
    MultiClassClassificationResult: MultiClassClassificationResult,
    /**
     * The MultiPredictRequest model constructor.
     * @property {module:ai/skymind/skil/model/MultiPredictRequest}
     */
    MultiPredictRequest: MultiPredictRequest,
    /**
     * The MultiPredictResponse model constructor.
     * @property {module:ai/skymind/skil/model/MultiPredictResponse}
     */
    MultiPredictResponse: MultiPredictResponse,
    /**
     * The NearestNeighborRequest model constructor.
     * @property {module:ai/skymind/skil/model/NearestNeighborRequest}
     */
    NearestNeighborRequest: NearestNeighborRequest,
    /**
     * The NearestNeighborsResult model constructor.
     * @property {module:ai/skymind/skil/model/NearestNeighborsResult}
     */
    NearestNeighborsResult: NearestNeighborsResult,
    /**
     * The NearestNeighborsResults model constructor.
     * @property {module:ai/skymind/skil/model/NearestNeighborsResults}
     */
    NearestNeighborsResults: NearestNeighborsResults,
    /**
     * The NewDeployment model constructor.
     * @property {module:ai/skymind/skil/model/NewDeployment}
     */
    NewDeployment: NewDeployment,
    /**
     * The Prediction model constructor.
     * @property {module:ai/skymind/skil/model/Prediction}
     */
    Prediction: Prediction,
    /**
     * The Resource model constructor.
     * @property {module:ai/skymind/skil/model/Resource}
     */
    Resource: Resource,
    /**
     * The ResourceCredentials model constructor.
     * @property {module:ai/skymind/skil/model/ResourceCredentials}
     */
    ResourceCredentials: ResourceCredentials,
    /**
     * The ResourceGroup model constructor.
     * @property {module:ai/skymind/skil/model/ResourceGroup}
     */
    ResourceGroup: ResourceGroup,
    /**
     * The RetrainingStatus model constructor.
     * @property {module:ai/skymind/skil/model/RetrainingStatus}
     */
    RetrainingStatus: RetrainingStatus,
    /**
     * The RevisionsWritten model constructor.
     * @property {module:ai/skymind/skil/model/RevisionsWritten}
     */
    RevisionsWritten: RevisionsWritten,
    /**
     * The Role model constructor.
     * @property {module:ai/skymind/skil/model/Role}
     */
    Role: Role,
    /**
     * The RollbackStatus model constructor.
     * @property {module:ai/skymind/skil/model/RollbackStatus}
     */
    RollbackStatus: RollbackStatus,
    /**
     * The S3ResourceDetails model constructor.
     * @property {module:ai/skymind/skil/model/S3ResourceDetails}
     */
    S3ResourceDetails: S3ResourceDetails,
    /**
     * The SetState model constructor.
     * @property {module:ai/skymind/skil/model/SetState}
     */
    SetState: SetState,
    /**
     * The SingleCSVRecord model constructor.
     * @property {module:ai/skymind/skil/model/SingleCSVRecord}
     */
    SingleCSVRecord: SingleCSVRecord,
    /**
     * The SingleRecord model constructor.
     * @property {module:ai/skymind/skil/model/SingleRecord}
     */
    SingleRecord: SingleRecord,
    /**
     * The Token model constructor.
     * @property {module:ai/skymind/skil/model/Token}
     */
    Token: Token,
    /**
     * The TokenGenerateRequest model constructor.
     * @property {module:ai/skymind/skil/model/TokenGenerateRequest}
     */
    TokenGenerateRequest: TokenGenerateRequest,
    /**
     * The TransformProcess model constructor.
     * @property {module:ai/skymind/skil/model/TransformProcess}
     */
    TransformProcess: TransformProcess,
    /**
     * The UpdateBestModel model constructor.
     * @property {module:ai/skymind/skil/model/UpdateBestModel}
     */
    UpdateBestModel: UpdateBestModel,
    /**
     * The User model constructor.
     * @property {module:ai/skymind/skil/model/User}
     */
    User: User,
    /**
     * The YARNResourceDetails model constructor.
     * @property {module:ai/skymind/skil/model/YARNResourceDetails}
     */
    YARNResourceDetails: YARNResourceDetails,
    /**
     * The DefaultApi service constructor.
     * @property {module:ai/skymind/skil/DefaultApi}
     */
    DefaultApi: DefaultApi
  };

  return exports;
}));
