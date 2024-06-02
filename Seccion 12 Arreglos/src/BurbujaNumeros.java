public class BurbujaNumeros {
    public static void main(String[] args) {

        Integer[] numero = { 10, 7, 35, -11 };
        Ordenar(numero);

        int i = 1;
        for (Integer num : numero) {
            System.out.println("valor "+i+": "+num);
        i++;
        }
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static void Ordenar(Object[] array) {
        int count = array.length;
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - 1 - i; j++) {
                if (((Comparable) array[j + 1]).compareTo(array[j]) > 0) {
                    Object aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
            }
        }
      
    }

}
