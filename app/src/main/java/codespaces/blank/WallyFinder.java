package codespaces.blank;

public class WallyFinder {
  public static int whereIsWally(String str) {
      // Convertimos la cadena en un array de caracteres
      char[] chars = str.toCharArray();

      // Buscamos la primera aparición de "Wally" en el array, ojo que Wally tiene una longitud de 4
      for (int i = 0; i < chars.length - 5; i++) {
          if (chars[i] == 'W' && chars[i + 1] == 'a' && chars[i + 2] == 'l' && chars[i + 3] == 'l' && chars[i + 4] == 'y') {
              return i;
          }
      }

      // Si no se encuentra "Wally", devolvemos -1
      return -1;
  }
}