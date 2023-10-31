package org.techreturners.exercises;

import org.techreturners.data_models.Car;
import org.techreturners.data_models.Person;
import org.techreturners.mockdata.MockData;

import java.io.IOException;
import java.util.List;

public class Exercise004 {

    public static void main(String[] args) throws IOException {
        List<Car> cars = MockData.getCars();
        List<Person> people = MockData.getPeople();

        findAverageCarPrice(cars);
        dataFilteringAndTransformation(people);

    }

    public static void findAverageCarPrice(List<Car> cars) throws IOException {
        // Using streams() API find the average car price (to the nearest whole number) from the list of cars
        // Output the resulting double value to the console

        // write your solution here

    }

    public static void dataFilteringAndTransformation(List<Person> people) throws IOException {
        // I would like to do some object transformation and see a list of PersonDTO objects
        // for all people over the age of 65
        // The PersonDTO can be found in /data_models
        // Print the result to the console

        // write your solution here
    }


}
