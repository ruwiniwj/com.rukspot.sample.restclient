/*
 * WSO2 API Manager - Publisher API
 * This specifies a **RESTful API** for WSO2 **API Manager** - Publisher.  Please see [full swagger definition](https://raw.githubusercontent.com/wso2/carbon-apimgt/v6.0.4/components/apimgt/org.wso2.carbon.apimgt.rest.api.publisher/src/main/resources/publisher-api.yaml) of the API which is written using [swagger 2.0](http://swagger.io/) specification. 
 *
 * OpenAPI spec version: v1.1
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.am.integration.clients.publisher.api.v1.dto;

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
import java.util.ArrayList;
import java.util.List;
import org.wso2.am.integration.clients.publisher.api.v1.dto.GraphQLSchemaTypeDTO;

/**
 * GraphQLSchemaTypeListDTO
 */

public class GraphQLSchemaTypeListDTO {
  @SerializedName("typeList")
  private List<GraphQLSchemaTypeDTO> typeList = null;

  public GraphQLSchemaTypeListDTO typeList(List<GraphQLSchemaTypeDTO> typeList) {
    this.typeList = typeList;
    return this;
  }

  public GraphQLSchemaTypeListDTO addTypeListItem(GraphQLSchemaTypeDTO typeListItem) {
    if (this.typeList == null) {
      this.typeList = new ArrayList<>();
    }
    this.typeList.add(typeListItem);
    return this;
  }

   /**
   * Get typeList
   * @return typeList
  **/
  @ApiModelProperty(value = "")
  public List<GraphQLSchemaTypeDTO> getTypeList() {
    return typeList;
  }

  public void setTypeList(List<GraphQLSchemaTypeDTO> typeList) {
    this.typeList = typeList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GraphQLSchemaTypeListDTO graphQLSchemaTypeList = (GraphQLSchemaTypeListDTO) o;
    return Objects.equals(this.typeList, graphQLSchemaTypeList.typeList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(typeList);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GraphQLSchemaTypeListDTO {\n");
    
    sb.append("    typeList: ").append(toIndentedString(typeList)).append("\n");
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

