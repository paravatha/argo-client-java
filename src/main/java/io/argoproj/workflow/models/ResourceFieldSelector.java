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
import io.argoproj.workflow.models.Quantity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ResourceFieldSelector
 */

public class ResourceFieldSelector {
  public static final String SERIALIZED_NAME_CONTAINER_NAME = "containerName";
  @SerializedName(SERIALIZED_NAME_CONTAINER_NAME)
  private String containerName;

  public static final String SERIALIZED_NAME_DIVISOR = "divisor";
  @SerializedName(SERIALIZED_NAME_DIVISOR)
  private Quantity divisor;

  public static final String SERIALIZED_NAME_RESOURCE = "resource";
  @SerializedName(SERIALIZED_NAME_RESOURCE)
  private String resource;


  public ResourceFieldSelector containerName(String containerName) {
    
    this.containerName = containerName;
    return this;
  }

   /**
   * Get containerName
   * @return containerName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getContainerName() {
    return containerName;
  }


  public void setContainerName(String containerName) {
    this.containerName = containerName;
  }


  public ResourceFieldSelector divisor(Quantity divisor) {
    
    this.divisor = divisor;
    return this;
  }

   /**
   * Get divisor
   * @return divisor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Quantity getDivisor() {
    return divisor;
  }


  public void setDivisor(Quantity divisor) {
    this.divisor = divisor;
  }


  public ResourceFieldSelector resource(String resource) {
    
    this.resource = resource;
    return this;
  }

   /**
   * Get resource
   * @return resource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getResource() {
    return resource;
  }


  public void setResource(String resource) {
    this.resource = resource;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceFieldSelector resourceFieldSelector = (ResourceFieldSelector) o;
    return Objects.equals(this.containerName, resourceFieldSelector.containerName) &&
        Objects.equals(this.divisor, resourceFieldSelector.divisor) &&
        Objects.equals(this.resource, resourceFieldSelector.resource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containerName, divisor, resource);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceFieldSelector {\n");
    sb.append("    containerName: ").append(toIndentedString(containerName)).append("\n");
    sb.append("    divisor: ").append(toIndentedString(divisor)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
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

