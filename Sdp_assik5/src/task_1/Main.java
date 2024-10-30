package task_1;


public class Main {
    public static void main(String[] args) {
        LoginView view = new LoginForm();
        LoginPresenter presenter = new LoginPresenter(view);

        presenter.login();
    }
}