public class hwApp {

    private static String month;

 
    public static String setMonth(String input) {
        String[] monthsFull = {"January", "February", "March", "April", "May", "June",
                               "July", "August", "September", "October", "November", "December"};
        String[] monthsAbbreviated = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
                                      "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        input = input.trim(); 
        try {
            int monthInt = Integer.parseInt(input);
            if (monthInt > 0 && monthInt <= 12) {
                month = monthsFull[monthInt - 1];
            } else {
                month = "Invalid month";
            }
        } catch (NumberFormatException e) {

            for (int i = 0; i < monthsFull.length; i++) {
                if (input.equalsIgnoreCase(monthsFull[i]) || input.equalsIgnoreCase(monthsAbbreviated[i])) {
                    month = monthsFull[i];
                    break;
                } else {
                    month = "Invalid month";
                }
            }
        }
        return month;
    }

    public static String getMonth() {
        return month;
    }

    public static void main(String[] args) {

        setMonth("January");
        System.out.println(getMonth()); 
    }
}
