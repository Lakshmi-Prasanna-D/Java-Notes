import java.util.*;

public class CountryCapitals {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, LinkedHashMap<String, String>> database = new HashMap<>();

        System.out.print("Enter number of countries: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.print("Enter country name: ");
            String country = sc.nextLine().toLowerCase();

            if (database.containsKey(country)) {
                System.out.println("Country already exists. Skipping...");
                i--;
                continue;
            }

            System.out.print("Enter number of capitals (1/2/3): ");
            int c = sc.nextInt();
            sc.nextLine();

            if (c < 1 || c > 3) {
                System.out.println("Invalid number of capitals!");
                i--;
                continue;
            }

            LinkedHashMap<String, String> seasons = new LinkedHashMap<>();

            System.out.print("Enter winter capital: ");
            seasons.put("winter", sc.nextLine());

            if (c >= 2) {
                System.out.print("Enter summer capital: ");
                seasons.put("summer", sc.nextLine());
            }

            if (c == 3) {
                System.out.print("Enter rainy capital: ");
                seasons.put("rainy", sc.nextLine());
            }

            database.put(country, seasons);
        }

        while (true) {

            System.out.println("\nMenu:");
            System.out.println("1. Print all countries and capitals");
            System.out.println("2. Print capitals of specific country");
            System.out.println("3. Print countries with 2 capitals");
            System.out.println("4. Print countries with 3 capitals");
            System.out.println("5. Print countries without summer capital");
            System.out.println("6. Print capitals of countries starting with vowel");
            System.out.println("7. Print summer capitals of countries starting with vowel");
            System.out.println("8. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    if (database.isEmpty()) {
                        System.out.println("Database is empty.");
                    } else {
                        for (String country : database.keySet()) {
                            System.out.println(country + " -> " + database.get(country));
                        }
                    }
                    break;

                case 2:
                    System.out.print("Enter country name: ");
                    String search = sc.nextLine().toLowerCase();

                    if (database.containsKey(search)) {
                        System.out.println(database.get(search));
                    } else {
                        System.out.println("Country not found.");
                    }
                    break;

                case 3:
                    for (String country : database.keySet()) {
                        if (database.get(country).size() == 2) {
                            System.out.println(country);
                        }
                    }
                    break;

                case 4:
                    for (String country : database.keySet()) {
                        if (database.get(country).size() == 3) {
                            System.out.println(country);
                        }
                    }
                    break;

                case 5:
                    for (String country : database.keySet()) {
                        if (!database.get(country).containsKey("summer")) {
                            System.out.println(country);
                        }
                    }
                    break;

                case 6:
                    for (String country : database.keySet()) {
                        if (isVowel(country.charAt(0))) {
                            System.out.println(country + " -> " + database.get(country));
                        }
                    }
                    break;

                case 7:
                    for (String country : database.keySet()) {
                        if (isVowel(country.charAt(0)) &&
                                database.get(country).containsKey("summer")) {

                            System.out.println(country + " -> "
                                    + database.get(country).get("summer"));
                        }
                    }
                    break;

                case 8:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }

    static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u';
    }
}