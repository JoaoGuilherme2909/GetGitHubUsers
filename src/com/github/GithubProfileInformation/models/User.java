package com.github.GithubProfileInformation.models;

import com.google.gson.annotations.SerializedName;

public class User {
    @SerializedName("login")
    private String name;
    @SerializedName("public_repos")
    private int publicRepos;
    @SerializedName("followers")
    private int followers;
    @SerializedName("following")
    private int following;

    public String getName() {
        return name;
    }

    public User(String name, int publicRepos, int followers, int following) {
        this.name = name;
        this.publicRepos = publicRepos;
        this.followers = followers;
        this.following = following;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", publicRepos=" + publicRepos +
                ", followers=" + followers +
                ", following=" + following +
                '}';
    }
}
