import java.util.ArrayList;
import java.util.Scanner;

public class MovieWatchlist {

    public static void main(String[] args) {

        ArrayList<String> movies = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int userChoice = 0;
        boolean running = true;

        while (running) {
            System.out.println("======Movie Watchlist======");
            System.out.println("1. Add Movies");
            System.out.println("2. View MovieList");
            System.out.println("3. Remove Movies");
            System.out.println("4. Exit");

            try {
                userChoice = Integer.parseInt(scanner.nextLine());
                if (userChoice == 1) {
                    addMovie(movies, scanner);
                } else if (userChoice == 2) {
                    viewMovies(movies, scanner, running);
                } else if (userChoice == 3) {
                    removeMovies(movies, scanner);
                } else if (userChoice == 4) {
                    System.out.println("EXITING PROGRAM!");
                    running = false;
                }
            } catch (NumberFormatException e) {
                System.out.println("INVALID INPUT!");

            }
        }
    }
        public static void addMovie (ArrayList <String> movies, Scanner scanner){
            System.out.println("What movie would you like to add?");
            String mov = scanner.nextLine();
            movies.add(mov);
            System.out.println(mov + " has been added!");
        }
        public static void viewMovies (ArrayList <String> movies, Scanner scanner, boolean running){
            System.out.println("Current Movies: " + movies);
            System.out.println("Would you likes to make any changes? 1. Yes || 2. No");
            int userAns = 0;
            userAns = Integer.parseInt(scanner.nextLine());

            if (userAns == 1) {
                System.out.println("1. Add Movie || 2. Remove Movie || 3. Exit");
                int submenu = 0;
                submenu = Integer.parseInt(scanner.nextLine());
                if(submenu == 1){
                    addMovie(movies, scanner);
                }
                else if(submenu == 2){
                    removeMovies(movies, scanner);

                }
                else if(submenu == 3){
                    System.out.println("EXITING PROGRAM");
                }
            } else {
                running = false;

            }
        }
        public static void removeMovies(ArrayList<String> movies, Scanner scanner){
            int removeMenu = 0;

            for(int i = 0; i<movies.size(); i++){

                System.out.println("Select a Movie to remove");
                System.out.println((i+1) + movies.size());

                removeMenu = Integer.parseInt(scanner.nextLine());
            }
        }

    }




