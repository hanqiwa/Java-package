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
 * NodeRuntimeHandlerFeatures is a set of runtime features.
 */
@ApiModel(description = "NodeRuntimeHandlerFeatures is a set of runtime features.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:08.546919Z[Etc/UTC]")
public class V1NodeRuntimeHandlerFeatures {
  public static final String SERIALIZED_NAME_RECURSIVE_READ_ONLY_MOUNTS = "recursiveReadOnlyMounts";
  @SerializedName(SERIALIZED_NAME_RECURSIVE_READ_ONLY_MOUNTS)
  private Boolean recursiveReadOnlyMounts;


  public V1NodeRuntimeHandlerFeatures recursiveReadOnlyMounts(Boolean recursiveReadOnlyMounts) {

    this.recursiveReadOnlyMounts = recursiveReadOnlyMounts;
    return this;
  }

   /**
   * RecursiveReadOnlyMounts is set to true if the runtime handler supports RecursiveReadOnlyMounts.
   * @return recursiveReadOnlyMounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "RecursiveReadOnlyMounts is set to true if the runtime handler supports RecursiveReadOnlyMounts.")

  public Boolean getRecursiveReadOnlyMounts() {
    return recursiveReadOnlyMounts;
  }


  public void setRecursiveReadOnlyMounts(Boolean recursiveReadOnlyMounts) {
    this.recursiveReadOnlyMounts = recursiveReadOnlyMounts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1NodeRuntimeHandlerFeatures v1NodeRuntimeHandlerFeatures = (V1NodeRuntimeHandlerFeatures) o;
    return Objects.equals(this.recursiveReadOnlyMounts, v1NodeRuntimeHandlerFeatures.recursiveReadOnlyMounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recursiveReadOnlyMounts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1NodeRuntimeHandlerFeatures {\n");
    sb.append("    recursiveReadOnlyMounts: ").append(toIndentedString(recursiveReadOnlyMounts)).append("\n");
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