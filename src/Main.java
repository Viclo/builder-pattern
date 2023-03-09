import builders.CarBuilder;
import builders.CarManualBuilder;
import cars.Car;
import cars.Manual;
import director.Director;

public class Main {

  public static void main(String[] args) {

    Director director = new Director();

    CarBuilder carBuilder = new CarBuilder();
    director.constructCityCar(carBuilder);
    Car car = carBuilder.getResult();
    System.out.println("Car built:\n" + car.getCarType());

    CarManualBuilder manualBuilder = new CarManualBuilder();
    director.constructSUV(manualBuilder);
    Manual carManual = manualBuilder.getResult();
    System.out.println("\nCar manual built:\n" + carManual.print());
  }
}