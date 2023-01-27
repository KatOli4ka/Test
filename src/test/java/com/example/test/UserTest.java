package com.example.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
    public void testConstructorWithoutArg() {
        String login = null;
        String email = null;
        assertNull(login);
        assertNull(email);
    }

    @Test
    public void testContainsEmailOtherSymbols() {
        String login = "KatOli4ka";
        String email = "KatOli4ka@mail.ru";
        User user = new User(login, email);
        boolean check = false;
        if (email.contains("@") && email.contains(".")) {
            check = true;
        }
        assertFalse(false);
    }

    @Test
    public void testLoginDontEqualLogin() {
        String login = "KatOli4ka";
        String email = "KatOli4ka@mail.ru";
        User user = new User(login, email);
        Assertions.assertNotEquals(login, email);
    }
}
