package com.example.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    public void testConstructorWithArg() {
        String login = "KatOli4ka";
        String email = "KatOli4ka@mail.ru";
        User user = new User(login, email);
        assertEquals(login, user.getLogin());
        assertEquals(email, user.getEmail());
    }

    @Test
    public void testConstructorWithoutArg() throws Exception {

//        User user = new User();
//        assertNotNull(user);

        final Constructor<?>[] constructors = User.class.getDeclaredConstructors();
        for (final Constructor<?> constructor : constructors) {
            Assertions.assertTrue(Modifier.isPrivate(constructor.getModifiers()));
        }
        constructors[0].setAccessible(true);
        constructors[0].newInstance((Object[]) null);

//        try {
//            Constructor<User> u = User.class.getDeclaredConstructor();
//            u.setAccessible(true);
//            User userOne=u.newInstance();
//        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException |
//                 InvocationTargetException e) {
//            throw new RuntimeException(e);
//        }
    }

//    public boolean testContainsEmailOtherSymbols() {
//
//    }


//        if (inEmail = email.contains("@")) {
//        System.out.println("email ok");
//    } else {
//        System.out.println("Error");
//    }
//}
//@Test
//    final String LOGIN = "login";
//    final String EMAIL = "email";


//


//
//    User user = new User(LOGIN, EMAIL);
//
//    String userLogin = user.getLogin();
//    String userEmail = user.getEmail();
//
//    Assertions Assert = null;
//        Assert.assertEquals(LOGIN, userLogin);
//        Assert.assertEquals(EMAIL, userEmail);

//    public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
//            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
//
//    public static boolean validate(String emailStr) {
//        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
//        return matcher.find();
//    }


}
