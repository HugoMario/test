package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ActivationResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-01-19T02:20:42.654Z")
public class ActivationResponse {
  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    @SerializedName("SUCCESS")
    SUCCESS("SUCCESS"),
    
    @SerializedName("FAILURE")
    FAILURE("FAILURE"),
    
    @SerializedName("PENDING")
    PENDING("PENDING");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("message")
  private String message = null;

  @SerializedName("offlineActivationText")
  private String offlineActivationText = null;

  public ActivationResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "SUCCESS", value = "")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public ActivationResponse message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(example = "the server was successfully activated", value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ActivationResponse offlineActivationText(String offlineActivationText) {
    this.offlineActivationText = offlineActivationText;
    return this;
  }

   /**
   * Get offlineActivationText
   * @return offlineActivationText
  **/
  @ApiModelProperty(example = "activation code &#x60;12345abcde&#x60;", value = "")
  public String getOfflineActivationText() {
    return offlineActivationText;
  }

  public void setOfflineActivationText(String offlineActivationText) {
    this.offlineActivationText = offlineActivationText;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivationResponse activationResponse = (ActivationResponse) o;
    return Objects.equals(this.status, activationResponse.status) &&
        Objects.equals(this.message, activationResponse.message) &&
        Objects.equals(this.offlineActivationText, activationResponse.offlineActivationText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, message, offlineActivationText);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivationResponse {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    offlineActivationText: ").append(toIndentedString(offlineActivationText)).append("\n");
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

