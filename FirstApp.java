public class FirstApp {
    // 1. Создать пустой проект в IntelliJ IDEA и прописать метод main();
    public static void main(String[] args) {

        // 2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
        byte byteVar = 20;
        short shortVar = -700;
        int intVar = 5;
        float floatVar = 974.667f;
        long longVar = 123456789L;
        double doubleVar = 974.667;
        boolean booleanVar = true;
        char val2 = '\u2242';

        // Проверка результатов
        System.out.println(result(5,6,2,9));
        System.out.println(check(7,8));
        System.out.println(check2(8));
        System.out.println(check3(-10));
        helloUser("Артурка");
        year(2020);
    }

    // 3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода;
    public static int result(int a, int b, int c, int d) {
        int i = a * (b + (c / d));
        return i;
    }

    // 4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
    public static boolean check(int a, int b) {
        int s = a + b;
        return (10 <= s) && (s <= 20);
    }

    // 5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.
    public static String check2(int a) {
        if(a >= 0) {
            return "Число положительное";
        } else {
            return "Число отрицательное";
        }
    }

    // 6. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;
    public static boolean check3(int a) {
        if(a < 0)
            return true;
        return false;
    }

    // 7. Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
    public static void helloUser(String a) {
        System.out.println("Привет, " + a);
    }

    // 8. * Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static void year(int a) {
        if(((a % 4 == 0) && (a % 100 != 0)) || (a % 400 == 0)) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год НЕ високосный");
        }
    }

    
}
