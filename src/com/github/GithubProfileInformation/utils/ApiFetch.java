package com.github.GithubProfileInformation.utils;

import com.github.GithubProfileInformation.exceptions.UserNotFoundException;
import com.github.GithubProfileInformation.models.User;
import com.github.GithubProfileInformation.models.UserGitHub;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiFetch {
    public User fetch(String uri) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(uri)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        Gson gson = new Gson();
        User user = gson.fromJson(response.body(), User.class);
        if(user.getName() == null){
           throw new UserNotFoundException("User not found");
        }
        return user;
    }
}
