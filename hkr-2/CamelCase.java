public class CamelCase {

    public static void main(String[] args) {
        String frase="saveChangesInTheEditor";
        int suma=1;
        for(int x=1;x<frase.length();++x)
            if(Character.isLowerCase(frase.charAt(x-1))&&Character.isUpperCase(frase.charAt(x)))
                suma=suma+1;
            System.out.print(suma);

    }
}
