import java.util.Scanner;

public class Lesson14 {
    public static void main(String[] args) {

//        REGEX
//        A*s -- Ananas
//        A.*s -- A12244444
//        ^StartsWith ---match StartsWithThisSentence
//        Contains only from alphanumeric a...z (lower case only)

//        Validate this range: 1900-2100;

//        String validInput = "2020";
//        String invalidInput = "99999";
//
//        if (validInput.matches("\\d\\d\\d\\d")) {
//            System.out.println("Valid input is a valid year");
//        } else {
//            System.out.println("Valid input is not a valid year");
//        }
//        ;
//
//
//        //
        String[] cities = {"Copenhagen","Paris","Tokyo","Bristol","Mumbai","Delhi","Riga","Vienna","Warsaw","Hamburg","Cesis"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a search patter here: ");
        String userInput = scanner.next();

        for (String city : cities) {
            if (city.matches(".*" + userInput + ".*") ) {
                System.out.println("This city matches the RegEx: \"" + userInput + "\" |" + city);
            }
        }

//        Quizzz lesson 14

        String Quiz6 = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
        int digits = 0;
        for (int i = 0; i < Quiz6.length(); i++) {
            if (Quiz6.charAt(i) >= 48 && Quiz6.charAt(i) <= 56)
                digits++;
        }
        System.out.println("Total number of Digits = " + digits);

        String inputString = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";

//        Quiz 7 for lesson 14
//        Positive scenario = all  characters that do not belong to
//        a - z, A - Z, 0 - 9, SPACE (allowed list)
//        We will go inside the loop and check that these characters are not a-z, A-Z and not a digit 0-9

        int counter = 0;
//      Counter is outside the loop, to hold the values we receive from every iteration
        for (int i = 0; i < inputString.length(); i++) {

            char characterToCheck = inputString.charAt(i);

            char [] charracterArray = {characterToCheck};

            String stringToCheck = new String(charracterArray);


            if(stringToCheck.matches("[^a-zA-Z0-9\\s]")){
                System.out.println(String.format("Character %s is matching the REGEX", stringToCheck));
                counter++;
            }

        }
        System.out.println(String.format("There were %d accurances", counter));

//        Negative scenario








    }
}



