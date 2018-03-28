package br.com.casadocodigo.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Chapter4 {

    public static void main(String[] args) {
        User u1 = new User("Paulo Silveira", 150);
        User u2 = new User("Rodrigo Turini", 120);
        User u3 = new User("Guilherme Silveira", 190);

        List<User> users = Arrays.asList(u1, u2, u3);

        Consumer<User> showMessage = user -> System.out.println("before showing names");

        Consumer<User> printName = user -> System.out.println(user.getName());

        users.forEach(showMessage.andThen(printName));
    }
    
}
