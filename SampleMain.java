/*
 * Java SDK Installation for Cloud9
 * http://stackoverflow.com/questions/36445901/installing-java-8-on-cloud9
 * http://stackoverflow.com/questions/28196434/setting-up-cloud9-ide-to-compile-and-run-javaj
 * Master Write for vim: :w !sudo tee % > /dev/null
 */

class SampleMain {
    
    /*
     * INSTRUCTIONS
     * Compile: javac SampleMain.java
     * Run: java SampleMain
     * Output: Sanity check that Java is running correctly
     */
    
    public static void main(String[] args){
        
        int sum = 2 + 2;
        System.out.println("2 + 2 = " + sum);
        System.out.println("Java appears to be running correctly!");
        
    }
    
}