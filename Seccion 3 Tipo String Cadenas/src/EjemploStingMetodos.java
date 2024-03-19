public class EjemploStingMetodos {

    public static void main(String[] args) {

        String name = "Carlos";
        String trabalenguas = "trabalenguas";

        System.out.println();
        System.out.println("name.length() = " + name.length());
        System.out.println("name.toUpperCase() = " + name.toUpperCase());
        System.out.println("name.toLowerCase() = " + name.toLowerCase());
        System.out.println("name.equals(\"Carlos\") =  " + name.equals("Carlos"));
        System.out.println("name.equals(\"carlos\") =  " + name.equals("carlos"));
        System.out.println("name.equalsIgnoreCase(\"carlos\") =  " + name.equalsIgnoreCase("carlos"));
        System.out.println("name.compareTo(\"Carlos\") = " + name.compareTo("Carlos"));
        System.out.println("name.ChartAt(0) = " + name.charAt(0));
        System.out.println("name.ChartAt(1) = " + name.charAt(1));
        System.out.println("name.ChartAt(name.length()-1) = " + name.charAt(name.length() - 1));
        System.out.println("name.subString(1) = " + name.substring(1));
        System.out.println("name.subString(1,4) = " + name.substring(1, 4));
        System.out.println("name.subString(name.length()-1) = " + name.substring(name.length() - 1));

        System.out.println("trabalenguas = " + trabalenguas);
        System.out.println("trabalenguas.replace('a', '.') = " + trabalenguas.replace('a', '.'));
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a'));
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a'));
        System.out.println("trabalenguas.contains(\"a\") = " + trabalenguas.contains("a"));
        System.out.println("trabalenguas.startsWith(\"lenguas\") = " + trabalenguas.startsWith("lenguas"));
        System.out.println("trabalenguas.endsWith(\"lenguas\") = " + trabalenguas.endsWith("lenguas"));
        System.out.println(" trabalenguas ");
        System.out.println(" trabalenguas ".trim());
        System.out.println();
    }
}
