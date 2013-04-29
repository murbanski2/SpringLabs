package lab1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 *
 * @author jlombardo
 */
public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final AbstractApplicationContext ctx = 
                new ClassPathXmlApplicationContext(
                    new String[] {"applicationContext.xml"});
        
        PetOwner owner = (PetOwner)ctx.getBean("petOwner");
        
//        PetOwner owner =
//                //new PetOwner("John", new Doc ("Fido", 5));
//                new PetOwner("John", new Cat ("Sassy", 8));
        Pet pet = owner.getPet();
        
        
        System.out.println("Pet Name: " + pet.getName());
        System.out.println("Age adjustment: " + pet.getAgeInAnimalYears());
    }

}
