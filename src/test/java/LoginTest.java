import org.junit.Test;
import pages.LoginPage;
import pages.MainPage;
import pages.ProfilePage;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class LoginTest {

    //private MainPage mainPage;

    @Test
    public void 非手机号(){
        //mainPage=App().start();
        MainPage mainPage = MainPage.start();
        ProfilePage profilePage =mainPage.gotoProfile();
        LoginPage loginPage=profilePage.gotoLogin();
        loginPage.passwordFail("158899344","123456");
        String toast=loginPage.getMessage();
        //loginPage.passworld("15889934477","xxxxx");
        assertThat(toast,equalTo("手机号码填写错误"));
    }
}
