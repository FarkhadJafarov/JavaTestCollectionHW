package module4;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", "F11","e46" , (short) 2018,(byte) 2, 4,(short) 6,(byte) 4,12);
        Car car2 = new Car("Mercedes", "benz","w126" , (short) 2015,(byte) 2, 5,(short) 6,(byte) 4,12);
        Car car3 = new Car("BMW", "F11","e39" , (short) 1996,(byte) 2, 6,(short) 7,(byte) 4,12);
        AutoShow autom = new AutoShow();
        autom.AddCarForAvtoShow(car1);
        autom.SearchByCarBrand("BMW");
        autom.SearchByBodyType("e39");
        autom.SearchByEngineVolume(4);
        autom.SearchByPassenger((byte)4);
        autom.SearchByYear((short)1968);
    }
}
