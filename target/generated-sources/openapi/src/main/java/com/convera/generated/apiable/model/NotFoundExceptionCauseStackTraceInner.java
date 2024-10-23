package com.convera.generated.apiable.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * NotFoundExceptionCauseStackTraceInner
 */

@JsonTypeName("NotFoundException_cause_stackTrace_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-10-23T11:14:59.778621+02:00[Europe/Zurich]")
public class NotFoundExceptionCauseStackTraceInner {

  @JsonProperty("classLoaderName")
  private String classLoaderName;

  @JsonProperty("moduleName")
  private String moduleName;

  @JsonProperty("moduleVersion")
  private String moduleVersion;

  @JsonProperty("methodName")
  private String methodName;

  @JsonProperty("fileName")
  private String fileName;

  @JsonProperty("lineNumber")
  private Integer lineNumber;

  @JsonProperty("nativeMethod")
  private Boolean nativeMethod;

  @JsonProperty("className")
  private String className;

  public NotFoundExceptionCauseStackTraceInner classLoaderName(String classLoaderName) {
    this.classLoaderName = classLoaderName;
    return this;
  }

  /**
   * Get classLoaderName
   * @return classLoaderName
  */
  
  @Schema(name = "classLoaderName", required = false)
  public String getClassLoaderName() {
    return classLoaderName;
  }

  public void setClassLoaderName(String classLoaderName) {
    this.classLoaderName = classLoaderName;
  }

  public NotFoundExceptionCauseStackTraceInner moduleName(String moduleName) {
    this.moduleName = moduleName;
    return this;
  }

  /**
   * Get moduleName
   * @return moduleName
  */
  
  @Schema(name = "moduleName", required = false)
  public String getModuleName() {
    return moduleName;
  }

  public void setModuleName(String moduleName) {
    this.moduleName = moduleName;
  }

  public NotFoundExceptionCauseStackTraceInner moduleVersion(String moduleVersion) {
    this.moduleVersion = moduleVersion;
    return this;
  }

  /**
   * Get moduleVersion
   * @return moduleVersion
  */
  
  @Schema(name = "moduleVersion", required = false)
  public String getModuleVersion() {
    return moduleVersion;
  }

  public void setModuleVersion(String moduleVersion) {
    this.moduleVersion = moduleVersion;
  }

  public NotFoundExceptionCauseStackTraceInner methodName(String methodName) {
    this.methodName = methodName;
    return this;
  }

  /**
   * Get methodName
   * @return methodName
  */
  
  @Schema(name = "methodName", required = false)
  public String getMethodName() {
    return methodName;
  }

  public void setMethodName(String methodName) {
    this.methodName = methodName;
  }

  public NotFoundExceptionCauseStackTraceInner fileName(String fileName) {
    this.fileName = fileName;
    return this;
  }

  /**
   * Get fileName
   * @return fileName
  */
  
  @Schema(name = "fileName", required = false)
  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public NotFoundExceptionCauseStackTraceInner lineNumber(Integer lineNumber) {
    this.lineNumber = lineNumber;
    return this;
  }

  /**
   * Get lineNumber
   * @return lineNumber
  */
  
  @Schema(name = "lineNumber", required = false)
  public Integer getLineNumber() {
    return lineNumber;
  }

  public void setLineNumber(Integer lineNumber) {
    this.lineNumber = lineNumber;
  }

  public NotFoundExceptionCauseStackTraceInner nativeMethod(Boolean nativeMethod) {
    this.nativeMethod = nativeMethod;
    return this;
  }

  /**
   * Get nativeMethod
   * @return nativeMethod
  */
  
  @Schema(name = "nativeMethod", required = false)
  public Boolean getNativeMethod() {
    return nativeMethod;
  }

  public void setNativeMethod(Boolean nativeMethod) {
    this.nativeMethod = nativeMethod;
  }

  public NotFoundExceptionCauseStackTraceInner className(String className) {
    this.className = className;
    return this;
  }

  /**
   * Get className
   * @return className
  */
  
  @Schema(name = "className", required = false)
  public String getClassName() {
    return className;
  }

  public void setClassName(String className) {
    this.className = className;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotFoundExceptionCauseStackTraceInner notFoundExceptionCauseStackTraceInner = (NotFoundExceptionCauseStackTraceInner) o;
    return Objects.equals(this.classLoaderName, notFoundExceptionCauseStackTraceInner.classLoaderName) &&
        Objects.equals(this.moduleName, notFoundExceptionCauseStackTraceInner.moduleName) &&
        Objects.equals(this.moduleVersion, notFoundExceptionCauseStackTraceInner.moduleVersion) &&
        Objects.equals(this.methodName, notFoundExceptionCauseStackTraceInner.methodName) &&
        Objects.equals(this.fileName, notFoundExceptionCauseStackTraceInner.fileName) &&
        Objects.equals(this.lineNumber, notFoundExceptionCauseStackTraceInner.lineNumber) &&
        Objects.equals(this.nativeMethod, notFoundExceptionCauseStackTraceInner.nativeMethod) &&
        Objects.equals(this.className, notFoundExceptionCauseStackTraceInner.className);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classLoaderName, moduleName, moduleVersion, methodName, fileName, lineNumber, nativeMethod, className);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotFoundExceptionCauseStackTraceInner {\n");
    sb.append("    classLoaderName: ").append(toIndentedString(classLoaderName)).append("\n");
    sb.append("    moduleName: ").append(toIndentedString(moduleName)).append("\n");
    sb.append("    moduleVersion: ").append(toIndentedString(moduleVersion)).append("\n");
    sb.append("    methodName: ").append(toIndentedString(methodName)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    lineNumber: ").append(toIndentedString(lineNumber)).append("\n");
    sb.append("    nativeMethod: ").append(toIndentedString(nativeMethod)).append("\n");
    sb.append("    className: ").append(toIndentedString(className)).append("\n");
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

