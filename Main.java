import java.util.ArrayList;

public class Main {
    static ArrayList<String> actions = new ArrayList<>();
    static Menu menu = new Menu(actions);

    public static void main(String[] args) {

        actions.add("1) Start game");
        actions.add("2) Resume game");
        actions.add("3) Pause game");
        actions.add("4) End game");



        doAction(Integer.parseInt(menu.showMenu()));
    }
        public static void doAction(int action){
            switch (action) {
                case 1:
                    System.out.println("Starting the game now");
                    break;

                case 2:
                    System.out.println("Fetching previously saved game data");
                    break;

                case 3:
                    System.out.println("Game paused");
                    break;

                case 4:
                    System.out.println("Ending game");
                    break;


            }
        }

    }

