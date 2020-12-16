/**
 * Copyright 2020 Killian O'Dalaigh
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
public class Main {

  public Main() {
    double capacity = 1.0;
    double powerOutput = 100;
    String engineMake = "Renault";
    String engineModel = "D7D";
    Engine myEngine = new Engine(capacity, powerOutput, engineMake, engineModel);

    double accelerationCoefficient = 0.5;
    double currentSpeed = 0;
    double brakingCoefficient = 0.8;
    String make = "Renault";
    String model = "Clio";
    int numberOfDoors = 3;
    int numberOfSeats = 5;
    double topSpeed = 100;
    Car myCar =
            new Car(
                    accelerationCoefficient,
                    currentSpeed,
                    brakingCoefficient,
                    topSpeed,
                    make,
                    model,
                    numberOfDoors,
                    numberOfSeats,
                    myEngine);

    for (int i = 0; i < 10; i++) {
      myCar.accelerate();
    }
    System.out.println("Current Speed = " + myCar.getCurrentSpeed());

    for (int i = 0; i < 10; i++) {
      myCar.brake();
    }
    System.out.println("Current Speed = " + myCar.getCurrentSpeed());
    System.out.println(myCar);
  }

  public static void main(String[] args) {
    Main m = new Main();
  }
}
