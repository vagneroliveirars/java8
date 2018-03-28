package br.com.casadocodigo.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Chapter2 {

    public static void main(String[] args) {
        User u1 = new User("Paulo Silveira", 150);
        User u2 = new User("Rodrigo Turini", 120);
        User u3 = new User("Guilherme Silveira", 190);

        List<User> users = Arrays.asList(u1, u2, u3);

        for (User u : users) {
            System.out.println(u.getName());
        }

        users.forEach(new Consumer<User>() {
            @Override
            public void accept(User user) {
                System.out.printf(user.getName());
            }
        });

        users.forEach(u -> System.out.printf(u.getName()));

        users.forEach(u -> u.becomeModerator());
    }
}
