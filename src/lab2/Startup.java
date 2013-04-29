package lab2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * See if you can modify this class to use Spring as in Lab1.
 */
public class Startup {

    public static void main(String[] args) {
        // First create some low-level instances using
        // Liskov Substitution Principle
        final AbstractApplicationContext ctx = 
                new ClassPathXmlApplicationContext(
                    new String[] {"config.xml"});

//        TipCalculator calc1 =
//                (TipCalculator)ctx.getBean(calc1);
//        new FoodServiceTipCalculator(TipService.ServiceQuality.FAIR,125.00);
//
//        TipCalculator calc2 =
//           new BaggageServiceTipCalculator(TipService.ServiceQuality.GOOD,5);

        // Next, create the high-level class
        //TipService tipMgr = new TipService(calc2);
        TipService tipMgr = (TipService) ctx.getBean("tipMgr");

        // Now ask the tip manager to do some work...
        double tip = tipMgr.getTip();
        String quality = tipMgr.getServiceQuality();

        // Now prove it works...
        System.out.println("\nThe tip for the "
                + tipMgr.getClass().getSimpleName() + " is: "
                + tip + ", with a service qualilty of: " + quality);

    }

}
