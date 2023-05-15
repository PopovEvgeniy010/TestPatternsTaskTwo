import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AuthTest {
    @BeforeEach
    void setup() {
        open("http://localhost:9999");
    }

//    @Test
//    @DisplayName("Should successfully login with active registered user")
//    void shouldSuccessfulLoginIfRegisteredActiveUser() {
//        var registeredUser = getRegisteredUser("active");
//    }
//
//    @Test
//    @DisplayName("Should get error message if login with not registered user")
//    void shouldGetErrorIfNotRegisteredUser() {
//        var notRegisteredUser = getUser("active");
//
//
//        @Test
//        @DisplayName("Should get error message if login with blocked registered user")
//        void shouldGetErrorIfBlockedUser () {
//            var blockedUser = getRegisteredUser("blocked");
//
//        }

//        @Test
//        @DisplayName("Should get error message if login with wrong login")
//        void shouldGetErrorIfWrongLogin () {
//            var registeredUser = getRegisteredUser("active");
//            var wrongLogin = getRandomLogin();
//        }

        @Test
        @DisplayName("Should get error message if login with wrong password")
        void shouldGetErrorIfWrongPassword () {
            var registeredUser = getRegisteredUser("active");
            var wrongPassword = getRandomPassword();
            $("[data-test-id=\"login\"] input").setValue(registeredUser.getLogin());

        }
  }
//}

