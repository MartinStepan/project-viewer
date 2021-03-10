package projectviewer.services;

import com.google.gson.Gson;
import projectviewer.model.loginResponse.LoginResponse;
import projectviewer.model.authUserRequest.AuthRequest;
import projectviewer.model.projectListResponse.Content;
import projectviewer.model.projectListResponse.ProjectListResponse;
import projectviewer.model.ProjectDetail;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/**
 * API handler
 */
@Component
public class ApiHandlerService {

    @Value("${auth.url}")
    private String authUrl;
    @Value("${project.list.url}")
    private String projectListUrl;

    public String getToken(String userName, String password) {
        String token = null;
        try {
            AuthRequest authRequest = new AuthRequest(userName, password);
            String jsonRequest = new Gson().toJson(authRequest);
            URL url = new URL(authUrl);
            URLConnection con = url.openConnection();
            HttpURLConnection http = (HttpURLConnection)con;
            http.setRequestMethod("POST");
            http.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
            http.setDoOutput(true);
            http.connect();
            http.getOutputStream().write(jsonRequest.getBytes(StandardCharsets.UTF_8));

            if(http.getResponseCode() != 200) {
                return null;
            }

            LoginResponse loginResponse = new Gson().fromJson(getResponse(con.getInputStream()).toString(), LoginResponse.class);
            token = loginResponse.getToken();

        } catch (Exception e) {
            System.out.println(e.toString());
        }

        return token;
    }

    public List<ProjectDetail> readProjectDetailtList(String token) {
        List<ProjectDetail> projectDetailList = null;
        try {
            URL url = new URL(projectListUrl);
            HttpsURLConnection con = (HttpsURLConnection) url.openConnection();
            con.setRequestProperty("Authorization", "ApiToken " + token);
            con.setRequestMethod("GET");

            ProjectListResponse projectListResponse = new Gson().fromJson(getResponse(con.getInputStream()).toString(), ProjectListResponse.class);

            projectDetailList = new ArrayList<>();
            for(Content content : projectListResponse.getContent()) {
                projectDetailList.add(new ProjectDetail(content.getName(), content.getStatus(), content.getSourceLang(), content.getTargetLangs()));
            }

        } catch (Exception e) {
            System.out.println(e.toString());
        }

        return projectDetailList;
    }

    private StringBuilder getResponse(InputStream inputStream) throws IOException {
        StringBuilder sb = new StringBuilder("");

        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String line;

        while((line = reader.readLine()) != null) {
            sb.append(line);
        }

        return sb;
    }
}
