package fr.unice.hmabwe.controleur.bd.config;

public class ConnexionException extends Exception {

    public ConnexionException(String message, Throwable cause) {
        super(message, cause);
    }

    public ConnexionException(String message) {
        super(message);
    }

}