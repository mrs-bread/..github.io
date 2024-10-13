class Vector {
    private int[] data;

    Vector(int size) {
        data = new int[size];
    }

    Vector(int[] data) {
        this.data = data;
    }

    int get(int index) {
        if (index < 0 || index >= data.length) {
            System.out.println("Индекс вне границ массива.");
        }
        return data[index];
    }

    void set(int index, int value) {
        if (index < 0 || index >= data.length) {
            System.out.println("Индекс вне границ массива.");
        }
        data[index] = value;
    }

    void add(Vector other) {
        if (data.length != other.data.length) {
            System.out.println("Размеры векторов должны быть одинаковыми.");
        }
        for (int i = 0; i < data.length; i++) {
            data[i] += other.data[i];
        }
    }

    void subtract(Vector other) {
        if (data.length != other.data.length) {
            System.out.println("Размеры векторов должны быть одинаковыми.");
        }
        for (int i = 0; i < data.length; i++) {
            data[i] -= other.data[i];
        }
    }

    void multiply(int scalar) {
        for (int i = 0; i < data.length; i++) {
            data[i] *= scalar;
        }
    }

    void divide(int scalar) {
        if (scalar == 0) {
            System.out.println("Деление на ноль.");
        }
        for (int i = 0; i < data.length; i++) {
            data[i] /= scalar;
        }
    }

    void print() {
        int i=0;
        System.out.print("[");
        for(i=0;i< data.length-1;i++)
            System.out.print(data[i]+", ");
        System.out.print(data[i]+"]"+"\n");
    }
}
