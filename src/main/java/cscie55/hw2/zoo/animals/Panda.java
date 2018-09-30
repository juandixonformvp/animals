package cscie55.zoo.animals;

/************************************************************ 
* HW 1, Part II - Create 5 classes in package cscie55.zoo.animals.
* Each class should model an animal of your choice that would be found in a zoo.
************************************************************/
import java.util.*; 

public class Panda {
    
    private String name;
    private int age;
    private boolean gender;
    ArrayList<String> favoriteFoods = new ArrayList<String>();
    public enum Diet { VEGGIE, MEAT, OMNI };
    Diet diet;
    
/**Takes no arguments and initializes the name,age,gender,foods,diet to generic starting values.
 * 
 */
    public Panda(){
        this.name = "panda";
        this.age = 0;
        this.gender = true;
        this.favoriteFoods.add("water");
        this.diet = Diet.VEGGIE;
    }

    public String toString(){
        return getClass().getName()+"[name="+this.name+",age="+this.age+",gender="+this.gender+",favfood="+this.favoriteFoods.get(0)+",diet="+this.diet+"]";
    }

/**Uses toString to test the class.
 * 
 */     
    public static void main(String[] argv){
        System.out.println("");
		System.out.println("");
        Panda panda_1 = new Panda();
        System.out.println(panda_1.toString());
    }


}

/************************************************************* 
* 
**************************************************************/



