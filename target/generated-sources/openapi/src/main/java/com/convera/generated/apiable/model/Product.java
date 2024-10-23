package com.convera.generated.apiable.model;

import java.net.URI;
import java.util.Objects;
import com.convera.generated.apiable.model.Conf;
import com.convera.generated.apiable.model.IdentifiableObjectId;
import com.convera.generated.apiable.model.Image;
import com.convera.generated.apiable.model.Testimonial;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Product
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-23T11:14:59.778621+02:00[Europe/Zurich]")
public class Product {

  @JsonProperty("version")
  private Integer version;

  @JsonProperty("created")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private LocalDateTime created;

  @JsonProperty("updated")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private LocalDateTime updated;

  @JsonProperty("id")
  private Object id;

  @JsonProperty("slug")
  private String slug;

  @JsonProperty("marketings")
  @Valid
  private List<IdentifiableObjectId> marketings = null;

  @JsonProperty("testimonials")
  @Valid
  private List<Testimonial> testimonials = null;

  @JsonProperty("menuItems")
  private Conf menuItems;

  @JsonProperty("groupRefs")
  @Valid
  private List<String> groupRefs = null;

  @JsonProperty("productCategories")
  @Valid
  private List<IdentifiableObjectId> productCategories = null;

  @JsonProperty("name")
  private String name;

  @JsonProperty("title")
  private String title;

  /**
   * The visibility of the product
   */
  public enum VisibilityEnum {
    OPEN("OPEN"),
    
    HIDDEN("HIDDEN");

    private String value;

    VisibilityEnum(String value) {
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
    public static VisibilityEnum fromValue(String value) {
      for (VisibilityEnum b : VisibilityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("visibility")
  private VisibilityEnum visibility;

  /**
   * The audience of the product
   */
  public enum AudienceEnum {
    PUBLIC("PUBLIC"),
    
    MANUAL("MANUAL"),
    
    INTERNAL("INTERNAL");

    private String value;

    AudienceEnum(String value) {
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
    public static AudienceEnum fromValue(String value) {
      for (AudienceEnum b : AudienceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("audience")
  private AudienceEnum audience;

  @JsonProperty("description")
  private String description;

  @JsonProperty("image")
  private Image image;

  @JsonProperty("active")
  private Boolean active;

  public Product version(Integer version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
  */
  
  @Schema(name = "version", required = false)
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public Product created(LocalDateTime created) {
    this.created = created;
    return this;
  }

  /**
   * Get created
   * @return created
  */
  @Valid 
  @Schema(name = "created", required = false)
  public LocalDateTime getCreated() {
    return created;
  }

  public void setCreated(LocalDateTime created) {
    this.created = created;
  }

  public Product updated(LocalDateTime updated) {
    this.updated = updated;
    return this;
  }

  /**
   * Get updated
   * @return updated
  */
  @Valid 
  @Schema(name = "updated", required = false)
  public LocalDateTime getUpdated() {
    return updated;
  }

  public void setUpdated(LocalDateTime updated) {
    this.updated = updated;
  }

  public Product id(Object id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", required = false)
  public Object getId() {
    return id;
  }

  public void setId(Object id) {
    this.id = id;
  }

  public Product slug(String slug) {
    this.slug = slug;
    return this;
  }

  /**
   * The url slug of the product
   * @return slug
  */
  
  @Schema(name = "slug", description = "The url slug of the product", required = false)
  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }

  public Product marketings(List<IdentifiableObjectId> marketings) {
    this.marketings = marketings;
    return this;
  }

  public Product addMarketingsItem(IdentifiableObjectId marketingsItem) {
    if (this.marketings == null) {
      this.marketings = new ArrayList<>();
    }
    this.marketings.add(marketingsItem);
    return this;
  }

  /**
   * List of marketing feature references for this product.
   * @return marketings
  */
  @Valid 
  @Schema(name = "marketings", description = "List of marketing feature references for this product.", required = false)
  public List<IdentifiableObjectId> getMarketings() {
    return marketings;
  }

  public void setMarketings(List<IdentifiableObjectId> marketings) {
    this.marketings = marketings;
  }

  public Product testimonials(List<Testimonial> testimonials) {
    this.testimonials = testimonials;
    return this;
  }

  public Product addTestimonialsItem(Testimonial testimonialsItem) {
    if (this.testimonials == null) {
      this.testimonials = new ArrayList<>();
    }
    this.testimonials.add(testimonialsItem);
    return this;
  }

  /**
   * List of testimonials for this product.
   * @return testimonials
  */
  @Valid 
  @Schema(name = "testimonials", description = "List of testimonials for this product.", required = false)
  public List<Testimonial> getTestimonials() {
    return testimonials;
  }

  public void setTestimonials(List<Testimonial> testimonials) {
    this.testimonials = testimonials;
  }

  public Product menuItems(Conf menuItems) {
    this.menuItems = menuItems;
    return this;
  }

  /**
   * Get menuItems
   * @return menuItems
  */
  @Valid 
  @Schema(name = "menuItems", required = false)
  public Conf getMenuItems() {
    return menuItems;
  }

  public void setMenuItems(Conf menuItems) {
    this.menuItems = menuItems;
  }

  public Product groupRefs(List<String> groupRefs) {
    this.groupRefs = groupRefs;
    return this;
  }

  public Product addGroupRefsItem(String groupRefsItem) {
    if (this.groupRefs == null) {
      this.groupRefs = new ArrayList<>();
    }
    this.groupRefs.add(groupRefsItem);
    return this;
  }

  /**
   * Get groupRefs
   * @return groupRefs
  */
  
  @Schema(name = "groupRefs", required = false)
  public List<String> getGroupRefs() {
    return groupRefs;
  }

  public void setGroupRefs(List<String> groupRefs) {
    this.groupRefs = groupRefs;
  }

  public Product productCategories(List<IdentifiableObjectId> productCategories) {
    this.productCategories = productCategories;
    return this;
  }

  public Product addProductCategoriesItem(IdentifiableObjectId productCategoriesItem) {
    if (this.productCategories == null) {
      this.productCategories = new ArrayList<>();
    }
    this.productCategories.add(productCategoriesItem);
    return this;
  }

  /**
   * List of product categories that this product has been associated with.
   * @return productCategories
  */
  @Valid 
  @Schema(name = "productCategories", description = "List of product categories that this product has been associated with.", required = false)
  public List<IdentifiableObjectId> getProductCategories() {
    return productCategories;
  }

  public void setProductCategories(List<IdentifiableObjectId> productCategories) {
    this.productCategories = productCategories;
  }

  public Product name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the product
   * @return name
  */
  
  @Schema(name = "name", description = "The name of the product", required = false)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Product title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The short title of the product
   * @return title
  */
  
  @Schema(name = "title", description = "The short title of the product", required = false)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Product visibility(VisibilityEnum visibility) {
    this.visibility = visibility;
    return this;
  }

  /**
   * The visibility of the product
   * @return visibility
  */
  
  @Schema(name = "visibility", description = "The visibility of the product", required = false)
  public VisibilityEnum getVisibility() {
    return visibility;
  }

  public void setVisibility(VisibilityEnum visibility) {
    this.visibility = visibility;
  }

  public Product audience(AudienceEnum audience) {
    this.audience = audience;
    return this;
  }

  /**
   * The audience of the product
   * @return audience
  */
  
  @Schema(name = "audience", description = "The audience of the product", required = false)
  public AudienceEnum getAudience() {
    return audience;
  }

  public void setAudience(AudienceEnum audience) {
    this.audience = audience;
  }

  public Product description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The longer description of what this product is for
   * @return description
  */
  
  @Schema(name = "description", description = "The longer description of what this product is for", required = false)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Product image(Image image) {
    this.image = image;
    return this;
  }

  /**
   * Get image
   * @return image
  */
  @Valid 
  @Schema(name = "image", required = false)
  public Image getImage() {
    return image;
  }

  public void setImage(Image image) {
    this.image = image;
  }

  public Product active(Boolean active) {
    this.active = active;
    return this;
  }

  /**
   * Flag to indicate if the product is active
   * @return active
  */
  
  @Schema(name = "active", description = "Flag to indicate if the product is active", required = false)
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Product product = (Product) o;
    return Objects.equals(this.version, product.version) &&
        Objects.equals(this.created, product.created) &&
        Objects.equals(this.updated, product.updated) &&
        Objects.equals(this.id, product.id) &&
        Objects.equals(this.slug, product.slug) &&
        Objects.equals(this.marketings, product.marketings) &&
        Objects.equals(this.testimonials, product.testimonials) &&
        Objects.equals(this.menuItems, product.menuItems) &&
        Objects.equals(this.groupRefs, product.groupRefs) &&
        Objects.equals(this.productCategories, product.productCategories) &&
        Objects.equals(this.name, product.name) &&
        Objects.equals(this.title, product.title) &&
        Objects.equals(this.visibility, product.visibility) &&
        Objects.equals(this.audience, product.audience) &&
        Objects.equals(this.description, product.description) &&
        Objects.equals(this.image, product.image) &&
        Objects.equals(this.active, product.active);
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, created, updated, id, slug, marketings, testimonials, menuItems, groupRefs, productCategories, name, title, visibility, audience, description, image, active);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Product {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    marketings: ").append(toIndentedString(marketings)).append("\n");
    sb.append("    testimonials: ").append(toIndentedString(testimonials)).append("\n");
    sb.append("    menuItems: ").append(toIndentedString(menuItems)).append("\n");
    sb.append("    groupRefs: ").append(toIndentedString(groupRefs)).append("\n");
    sb.append("    productCategories: ").append(toIndentedString(productCategories)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    audience: ").append(toIndentedString(audience)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
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

