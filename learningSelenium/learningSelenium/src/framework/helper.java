
package framework;


public class helper {
    
    public static String getRandomText() {
        
        // sp-32432
//        int randomNumber = (int) (Math.random() *1000);
//        String randomText = "md" + randomNumber;
//        
//        return rendomText;
        
        
        return "md-" + (int) (Math.random() * 1000);
    }
    
}
