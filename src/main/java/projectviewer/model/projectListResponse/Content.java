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
    "internalId",
    "progress",
    "dateCreated",
    "references",
    "id",
    "analyseSettings",
    "targetLangs",
    "financialSettings",
    "subDomain",
    "sourceLang",
    "businessUnit",
    "purchaseOrder",
    "dateDue",
    "name",
    "owner",
    "uid",
    "createdBy",
    "client",
    "status",
    "note",
    "qualityAssuranceSettings",
    "costCenter",
    "domain",
    "isPublishedOnJobBoard",
    "shared",
    "userRole",
    "accessSettings",
    "mtSettingsPerLanguageList",
    "workflowSteps"
})
public class Content {

    @JsonProperty("internalId")
    private Integer internalId;
    @JsonProperty("progress")
    private Progress progress;
    @JsonProperty("dateCreated")
    private String dateCreated;
    @JsonProperty("references")
    private List<Object> references = null;
    @JsonProperty("id")
    private String id;
    @JsonProperty("analyseSettings")
    private AnalyseSettings analyseSettings;
    @JsonProperty("targetLangs")
    private List<String> targetLangs = null;
    @JsonProperty("financialSettings")
    private FinancialSettings financialSettings;
    @JsonProperty("subDomain")
    private Object subDomain;
    @JsonProperty("sourceLang")
    private String sourceLang;
    @JsonProperty("businessUnit")
    private Object businessUnit;
    @JsonProperty("purchaseOrder")
    private String purchaseOrder;
    @JsonProperty("dateDue")
    private String dateDue;
    @JsonProperty("name")
    private String name;
    @JsonProperty("owner")
    private Owner owner;
    @JsonProperty("uid")
    private String uid;
    @JsonProperty("createdBy")
    private CreatedBy createdBy;
    @JsonProperty("client")
    private Object client;
    @JsonProperty("status")
    private String status;
    @JsonProperty("note")
    private String note;
    @JsonProperty("qualityAssuranceSettings")
    private QualityAssuranceSettings qualityAssuranceSettings;
    @JsonProperty("costCenter")
    private Object costCenter;
    @JsonProperty("domain")
    private Object domain;
    @JsonProperty("isPublishedOnJobBoard")
    private Boolean isPublishedOnJobBoard;
    @JsonProperty("shared")
    private Boolean shared;
    @JsonProperty("userRole")
    private String userRole;
    @JsonProperty("accessSettings")
    private AccessSettings accessSettings;
    @JsonProperty("mtSettingsPerLanguageList")
    private List<MtSettingsPerLanguageList> mtSettingsPerLanguageList = null;
    @JsonProperty("workflowSteps")
    private List<Object> workflowSteps = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("internalId")
    public Integer getInternalId() {
        return internalId;
    }

    @JsonProperty("internalId")
    public void setInternalId(Integer internalId) {
        this.internalId = internalId;
    }

    @JsonProperty("progress")
    public Progress getProgress() {
        return progress;
    }

    @JsonProperty("progress")
    public void setProgress(Progress progress) {
        this.progress = progress;
    }

    @JsonProperty("dateCreated")
    public String getDateCreated() {
        return dateCreated;
    }

    @JsonProperty("dateCreated")
    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    @JsonProperty("references")
    public List<Object> getReferences() {
        return references;
    }

    @JsonProperty("references")
    public void setReferences(List<Object> references) {
        this.references = references;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("analyseSettings")
    public AnalyseSettings getAnalyseSettings() {
        return analyseSettings;
    }

    @JsonProperty("analyseSettings")
    public void setAnalyseSettings(AnalyseSettings analyseSettings) {
        this.analyseSettings = analyseSettings;
    }

    @JsonProperty("targetLangs")
    public List<String> getTargetLangs() {
        return targetLangs;
    }

    @JsonProperty("targetLangs")
    public void setTargetLangs(List<String> targetLangs) {
        this.targetLangs = targetLangs;
    }

    @JsonProperty("financialSettings")
    public FinancialSettings getFinancialSettings() {
        return financialSettings;
    }

    @JsonProperty("financialSettings")
    public void setFinancialSettings(FinancialSettings financialSettings) {
        this.financialSettings = financialSettings;
    }

    @JsonProperty("subDomain")
    public Object getSubDomain() {
        return subDomain;
    }

    @JsonProperty("subDomain")
    public void setSubDomain(Object subDomain) {
        this.subDomain = subDomain;
    }

    @JsonProperty("sourceLang")
    public String getSourceLang() {
        return sourceLang;
    }

    @JsonProperty("sourceLang")
    public void setSourceLang(String sourceLang) {
        this.sourceLang = sourceLang;
    }

    @JsonProperty("businessUnit")
    public Object getBusinessUnit() {
        return businessUnit;
    }

    @JsonProperty("businessUnit")
    public void setBusinessUnit(Object businessUnit) {
        this.businessUnit = businessUnit;
    }

    @JsonProperty("purchaseOrder")
    public String getPurchaseOrder() {
        return purchaseOrder;
    }

    @JsonProperty("purchaseOrder")
    public void setPurchaseOrder(String purchaseOrder) {
        this.purchaseOrder = purchaseOrder;
    }

    @JsonProperty("dateDue")
    public String getDateDue() {
        return dateDue;
    }

    @JsonProperty("dateDue")
    public void setDateDue(String dateDue) {
        this.dateDue = dateDue;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("owner")
    public Owner getOwner() {
        return owner;
    }

    @JsonProperty("owner")
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    @JsonProperty("uid")
    public String getUid() {
        return uid;
    }

    @JsonProperty("uid")
    public void setUid(String uid) {
        this.uid = uid;
    }

    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy() {
        return createdBy;
    }

    @JsonProperty("createdBy")
    public void setCreatedBy(CreatedBy createdBy) {
        this.createdBy = createdBy;
    }

    @JsonProperty("client")
    public Object getClient() {
        return client;
    }

    @JsonProperty("client")
    public void setClient(Object client) {
        this.client = client;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("note")
    public String getNote() {
        return note;
    }

    @JsonProperty("note")
    public void setNote(String note) {
        this.note = note;
    }

    @JsonProperty("qualityAssuranceSettings")
    public QualityAssuranceSettings getQualityAssuranceSettings() {
        return qualityAssuranceSettings;
    }

    @JsonProperty("qualityAssuranceSettings")
    public void setQualityAssuranceSettings(QualityAssuranceSettings qualityAssuranceSettings) {
        this.qualityAssuranceSettings = qualityAssuranceSettings;
    }

    @JsonProperty("costCenter")
    public Object getCostCenter() {
        return costCenter;
    }

    @JsonProperty("costCenter")
    public void setCostCenter(Object costCenter) {
        this.costCenter = costCenter;
    }

    @JsonProperty("domain")
    public Object getDomain() {
        return domain;
    }

    @JsonProperty("domain")
    public void setDomain(Object domain) {
        this.domain = domain;
    }

    @JsonProperty("isPublishedOnJobBoard")
    public Boolean getIsPublishedOnJobBoard() {
        return isPublishedOnJobBoard;
    }

    @JsonProperty("isPublishedOnJobBoard")
    public void setIsPublishedOnJobBoard(Boolean isPublishedOnJobBoard) {
        this.isPublishedOnJobBoard = isPublishedOnJobBoard;
    }

    @JsonProperty("shared")
    public Boolean getShared() {
        return shared;
    }

    @JsonProperty("shared")
    public void setShared(Boolean shared) {
        this.shared = shared;
    }

    @JsonProperty("userRole")
    public String getUserRole() {
        return userRole;
    }

    @JsonProperty("userRole")
    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    @JsonProperty("accessSettings")
    public AccessSettings getAccessSettings() {
        return accessSettings;
    }

    @JsonProperty("accessSettings")
    public void setAccessSettings(AccessSettings accessSettings) {
        this.accessSettings = accessSettings;
    }

    @JsonProperty("mtSettingsPerLanguageList")
    public List<MtSettingsPerLanguageList> getMtSettingsPerLanguageList() {
        return mtSettingsPerLanguageList;
    }

    @JsonProperty("mtSettingsPerLanguageList")
    public void setMtSettingsPerLanguageList(List<MtSettingsPerLanguageList> mtSettingsPerLanguageList) {
        this.mtSettingsPerLanguageList = mtSettingsPerLanguageList;
    }

    @JsonProperty("workflowSteps")
    public List<Object> getWorkflowSteps() {
        return workflowSteps;
    }

    @JsonProperty("workflowSteps")
    public void setWorkflowSteps(List<Object> workflowSteps) {
        this.workflowSteps = workflowSteps;
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
        return "Content{" +
                "internalId=" + internalId +
                ", progress=" + progress +
                ", dateCreated='" + dateCreated + '\'' +
                ", references=" + references +
                ", id='" + id + '\'' +
                ", analyseSettings=" + analyseSettings +
                ", targetLangs=" + targetLangs +
                ", financialSettings=" + financialSettings +
                ", subDomain=" + subDomain +
                ", sourceLang='" + sourceLang + '\'' +
                ", businessUnit=" + businessUnit +
                ", purchaseOrder='" + purchaseOrder + '\'' +
                ", dateDue='" + dateDue + '\'' +
                ", name='" + name + '\'' +
                ", owner=" + owner +
                ", uid='" + uid + '\'' +
                ", createdBy=" + createdBy +
                ", client=" + client +
                ", status='" + status + '\'' +
                ", note='" + note + '\'' +
                ", qualityAssuranceSettings=" + qualityAssuranceSettings +
                ", costCenter=" + costCenter +
                ", domain=" + domain +
                ", isPublishedOnJobBoard=" + isPublishedOnJobBoard +
                ", shared=" + shared +
                ", userRole='" + userRole + '\'' +
                ", accessSettings=" + accessSettings +
                ", mtSettingsPerLanguageList=" + mtSettingsPerLanguageList +
                ", workflowSteps=" + workflowSteps +
                ", additionalProperties=" + additionalProperties +
                '}';
    }
}
