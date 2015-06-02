import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

@ManagedBean
@SessionScoped

public class IndexBean implements Serializable {
    private String page = "template/welcomePage.xhtml";
    String outText = "hello";
    String nickname;
    String password;
    String authorizationResult = "Вы не авторизовались";
    String trueNickname = "Hello";

    public void authorization() {
        if (nickname.equals("ivan") && password.equals("2311")) {
            authorizationResult = "Авторизация прошла успешна";
           trueNickname = nickname;
        }

    }

    public void welcomePage() {
        page = "template/welcomePage.xhtml";
    }

    public void authorizationPage() {
        page = "authorizationPage.xhtml";
    }

    public void adminPage() {
        page = "adminPage.xhtml";
    }

    public void guestPage() {
        page = "guestPage.xhtml";

    }

    public String getOutText() {
        return outText;
    }

    public void setOutText(String outText) {
        this.outText = outText;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAuthorizationResult() {
        return authorizationResult;
    }

    public void setAuthorizationResult(String authorizationResult) {
        this.authorizationResult = authorizationResult;
    }

    public String getTrueNickname() {
        return trueNickname;
    }

    public void setTrueNickname(String trueNickname) {
        this.trueNickname = trueNickname;
    }
}
