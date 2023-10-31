package org.techreturners.exercises;

import org.techreturners.data_models.Car;
import org.techreturners.data_models.Person;
import org.techreturners.mockdata.MockData;

import java.io.IOException;
import java.util.List;

public class Exercise002 {

    public static void main(String[] args) throws IOException {
        List<Person> people = MockData.getPeople();
        List<Car> cars = MockData.getCars();

        sortPeopleByAge(people);
        sortByCarMakeAndYear(cars);
        tenMostExpensiveRedCars(cars);

    }

    public static void sortPeopleByAge(List<Person> people) throws IOException {
        // My list of people is unsorted, and I'd like it to be in age order
        // Please return the results from the lowest to the highest age

        // write your solution here

    }

    public static void sortByCarMakeAndYear(List<Car> cars) throws IOException {
        // My list of cars is currently unsorted
        // Please return the results of the list of cars sorted in:
        // Alphabetical order of make
        // Year within each make
        // Print the results of this to the console

        // write your solution here
    }


    public static void tenMostExpensiveRedCars(List<Car> cars) throws IOException {
        // I've grown accustomed to expensive tastes and want to blow some cash on a new car
        // return the top ten most expensive cars from the list
        // Oh, also, they have to be Red!

        // write your solution here

    }
}
