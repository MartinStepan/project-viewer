package projectviewer.model.projectListResponse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "pageNumber",
    "content",
    "numberOfElements",
    "totalElements",
    "pageSize",
    "totalPages"
})
public class ProjectListResponse {

    @JsonProperty("pageNumber")
    private Integer pageNumber;
    @JsonProperty("content")
    private List<Content> content = null;
    @JsonProperty("numberOfElements")
    private Integer numberOfElements;
    @JsonProperty("totalElements")
    private Integer totalElements;
    @JsonProperty("pageSize")
    private Integer pageSize;
    @JsonProperty("totalPages")
    private Integer totalPages;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("pageNumber")
    public Integer getPageNumber() {
        return pageNumber;
    }

    @JsonProperty("pageNumber")
    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    @JsonProperty("content")
    public List<Content> getContent() {
        return content;
    }

    @JsonProperty("content")
    public void setContent(List<Content> content) {
        this.content = content;
    }

    @JsonProperty("numberOfElements")
    public Integer getNumberOfElements() {
        return numberOfElements;
    }

    @JsonProperty("numberOfElements")
    public void setNumberOfElements(Integer numberOfElements) {
        this.numberOfElements = numberOfElements;
    }

    @JsonProperty("totalElements")
    public Integer getTotalElements() {
        return totalElements;
    }

    @JsonProperty("totalElements")
    public void setTotalElements(Integer totalElements) {
        this.totalElements = totalElements;
    }

    @JsonProperty("pageSize")
    public Integer getPageSize() {
        return pageSize;
    }

    @JsonProperty("pageSize")
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    @JsonProperty("totalPages")
    public Integer getTotalPages() {
        return totalPages;
    }

    @JsonProperty("totalPages")
    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return "ProjectListResponse{" +
                "pageNumber=" + pageNumber +
                ", content=" + content +
                ", numberOfElements=" + numberOfElements +
                ", totalElements=" + totalElements +
                ", pageSize=" + pageSize +
                ", totalPages=" + totalPages +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
