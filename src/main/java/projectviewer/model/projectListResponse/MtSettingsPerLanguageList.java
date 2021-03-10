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
    "machineTranslateSettings",
    "targetLang"
})
public class MtSettingsPerLanguageList {

    @JsonProperty("machineTranslateSettings")
    private MachineTranslateSettings machineTranslateSettings;
    @JsonProperty("targetLang")
    private Object targetLang;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("machineTranslateSettings")
    public MachineTranslateSettings getMachineTranslateSettings() {
        return machineTranslateSettings;
    }

    @JsonProperty("machineTranslateSettings")
    public void setMachineTranslateSettings(MachineTranslateSettings machineTranslateSettings) {
        this.machineTranslateSettings = machineTranslateSettings;
    }

    @JsonProperty("targetLang")
    public Object getTargetLang() {
        return targetLang;
    }

    @JsonProperty("targetLang")
    public void setTargetLang(Object targetLang) {
        this.targetLang = targetLang;
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
        return "MtSettingsPerLanguageList{" +
                "machineTranslateSettings=" + machineTranslateSettings +
                ", targetLang=" + targetLang +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
