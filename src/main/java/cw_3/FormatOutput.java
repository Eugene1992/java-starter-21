package cw_3;

public class FormatOutput {
    public static void main(String[] args) {
        String city = "London";
        String country = "Great Britain";

        System.out.println(city + " is a capital of " + country + "!");

        System.out.printf("%s is a capital of %s!", city, country);
    }
}
