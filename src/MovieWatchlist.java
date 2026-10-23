import java.util.ArrayList;
import java.util.Scanner;

public class MovieWatchlist {

    public static void main(String[] args){

        ArrayList<String> movies = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int userChoice = 0;
        boolean running = true;

        while(running){

        System.out.println("======Movie Watchlist======");
        System.out.println("1. Add Movies");
        System.out.println("2. View MovieList");
        System.out.println("3. Remove Movies");
        System.out.println("4. Exit");

            userChoice = Integer.parseInt(scanner.nextLine());

        if (userChoice == 1) {
            addMovie(movies, scanner);
        }
        else if(userChoice == 2){

        }
        else if(userChoice == 3){

        }
        else if(userChoice == 4){
            System.out.println("EXITING PROGRAM!");
            running = false;
        }

        }
    }
    public static void addMovie(ArrayList<String> movies, Scanner scanner){
        System.out.println("What movie would you like to add?");
        String mov = scanner.nextLine();
        movies.add(mov);
        System.out.println(mov + " has been added!");
        System.out.println(movies);

    }


}
