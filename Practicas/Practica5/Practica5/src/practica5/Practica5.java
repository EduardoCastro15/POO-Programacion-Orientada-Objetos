package practica5;

public class Practica5 {
        public static void main(String[] args) {
                Object[] objects = {new Tigre(), 
                                    new Pollo(), 
                                    new Manzana(),
                                    new Naranja()};
                for (int i = 0; i < objects.length; i++)
                    System.out.println(((Comer)objects[i]).howToEat());
        }
 }
