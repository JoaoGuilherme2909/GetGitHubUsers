import com.github.GithubProfileInformation.exceptions.UserNotFoundException;
import com.github.GithubProfileInformation.models.User;
import com.github.GithubProfileInformation.utils.ApiFetch;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Who do you want to find on github? ");
        String userToFind = scanner.nextLine();
        try{
            ApiFetch fetch = new ApiFetch();
            User user = fetch.fetch("https://api.github.com/users/" + userToFind);
            System.out.println(user);
        }catch (UserNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}