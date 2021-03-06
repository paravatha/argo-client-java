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
import io.argoproj.workflow.models.OSSBucket;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * OSSArtifact
 */

public class OSSArtifact {
  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_O_S_S_BUCKET = "oSSBucket";
  @SerializedName(SERIALIZED_NAME_O_S_S_BUCKET)
  private OSSBucket oSSBucket;


  public OSSArtifact key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public OSSArtifact oSSBucket(OSSBucket oSSBucket) {
    
    this.oSSBucket = oSSBucket;
    return this;
  }

   /**
   * Get oSSBucket
   * @return oSSBucket
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OSSBucket getoSSBucket() {
    return oSSBucket;
  }


  public void setoSSBucket(OSSBucket oSSBucket) {
    this.oSSBucket = oSSBucket;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OSSArtifact osSArtifact = (OSSArtifact) o;
    return Objects.equals(this.key, osSArtifact.key) &&
        Objects.equals(this.oSSBucket, osSArtifact.oSSBucket);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, oSSBucket);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OSSArtifact {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    oSSBucket: ").append(toIndentedString(oSSBucket)).append("\n");
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

