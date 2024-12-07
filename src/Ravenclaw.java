public class Ravenclaw extends Hogwarts{
    private int at;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String firstName, String lastName, int at, int wisdom, int wit, int creativity, int magicPower, int transgression) {
        super(firstName, lastName, magicPower, transgression);
        this.at = at;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getAt() {
        return at;
    }

    public void setAt(int at) {
        this.at = at;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }
    @Override
    public String toString() {
        return getFirstName() + getLastName() + at + wisdom + wit + creativity;
    }

    public void studentInformationRavenclaw() {
        System.out.println("Имя " + getFirstName() + getLastName() + " Ум " + at + "; Мудрость " + wisdom + "; Остраумие " + wit + "; Креативность " + creativity + ";");
    }
    public static void studentComparisonRavenclaw(Ravenclaw comparison1, Ravenclaw comparison2) {
        int student1 = comparison1.getAt() + comparison1.getWisdom() + comparison1.getWit() + comparison1.getCreativity();
        int student2 = comparison2.getAt() + comparison2.getWisdom() + comparison2.getWit() + comparison2.getCreativity();
        if (student1 > student2) {
            System.out.println(comparison1.getFirstName() + comparison1.getLastName() + " лучший ученик Когтеврана, чем " + comparison2.getFirstName() + comparison2.getLastName());
        } else if (student1 < student2) {
            System.out.println(comparison2.getFirstName() + comparison2.getLastName() + " лучший ученик Когтеврана, чем " + comparison1.getFirstName() + comparison1.getLastName());
        } else {
            System.out.println(comparison1.getFirstName() + comparison1.getLastName() + " " + comparison2.getFirstName() + comparison2.getLastName() + " Лучшие ученики Когтеврана.");
        }
    }

}
