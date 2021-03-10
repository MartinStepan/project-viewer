package projectviewer.model;

import java.util.List;
import java.util.stream.Collectors;

public class ProjectDetail {

    private String name;
    private String status;
    private String sourceLang;
    private List<String> targetLang;

    public ProjectDetail(String name, String status, String sourceLang, List<String> targetLang) {
        this.name = name;
        this.status = status;
        this.sourceLang = sourceLang;
        this.targetLang = targetLang.stream().collect(Collectors.toList());
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public String getSourceLang() {
        return sourceLang;
    }

    public List<String> getTargetLang() {
        return targetLang;
    }

    @Override
    public String toString() {
        return "ProjectDetail{" +
                "name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", sourceLang='" + sourceLang + '\'' +
                ", targetLang=" + targetLang +
                '}';
    }
}
