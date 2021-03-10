package projectviewer.model.projectListResponse;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "overdueCount",
    "totalCount",
    "finishedCount"
})
public class Progress {

    @JsonProperty("overdueCount")
    private Integer overdueCount;
    @JsonProperty("totalCount")
    private Integer totalCount;
    @JsonProperty("finishedCount")
    private Integer finishedCount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("overdueCount")
    public Integer getOverdueCount() {
        return overdueCount;
    }

    @JsonProperty("overdueCount")
    public void setOverdueCount(Integer overdueCount) {
        this.overdueCount = overdueCount;
    }

    @JsonProperty("totalCount")
    public Integer getTotalCount() {
        return totalCount;
    }

    @JsonProperty("totalCount")
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @JsonProperty("finishedCount")
    public Integer getFinishedCount() {
        return finishedCount;
    }

    @JsonProperty("finishedCount")
    public void setFinishedCount(Integer finishedCount) {
        this.finishedCount = finishedCount;
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
        return "Progress{" +
                "overdueCount=" + overdueCount +
                ", totalCount=" + totalCount +
                ", finishedCount=" + finishedCount +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
