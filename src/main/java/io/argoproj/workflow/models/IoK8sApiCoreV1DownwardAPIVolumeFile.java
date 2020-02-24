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
import io.argoproj.workflow.models.IoK8sApiCoreV1ObjectFieldSelector;
import io.argoproj.workflow.models.IoK8sApiCoreV1ResourceFieldSelector;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * IoK8sApiCoreV1DownwardAPIVolumeFile
 */

public class IoK8sApiCoreV1DownwardAPIVolumeFile {
  public static final String SERIALIZED_NAME_FIELD_REF = "fieldRef";
  @SerializedName(SERIALIZED_NAME_FIELD_REF)
  private IoK8sApiCoreV1ObjectFieldSelector fieldRef;

  public static final String SERIALIZED_NAME_MODE = "mode";
  @SerializedName(SERIALIZED_NAME_MODE)
  private Integer mode;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_RESOURCE_FIELD_REF = "resourceFieldRef";
  @SerializedName(SERIALIZED_NAME_RESOURCE_FIELD_REF)
  private IoK8sApiCoreV1ResourceFieldSelector resourceFieldRef;


  public IoK8sApiCoreV1DownwardAPIVolumeFile fieldRef(IoK8sApiCoreV1ObjectFieldSelector fieldRef) {
    
    this.fieldRef = fieldRef;
    return this;
  }

   /**
   * Get fieldRef
   * @return fieldRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IoK8sApiCoreV1ObjectFieldSelector getFieldRef() {
    return fieldRef;
  }


  public void setFieldRef(IoK8sApiCoreV1ObjectFieldSelector fieldRef) {
    this.fieldRef = fieldRef;
  }


  public IoK8sApiCoreV1DownwardAPIVolumeFile mode(Integer mode) {
    
    this.mode = mode;
    return this;
  }

   /**
   * Get mode
   * @return mode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMode() {
    return mode;
  }


  public void setMode(Integer mode) {
    this.mode = mode;
  }


  public IoK8sApiCoreV1DownwardAPIVolumeFile path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  public IoK8sApiCoreV1DownwardAPIVolumeFile resourceFieldRef(IoK8sApiCoreV1ResourceFieldSelector resourceFieldRef) {
    
    this.resourceFieldRef = resourceFieldRef;
    return this;
  }

   /**
   * Get resourceFieldRef
   * @return resourceFieldRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IoK8sApiCoreV1ResourceFieldSelector getResourceFieldRef() {
    return resourceFieldRef;
  }


  public void setResourceFieldRef(IoK8sApiCoreV1ResourceFieldSelector resourceFieldRef) {
    this.resourceFieldRef = resourceFieldRef;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1DownwardAPIVolumeFile ioK8sApiCoreV1DownwardAPIVolumeFile = (IoK8sApiCoreV1DownwardAPIVolumeFile) o;
    return Objects.equals(this.fieldRef, ioK8sApiCoreV1DownwardAPIVolumeFile.fieldRef) &&
        Objects.equals(this.mode, ioK8sApiCoreV1DownwardAPIVolumeFile.mode) &&
        Objects.equals(this.path, ioK8sApiCoreV1DownwardAPIVolumeFile.path) &&
        Objects.equals(this.resourceFieldRef, ioK8sApiCoreV1DownwardAPIVolumeFile.resourceFieldRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldRef, mode, path, resourceFieldRef);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1DownwardAPIVolumeFile {\n");
    sb.append("    fieldRef: ").append(toIndentedString(fieldRef)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    resourceFieldRef: ").append(toIndentedString(resourceFieldRef)).append("\n");
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
