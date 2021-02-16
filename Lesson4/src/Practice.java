public class Practice {
    public static void main(String[] args) {

        primary_loop:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i + j > 5) {
                    System.out.println("ALARM");
                    break primary_loop;
                }
                System.out.println(i + " " + j);
            }
        }

        System.out.println("Done!");
/**
 * 1) метод на получение здоровых людей должен быть в военкомате
 * 2) метод getHealthyPeople у тебя не заполняет список людей а просто выводит person.
 * Посмотри в метод getPeople выше. Там делается people.add(person)
 * 3) чтобы вывести людей нужно пройтись по списку как на 3й фотке на строчках 57-59
 */


        one:
        {
            System.out.println("start of one");
            two:
            {
                System.out.println("start of two");
                three:
                {
                    System.out.println("start of three");

                    System.out.println("end of three");
                }
                System.out.println("end of two");
            }
            System.out.println("end of one");
        }

    }


}
