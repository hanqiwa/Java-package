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
import java.time.OffsetDateTime;

/**
 * Describes the state of a migration at a certain point.
 */
@ApiModel(description = "Describes the state of a migration at a certain point.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-04-23T13:45:08.546919Z[Etc/UTC]")
public class V1alpha1MigrationCondition {
  public static final String SERIALIZED_NAME_LAST_UPDATE_TIME = "lastUpdateTime";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATE_TIME)
  private OffsetDateTime lastUpdateTime;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;


  public V1alpha1MigrationCondition lastUpdateTime(OffsetDateTime lastUpdateTime) {

    this.lastUpdateTime = lastUpdateTime;
    return this;
  }

   /**
   * The last time this condition was updated.
   * @return lastUpdateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The last time this condition was updated.")

  public OffsetDateTime getLastUpdateTime() {
    return lastUpdateTime;
  }


  public void setLastUpdateTime(OffsetDateTime lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
  }


  public V1alpha1MigrationCondition message(String message) {

    this.message = message;
    return this;
  }

   /**
   * A human readable message indicating details about the transition.
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A human readable message indicating details about the transition.")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public V1alpha1MigrationCondition reason(String reason) {

    this.reason = reason;
    return this;
  }

   /**
   * The reason for the condition&#39;s last transition.
   * @return reason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The reason for the condition's last transition.")

  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    this.reason = reason;
  }


  public V1alpha1MigrationCondition status(String status) {

    this.status = status;
    return this;
  }

   /**
   * Status of the condition, one of True, False, Unknown.
   * @return status
  **/
  @ApiModelProperty(required = true, value = "Status of the condition, one of True, False, Unknown.")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public V1alpha1MigrationCondition type(String type) {

    this.type = type;
    return this;
  }

   /**
   * Type of the condition.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Type of the condition.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1MigrationCondition v1alpha1MigrationCondition = (V1alpha1MigrationCondition) o;
    return Objects.equals(this.lastUpdateTime, v1alpha1MigrationCondition.lastUpdateTime) &&
        Objects.equals(this.message, v1alpha1MigrationCondition.message) &&
        Objects.equals(this.reason, v1alpha1MigrationCondition.reason) &&
        Objects.equals(this.status, v1alpha1MigrationCondition.status) &&
        Objects.equals(this.type, v1alpha1MigrationCondition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastUpdateTime, message, reason, status, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1MigrationCondition {\n");
    sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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