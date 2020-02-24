/*
 * Argo
 * Workflow Service API performs CRUD actions against application resources
 *
 * The version of the OpenAPI document: latest
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.argoproj.workflow.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * S3Bucket
 */

public class S3Bucket {
  public static final String SERIALIZED_NAME_ACCESS_KEY_SECRET = "accessKeySecret";
  @SerializedName(SERIALIZED_NAME_ACCESS_KEY_SECRET)
  private io.kubernetes.client.models.V1SecretKeySelector accessKeySecret;

  public static final String SERIALIZED_NAME_BUCKET = "bucket";
  @SerializedName(SERIALIZED_NAME_BUCKET)
  private String bucket;

  public static final String SERIALIZED_NAME_ENDPOINT = "endpoint";
  @SerializedName(SERIALIZED_NAME_ENDPOINT)
  private String endpoint;

  public static final String SERIALIZED_NAME_INSECURE = "insecure";
  @SerializedName(SERIALIZED_NAME_INSECURE)
  private Boolean insecure;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region;

  public static final String SERIALIZED_NAME_ROLE_A_R_N = "roleARN";
  @SerializedName(SERIALIZED_NAME_ROLE_A_R_N)
  private String roleARN;

  public static final String SERIALIZED_NAME_SECRET_KEY_SECRET = "secretKeySecret";
  @SerializedName(SERIALIZED_NAME_SECRET_KEY_SECRET)
  private io.kubernetes.client.models.V1SecretKeySelector secretKeySecret;


  public S3Bucket accessKeySecret(io.kubernetes.client.models.V1SecretKeySelector accessKeySecret) {
    
    this.accessKeySecret = accessKeySecret;
    return this;
  }

   /**
   * Get accessKeySecret
   * @return accessKeySecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public io.kubernetes.client.models.V1SecretKeySelector getAccessKeySecret() {
    return accessKeySecret;
  }


  public void setAccessKeySecret(io.kubernetes.client.models.V1SecretKeySelector accessKeySecret) {
    this.accessKeySecret = accessKeySecret;
  }


  public S3Bucket bucket(String bucket) {
    
    this.bucket = bucket;
    return this;
  }

   /**
   * Get bucket
   * @return bucket
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBucket() {
    return bucket;
  }


  public void setBucket(String bucket) {
    this.bucket = bucket;
  }


  public S3Bucket endpoint(String endpoint) {
    
    this.endpoint = endpoint;
    return this;
  }

   /**
   * Get endpoint
   * @return endpoint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEndpoint() {
    return endpoint;
  }


  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }


  public S3Bucket insecure(Boolean insecure) {
    
    this.insecure = insecure;
    return this;
  }

   /**
   * Get insecure
   * @return insecure
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getInsecure() {
    return insecure;
  }


  public void setInsecure(Boolean insecure) {
    this.insecure = insecure;
  }


  public S3Bucket region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRegion() {
    return region;
  }


  public void setRegion(String region) {
    this.region = region;
  }


  public S3Bucket roleARN(String roleARN) {
    
    this.roleARN = roleARN;
    return this;
  }

   /**
   * RoleARN is the Amazon Resource Name (ARN) of the role to assume.
   * @return roleARN
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "RoleARN is the Amazon Resource Name (ARN) of the role to assume.")

  public String getRoleARN() {
    return roleARN;
  }


  public void setRoleARN(String roleARN) {
    this.roleARN = roleARN;
  }


  public S3Bucket secretKeySecret(io.kubernetes.client.models.V1SecretKeySelector secretKeySecret) {
    
    this.secretKeySecret = secretKeySecret;
    return this;
  }

   /**
   * Get secretKeySecret
   * @return secretKeySecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public io.kubernetes.client.models.V1SecretKeySelector getSecretKeySecret() {
    return secretKeySecret;
  }


  public void setSecretKeySecret(io.kubernetes.client.models.V1SecretKeySelector secretKeySecret) {
    this.secretKeySecret = secretKeySecret;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    S3Bucket s3Bucket = (S3Bucket) o;
    return Objects.equals(this.accessKeySecret, s3Bucket.accessKeySecret) &&
        Objects.equals(this.bucket, s3Bucket.bucket) &&
        Objects.equals(this.endpoint, s3Bucket.endpoint) &&
        Objects.equals(this.insecure, s3Bucket.insecure) &&
        Objects.equals(this.region, s3Bucket.region) &&
        Objects.equals(this.roleARN, s3Bucket.roleARN) &&
        Objects.equals(this.secretKeySecret, s3Bucket.secretKeySecret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessKeySecret, bucket, endpoint, insecure, region, roleARN, secretKeySecret);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class S3Bucket {\n");
    sb.append("    accessKeySecret: ").append(toIndentedString(accessKeySecret)).append("\n");
    sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    insecure: ").append(toIndentedString(insecure)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    roleARN: ").append(toIndentedString(roleARN)).append("\n");
    sb.append("    secretKeySecret: ").append(toIndentedString(secretKeySecret)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
