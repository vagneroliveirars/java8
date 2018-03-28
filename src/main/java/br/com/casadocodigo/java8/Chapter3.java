package br.com.casadocodigo.java8;

public class Chapter3 {

    public static void main(String[] args) {
        /*Runnable r1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000 ; i++) {
                    System.out.println(i);
                }
            }
        };
        new Thread(r1).start();


        Runnable r2 = () -> {
            for (int i = 0; i < 1000 ; i++) {
                System.out.println(i);
            }
        };
        new Thread(r2).start();


        new Thread(() -> {
            for (int i = 0; i < 1000 ; i++) {
                System.out.println(i);
            }
        }).start();


        Validator<String> zipCodeValidatorWithoutLambda = new Validator<String>() {
            @Override
            public boolean validate(String s) {
                return s.matches("[0-9]{5}-[0-9]{3}");
            }
        };

        Validator<String> zipCodeValidatorWithLambda = zipCode ->
                zipCode.matches("[0-9]{5}-[0-9]{3}");

        System.out.println(zipCodeValidatorWithLambda.validate("95555-000"));*/

        Runnable o = () -> System.out.println("Who am I? What lambda?");

        System.out.println(o);
        System.out.println(o.getClass());
    }
}
