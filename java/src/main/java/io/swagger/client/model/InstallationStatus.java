package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * InstallationStatus
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-01-19T04:26:49.011Z")
public class InstallationStatus {
  @SerializedName("hasAdmin")
  private Boolean hasAdmin = null;

  @SerializedName("isConfigured")
  private Boolean isConfigured = null;

  @SerializedName("isLicensed")
  private Boolean isLicensed = null;

  @SerializedName("hasActiveLicense")
  private Boolean hasActiveLicense = null;

  @SerializedName("lastError")
  private String lastError = null;

  public InstallationStatus hasAdmin(Boolean hasAdmin) {
    this.hasAdmin = hasAdmin;
    return this;
  }

   /**
   * returns whether or not an admin user has been created
   * @return hasAdmin
  **/
  @ApiModelProperty(example = "null", required = true, value = "returns whether or not an admin user has been created")
  public Boolean getHasAdmin() {
    return hasAdmin;
  }

  public void setHasAdmin(Boolean hasAdmin) {
    this.hasAdmin = hasAdmin;
  }

  public InstallationStatus isConfigured(Boolean isConfigured) {
    this.isConfigured = isConfigured;
    return this;
  }

   /**
   * returns whether the system has configuration data
   * @return isConfigured
  **/
  @ApiModelProperty(example = "null", required = true, value = "returns whether the system has configuration data")
  public Boolean getIsConfigured() {
    return isConfigured;
  }

  public void setIsConfigured(Boolean isConfigured) {
    this.isConfigured = isConfigured;
  }

  public InstallationStatus isLicensed(Boolean isLicensed) {
    this.isLicensed = isLicensed;
    return this;
  }

   /**
   * returns whether the system has a license
   * @return isLicensed
  **/
  @ApiModelProperty(example = "null", required = true, value = "returns whether the system has a license")
  public Boolean getIsLicensed() {
    return isLicensed;
  }

  public void setIsLicensed(Boolean isLicensed) {
    this.isLicensed = isLicensed;
  }

  public InstallationStatus hasActiveLicense(Boolean hasActiveLicense) {
    this.hasActiveLicense = hasActiveLicense;
    return this;
  }

   /**
   * returns if the system has a valid, active license
   * @return hasActiveLicense
  **/
  @ApiModelProperty(example = "null", required = true, value = "returns if the system has a valid, active license")
  public Boolean getHasActiveLicense() {
    return hasActiveLicense;
  }

  public void setHasActiveLicense(Boolean hasActiveLicense) {
    this.hasActiveLicense = hasActiveLicense;
  }

  public InstallationStatus lastError(String lastError) {
    this.lastError = lastError;
    return this;
  }

   /**
   * Get lastError
   * @return lastError
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getLastError() {
    return lastError;
  }

  public void setLastError(String lastError) {
    this.lastError = lastError;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstallationStatus installationStatus = (InstallationStatus) o;
    return Objects.equals(this.hasAdmin, installationStatus.hasAdmin) &&
        Objects.equals(this.isConfigured, installationStatus.isConfigured) &&
        Objects.equals(this.isLicensed, installationStatus.isLicensed) &&
        Objects.equals(this.hasActiveLicense, installationStatus.hasActiveLicense) &&
        Objects.equals(this.lastError, installationStatus.lastError);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hasAdmin, isConfigured, isLicensed, hasActiveLicense, lastError);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstallationStatus {\n");
    
    sb.append("    hasAdmin: ").append(toIndentedString(hasAdmin)).append("\n");
    sb.append("    isConfigured: ").append(toIndentedString(isConfigured)).append("\n");
    sb.append("    isLicensed: ").append(toIndentedString(isLicensed)).append("\n");
    sb.append("    hasActiveLicense: ").append(toIndentedString(hasActiveLicense)).append("\n");
    sb.append("    lastError: ").append(toIndentedString(lastError)).append("\n");
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

