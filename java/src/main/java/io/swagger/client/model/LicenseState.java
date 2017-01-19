package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * LicenseState
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-01-19T02:20:42.654Z")
public class LicenseState {
  @SerializedName("isActive")
  private Boolean isActive = null;

  public LicenseState isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }

   /**
   * Get isActive
   * @return isActive
  **/
  @ApiModelProperty(example = "null", required = true, value = "")
  public Boolean getIsActive() {
    return isActive;
  }

  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LicenseState licenseState = (LicenseState) o;
    return Objects.equals(this.isActive, licenseState.isActive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isActive);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LicenseState {\n");
    
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
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

