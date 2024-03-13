public class exc {
    public static void main(String[] args) {
        String[] seasons  = new String[] {"Winter", "Spring", null, "Summer", "Autumn"};
        for (int i = 0; i < 5; i++) {
            System.out.println(seasons[i]);
        }
        for (int i = 1; i < 5; i=i+2) {
            System.out.println(seasons[i]);
    }
        for (int i = 0; i < 5; i=i++) {
            if (seasons[i] == null)
            {
                break;
            }
        }
}
}


