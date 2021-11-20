public class MakeAbbr {
    public static void main(String[] args) {
        String makeAbbr = ("national aeronautics space administration 1");

        StringBuilder initials = new StringBuilder();
        for (String s : makeAbbr.split(" ")) {
            initials.append(s.charAt(0));
        }
        System.out.println(initials.toString().toUpperCase());
    }
}
