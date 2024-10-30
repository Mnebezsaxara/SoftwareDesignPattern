package task_1;


public class LoginPresenter {
    private final LoginView view;

    public LoginPresenter(LoginView view) {
        this.view = view;
    }

    public void performLogin(String username, String password) {
        UserModel user = new UserModel("Mansur", "11111");

        if (username.equals(user.getUsername()) && password.equals(user.getPassword())) {
            view.showLoginSuccess();
        } else {
            view.showLoginError("Invalid username or password.");
        }
    }

    public void login() {
        String username = view.getUsernameInput();
        String password = view.getPasswordInput();
        performLogin(username, password);
    }
}