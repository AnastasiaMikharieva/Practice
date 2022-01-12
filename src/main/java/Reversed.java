public class Reversed {

    public static void main(String[] args) {

        String str = "winner";

        String reveresd = "";


        for (int i = str.length()-1 ; i >= 0; i--) {

            reveresd += str.charAt(i) ;
        }

        System.out.println("reveresd = " + reveresd);
        




    }
}
