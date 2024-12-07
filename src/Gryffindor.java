public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String firstName, String lastName, int nobility, int honor, int bravery, int magicPower, int transgression) {
        super(firstName, lastName, magicPower, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return getFirstName() + getLastName() + nobility + honor + bravery;
    }

    public void studentInformationGryffindor() {
        System.out.println("Имя " + getFirstName() + getLastName() + " Благородство " + nobility + "; Честь " + honor + "; Храбрость " + bravery + ";");
    }

    public static void studentComparisonGryffindor(Gryffindor comparison1, Gryffindor comparison2) {
        int student1 = comparison1.getNobility() + comparison1.getHonor() + comparison1.getBravery();
        int student2 = comparison2.getNobility() + comparison2.getHonor() + comparison2.getBravery();
        if (student1 > student2) {
            System.out.println(comparison1.getFirstName() + comparison1.getLastName() + " лучший ученик Гриффиндора, чем " + comparison2.getFirstName() + comparison2.getLastName());
        } else if (student1 < student2) {
            System.out.println(comparison2.getFirstName() + comparison2.getLastName() + " лучший ученик Гриффиндора, чем " + comparison1.getFirstName() + comparison1.getLastName());
        } else {
            System.out.println(comparison1.getFirstName() + comparison1.getLastName() + " " + comparison2.getFirstName() + comparison2.getLastName() + " Лучшие ученики Гриффиндора.");
        }
    }
}
