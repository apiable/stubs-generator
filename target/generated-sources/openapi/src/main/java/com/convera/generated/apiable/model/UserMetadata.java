package com.convera.generated.apiable.model;

import java.net.URI;
import java.util.Objects;
import com.convera.generated.apiable.model.IdentifiableObjectId;
import com.convera.generated.apiable.model.TeamRole;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * The metadata of the user
 */

@Schema(name = "UserMetadata", description = "The metadata of the user")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-23T11:14:59.778621+02:00[Europe/Zurich]")
public class UserMetadata {

  @JsonProperty("activeTeam")
  private IdentifiableObjectId activeTeam;

  @JsonProperty("agreesToReceiveEmail")
  private Boolean agreesToReceiveEmail;

  @JsonProperty("postRegistrationWizardComplete")
  private Boolean postRegistrationWizardComplete;

  /**
   * Flag to indicate if the user has been approved, if approval process is in place
   */
  public enum ApprovalEnum {
    PENDING("PENDING"),
    
    ACTIVE("ACTIVE"),
    
    REJECTED("REJECTED");

    private String value;

    ApprovalEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ApprovalEnum fromValue(String value) {
      for (ApprovalEnum b : ApprovalEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("approval")
  private ApprovalEnum approval;

  @JsonProperty("teams")
  @Valid
  private List<IdentifiableObjectId> teams = null;

  @JsonProperty("stripeCustomerId")
  private String stripeCustomerId;

  @JsonProperty("registrationEmailSent")
  private Boolean registrationEmailSent;

  @JsonProperty("teamRoles")
  @Valid
  private List<TeamRole> teamRoles = null;

  @JsonProperty("developer")
  private Boolean developer;

  public UserMetadata activeTeam(IdentifiableObjectId activeTeam) {
    this.activeTeam = activeTeam;
    return this;
  }

  /**
   * Get activeTeam
   * @return activeTeam
  */
  @Valid 
  @Schema(name = "activeTeam", required = false)
  public IdentifiableObjectId getActiveTeam() {
    return activeTeam;
  }

  public void setActiveTeam(IdentifiableObjectId activeTeam) {
    this.activeTeam = activeTeam;
  }

  public UserMetadata agreesToReceiveEmail(Boolean agreesToReceiveEmail) {
    this.agreesToReceiveEmail = agreesToReceiveEmail;
    return this;
  }

  /**
   * Flag to indicate if the user has given consent to receive emails
   * @return agreesToReceiveEmail
  */
  
  @Schema(name = "agreesToReceiveEmail", description = "Flag to indicate if the user has given consent to receive emails", required = false)
  public Boolean getAgreesToReceiveEmail() {
    return agreesToReceiveEmail;
  }

  public void setAgreesToReceiveEmail(Boolean agreesToReceiveEmail) {
    this.agreesToReceiveEmail = agreesToReceiveEmail;
  }

  public UserMetadata postRegistrationWizardComplete(Boolean postRegistrationWizardComplete) {
    this.postRegistrationWizardComplete = postRegistrationWizardComplete;
    return this;
  }

  /**
   * Flag to indicate if the user has completed the registration wizard
   * @return postRegistrationWizardComplete
  */
  
  @Schema(name = "postRegistrationWizardComplete", description = "Flag to indicate if the user has completed the registration wizard", required = false)
  public Boolean getPostRegistrationWizardComplete() {
    return postRegistrationWizardComplete;
  }

  public void setPostRegistrationWizardComplete(Boolean postRegistrationWizardComplete) {
    this.postRegistrationWizardComplete = postRegistrationWizardComplete;
  }

  public UserMetadata approval(ApprovalEnum approval) {
    this.approval = approval;
    return this;
  }

  /**
   * Flag to indicate if the user has been approved, if approval process is in place
   * @return approval
  */
  
  @Schema(name = "approval", description = "Flag to indicate if the user has been approved, if approval process is in place", required = false)
  public ApprovalEnum getApproval() {
    return approval;
  }

  public void setApproval(ApprovalEnum approval) {
    this.approval = approval;
  }

  public UserMetadata teams(List<IdentifiableObjectId> teams) {
    this.teams = teams;
    return this;
  }

  public UserMetadata addTeamsItem(IdentifiableObjectId teamsItem) {
    if (this.teams == null) {
      this.teams = new ArrayList<>();
    }
    this.teams.add(teamsItem);
    return this;
  }

  /**
   * List of teams that the user is part of
   * @return teams
  */
  @Valid 
  @Schema(name = "teams", description = "List of teams that the user is part of", required = false)
  public List<IdentifiableObjectId> getTeams() {
    return teams;
  }

  public void setTeams(List<IdentifiableObjectId> teams) {
    this.teams = teams;
  }

  public UserMetadata stripeCustomerId(String stripeCustomerId) {
    this.stripeCustomerId = stripeCustomerId;
    return this;
  }

  /**
   * The monetization integration ID of the user
   * @return stripeCustomerId
  */
  
  @Schema(name = "stripeCustomerId", description = "The monetization integration ID of the user", required = false)
  public String getStripeCustomerId() {
    return stripeCustomerId;
  }

  public void setStripeCustomerId(String stripeCustomerId) {
    this.stripeCustomerId = stripeCustomerId;
  }

  public UserMetadata registrationEmailSent(Boolean registrationEmailSent) {
    this.registrationEmailSent = registrationEmailSent;
    return this;
  }

  /**
   * Flag to indicate if the user has been sent a registration email
   * @return registrationEmailSent
  */
  
  @Schema(name = "registrationEmailSent", description = "Flag to indicate if the user has been sent a registration email", required = false)
  public Boolean getRegistrationEmailSent() {
    return registrationEmailSent;
  }

  public void setRegistrationEmailSent(Boolean registrationEmailSent) {
    this.registrationEmailSent = registrationEmailSent;
  }

  public UserMetadata teamRoles(List<TeamRole> teamRoles) {
    this.teamRoles = teamRoles;
    return this;
  }

  public UserMetadata addTeamRolesItem(TeamRole teamRolesItem) {
    if (this.teamRoles == null) {
      this.teamRoles = new ArrayList<>();
    }
    this.teamRoles.add(teamRolesItem);
    return this;
  }

  /**
   * List of roles that the user has in the teams that they are part of.
   * @return teamRoles
  */
  @Valid 
  @Schema(name = "teamRoles", description = "List of roles that the user has in the teams that they are part of.", required = false)
  public List<TeamRole> getTeamRoles() {
    return teamRoles;
  }

  public void setTeamRoles(List<TeamRole> teamRoles) {
    this.teamRoles = teamRoles;
  }

  public UserMetadata developer(Boolean developer) {
    this.developer = developer;
    return this;
  }

  /**
   * Get developer
   * @return developer
  */
  
  @Schema(name = "developer", required = false)
  public Boolean getDeveloper() {
    return developer;
  }

  public void setDeveloper(Boolean developer) {
    this.developer = developer;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserMetadata userMetadata = (UserMetadata) o;
    return Objects.equals(this.activeTeam, userMetadata.activeTeam) &&
        Objects.equals(this.agreesToReceiveEmail, userMetadata.agreesToReceiveEmail) &&
        Objects.equals(this.postRegistrationWizardComplete, userMetadata.postRegistrationWizardComplete) &&
        Objects.equals(this.approval, userMetadata.approval) &&
        Objects.equals(this.teams, userMetadata.teams) &&
        Objects.equals(this.stripeCustomerId, userMetadata.stripeCustomerId) &&
        Objects.equals(this.registrationEmailSent, userMetadata.registrationEmailSent) &&
        Objects.equals(this.teamRoles, userMetadata.teamRoles) &&
        Objects.equals(this.developer, userMetadata.developer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeTeam, agreesToReceiveEmail, postRegistrationWizardComplete, approval, teams, stripeCustomerId, registrationEmailSent, teamRoles, developer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserMetadata {\n");
    sb.append("    activeTeam: ").append(toIndentedString(activeTeam)).append("\n");
    sb.append("    agreesToReceiveEmail: ").append(toIndentedString(agreesToReceiveEmail)).append("\n");
    sb.append("    postRegistrationWizardComplete: ").append(toIndentedString(postRegistrationWizardComplete)).append("\n");
    sb.append("    approval: ").append(toIndentedString(approval)).append("\n");
    sb.append("    teams: ").append(toIndentedString(teams)).append("\n");
    sb.append("    stripeCustomerId: ").append(toIndentedString(stripeCustomerId)).append("\n");
    sb.append("    registrationEmailSent: ").append(toIndentedString(registrationEmailSent)).append("\n");
    sb.append("    teamRoles: ").append(toIndentedString(teamRoles)).append("\n");
    sb.append("    developer: ").append(toIndentedString(developer)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

