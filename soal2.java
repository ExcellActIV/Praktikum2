public class soal2 {
    public static class Constants {
        public static final double CM_PER_INCH = 2.54;
        
        public static void main(String[] args) {  
            double paperWidth = 8.5;
            double paperHeight = 11;
            System.out.println("Paper size in centimeters: " +
                paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
        }
    }
    
    public static class Constants2 {
        public static final double CM_PER_INCH = 2.54;
        
        public static void main(String[] args) { 
            double paperWidth = 8.5;
            double paperHeight = 11;
            System.out.println("Paper size in centimeters: " +
                paperWidth * CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
        }
    }
    
    public static void main(String[] args) {
        Constants.main(args);
        Constants2.main(args);
    }
}