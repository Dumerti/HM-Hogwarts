public class Hufflepuff extends Hogwarts {
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String firstName, String lastName, int industriousness, int loyalty, int honesty, int magicPower, int transgression) {
        super(firstName, lastName, magicPower, transgression);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return getFirstName() + getLastName() + industriousness + loyalty + honesty;
    }

    public void studentInformationHuddlepuff() {
        System.out.println("Имя " + getFirstName() + getLastName() + " Трудолюбие " + industriousness + "; Верность " + loyalty + "; Честность " + honesty + ";");
    }

    public static void studentComparisonHufflepuff(Hufflepuff comparison1, Hufflepuff comparison2) {
        int student1 = comparison1.getIndustriousness() + comparison1.getLoyalty() + comparison1.getHonesty();
        int student2 = comparison2.getIndustriousness() + comparison2.getLoyalty() + comparison2.getHonesty();
        if (student1 > student2) {
            System.out.println(comparison1.getFirstName() + comparison1.getLastName() + " лучший ученик Пуфендуя, чем " + comparison2.getFirstName() + comparison2.getLastName());
        } else if (student1 < student2) {
            System.out.println(comparison2.getFirstName() + comparison2.getLastName() + " лучший ученик Пуфендуя, чем " + comparison1.getFirstName() + comparison1.getLastName());
        } else {
            System.out.println(comparison1.getFirstName() + comparison1.getLastName() + " " + comparison2.getFirstName() + comparison2.getLastName() + " Лучшие ученики Пуфендуя.");
        }
    }
}
