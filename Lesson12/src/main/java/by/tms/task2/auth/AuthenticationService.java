package by.tms.task2.auth;

public interface AuthenticationService {

    boolean checkAuthorization(String login, String password, String confirmPassword) throws Exception;
}
