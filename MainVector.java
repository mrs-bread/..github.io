public class MainVector {
    public static void main(String[] args) {
        // Создаем вектор размерности 5
        Vector vector1 = new Vector(5);

        // Заполняем вектор значениями
        vector1.set(0, 1);
        vector1.set(1, 2);
        vector1.set(2, 3);
        vector1.set(3, 4);
        vector1.set(4, 5);

        // Выводим вектор на экран
        System.out.println("Вектор 1:");
        vector1.print();

        // Создаем второй вектор размерности 5
        Vector vector2 = new Vector(5);
        vector2.set(0, 6);
        vector2.set(1, 7);
        vector2.set(2, 8);
        vector2.set(3, 9);
        vector2.set(4, 10);

        System.out.println("Вектор 2:");
        vector2.print();

        // Складываем векторы
        vector1.add(vector2);
        System.out.println("Сумма векторов:");
        vector1.print();

        // Вычитаем векторы
        vector1.subtract(vector2);
        System.out.println("Разность векторов:");
        vector1.print();

        // Умножаем вектор на скаляр
        vector1.multiply(2);
        System.out.println("Вектор, умноженный на 2:");
        vector1.print();

        // Делим вектор на скаляр
        vector1.divide(2);
        System.out.println("Вектор, деленный на 2:");
        vector1.print();
    }
}
