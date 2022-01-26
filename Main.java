import java.util.Scanner;


public class Main {
    // Lägger scannern här så vi inte behöver skapa en ny i varje metod då den är global över hela programmet och inte bara i scoopet av en metod.
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println(" ----"); // Printar ut strängar liknande en bil.
        System.out.println("_/__\\_");
        System.out.println("-o---o-");

        String sprak = "Programmeringsspråk";

        System.out.println(sprak); // Sprak är vår variabel för programmeringsspråk.
        System.out.print(sprak.substring(7, 10)); // Tar index 7 bokstav 8 till 10 och under plockar vi bara en bokstav vid index 12.
        System.out.println(sprak.charAt(12));

        runProgram(lightSetting(), speed()); // Kallar på våra metoder, i sista metoden har vi parameter bool och int, vilket våra andra metoder retunerar så vi kan lägga in dem vår sista method.

    }

    public static int speed() {
        System.out.println("How fast are you driving?"); // En metod som tar int som input som vi kan skriva ut senare.
        int drive;
        drive = scn.nextInt();

        return drive;
    }

    public static boolean lightSetting()
    {
        boolean correctAnswer = false;
        boolean lights = false;
        

        while(correctAnswer == false)
        { // Det kändes enklast att dela upp allt såhär, loopar tills man ger svar ja eller nej, annars gers ett fel medelande.
            System.out.println("Do You have lights on?");
            String light = scn.nextLine();

            if(light.equals("yes"))
            {
                lights = true; // Om yes är svaret hoppar vi ur if satsen här.
                correctAnswer = true;
            }
            else if(light.equals("no"))
            {
                lights = false; // Och här om no är svaret och under hanterar vi all annan input.
                correctAnswer = true;
            }
            else
            {
                System.out.println("Write yes or no.");
            }
        }

        return lights;
    }
    
    public static void runProgram(boolean lightsOn, int speed)
    {
        if (speed > 50 && !lightsOn) {
            System.out.println("2 Wrongs");
        }
        else if (speed < 50) {
            System.out.printf("Your speed %s", speed);
        }
        else if (speed == 50) {
            System.out.println("TACK");
        }
        else if (speed > 50) {
            System.out.println("OBS, You drive to fast!");
        }
    } // Denna metod hanterar vi större delen av denna uppgift, och metoden har 2 parametrar som vi lägger dem 2 andra metoderna i så programmet utförs i rätt ordning.


}
