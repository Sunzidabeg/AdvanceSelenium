public class reverseName {

    public static void main(String[] args) {




    /*  String s="Khurshed Alam";

        int len=s.length();

        String rev= "";


        for(int i =len-1; i>=0;i--) {
            rev =  s.charAt(i);

        }

        System.out.println(rev);

        }*/
        String s = "Khurshedfngfhgg";
        int len = s.length();
        String rev = "";

        for (int i = len-1; i >= 0; i--) {
            rev =rev +  s.charAt(i);


        }

        System.out.println(rev);
    }

}