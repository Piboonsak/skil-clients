/**
 * Endpoints
 * Endpoints API for different services in SKIL
 *
 * OpenAPI spec version: 1.2.0-rc1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package ai.skymind;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Date;
import ai.skymind.skil.model.*;

public class JsonUtil {
  public static GsonBuilder gsonBuilder;

  static {
    gsonBuilder = new GsonBuilder();
    gsonBuilder.serializeNulls();
    gsonBuilder.setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
    gsonBuilder.registerTypeAdapter(Date.class, new JsonDeserializer<Date>() {
      public Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        return new Date(json.getAsJsonPrimitive().getAsLong());
      }
    });
  }

  public static Gson getGson() {
    return gsonBuilder.create();
  }

  public static String serialize(Object obj){
    return getGson().toJson(obj);
  }

  public static <T> T deserializeToList(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getListTypeForDeserialization(cls));
  }

  public static <T> T deserializeToObject(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getTypeForDeserialization(cls));
  }

  public static Type getListTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("AccumulatedResults".equalsIgnoreCase(className)) {
      return new TypeToken<List<AccumulatedResults>>(){}.getType();
    }
    
    if ("AddCredentialsRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<AddCredentialsRequest>>(){}.getType();
    }
    
    if ("AddExampleRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<AddExampleRequest>>(){}.getType();
    }
    
    if ("AddModelHistoryRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<AddModelHistoryRequest>>(){}.getType();
    }
    
    if ("AddResourceRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<AddResourceRequest>>(){}.getType();
    }
    
    if ("AggregatePrediction".equalsIgnoreCase(className)) {
      return new TypeToken<List<AggregatePrediction>>(){}.getType();
    }
    
    if ("AuthPolicy".equalsIgnoreCase(className)) {
      return new TypeToken<List<AuthPolicy>>(){}.getType();
    }
    
    if ("AzureStorageResourceDetails".equalsIgnoreCase(className)) {
      return new TypeToken<List<AzureStorageResourceDetails>>(){}.getType();
    }
    
    if ("Base64NDArrayBody".equalsIgnoreCase(className)) {
      return new TypeToken<List<Base64NDArrayBody>>(){}.getType();
    }
    
    if ("Base64NDArrayBodyKNN".equalsIgnoreCase(className)) {
      return new TypeToken<List<Base64NDArrayBodyKNN>>(){}.getType();
    }
    
    if ("BatchCSVRecord".equalsIgnoreCase(className)) {
      return new TypeToken<List<BatchCSVRecord>>(){}.getType();
    }
    
    if ("BatchRecord".equalsIgnoreCase(className)) {
      return new TypeToken<List<BatchRecord>>(){}.getType();
    }
    
    if ("BestModel".equalsIgnoreCase(className)) {
      return new TypeToken<List<BestModel>>(){}.getType();
    }
    
    if ("ChangePasswordRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<ChangePasswordRequest>>(){}.getType();
    }
    
    if ("ClassificationResult".equalsIgnoreCase(className)) {
      return new TypeToken<List<ClassificationResult>>(){}.getType();
    }
    
    if ("CreateDeploymentRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<CreateDeploymentRequest>>(){}.getType();
    }
    
    if ("CreateJobRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<CreateJobRequest>>(){}.getType();
    }
    
    if ("DataProcResourceDetails".equalsIgnoreCase(className)) {
      return new TypeToken<List<DataProcResourceDetails>>(){}.getType();
    }
    
    if ("DeploymentObjects".equalsIgnoreCase(className)) {
      return new TypeToken<List<DeploymentObjects>>(){}.getType();
    }
    
    if ("DeploymentResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<DeploymentResponse>>(){}.getType();
    }
    
    if ("DetectedObject".equalsIgnoreCase(className)) {
      return new TypeToken<List<DetectedObject>>(){}.getType();
    }
    
    if ("DetectionResult".equalsIgnoreCase(className)) {
      return new TypeToken<List<DetectionResult>>(){}.getType();
    }
    
    if ("DownloadOutputFileRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<DownloadOutputFileRequest>>(){}.getType();
    }
    
    if ("EMRResourceDetails".equalsIgnoreCase(className)) {
      return new TypeToken<List<EMRResourceDetails>>(){}.getType();
    }
    
    if ("EvaluationResultsEntity".equalsIgnoreCase(className)) {
      return new TypeToken<List<EvaluationResultsEntity>>(){}.getType();
    }
    
    if ("ExampleEntity".equalsIgnoreCase(className)) {
      return new TypeToken<List<ExampleEntity>>(){}.getType();
    }
    
    if ("ExperimentEntity".equalsIgnoreCase(className)) {
      return new TypeToken<List<ExperimentEntity>>(){}.getType();
    }
    
    if ("FeedbackResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<FeedbackResponse>>(){}.getType();
    }
    
    if ("FileUpload".equalsIgnoreCase(className)) {
      return new TypeToken<List<FileUpload>>(){}.getType();
    }
    
    if ("FileUploadList".equalsIgnoreCase(className)) {
      return new TypeToken<List<FileUploadList>>(){}.getType();
    }
    
    if ("GoogleStorageResourceDetails".equalsIgnoreCase(className)) {
      return new TypeToken<List<GoogleStorageResourceDetails>>(){}.getType();
    }
    
    if ("HDFSResourceDetails".equalsIgnoreCase(className)) {
      return new TypeToken<List<HDFSResourceDetails>>(){}.getType();
    }
    
    if ("HDInsightResourceDetails".equalsIgnoreCase(className)) {
      return new TypeToken<List<HDInsightResourceDetails>>(){}.getType();
    }
    
    if ("INDArray".equalsIgnoreCase(className)) {
      return new TypeToken<List<INDArray>>(){}.getType();
    }
    
    if ("ImageTransformProcess".equalsIgnoreCase(className)) {
      return new TypeToken<List<ImageTransformProcess>>(){}.getType();
    }
    
    if ("ImportModelRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<ImportModelRequest>>(){}.getType();
    }
    
    if ("InlineResponse200".equalsIgnoreCase(className)) {
      return new TypeToken<List<InlineResponse200>>(){}.getType();
    }
    
    if ("JobEntity".equalsIgnoreCase(className)) {
      return new TypeToken<List<JobEntity>>(){}.getType();
    }
    
    if ("JsonArrayResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<JsonArrayResponse>>(){}.getType();
    }
    
    if ("LogBatch".equalsIgnoreCase(className)) {
      return new TypeToken<List<LogBatch>>(){}.getType();
    }
    
    if ("LogRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<LogRequest>>(){}.getType();
    }
    
    if ("LoginRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<LoginRequest>>(){}.getType();
    }
    
    if ("LoginResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<LoginResponse>>(){}.getType();
    }
    
    if ("MetaData".equalsIgnoreCase(className)) {
      return new TypeToken<List<MetaData>>(){}.getType();
    }
    
    if ("MinibatchEntity".equalsIgnoreCase(className)) {
      return new TypeToken<List<MinibatchEntity>>(){}.getType();
    }
    
    if ("ModelEntity".equalsIgnoreCase(className)) {
      return new TypeToken<List<ModelEntity>>(){}.getType();
    }
    
    if ("ModelFeedBackRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<ModelFeedBackRequest>>(){}.getType();
    }
    
    if ("ModelHistoryEntity".equalsIgnoreCase(className)) {
      return new TypeToken<List<ModelHistoryEntity>>(){}.getType();
    }
    
    if ("ModelInstanceEntity".equalsIgnoreCase(className)) {
      return new TypeToken<List<ModelInstanceEntity>>(){}.getType();
    }
    
    if ("ModelResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<ModelResponse>>(){}.getType();
    }
    
    if ("ModelStatus".equalsIgnoreCase(className)) {
      return new TypeToken<List<ModelStatus>>(){}.getType();
    }
    
    if ("MultiClassClassificationResult".equalsIgnoreCase(className)) {
      return new TypeToken<List<MultiClassClassificationResult>>(){}.getType();
    }
    
    if ("MultiPredictRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<MultiPredictRequest>>(){}.getType();
    }
    
    if ("MultiPredictResponse".equalsIgnoreCase(className)) {
      return new TypeToken<List<MultiPredictResponse>>(){}.getType();
    }
    
    if ("NearestNeighborRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<NearestNeighborRequest>>(){}.getType();
    }
    
    if ("NearestNeighborsResult".equalsIgnoreCase(className)) {
      return new TypeToken<List<NearestNeighborsResult>>(){}.getType();
    }
    
    if ("NearestNeighborsResults".equalsIgnoreCase(className)) {
      return new TypeToken<List<NearestNeighborsResults>>(){}.getType();
    }
    
    if ("NewDeployment".equalsIgnoreCase(className)) {
      return new TypeToken<List<NewDeployment>>(){}.getType();
    }
    
    if ("Prediction".equalsIgnoreCase(className)) {
      return new TypeToken<List<Prediction>>(){}.getType();
    }
    
    if ("Resource".equalsIgnoreCase(className)) {
      return new TypeToken<List<Resource>>(){}.getType();
    }
    
    if ("ResourceCredentials".equalsIgnoreCase(className)) {
      return new TypeToken<List<ResourceCredentials>>(){}.getType();
    }
    
    if ("ResourceGroup".equalsIgnoreCase(className)) {
      return new TypeToken<List<ResourceGroup>>(){}.getType();
    }
    
    if ("RetrainingStatus".equalsIgnoreCase(className)) {
      return new TypeToken<List<RetrainingStatus>>(){}.getType();
    }
    
    if ("RevisionsWritten".equalsIgnoreCase(className)) {
      return new TypeToken<List<RevisionsWritten>>(){}.getType();
    }
    
    if ("Role".equalsIgnoreCase(className)) {
      return new TypeToken<List<Role>>(){}.getType();
    }
    
    if ("RollbackStatus".equalsIgnoreCase(className)) {
      return new TypeToken<List<RollbackStatus>>(){}.getType();
    }
    
    if ("S3ResourceDetails".equalsIgnoreCase(className)) {
      return new TypeToken<List<S3ResourceDetails>>(){}.getType();
    }
    
    if ("SetState".equalsIgnoreCase(className)) {
      return new TypeToken<List<SetState>>(){}.getType();
    }
    
    if ("SingleCSVRecord".equalsIgnoreCase(className)) {
      return new TypeToken<List<SingleCSVRecord>>(){}.getType();
    }
    
    if ("SingleRecord".equalsIgnoreCase(className)) {
      return new TypeToken<List<SingleRecord>>(){}.getType();
    }
    
    if ("Token".equalsIgnoreCase(className)) {
      return new TypeToken<List<Token>>(){}.getType();
    }
    
    if ("TokenGenerateRequest".equalsIgnoreCase(className)) {
      return new TypeToken<List<TokenGenerateRequest>>(){}.getType();
    }
    
    if ("TransformProcess".equalsIgnoreCase(className)) {
      return new TypeToken<List<TransformProcess>>(){}.getType();
    }
    
    if ("UpdateBestModel".equalsIgnoreCase(className)) {
      return new TypeToken<List<UpdateBestModel>>(){}.getType();
    }
    
    if ("User".equalsIgnoreCase(className)) {
      return new TypeToken<List<User>>(){}.getType();
    }
    
    if ("YARNResourceDetails".equalsIgnoreCase(className)) {
      return new TypeToken<List<YARNResourceDetails>>(){}.getType();
    }
    
    return new TypeToken<List<Object>>(){}.getType();
  }

  public static Type getTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("AccumulatedResults".equalsIgnoreCase(className)) {
      return new TypeToken<AccumulatedResults>(){}.getType();
    }
    
    if ("AddCredentialsRequest".equalsIgnoreCase(className)) {
      return new TypeToken<AddCredentialsRequest>(){}.getType();
    }
    
    if ("AddExampleRequest".equalsIgnoreCase(className)) {
      return new TypeToken<AddExampleRequest>(){}.getType();
    }
    
    if ("AddModelHistoryRequest".equalsIgnoreCase(className)) {
      return new TypeToken<AddModelHistoryRequest>(){}.getType();
    }
    
    if ("AddResourceRequest".equalsIgnoreCase(className)) {
      return new TypeToken<AddResourceRequest>(){}.getType();
    }
    
    if ("AggregatePrediction".equalsIgnoreCase(className)) {
      return new TypeToken<AggregatePrediction>(){}.getType();
    }
    
    if ("AuthPolicy".equalsIgnoreCase(className)) {
      return new TypeToken<AuthPolicy>(){}.getType();
    }
    
    if ("AzureStorageResourceDetails".equalsIgnoreCase(className)) {
      return new TypeToken<AzureStorageResourceDetails>(){}.getType();
    }
    
    if ("Base64NDArrayBody".equalsIgnoreCase(className)) {
      return new TypeToken<Base64NDArrayBody>(){}.getType();
    }
    
    if ("Base64NDArrayBodyKNN".equalsIgnoreCase(className)) {
      return new TypeToken<Base64NDArrayBodyKNN>(){}.getType();
    }
    
    if ("BatchCSVRecord".equalsIgnoreCase(className)) {
      return new TypeToken<BatchCSVRecord>(){}.getType();
    }
    
    if ("BatchRecord".equalsIgnoreCase(className)) {
      return new TypeToken<BatchRecord>(){}.getType();
    }
    
    if ("BestModel".equalsIgnoreCase(className)) {
      return new TypeToken<BestModel>(){}.getType();
    }
    
    if ("ChangePasswordRequest".equalsIgnoreCase(className)) {
      return new TypeToken<ChangePasswordRequest>(){}.getType();
    }
    
    if ("ClassificationResult".equalsIgnoreCase(className)) {
      return new TypeToken<ClassificationResult>(){}.getType();
    }
    
    if ("CreateDeploymentRequest".equalsIgnoreCase(className)) {
      return new TypeToken<CreateDeploymentRequest>(){}.getType();
    }
    
    if ("CreateJobRequest".equalsIgnoreCase(className)) {
      return new TypeToken<CreateJobRequest>(){}.getType();
    }
    
    if ("DataProcResourceDetails".equalsIgnoreCase(className)) {
      return new TypeToken<DataProcResourceDetails>(){}.getType();
    }
    
    if ("DeploymentObjects".equalsIgnoreCase(className)) {
      return new TypeToken<DeploymentObjects>(){}.getType();
    }
    
    if ("DeploymentResponse".equalsIgnoreCase(className)) {
      return new TypeToken<DeploymentResponse>(){}.getType();
    }
    
    if ("DetectedObject".equalsIgnoreCase(className)) {
      return new TypeToken<DetectedObject>(){}.getType();
    }
    
    if ("DetectionResult".equalsIgnoreCase(className)) {
      return new TypeToken<DetectionResult>(){}.getType();
    }
    
    if ("DownloadOutputFileRequest".equalsIgnoreCase(className)) {
      return new TypeToken<DownloadOutputFileRequest>(){}.getType();
    }
    
    if ("EMRResourceDetails".equalsIgnoreCase(className)) {
      return new TypeToken<EMRResourceDetails>(){}.getType();
    }
    
    if ("EvaluationResultsEntity".equalsIgnoreCase(className)) {
      return new TypeToken<EvaluationResultsEntity>(){}.getType();
    }
    
    if ("ExampleEntity".equalsIgnoreCase(className)) {
      return new TypeToken<ExampleEntity>(){}.getType();
    }
    
    if ("ExperimentEntity".equalsIgnoreCase(className)) {
      return new TypeToken<ExperimentEntity>(){}.getType();
    }
    
    if ("FeedbackResponse".equalsIgnoreCase(className)) {
      return new TypeToken<FeedbackResponse>(){}.getType();
    }
    
    if ("FileUpload".equalsIgnoreCase(className)) {
      return new TypeToken<FileUpload>(){}.getType();
    }
    
    if ("FileUploadList".equalsIgnoreCase(className)) {
      return new TypeToken<FileUploadList>(){}.getType();
    }
    
    if ("GoogleStorageResourceDetails".equalsIgnoreCase(className)) {
      return new TypeToken<GoogleStorageResourceDetails>(){}.getType();
    }
    
    if ("HDFSResourceDetails".equalsIgnoreCase(className)) {
      return new TypeToken<HDFSResourceDetails>(){}.getType();
    }
    
    if ("HDInsightResourceDetails".equalsIgnoreCase(className)) {
      return new TypeToken<HDInsightResourceDetails>(){}.getType();
    }
    
    if ("INDArray".equalsIgnoreCase(className)) {
      return new TypeToken<INDArray>(){}.getType();
    }
    
    if ("ImageTransformProcess".equalsIgnoreCase(className)) {
      return new TypeToken<ImageTransformProcess>(){}.getType();
    }
    
    if ("ImportModelRequest".equalsIgnoreCase(className)) {
      return new TypeToken<ImportModelRequest>(){}.getType();
    }
    
    if ("InlineResponse200".equalsIgnoreCase(className)) {
      return new TypeToken<InlineResponse200>(){}.getType();
    }
    
    if ("JobEntity".equalsIgnoreCase(className)) {
      return new TypeToken<JobEntity>(){}.getType();
    }
    
    if ("JsonArrayResponse".equalsIgnoreCase(className)) {
      return new TypeToken<JsonArrayResponse>(){}.getType();
    }
    
    if ("LogBatch".equalsIgnoreCase(className)) {
      return new TypeToken<LogBatch>(){}.getType();
    }
    
    if ("LogRequest".equalsIgnoreCase(className)) {
      return new TypeToken<LogRequest>(){}.getType();
    }
    
    if ("LoginRequest".equalsIgnoreCase(className)) {
      return new TypeToken<LoginRequest>(){}.getType();
    }
    
    if ("LoginResponse".equalsIgnoreCase(className)) {
      return new TypeToken<LoginResponse>(){}.getType();
    }
    
    if ("MetaData".equalsIgnoreCase(className)) {
      return new TypeToken<MetaData>(){}.getType();
    }
    
    if ("MinibatchEntity".equalsIgnoreCase(className)) {
      return new TypeToken<MinibatchEntity>(){}.getType();
    }
    
    if ("ModelEntity".equalsIgnoreCase(className)) {
      return new TypeToken<ModelEntity>(){}.getType();
    }
    
    if ("ModelFeedBackRequest".equalsIgnoreCase(className)) {
      return new TypeToken<ModelFeedBackRequest>(){}.getType();
    }
    
    if ("ModelHistoryEntity".equalsIgnoreCase(className)) {
      return new TypeToken<ModelHistoryEntity>(){}.getType();
    }
    
    if ("ModelInstanceEntity".equalsIgnoreCase(className)) {
      return new TypeToken<ModelInstanceEntity>(){}.getType();
    }
    
    if ("ModelResponse".equalsIgnoreCase(className)) {
      return new TypeToken<ModelResponse>(){}.getType();
    }
    
    if ("ModelStatus".equalsIgnoreCase(className)) {
      return new TypeToken<ModelStatus>(){}.getType();
    }
    
    if ("MultiClassClassificationResult".equalsIgnoreCase(className)) {
      return new TypeToken<MultiClassClassificationResult>(){}.getType();
    }
    
    if ("MultiPredictRequest".equalsIgnoreCase(className)) {
      return new TypeToken<MultiPredictRequest>(){}.getType();
    }
    
    if ("MultiPredictResponse".equalsIgnoreCase(className)) {
      return new TypeToken<MultiPredictResponse>(){}.getType();
    }
    
    if ("NearestNeighborRequest".equalsIgnoreCase(className)) {
      return new TypeToken<NearestNeighborRequest>(){}.getType();
    }
    
    if ("NearestNeighborsResult".equalsIgnoreCase(className)) {
      return new TypeToken<NearestNeighborsResult>(){}.getType();
    }
    
    if ("NearestNeighborsResults".equalsIgnoreCase(className)) {
      return new TypeToken<NearestNeighborsResults>(){}.getType();
    }
    
    if ("NewDeployment".equalsIgnoreCase(className)) {
      return new TypeToken<NewDeployment>(){}.getType();
    }
    
    if ("Prediction".equalsIgnoreCase(className)) {
      return new TypeToken<Prediction>(){}.getType();
    }
    
    if ("Resource".equalsIgnoreCase(className)) {
      return new TypeToken<Resource>(){}.getType();
    }
    
    if ("ResourceCredentials".equalsIgnoreCase(className)) {
      return new TypeToken<ResourceCredentials>(){}.getType();
    }
    
    if ("ResourceGroup".equalsIgnoreCase(className)) {
      return new TypeToken<ResourceGroup>(){}.getType();
    }
    
    if ("RetrainingStatus".equalsIgnoreCase(className)) {
      return new TypeToken<RetrainingStatus>(){}.getType();
    }
    
    if ("RevisionsWritten".equalsIgnoreCase(className)) {
      return new TypeToken<RevisionsWritten>(){}.getType();
    }
    
    if ("Role".equalsIgnoreCase(className)) {
      return new TypeToken<Role>(){}.getType();
    }
    
    if ("RollbackStatus".equalsIgnoreCase(className)) {
      return new TypeToken<RollbackStatus>(){}.getType();
    }
    
    if ("S3ResourceDetails".equalsIgnoreCase(className)) {
      return new TypeToken<S3ResourceDetails>(){}.getType();
    }
    
    if ("SetState".equalsIgnoreCase(className)) {
      return new TypeToken<SetState>(){}.getType();
    }
    
    if ("SingleCSVRecord".equalsIgnoreCase(className)) {
      return new TypeToken<SingleCSVRecord>(){}.getType();
    }
    
    if ("SingleRecord".equalsIgnoreCase(className)) {
      return new TypeToken<SingleRecord>(){}.getType();
    }
    
    if ("Token".equalsIgnoreCase(className)) {
      return new TypeToken<Token>(){}.getType();
    }
    
    if ("TokenGenerateRequest".equalsIgnoreCase(className)) {
      return new TypeToken<TokenGenerateRequest>(){}.getType();
    }
    
    if ("TransformProcess".equalsIgnoreCase(className)) {
      return new TypeToken<TransformProcess>(){}.getType();
    }
    
    if ("UpdateBestModel".equalsIgnoreCase(className)) {
      return new TypeToken<UpdateBestModel>(){}.getType();
    }
    
    if ("User".equalsIgnoreCase(className)) {
      return new TypeToken<User>(){}.getType();
    }
    
    if ("YARNResourceDetails".equalsIgnoreCase(className)) {
      return new TypeToken<YARNResourceDetails>(){}.getType();
    }
    
    return new TypeToken<Object>(){}.getType();
  }

};
