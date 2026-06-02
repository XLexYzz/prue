package paqueteMasterMind;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Consola {
		/*Proporciona métodos estáticos para leer diferentes tipos de datos primitivos desde la consola. 
Cada método lee una línea de texto introducida por el usuario, la convierte al tipo de dato correspondiente
(byte, short, int, long, float) y luego devuelve ese valor. Estos métodos son útiles en aplicaciones 
de consola donde se necesita obtener entrada del usuario.

(Dentro de un párrafo HTML) Es importante manejar la excepción IOException que puede lanzarse si ocurre un error de entrada/salida  durante la lectura de la consola.

(Dentro de un párrafo HTML) Los métodos de esta clase son:
(Inicio de una lista desordenada HTML)
(Dentro de un elemento de lista HTML) leeByte() - para leer un valor de tipo byte.
   (Dentro de un elemento de lista HTML) leeShort() - para leer un valor de tipo short.
   (Dentro de un elemento de lista HTML) leeInt() - para leer un valor de tipo int.
   (Dentro de un elemento de lista HTML) leeLong() - para leer un valor de tipo long.
   (Dentro de un elemento de lista HTML) leeFloat() - para leer un valor de tipo float.
(Fin de una lista desordenada HTML)*/
        
        public static byte leeByte() throws IOException{
                
                BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
                byte x=Byte.valueOf(in.readLine());  
                return x;

        }

        public static short leeShort() throws IOException{
                
                BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
                short x=Short.valueOf(in.readLine());  
                return x;

        }
        
        public static int leeInt() throws IOException{
                
                BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
                int x=Integer.valueOf(in.readLine());  
                return x;

        }
        
        public static long leeLong() throws IOException{
                
                BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
                long x=Long.valueOf(in.readLine());  
                return x;

        }
        

        public static float leeFloat() throws IOException{
                
                BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
                float x=Float.valueOf(in.readLine());  
                return x;

        }

        public static double leeDouble() throws IOException{
                
                BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
                double x=Double.valueOf(in.readLine());  
                return x;

        }
        
        public static char leeChar() throws IOException{
                
                
                java.io.BufferedInputStream b = new BufferedInputStream(System.in);
                 return (char) (b.read());
        }

        public static String leeString() throws IOException{
                
                BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
                String str=in.readLine();
                return str;

        }
        
        
}
