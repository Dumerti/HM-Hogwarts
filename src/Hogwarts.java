public class Hogwarts {
    private String FirstName;
    private String LastName;
    private int MagicPower;
    private int transgression;

    public Hogwarts(String firstName, String lastName, int magicPower, int transgression) {
        FirstName = firstName;
        LastName = lastName;
        MagicPower = magicPower;
        this.transgression = transgression;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getMagicPower() {
        return MagicPower;
    }

    public void setMagicPower(int magicPower) {
        MagicPower = magicPower;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    public static void powerOfMagicTransgressionDistance(Hogwarts student1, Hogwarts student2) {
        int comparison1 = student1.getMagicPower() + student1.getTransgression();
        int comparison2 = student2.getMagicPower() + student2.getTransgression();
        if (comparison1 > comparison2) {
            System.out.println(student1.getFirstName() + student1.getLastName() + " обладает большей мощностью магии, чем " + student2.getFirstName() + student2.getLastName());
        } else if (comparison1 < comparison2) {
            System.out.println(student2.getFirstName() + student2.getLastName() + " обладает большей мощностью магии, чем " + student1.getFirstName() + student1.getLastName());
        } else {
            System.out.println(student1.getFirstName() + student1.getLastName() + " " + student2.getFirstName() + student2.getLastName() + " Обладают большой мощностью магии");
        }
    }
}