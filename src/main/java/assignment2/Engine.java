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
 * The type Engine.
 */
public class Engine {

  private double capacity;
  private double powerOutput;
  private String make;
  private String model;

  /**
   * Instantiates a new Engine.
   *
   * @param capacity    the capacity
   * @param powerOutput the power output
   * @param make        the make
   * @param model       the model
   */
  public Engine(double capacity, double powerOutput, String make, String model) {
    this.capacity = capacity;
    this.powerOutput = powerOutput;
    this.make = make;
    this.model = model;
  }

  /**
   * Getters and Setters
   *
   * @return the capacity
   */
  public double getCapacity() {
    return capacity;
  }

  /**
   * Sets capacity.
   *
   * @param capacity the capacity
   */
  public void setCapacity(double capacity) {
    this.capacity = capacity;
  }

  /**
   * Gets power output.
   *
   * @return the power output
   */
  public double getPowerOutput() {
    return powerOutput;
  }

  /**
   * Sets power output.
   *
   * @param powerOutput the power output
   */
  public void setPowerOutput(double powerOutput) {
    this.powerOutput = powerOutput;
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
   * Override Methods
   **/

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Engine)) return false;
    Engine engine = (Engine) o;
    return Double.compare(engine.getCapacity(), getCapacity()) == 0
            && Double.compare(engine.getPowerOutput(), getPowerOutput()) == 0
            && getMake().equals(engine.getMake())
            && getModel().equals(engine.getModel());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getCapacity(), getPowerOutput(), getMake(), getModel());
  }

  @Override
  public String toString() {
    return "assignment2.Engine{"
            + "capacity="
            + capacity
            + ", powerOutput="
            + powerOutput
            + ", make='"
            + make
            + '\''
            + ", model='"
            + model
            + '\''
            + '}';
  }
}
