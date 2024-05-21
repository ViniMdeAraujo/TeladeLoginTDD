/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package telalogin;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Education
 */
public class TelaLoginTest {

    @Test
    public void testSuccessfulLogin() {
        TelaLogin loginScreen = new TelaLogin();
        assertTrue(loginScreen.login("john", "password123"));
    }

    @Test
    public void testFailedLogin() {
        TelaLogin loginScreen = new TelaLogin();
        assertFalse(loginScreen.login("john", "wrongpassword"));
    }

    @Test
    public void testAddUser() {
        TelaLogin loginScreen = new TelaLogin();
        loginScreen.addUser("testuser", "testpassword");
        assertTrue(loginScreen.login("testuser", "testpassword"));
    }
}
