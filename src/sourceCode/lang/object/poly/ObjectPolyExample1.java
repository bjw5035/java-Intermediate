package src.sourceCode.lang.object.poly;

public class ObjectPolyExample1 {

    public static void main(String[] args) {

        Dog dog = new Dog();
        Car car = new Car();

        action(dog);
        action(car);
    }

    private static void action(Object obj) {
        // obj.sound(); // ������ ����, Object�� sound()�� ����

        // ��ü�� �´� �ٿ�ĳ���� �ʿ�
        if (obj instanceof Dog dog) {
            dog.sound();
        } else if (obj instanceof Car car) {
            car.sound();
        }
    }

}
