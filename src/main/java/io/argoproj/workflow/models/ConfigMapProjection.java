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
import io.argoproj.workflow.models.KeyToPath;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Adapts a ConfigMap into a projected volume.  The contents of the target ConfigMap&#39;s Data field will be presented in a projected volume as files using the keys in the Data field as the file names, unless the items element is populated with specific mappings of keys to paths. Note that this is identical to a configmap volume source without the default mode.
 */
@ApiModel(description = "Adapts a ConfigMap into a projected volume.  The contents of the target ConfigMap's Data field will be presented in a projected volume as files using the keys in the Data field as the file names, unless the items element is populated with specific mappings of keys to paths. Note that this is identical to a configmap volume source without the default mode.")

public class ConfigMapProjection {
  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<KeyToPath> items = null;

  public static final String SERIALIZED_NAME_LOCAL_OBJECT_REFERENCE = "localObjectReference";
  @SerializedName(SERIALIZED_NAME_LOCAL_OBJECT_REFERENCE)
  private io.kubernetes.client.models.V1LocalObjectReference localObjectReference;

  public static final String SERIALIZED_NAME_OPTIONAL = "optional";
  @SerializedName(SERIALIZED_NAME_OPTIONAL)
  private Boolean optional;


  public ConfigMapProjection items(List<KeyToPath> items) {
    
    this.items = items;
    return this;
  }

  public ConfigMapProjection addItemsItem(KeyToPath itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<KeyToPath>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<KeyToPath> getItems() {
    return items;
  }


  public void setItems(List<KeyToPath> items) {
    this.items = items;
  }


  public ConfigMapProjection localObjectReference(io.kubernetes.client.models.V1LocalObjectReference localObjectReference) {
    
    this.localObjectReference = localObjectReference;
    return this;
  }

   /**
   * Get localObjectReference
   * @return localObjectReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public io.kubernetes.client.models.V1LocalObjectReference getLocalObjectReference() {
    return localObjectReference;
  }


  public void setLocalObjectReference(io.kubernetes.client.models.V1LocalObjectReference localObjectReference) {
    this.localObjectReference = localObjectReference;
  }


  public ConfigMapProjection optional(Boolean optional) {
    
    this.optional = optional;
    return this;
  }

   /**
   * Get optional
   * @return optional
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getOptional() {
    return optional;
  }


  public void setOptional(Boolean optional) {
    this.optional = optional;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigMapProjection configMapProjection = (ConfigMapProjection) o;
    return Objects.equals(this.items, configMapProjection.items) &&
        Objects.equals(this.localObjectReference, configMapProjection.localObjectReference) &&
        Objects.equals(this.optional, configMapProjection.optional);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, localObjectReference, optional);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigMapProjection {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    localObjectReference: ").append(toIndentedString(localObjectReference)).append("\n");
    sb.append("    optional: ").append(toIndentedString(optional)).append("\n");
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

