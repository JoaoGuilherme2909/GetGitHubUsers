package com.github.GithubProfileInformation.models;

public record UserGitHub(String login, int publicRepos, int followers, int following) {
}
