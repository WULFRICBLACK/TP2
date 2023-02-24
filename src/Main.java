import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Hello there!");
        int choice;
        do{
            System.out.println("Quel exercice ? Saisissez :" );
            System.out.println("\t1. Discriminant\n");
            System.out.println("\t2. Parité d’un nombre\n" );
            System.out.println("\t3. Calcul d’extremum\n" );
            System.out.println("\t4. Égalité entre chaînes de caractères\n" );
            System.out.println("\t5. Factorielle\n");
            System.out.println("\t6. Compte à rebous\n");
            System.out.println("\t7. Valeurs de carrés\n");
            System.out.println("\t8. Table de multiplication\n");
            System.out.println("\t9. Division d’entiers\n");
            System.out.println("\t 10. Règle graduée\n");
            System.out.println("\t 11. Nombres premiers\n");
            System.out.println("\t 12. Manipulations sur un tableau");

            System.out.println("Enter The serial number of your choice");
            choice = scanner.nextInt();
            // Call the corresponding function based on user's choice
            switch (choice) {
                case 1:
                    discriminant();
                    break;
                case 2:
                    partie();

                    break;
                case 3:
                    max();

                    break;
                case 4:
                    egaliteStr();

                    break;
                case 5:
                    factorielle();

                    break;
                case 6:
                    countdown();

                    break;
                case 7:
                    carres();

                    break;

                case 8:
                    tableMultiplication();

                    break;
                case 9:
                    division();

                    break;
                case 10:
                    rule();

                    break;

                case 11:
                    nombrePremier();

                    break;

                case 12:
                    initialisationTableau();
                    inverseTableau();

                    break;

                default:
                    System.out.println("Invalid choice, please try again.");
                    break;
            }
            break;



        }while (choice != 0);


    }

//3.1.1 Calcul du discriminant du second degré

    public static void discriminant() {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Quelle est la valeur de a ?");
        int a = scanner.nextInt();

        System.out.println("Quelle est la valeur de b ?");
        int b = scanner.nextInt();

        System.out.println("Quelle est la valeur de c ?");
        int c = scanner.nextInt();

        int delta = (int) (Math.pow(b, 2) - 4 * a * c);


        if (delta < 0) {
            System.out.println("Ce polynome n’a pas de racine reelle");

        }
        else{
            System.out.println("It is a polynomial");
        }
    }

//3.1.2 Calcul de la parité d’un nombre
    public  static void partie(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer = ");
        int num = scanner.nextInt();

        if(num%2==0)
        {
            System.out.println("The entered number is even");
        }
        else{
            System.out.println("Entered number is odd");
        }

    }
//3.1.3 Calcul d’extremum
    public static void max() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two number");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a > b) {
            System.out.println(a + " is the bigger number");
        } else {
            System.out.println(b + " is the bigger number");
        }
    }
//3.1.4 Égalité entre chaînes de caractères
    public static void egaliteStr()
    {
        System.out.println("Enter two string Characters");
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        boolean test = str1.equals(str2);
        if(test==true) {
            System.out.println("The string are same");
        }
        else
        {
            System.out.println("The strings are NOT same");
        }
    }

    //3.2 Structures itératives
    public static void factorielle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir un entier positif ou nul");
        int n = scanner.nextInt();
   for (int i = 0; i <= n-1; i++) {
       int factorielle = 1;
       factorielle *= i;
       System.out.println(n + "! = " + factorielle);
   }
   }

    //3.2.1 Compte à rebours
    public static void countdown() {

        int n; int i;

        for(i=10;i>=0;i--){
            System.out.println(i);

            if(i==0){
                System.out.println("BOOM");
            }
        }


    }

    //3.2.2 Valeurs de carrés
    public static void carres(){
        System.out.println("Enter the x1 = ");
        float x1= scanner.nextFloat();
        float sqx1= x1*x1;
        System.out.println("Enter the x2 = ");
        float x2= scanner.nextFloat();
        float sqx2= x2*x2;
        System.out.println("The square of "+x1+" = "+sqx1);
        System.out.println("The square of "+x2+" = "+sqx2);
    }

    public static void tableMultiplication(){
        int i,j;

        for (i=1;i<=10;i++){

            for (j=1;j<=10;j++){

                System.out.print(i*j+"\t");
            }
            System.out.println(" ");
        }
    }


    //3.2.5
    public static void division() {
        float a, b;
        do {
            System.out.println("Enter two integers (say 'a' & 'b' such that a/b)= ");
            a = scanner.nextFloat();
            b = scanner.nextFloat();
            if (b == 0) {
                System.out.println("Error: Denominator cannot be zero. Please re-enter:");
            }
        } while (b == 0);
        double x = a / b;
        System.out.println("The divisoin of" + a + " & " + b + "=" + x);


    }


                            //3.3 Structures de contrôle
                             //3.3.1 Règle graduée
    public static void rule(){
        System.out.println("Enter a positive integer:");
        int a;

        do {
            a = scanner.nextInt();
            if(a<0){
                System.out.println("Error you have entered negative integer"+"\t Please Enter positive integer");
            }

        }while(a<0);
        int i;
        String ruler ="|";
        for(i=0;i<=a;i++){
            if (i % 10 == 0 && i>9){
                ruler += "|";
            } else {
                ruler += "-";
            }
        }
        //ruler += "|";

        System.out.print(ruler);

    }

//nombrePremier()

    public static void nombrePremier(){
        int a;
        do {
            System.out.println("Enter positive integer");
            a = scanner.nextInt();
            if(a<0){
                System.out.println("Error you have entered negative integer"+"\t Please Enter positive integer");
            }

        }while(a<0);

        boolean isPrime = true;

        if (a < 2) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(a + " is prime.");
        } else {
            System.out.println(a + " is not prime.");
        }


    }
                         //3.4 Tableaux
                     //3.4.1 Manipulations sur un tableau
    public static void initialisationTableau() {
        int[] tableau = new int[5];
        int max = tableau[0]; //initialising
        int sum = 0;
        int even = tableau[0];

        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Saisir un entier(Enter an integer value):");
            int entier = scanner.nextInt();
            tableau[i] = entier;
            if (tableau[i] > max) {
                max = tableau[i];
            }
            sum += tableau[i];

        }
        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] % 2 == 0) {
                even = tableau[i];
                System.out.println("Even values are =" + even);
                // Filter the even values using a stream
                int[] evenValues = Arrays.stream(tableau).filter(x -> x % 2 == 0).toArray();

                // Print the even values
                System.out.println("Even values: " + Arrays.toString(evenValues));

            }
        }


        System.out.println("Maximum value =" + max + " ");
        System.out.println("Sum  =" + sum);
        System.out.println("Even index elements  =");
        for (int j = 1; j < tableau.length; j += 2) {
            System.out.println(tableau[j] + " ");
        }
    }



    //5. Créez une nouvelle fonction inverseTableau(int[] tableau) qui prend en paramètre un tableau et qui inverse l’ordre de ses éléments.
    public static void inverseTableau() {
            int[] inversetableau = new int[5];


            for (int i = 0; i < inversetableau.length; i++) {
                System.out.println("Saisir un entier(Enter an integer value):");
                int entier = scanner.nextInt();
                inversetableau[i] = entier;


            }

            System.out.println("Reversed array is :");
        for(int j = inversetableau.length-1;j>=0;j--){
            System.out.println(inversetableau[j]);
        }

        }

    }

