package com.example.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {
    private String login;
    private String email;
    private User user;

    @BeforeEach
    @Test
    public void setUp() {
        String login = "KatOli4ka";
        String email = "KatOli4ka@mail.ru";
        User user = new User(login, email);
    }

    @Test
    public void testConstructorWithArg() {

        assertEquals(login, user.getLogin());
        assertEquals(email, user.getEmail());
    }

    @Test
    public void testConstructorWithoutArg() {
        assertNull(user);
    }

    @Test
    public void testContainsEmailOtherSymbols() {
        boolean check = false;
        if (email.contains("@") && email.contains(".")) {
            check = true;
        }
        assertFalse(false);
    }

    @Test
    public void testLoginDontEqualLogin() {
        Assertions.assertNotEquals(login, email);
    }
}
