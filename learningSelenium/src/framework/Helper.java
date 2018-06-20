
package framework;


public class Helper {
    
    public static String getRandomText() {
        
        // sp-32432
//        int randomNumber = (int) (Math.random() * 1000);
//        String randomText = "krtola-" + randomNumber;
//        
//        return randomText;
        
        
        return "krtola-" + (int) (Math.random() * 1000);
        
    }
    
}
