/*
Copyright 2024 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.openapi.models;

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
 * The names of the group, the version, and the resource.
 */
@ApiModel(description = "The names of the group, the version, and the resource.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:08.546919Z[Etc/UTC]")
public class V1alpha1GroupVersionResource {
  public static final String SERIALIZED_NAME_GROUP = "group";
  @SerializedName(SERIALIZED_NAME_GROUP)
  private String group;

  public static final String SERIALIZED_NAME_RESOURCE = "resource";
  @SerializedName(SERIALIZED_NAME_RESOURCE)
  private String resource;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;


  public V1alpha1GroupVersionResource group(String group) {

    this.group = group;
    return this;
  }

   /**
   * The name of the group.
   * @return group
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the group.")

  public String getGroup() {
    return group;
  }


  public void setGroup(String group) {
    this.group = group;
  }


  public V1alpha1GroupVersionResource resource(String resource) {

    this.resource = resource;
    return this;
  }

   /**
   * The name of the resource.
   * @return resource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the resource.")

  public String getResource() {
    return resource;
  }


  public void setResource(String resource) {
    this.resource = resource;
  }


  public V1alpha1GroupVersionResource version(String version) {

    this.version = version;
    return this;
  }

   /**
   * The name of the version.
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the version.")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1GroupVersionResource v1alpha1GroupVersionResource = (V1alpha1GroupVersionResource) o;
    return Objects.equals(this.group, v1alpha1GroupVersionResource.group) &&
        Objects.equals(this.resource, v1alpha1GroupVersionResource.resource) &&
        Objects.equals(this.version, v1alpha1GroupVersionResource.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, resource, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1GroupVersionResource {\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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