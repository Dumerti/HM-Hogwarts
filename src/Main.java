public class Main {
    public static void main(String[] args) {

        Gryffindor harryPotter = new Gryffindor("Harry ", "Potter ", 100, 90, 99, 89, 250);
        Gryffindor hermioneGranger = new Gryffindor("Hermione ", "Granger ", 80, 100, 100, 87, 450);
        Gryffindor ronWeasley = new Gryffindor("Ron ", "Weasley ", 100, 70, 50, 68, 250);

        Hufflepuff zachariasSmith = new Hufflepuff("Zacharias ", "Smith", 95, 51, 70, 58, 100);
        Hufflepuff cedricDiggory = new Hufflepuff("Cedric ", "Diggory", 48, 33, 67, 93, 300);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Justin ", "Finch-Fletchley", 74, 83, 93, 67, 150);

        Slytherin dracoMalcfoy = new Slytherin("Draco ", "Malfoy", 99, 89, 100, 100, 79, 243);
        Slytherin grahamMontague = new Slytherin("Graham ", "Montague", 79, 67, 67, 80, 73, 180);
        Slytherin gregoryGoyle = new Slytherin("Gregory ", "Goyle", 82, 87, 97, 84, 63, 130);

        Ravenclaw choChang = new Ravenclaw("Cho ", "Chang", 87, 91, 89, 93, 69, 200);
        Ravenclaw padmaPatil = new Ravenclaw("Padma ", "Patil", 94, 87, 86, 93, 64, 210);
        Ravenclaw marcusBelby = new Ravenclaw("Marcus ", "Belby", 85, 94, 87, 90, 85, 220);

        System.out.println();

        //Gryffindor
        harryPotter.studentInformationGryffindor();
        hermioneGranger.studentInformationGryffindor();
        ronWeasley.studentInformationGryffindor();

        System.out.println();

        //Hufflepuff
        zachariasSmith.studentInformationHuddlepuff();
        cedricDiggory.studentInformationHuddlepuff();
        justinFinchFletchley.studentInformationHuddlepuff();

        System.out.println();

        //Slytherin
        dracoMalcfoy.studentInformationSlytherin();
        grahamMontague.studentInformationSlytherin();
        gregoryGoyle.studentInformationSlytherin();

        System.out.println();

        //Ravenclaw
        choChang.studentInformationRavenclaw();
        padmaPatil.studentInformationRavenclaw();
        marcusBelby.studentInformationRavenclaw();

        System.out.println();

        Gryffindor.studentComparisonGryffindor(harryPotter, hermioneGranger);
        Hufflepuff.studentComparisonHufflepuff(zachariasSmith, justinFinchFletchley);
        Ravenclaw.studentComparisonRavenclaw(padmaPatil, marcusBelby);
        Slytherin.studentComparisonSlytherin(dracoMalcfoy, gregoryGoyle);

        System.out.println();
        Hogwarts.powerOfMagicTransgressionDistance(dracoMalcfoy, harryPotter);







    }
}