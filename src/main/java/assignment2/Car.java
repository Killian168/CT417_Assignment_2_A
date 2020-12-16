/*
  Copyright 2020 Killian O'Dalaigh
  <p>
  Licensed under the Apache License, Version 2.0 (the "License");
  you may not use this file except in compliance with the License.
  You may obtain a copy of the License at
  <p>
  http://www.apache.org/licenses/LICENSE-2.0
  <p>
  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS,
  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
  See the License for the specific language governing permissions and
  limitations under the License.
 */

package assignment2;

import java.util.Objects;

public class Car {

  private double accelerationCoefficient;
  private double brakingCoefficient;
  private double currentSpeed;
  private double topSpeed;
  private String make;
  private String model;
  private int numberOfDoors;
  private int numberOfSeats;
  private Engine engine;

  public Car(
          double accelerationCoefficient,
          double currentSpeed,
          double brakingCoefficient,
          double topSpeed,
          String make,
          String model,
          int numberOfDoors,
          int numberOfSeats,
          Engine engine) {
    this.accelerationCoefficient = accelerationCoefficient;
    this.currentSpeed = currentSpeed;
    this.brakingCoefficient = brakingCoefficient;
    this.topSpeed = topSpeed;
    this.make = make;
    this.model = model;
    this.numberOfDoors = numberOfDoors;
    this.numberOfSeats = numberOfSeats;
    this.engine = engine;
  }

  /**
   * Public Methods
   **/

  public void accelerate() {
    this.currentSpeed += this.accelerationCoefficient;
    if (this.currentSpeed > this.topSpeed) {
      this.currentSpeed = this.topSpeed;
    }
  }

  public void brake() {
    this.currentSpeed -= this.brakingCoefficient;
    if (this.currentSpeed < 0) {
      this.currentSpeed = 0;
    }
  }

  /**
   * Getters and Setters
   **/

  public double getAccelerationCoefficient() {
    return accelerationCoefficient;
  }

  public void setAccelerationCoefficient(double accelerationCoefficient) {
    this.accelerationCoefficient = accelerationCoefficient;
  }

  public double getCurrentSpeed() {
    return currentSpeed;
  }

  public void setCurrentSpeed(double currentSpeed) {
    this.currentSpeed = currentSpeed;
  }

  public double getBrakingCoefficient() {
    return brakingCoefficient;
  }

  public void setBrakingCoefficient(double brakingCoefficient) {
    this.brakingCoefficient = brakingCoefficient;
  }

  public double getTopSpeed() {
    return topSpeed;
  }

  public void setTopSpeed(double topSpeed) {
    this.topSpeed = topSpeed;
  }

  public String getMake() {
    return make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public int getNumberOfDoors() {
    return numberOfDoors;
  }

  public void setNumberOfDoors(int numberOfDoors) {
    this.numberOfDoors = numberOfDoors;
  }

  public int getNumberOfSeats() {
    return numberOfSeats;
  }

  public void setNumberOfSeats(int numberOfSeats) {
    this.numberOfSeats = numberOfSeats;
  }

  public Engine getEngine() {
    return engine;
  }

  public void setEngine(Engine engine) {
    this.engine = engine;
  }

  /**
   * Override Methods
   **/

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Car)) return false;
    Car car = (Car) o;
    return Double.compare(car.getAccelerationCoefficient(), getAccelerationCoefficient()) == 0
            && Double.compare(car.getCurrentSpeed(), getCurrentSpeed()) == 0
            && Double.compare(car.getBrakingCoefficient(), getBrakingCoefficient()) == 0
            && Double.compare(car.getTopSpeed(), getTopSpeed()) == 0
            && getNumberOfDoors() == car.getNumberOfDoors()
            && getNumberOfSeats() == car.getNumberOfSeats()
            && getMake().equals(car.getMake())
            && getModel().equals(car.getModel())
            && getEngine().equals(car.getEngine());
  }

  @Override
  public int hashCode() {
    return Objects.hash(
            getAccelerationCoefficient(),
            getCurrentSpeed(),
            getBrakingCoefficient(),
            getTopSpeed(),
            getMake(),
            getModel(),
            getNumberOfDoors(),
            getNumberOfSeats(),
            getEngine());
  }

  @Override
  public String toString() {
    return "assignment2.Car{"
            + "accelerationCoefficient="
            + accelerationCoefficient
            + ", currentSpeed="
            + currentSpeed
            + ", brakingCoefficient="
            + brakingCoefficient
            + ", topSpeed="
            + topSpeed
            + ", make='"
            + make
            + '\''
            + ", model='"
            + model
            + '\''
            + ", numberOfDoors="
            + numberOfDoors
            + ", numberOfSeats="
            + numberOfSeats
            + ", engine="
            + engine
            + '}';
  }
}
