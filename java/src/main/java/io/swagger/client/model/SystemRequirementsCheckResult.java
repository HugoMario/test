package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * SystemRequirementsCheckResult
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-01-19T02:20:42.654Z")
public class SystemRequirementsCheckResult {
  @SerializedName("meetsCriteria")
  private Boolean meetsCriteria = null;

  @SerializedName("unsatisfiedRequirements")
  private List<String> unsatisfiedRequirements = new ArrayList<String>();

  @SerializedName("minProcessors")
  private Integer minProcessors = null;

  @SerializedName("minFreeMemory")
  private Long minFreeMemory = null;

  @SerializedName("minTotalMemory")
  private Long minTotalMemory = null;

  @SerializedName("minFreeSpace")
  private Long minFreeSpace = null;

  public SystemRequirementsCheckResult meetsCriteria(Boolean meetsCriteria) {
    this.meetsCriteria = meetsCriteria;
    return this;
  }

   /**
   * returns true if the system meets required criteria
   * @return meetsCriteria
  **/
  @ApiModelProperty(example = "null", required = true, value = "returns true if the system meets required criteria")
  public Boolean getMeetsCriteria() {
    return meetsCriteria;
  }

  public void setMeetsCriteria(Boolean meetsCriteria) {
    this.meetsCriteria = meetsCriteria;
  }

  public SystemRequirementsCheckResult unsatisfiedRequirements(List<String> unsatisfiedRequirements) {
    this.unsatisfiedRequirements = unsatisfiedRequirements;
    return this;
  }

  public SystemRequirementsCheckResult addUnsatisfiedRequirementsItem(String unsatisfiedRequirementsItem) {
    this.unsatisfiedRequirements.add(unsatisfiedRequirementsItem);
    return this;
  }

   /**
   * an array of unsatisfied criteria
   * @return unsatisfiedRequirements
  **/
  @ApiModelProperty(example = "null", value = "an array of unsatisfied criteria")
  public List<String> getUnsatisfiedRequirements() {
    return unsatisfiedRequirements;
  }

  public void setUnsatisfiedRequirements(List<String> unsatisfiedRequirements) {
    this.unsatisfiedRequirements = unsatisfiedRequirements;
  }

  public SystemRequirementsCheckResult minProcessors(Integer minProcessors) {
    this.minProcessors = minProcessors;
    return this;
  }

   /**
   * returns the minimum amout of processors needed
   * @return minProcessors
  **/
  @ApiModelProperty(example = "null", value = "returns the minimum amout of processors needed")
  public Integer getMinProcessors() {
    return minProcessors;
  }

  public void setMinProcessors(Integer minProcessors) {
    this.minProcessors = minProcessors;
  }

  public SystemRequirementsCheckResult minFreeMemory(Long minFreeMemory) {
    this.minFreeMemory = minFreeMemory;
    return this;
  }

   /**
   * returns the minimum amout of free memory needed
   * @return minFreeMemory
  **/
  @ApiModelProperty(example = "null", value = "returns the minimum amout of free memory needed")
  public Long getMinFreeMemory() {
    return minFreeMemory;
  }

  public void setMinFreeMemory(Long minFreeMemory) {
    this.minFreeMemory = minFreeMemory;
  }

  public SystemRequirementsCheckResult minTotalMemory(Long minTotalMemory) {
    this.minTotalMemory = minTotalMemory;
    return this;
  }

   /**
   * returns the minimum amout of total memory needed
   * @return minTotalMemory
  **/
  @ApiModelProperty(example = "null", value = "returns the minimum amout of total memory needed")
  public Long getMinTotalMemory() {
    return minTotalMemory;
  }

  public void setMinTotalMemory(Long minTotalMemory) {
    this.minTotalMemory = minTotalMemory;
  }

  public SystemRequirementsCheckResult minFreeSpace(Long minFreeSpace) {
    this.minFreeSpace = minFreeSpace;
    return this;
  }

   /**
   * returns the minimum amout of free space needed
   * @return minFreeSpace
  **/
  @ApiModelProperty(example = "null", value = "returns the minimum amout of free space needed")
  public Long getMinFreeSpace() {
    return minFreeSpace;
  }

  public void setMinFreeSpace(Long minFreeSpace) {
    this.minFreeSpace = minFreeSpace;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemRequirementsCheckResult systemRequirementsCheckResult = (SystemRequirementsCheckResult) o;
    return Objects.equals(this.meetsCriteria, systemRequirementsCheckResult.meetsCriteria) &&
        Objects.equals(this.unsatisfiedRequirements, systemRequirementsCheckResult.unsatisfiedRequirements) &&
        Objects.equals(this.minProcessors, systemRequirementsCheckResult.minProcessors) &&
        Objects.equals(this.minFreeMemory, systemRequirementsCheckResult.minFreeMemory) &&
        Objects.equals(this.minTotalMemory, systemRequirementsCheckResult.minTotalMemory) &&
        Objects.equals(this.minFreeSpace, systemRequirementsCheckResult.minFreeSpace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(meetsCriteria, unsatisfiedRequirements, minProcessors, minFreeMemory, minTotalMemory, minFreeSpace);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemRequirementsCheckResult {\n");
    
    sb.append("    meetsCriteria: ").append(toIndentedString(meetsCriteria)).append("\n");
    sb.append("    unsatisfiedRequirements: ").append(toIndentedString(unsatisfiedRequirements)).append("\n");
    sb.append("    minProcessors: ").append(toIndentedString(minProcessors)).append("\n");
    sb.append("    minFreeMemory: ").append(toIndentedString(minFreeMemory)).append("\n");
    sb.append("    minTotalMemory: ").append(toIndentedString(minTotalMemory)).append("\n");
    sb.append("    minFreeSpace: ").append(toIndentedString(minFreeSpace)).append("\n");
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

