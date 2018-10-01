package main.java.cscie55.hw2.zoo.animals;

/************************************************************ 
* HW 1, Part II - Create 5 classes in package cscie55.zoo.animals.
* Each class should model an animal of your choice that would be found in a zoo.
************************************************************/
import java.util.*; 

public class Elephant {
    
    private String name;
    private int age;
    private boolean male;
    ArrayList<String> favoriteFoods = new ArrayList<String>();
    public enum Diet { VEGGIE, MEAT, OMNI };
    Diet diet;
    
/**Takes no arguments and initializes the name,age,male,foods,diet to general starting values.
 * 
 */
    public Elephant(){
        this.name = "elephant";
        this.age = 0;
        this.male = true;
        this.favoriteFoods.add("water");
        this.favoriteFoods.add("peanuts");
        this.favoriteFoods.add("carrots");
        this.diet = Diet.VEGGIE;
    }

    public String toString(){
        return getClass().getName()+"[name="+this.name+",age="+this.age+",male="+this.male+",favfood="+this.favoriteFoods.get(0)+",diet="+this.diet+"]";
    }

/**Returns a String that takes the favoriteFoods data from
 * Assignment 1 and displays it as proof that it is eating well.
 */    
    public String eat(){
        StringBuilder eating = new StringBuilder();
        eating.append("Delightfully tasty ");
        for(int i = 0; i < favoriteFoods.size(); i++) {
            eating.append(favoriteFoods.get(i));
            eating.append(i < favoriteFoods.size() - 1 ? ", " : ".");
        }
        return eating.toString();
    }

/**Return a String indicating what sound the animal makes.
 */ 
    public String speak(){
        StringBuilder speaking = new StringBuilder("Trumpet!");
        return speaking.toString();
    }

/**Return a String indicating what sound the animal makes while playing.
 */  
    public String play(){
        StringBuilder playing = new StringBuilder("Elephant Ecstasy!");
        return playing.toString();
    }

    public static void main(String[] argv){
        Elephant elephant_1 = new Elephant();
        System.out.println("");
        System.out.println(elephant_1.eat());
        System.out.println(elephant_1.speak());
        System.out.println(elephant_1.play());
    }


}

/************************************************************* 
* 
**************************************************************/



