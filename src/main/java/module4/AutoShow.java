package module4;

import java.util.ArrayList;

public class AutoShow {

    public ArrayList<Car> avto;

    public AutoShow() {
        this.avto = new ArrayList<Car>();
    }

    public void AddCarForAvtoShow(Car car){
        this.avto.add(car);
    }
    public void SearchByCarBrand(String brand){

        for (int i = 0;i<avto.size(); i++)
        {
            if(brand == avto.get(i).getBrand() )
            {
                avto.get(i).GetInfo();

            }else {
                System.out.println("Нет такой машины");
            }
        }
    }
    public void SearchByYear(short year){
        for (int i = 0;i<avto.size(); i++)
        {
            if(year == avto.get(i).getYear() )
            {
                avto.get(i).GetInfo();

            }else {
                System.out.println("Нет такой машины");
            }
        }
    }
    public void SearchByPassenger(byte passenger){
        for (int i = 0;i<avto.size(); i++)
        {
            if(passenger == avto.get(i).getPassenger() )
            {
                avto.get(i).GetInfo();

            }else {
                System.out.println("Нет такой машины");
            }
        }
    }
    public void SearchByEngineVolume(int engineVolume){
        for (int i = 0;i<avto.size(); i++)
        {
            if(engineVolume == avto.get(i).getEngineVolume() )
            {
                avto.get(i).GetInfo();

            }else {
                System.out.println("Нет такой машины");
            }
        }
    }
    public void SearchByBodyType(String bodyType){
        for (int i = 0;i<avto.size(); i++)
        {
            if(bodyType == avto.get(i).getBodyType() )
            {
                avto.get(i).GetInfo();

            }else {
                System.out.println("Нет такой машины");
            }
        }
    }

}
