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

/**
 * The type Car.
 */
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


  /**
   * Instantiates a new Car.
   *
   * @param accelerationCoefficient the acceleration coefficient
   * @param currentSpeed            the current speed
   * @param brakingCoefficient      the braking coefficient
   * @param topSpeed                the top speed
   * @param make                    the make
   * @param model                   the model
   * @param numberOfDoors           the number of doors
   * @param numberOfSeats           the number of seats
   * @param engine                  the engine
   */
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
    this.brakingCoefficient = brakingCoefficient;
    this.currentSpeed = currentSpeed;
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

  /**
   * Accelerate the Car
   */
  public void accelerate() {
    this.currentSpeed += this.accelerationCoefficient;
    if (this.currentSpeed > this.topSpeed) {
      this.currentSpeed = this.topSpeed;
    }
  }

  /**
   * Brake the Car.
   */
  public void brake() {
    this.currentSpeed -= this.brakingCoefficient;
    if (this.currentSpeed < 0) {
      this.currentSpeed = 0;
    }
  }

  /**
   * Getters and Setters
   */

  /**
   * Gets the acceleration coefficient.
   *
   * @return the acceleration coefficient
   */
  public double getAccelerationCoefficient() {
    return accelerationCoefficient;
  }

  /**
   * Sets acceleration coefficient.
   *
   * @param accelerationCoefficient the acceleration coefficient
   */
  public void setAccelerationCoefficient(double accelerationCoefficient) {
    this.accelerationCoefficient = accelerationCoefficient;
  }

  /**
   * Gets current speed.
   *
   * @return the current speed
   */
  public double getCurrentSpeed() {
    return currentSpeed;
  }

  /**
   * Sets current speed.
   *
   * @param currentSpeed the current speed
   */
  public void setCurrentSpeed(double currentSpeed) {
    this.currentSpeed = currentSpeed;
  }

  /**
   * Gets braking coefficient.
   *
   * @return the braking coefficient
   */
  public double getBrakingCoefficient() {
    return brakingCoefficient;
  }

  /**
   * Sets braking coefficient.
   *
   * @param brakingCoefficient the braking coefficient
   */
  public void setBrakingCoefficient(double brakingCoefficient) {
    this.brakingCoefficient = brakingCoefficient;
  }

  /**
   * Gets top speed.
   *
   * @return the top speed
   */
  public double getTopSpeed() {
    return topSpeed;
  }

  /**
   * Sets top speed.
   *
   * @param topSpeed the top speed
   */
  public void setTopSpeed(double topSpeed) {
    this.topSpeed = topSpeed;
  }

  /**
   * Gets make.
   *
   * @return the make
   */
  public String getMake() {
    return make;
  }

  /**
   * Sets make.
   *
   * @param make the make
   */
  public void setMake(String make) {
    this.make = make;
  }

  /**
   * Gets model.
   *
   * @return the model
   */
  public String getModel() {
    return model;
  }

  /**
   * Sets model.
   *
   * @param model the model
   */
  public void setModel(String model) {
    this.model = model;
  }

  /**
   * Gets number of doors.
   *
   * @return the number of doors
   */
  public int getNumberOfDoors() {
    return numberOfDoors;
  }

  /**
   * Sets number of doors.
   *
   * @param numberOfDoors the number of doors
   */
  public void setNumberOfDoors(int numberOfDoors) {
    this.numberOfDoors = numberOfDoors;
  }

  /**
   * Gets number of seats.
   *
   * @return the number of seats
   */
  public int getNumberOfSeats() {
    return numberOfSeats;
  }

  /**
   * Sets number of seats.
   *
   * @param numberOfSeats the number of seats
   */
  public void setNumberOfSeats(int numberOfSeats) {
    this.numberOfSeats = numberOfSeats;
  }

  /**
   * Gets engine.
   *
   * @return the engine
   */
  public Engine getEngine() {
    return engine;
  }

  /**
   * Sets engine.
   *
   * @param engine the engine
   */
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
