package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * ActivationRequest
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-01-19T04:26:49.011Z")
public class ActivationRequest {
  @SerializedName("offlineActivation")
  private Boolean offlineActivation = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("lastName")
  private String lastName = null;

  @SerializedName("organization")
  private String organization = null;

  public ActivationRequest offlineActivation(Boolean offlineActivation) {
    this.offlineActivation = offlineActivation;
    return this;
  }

   /**
   * request offline activation, for non-internet connected networks
   * @return offlineActivation
  **/
  @ApiModelProperty(example = "null", value = "request offline activation, for non-internet connected networks")
  public Boolean getOfflineActivation() {
    return offlineActivation;
  }

  public void setOfflineActivation(Boolean offlineActivation) {
    this.offlineActivation = offlineActivation;
  }

  public ActivationRequest email(String email) {
    this.email = email;
    return this;
  }

   /**
   * the email address for the administrator of the server
   * @return email
  **/
  @ApiModelProperty(example = "foo@bar.com", required = true, value = "the email address for the administrator of the server")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public ActivationRequest firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * the administrator's first name
   * @return firstName
  **/
  @ApiModelProperty(example = "Fred", value = "the administrator's first name")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public ActivationRequest lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * the administrator's last name
   * @return lastName
  **/
  @ApiModelProperty(example = "Meyer", value = "the administrator's last name")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public ActivationRequest organization(String organization) {
    this.organization = organization;
    return this;
  }

   /**
   * the organization installing the service
   * @return organization
  **/
  @ApiModelProperty(example = "Your Organization", value = "the organization installing the service")
  public String getOrganization() {
    return organization;
  }

  public void setOrganization(String organization) {
    this.organization = organization;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivationRequest activationRequest = (ActivationRequest) o;
    return Objects.equals(this.offlineActivation, activationRequest.offlineActivation) &&
        Objects.equals(this.email, activationRequest.email) &&
        Objects.equals(this.firstName, activationRequest.firstName) &&
        Objects.equals(this.lastName, activationRequest.lastName) &&
        Objects.equals(this.organization, activationRequest.organization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offlineActivation, email, firstName, lastName, organization);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivationRequest {\n");
    
    sb.append("    offlineActivation: ").append(toIndentedString(offlineActivation)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
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

