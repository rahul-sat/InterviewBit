public class Regex {
    public static void main(String[] args) {
        String string = "AbcgsDewbDDsaUUU89128kcV";
        System.out.println(string.replaceAll("\\d","@")); // Replace Integer only
        System.out.println(string.replaceAll("\\D","@")); // Replace everything (exclude Intger)
        System.out.println(string.replaceAll(".","@")); // Replace ecerything
        System.out.println(string.replaceAll("\ba","[.]"));
    }
}
