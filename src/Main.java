import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main (String[]ars) {

        List<Person> People = Arrays.asList(new Person("Marcos Bertolotti", 40951430, 21)
        ,new Person("Marco Briatore", 39431249, 23)
        ,new Person("Giani Ravanni", 45258964, 12)
        ,new Person("Nicolas Bercovsky", 37893932, 25)
        ,new Person("Nicolas Medina", 375487212, 20)
        ,new Person("German Gianotti", 10000000, 22));

        System.out.println(String.format("Mayores 21: \n %s ",
        People.stream().filter(Person->Person.getAge()>21)
                       .collect(Collectors.toList())));

        System.out.println(String.format("Menores 18: %s \n",
        People.stream().filter(Person->Person.getAge()<18)
                       .collect(Collectors.toList())));

        System.out.println(String.format("Mayores 21 y Dni mayor a 20000000: %s \n",
        People.stream().filter(Person->Person.getAge()>21)
                       .filter(Person->Person.getDni()>20000000)
                       .collect(Collectors.toList())));
    }
}
