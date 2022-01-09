import java.util.ArrayList;

class Orange {
    }

    public class ApplesAndOrangeWithoutGenerics {
        @SuppressWarnings("unchecked")
        public static void main(String[] args) {
            ArrayList apples = new ArrayList<>();
            for (int i = 0; i < 3; i++) {
                apples.add(new Apple());
                apples.add(new Orange());
            }

            for (int i = 0; i < apples.size(); i++) {
                ((Apple) apples.get(i)).id();
            }
        }
    }