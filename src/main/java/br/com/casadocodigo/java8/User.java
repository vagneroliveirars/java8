package br.com.casadocodigo.java8;

class User {

    private String name;

    private int points;

    private boolean moderator;

    public User(String name, int points) {
        this.points = points;
        this.name = name;
        this.moderator = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public boolean isModerator() {
        return moderator;
    }

    public void setModerator(boolean moderator) {
        this.moderator = moderator;
    }

    public void becomeModerator() {
        this.moderator = true;
    }
}
