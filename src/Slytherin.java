import javax.swing.*;

public class Slytherin extends Hogwarts {
    private int trick;
    private int determination;
    private int ambition;
    private int power;

    public Slytherin(String firstname, String lastname, int trick, int determination, int ambition, int power, int magicPower, int transgression) {
        super(firstname, lastname, magicPower, transgression);
        this.trick = trick;
        this.determination = determination;
        this.ambition = ambition;
        this.power = power;
    }

    public int getTrick() {
        return trick;
    }

    public void setTrick(int trick) {
        this.trick = trick;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return getFirstName() + getLastName() + trick + determination + ambition + power;
    }

    public void studentInformationSlytherin() {
        System.out.println("Имя " + getFirstName() + getLastName() + " Хитрость " + trick + "; Решительность " + determination + "; Амбициозность " + ambition + "; Жажда власти " + power + ";");
    }
    public static void studentComparisonSlytherin(Slytherin comparison1, Slytherin comparison2) {
        int student1 = comparison1.getTrick() + comparison1.getDetermination() + comparison1.getAmbition() + comparison1.getPower();
        int student2 = comparison2.getTrick() + comparison2.getDetermination() + comparison2.getAmbition() + comparison2.getPower();
        if (student1 > student2) {
            System.out.println(comparison1.getFirstName() + comparison1.getLastName() + " лучший ученик Слизерина, чем " + comparison2.getFirstName() + comparison2.getLastName());
        } else if (student1 < student2) {
            System.out.println(comparison2.getFirstName() + comparison2.getLastName() + " лучший ученик Слизерина, чем " + comparison1.getFirstName() + comparison1.getLastName());
        } else {
            System.out.println(comparison1.getFirstName() + comparison1.getLastName() + " " + comparison2.getFirstName() + comparison2.getLastName() + " Лучшие ученики Слизерина.");
        }
    }
}
