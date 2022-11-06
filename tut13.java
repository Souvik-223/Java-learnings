public class tut13 {
    public static void main(String[] args) {
        StringBuilder Sb = new StringBuilder("Souvik");

        for (int i = 0; i < Sb.length()/2; i++) {
            char front = Sb.charAt(i);
            char back = Sb.charAt(Sb.length()-i-1);

            Sb.setCharAt(i,back);
            Sb.setCharAt(Sb.length()-1-i,front);
        }
        System.out.println(Sb);
    }
}
