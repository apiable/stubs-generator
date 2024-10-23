package com.convera.generated.apiable.model;

import java.net.URI;
import java.util.Objects;
import com.convera.generated.apiable.model.PlanPrice;
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
 * Monetization configuration for the plan. Used to define how the plan is billed.
 */

@Schema(name = "Monetization", description = "Monetization configuration for the plan. Used to define how the plan is billed.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-23T11:14:59.778621+02:00[Europe/Zurich]")
public class Monetization {

  /**
   * Gets or Sets billProcessing
   */
  public enum BillProcessingEnum {
    API_CALL("API_CALL"),
    
    TOKEN("TOKEN"),
    
    CUSTOM("CUSTOM");

    private String value;

    BillProcessingEnum(String value) {
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
    public static BillProcessingEnum fromValue(String value) {
      for (BillProcessingEnum b : BillProcessingEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("billProcessing")
  private BillProcessingEnum billProcessing;

  @JsonProperty("unitLabel")
  private String unitLabel;

  /**
   * Gets or Sets cycle
   */
  public enum CycleEnum {
    MONTH("MONTH"),
    
    YEAR("YEAR"),
    
    MONTHLY("MONTHLY"),
    
    YEARLY("YEARLY");

    private String value;

    CycleEnum(String value) {
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
    public static CycleEnum fromValue(String value) {
      for (CycleEnum b : CycleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("cycle")
  private CycleEnum cycle;

  /**
   * Gets or Sets revenueModel
   */
  public enum RevenueModelEnum {
    ONETIME("ONETIME"),
    
    RECURRING("RECURRING"),
    
    FLAT_FEE("FLAT_FEE"),
    
    GRADUATED("GRADUATED"),
    
    VOLUME("VOLUME"),
    
    FREE("FREE"),
    
    CONTRACT("CONTRACT"),
    
    FLAT_FEE_OVERAGE("FLAT_FEE_OVERAGE");

    private String value;

    RevenueModelEnum(String value) {
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
    public static RevenueModelEnum fromValue(String value) {
      for (RevenueModelEnum b : RevenueModelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("revenueModel")
  private RevenueModelEnum revenueModel;

  @JsonProperty("prices")
  @Valid
  private List<PlanPrice> prices = null;

  @JsonProperty("defined")
  private Boolean defined;

  public Monetization billProcessing(BillProcessingEnum billProcessing) {
    this.billProcessing = billProcessing;
    return this;
  }

  /**
   * Get billProcessing
   * @return billProcessing
  */
  
  @Schema(name = "billProcessing", required = false)
  public BillProcessingEnum getBillProcessing() {
    return billProcessing;
  }

  public void setBillProcessing(BillProcessingEnum billProcessing) {
    this.billProcessing = billProcessing;
  }

  public Monetization unitLabel(String unitLabel) {
    this.unitLabel = unitLabel;
    return this;
  }

  /**
   * Get unitLabel
   * @return unitLabel
  */
  
  @Schema(name = "unitLabel", required = false)
  public String getUnitLabel() {
    return unitLabel;
  }

  public void setUnitLabel(String unitLabel) {
    this.unitLabel = unitLabel;
  }

  public Monetization cycle(CycleEnum cycle) {
    this.cycle = cycle;
    return this;
  }

  /**
   * Get cycle
   * @return cycle
  */
  
  @Schema(name = "cycle", required = false)
  public CycleEnum getCycle() {
    return cycle;
  }

  public void setCycle(CycleEnum cycle) {
    this.cycle = cycle;
  }

  public Monetization revenueModel(RevenueModelEnum revenueModel) {
    this.revenueModel = revenueModel;
    return this;
  }

  /**
   * Get revenueModel
   * @return revenueModel
  */
  
  @Schema(name = "revenueModel", required = false)
  public RevenueModelEnum getRevenueModel() {
    return revenueModel;
  }

  public void setRevenueModel(RevenueModelEnum revenueModel) {
    this.revenueModel = revenueModel;
  }

  public Monetization prices(List<PlanPrice> prices) {
    this.prices = prices;
    return this;
  }

  public Monetization addPricesItem(PlanPrice pricesItem) {
    if (this.prices == null) {
      this.prices = new ArrayList<>();
    }
    this.prices.add(pricesItem);
    return this;
  }

  /**
   * Get prices
   * @return prices
  */
  @Valid 
  @Schema(name = "prices", required = false)
  public List<PlanPrice> getPrices() {
    return prices;
  }

  public void setPrices(List<PlanPrice> prices) {
    this.prices = prices;
  }

  public Monetization defined(Boolean defined) {
    this.defined = defined;
    return this;
  }

  /**
   * Get defined
   * @return defined
  */
  
  @Schema(name = "defined", required = false)
  public Boolean getDefined() {
    return defined;
  }

  public void setDefined(Boolean defined) {
    this.defined = defined;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Monetization monetization = (Monetization) o;
    return Objects.equals(this.billProcessing, monetization.billProcessing) &&
        Objects.equals(this.unitLabel, monetization.unitLabel) &&
        Objects.equals(this.cycle, monetization.cycle) &&
        Objects.equals(this.revenueModel, monetization.revenueModel) &&
        Objects.equals(this.prices, monetization.prices) &&
        Objects.equals(this.defined, monetization.defined);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billProcessing, unitLabel, cycle, revenueModel, prices, defined);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Monetization {\n");
    sb.append("    billProcessing: ").append(toIndentedString(billProcessing)).append("\n");
    sb.append("    unitLabel: ").append(toIndentedString(unitLabel)).append("\n");
    sb.append("    cycle: ").append(toIndentedString(cycle)).append("\n");
    sb.append("    revenueModel: ").append(toIndentedString(revenueModel)).append("\n");
    sb.append("    prices: ").append(toIndentedString(prices)).append("\n");
    sb.append("    defined: ").append(toIndentedString(defined)).append("\n");
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

