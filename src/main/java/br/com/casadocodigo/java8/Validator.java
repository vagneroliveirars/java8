package br.com.casadocodigo.java8;

@FunctionalInterface
interface Validator<T> {

    boolean validate(T t);

}