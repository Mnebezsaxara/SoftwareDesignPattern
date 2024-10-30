package task_1;

public interface LoginView {
    void showLoginSuccess();
    void showLoginError(String message);
    String getUsernameInput();
    String getPasswordInput();
}