package org.techreturners.exercises;

import org.techreturners.data_models.Car;
import org.techreturners.data_models.Person;
import org.techreturners.mockdata.MockData;

import java.io.IOException;
import java.util.List;

public class Exercise001 {

    public static void main(String[] args) throws Exception {
        List<Person> people = MockData.getPeople();
        List<Car> cars = MockData.getCars();

        filterCars(cars);
        findPerson(people);

    }

    public static void filterCars(List<Car> cars) throws Exception {
        // I'm in the market to buy a new car, and I'm looking for something very particular:
        // It has to be made in or before 2001, cost 30000 or less, and be coloured Green.
        // I would like the results printed out to the console

        // write your solution here
    }

    public static void findPerson(List<Person> people) throws IOException {
        // I'm looking for the details of someone in particular and I don't have much to go on
        // All I know is that it's a Male, older than 30, who's initials are A M.
        // Can you find people who match this to help whittle down my search?
        // Output your result to the console

        // write your solution here

    }
}
