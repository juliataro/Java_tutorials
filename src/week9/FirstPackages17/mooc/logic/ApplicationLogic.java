package week9.FirstPackages17.mooc.logic;

import week9.FirstPackages17.mooc.ui.UserInterface;

public class ApplicationLogic {

    private final UserInterface ui;

    public ApplicationLogic(UserInterface ui) {
        this.ui = ui;
    }

    public void execute(int howManyTimes) {

        for (int count = 0; count < howManyTimes; count++) {
            System.out.println("The application logic works");

            this.ui.update();
        }
    }
}
