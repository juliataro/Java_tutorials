package week4.menu_76;

import java.util.ArrayList;
import java.util.Collections;

public class Menu {

    private ArrayList<String> meals;

    // Here we are creating new Array
    public Menu() {
        this.meals = new ArrayList<String>();
    }

    // Here we are adding meal if its not yet in list
    public void addMeal(String meal){
            if(!this.meals.contains(meal)){
                this.meals.add(meal);
            }
    }

    // Here we are printing each meal that is in meals array
    public void printMeals(){
        System.out.println("We have these meals: ");
        for (String meal : meals){
            System.out.println(meal);
         }
    }

    // Here we are clearing Menu list
    public void clearingMeals() {
        this.meals.clear();
        }
    }



