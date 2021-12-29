package week9.FirstPackages17;

import week9.FirstPackages17.mooc.logic.ApplicationLogic;
import week9.FirstPackages17.mooc.ui.UserInterface;
import week9.FirstPackages17.mooc.ui.TextUserInterface;

public class Main {

    public static void main(String[] args) {
        UserInterface ui = new TextUserInterface();
        new ApplicationLogic(ui).execute(3);
    }
}