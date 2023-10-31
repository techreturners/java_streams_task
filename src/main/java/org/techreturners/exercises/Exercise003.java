package org.techreturners.exercises;

import org.techreturners.data_models.Car;
import org.techreturners.mockdata.MockData;

import java.io.IOException;
import java.util.List;

public class Exercise003 {

    public static void main(String[] args) throws IOException {
        List<Car> cars = MockData.getCars();

        listAllCarMakes(cars);
        groupByColour(cars);
        getOneMakeAndModel(cars);

    }

    public static void listAllCarMakes(List<Car> cars) throws IOException {
        // I would like a list of all the cars makes available to me
        // Print this to the console

        // write your solution here

    }

    public static void groupByColour(List<Car> cars) throws IOException {
        // I would like information for some cars returned in a specific way.
        // I'm looking for cars that are less than 20000 and made in 1995
        // Group the results together by their colour and print to the console

        // write your solution here

    }

    public static void getOneMakeAndModel(List<Car> cars) throws IOException {
        // I would like a list of just the make and model of one car from each make returned
        // from the input list of Cars
        // You man need to consider a custom Predicate in your solution
        // Print this list to the console

        // write your solution here
    }
}

