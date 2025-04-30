public class Main{

    public static void main(String[] args) {
        System.out.println("Hello");

        int font_size = 44;
        String message;

        switch (font_size) {

            case 29:
              message = "Small";
              break;
      
            case 42:
              message = "Medium";
              break;
      
            // match the value of week
            case 44:
              message = "Large";
              break;
      
            case 48:
              message = "Extra Large";
              break;
            
            default:
              message = "Unknown";
              break;
      
        }

        System.out.println("Font Size : "+ message);

    }
}