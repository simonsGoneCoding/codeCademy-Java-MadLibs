public class MadLibs {
    /*
     * This program generates a mad libbed story.
     */
    public static void main(String[] args) {
        String name1 = "Charlie";
        String name2 = "Zuzana";
        String adjective1 = "big";
        String adjective2 = "weird";
        String adjective3 = "tiny";
        String noun1 = "mashroom";
        String noun2 = "rock";
        String noun3 = "fence";
        String noun4 = "rainbow";
        String noun5 = "monkey";
        String noun6 = "nose";
        String place1 = "Barcelona";
        String verb1 = "eat";
        int number = 7;

        // The template for the story
        String story = "This morning " + name1 + " woke up feeling " + adjective1 + ". 'It is going to be a "
                + adjective2 + " day!' Outside, a bunch of " + noun1 + "s were protesting to keep " + noun2
                + " in stores. They began to " + verb1 + " to the rhythm of the " + noun3 + ", which made all the "
                + noun4 + "s very " + adjective3 + ". Concerned, " + name1 + " texted " + name2 + ", who flew " + name1
                + " to " + place1 + " and dropped " + name1 + " in a puddle of frozen " + noun5 + ". " + name1
                + " woke up in the year " + number + ", in a world where " + noun6 + "s ruled the world.";

        System.out.println(story);
    }
}