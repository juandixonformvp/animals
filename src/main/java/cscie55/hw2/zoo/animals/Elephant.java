package main.java.cscie55.hw2.zoo.animals;

/************************************************************ 
* HW 1, Part II - Create 5 classes in package cscie55.zoo.animals.
* Each class should model an animal of your choice that would be found in a zoo.
************************************************************/
import java.util.*; 

public class Elephant {
    
    private String name;
    private int age;
    private boolean gender;
    ArrayList<String> favoriteFoods = new ArrayList<String>();
    public enum Diet { VEGGIE, MEAT, OMNI };
    Diet diet;
    
/**Takes no arguments and initializes the name,age,gender,foods,diet to generic starting values.
 * 
 */
    public Elephant(){
        this.name = "elephant";
        this.age = 0;
        this.gender = true;
        this.favoriteFoods.add("water");
        this.favoriteFoods.add("peanuts");
        this.favoriteFoods.add("carrots");
        this.diet = Diet.VEGGIE;
    }

    public String toString(){
        return getClass().getName()+"[name="+this.name+",age="+this.age+",gender="+this.gender+",favfood="+this.favoriteFoods.get(0)+",diet="+this.diet+"]";
    }

/**Uses toString to test the class.
 * 
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


    public static void main(String[] argv){
        System.out.println("");
        Elephant elephant_1 = new Elephant();
        System.out.println(elephant_1.eat());
    }


}

/************************************************************* 
* 
**************************************************************/



