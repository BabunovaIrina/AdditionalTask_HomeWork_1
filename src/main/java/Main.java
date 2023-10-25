public class Main {
    public static void main(String[] args) {
        System.out.println("Площадь квадрата = " + areaSquare(3));
        System.out.println("Площадь круга = " + areaCircle(2));
        System.out.println("Площадь треугольника = " + areaTriangle(5, 3, 4));
    }

    public static double areaSquare(double width) {
        if (width <= 0) {
            throw new IllegalArgumentException("Длина стороны квадрата должна быть больше нуля. Площать квадрата посчитать невозможно!");
        }
        return width * width; // S=a*a
    }

    public static double areaCircle(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Длина радиуса должна быть больше нуля. Площать круга посчитать невозможно!");
        }
        return 3.14 * radius * radius; // S=3.14*r*r
    }

    public static double areaTriangle(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0 || (a + b <= c) || (a + c <= b) || (b + c <= a)) {
            throw new IllegalArgumentException("Длины сторон треугольника не могут быть меньше нуля. Сумма длин любых двух сторон должна быть больше третьей стороны. Площать треугольника посчитать невозможно!");
        } else {
            double p = (a + b + c) / 2; // полупериметр
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
    }

    // Второй вариант реализован с try catch, чтобы выполнение программы не прерывалось из-за ошибки. И след метод отрабатывал
/**
    try {
        System.out.println("Площадь квадрата = " + areaSquare(0));
    } catch (IllegalArgumentException e) {
        System.out.println("Длина стороны квадрата должна быть больше нуля. Площать квадрата посчитать невозможно!");
    }
    try {
        System.out.println("Площадь круга = " + areaCircle(3));
    } catch (IllegalArgumentException e) {
        System.out.println("Длина радиуса должна быть больше нуля. Площать круга посчитать невозможно!");
    }
    try {
        System.out.println("Площадь треугольника = " + areaTriangle(2, 3, 4));
    } catch (IllegalArgumentException e) {
        System.out.println("Длины сторон треугольника не могут быть меньше нуля. Сумма длин любых двух сторон должна быть больше третьей стороны. Площать треугольника посчитать невозможно!");
    }
}

    public static double areaSquare(double width) {
        if (width <= 0) {
            throw new IllegalArgumentException();
        }
        return width * width; // S=a*a
    }
    public static double areaCircle(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException();
        }
        return 3.14 * radius * radius; // S=3.14*r*r
    }
    public static double areaTriangle(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0 || (a + b <= c) || (a + c <= b) || (b + c <= a)) {
            throw new IllegalArgumentException();
        } else {
            double p = (a + b + c) / 2; // полупериметр
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
    }
*/
/**     // Третий вариант, если не нужны проверки длин сторон
    public static double areaSquare(double width) {
        return width * width; // S=a*a
    }

    public static double areaCircle(double radius) {
        return 3.14 * radius * radius; // S=3.14*r*r
    }

    public static double areaTriangle(double a, double b, double c) {
        double p = (a + b + c) / 2; // полупериметр
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
*/
}
