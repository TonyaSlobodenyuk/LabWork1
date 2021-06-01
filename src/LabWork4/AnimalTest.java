package LabWork4;

import LabWork3.Animals.Animals;
import LabWork3.Place;
import LabWork3.Types;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
    private Place place;

    @BeforeEach
    public void setZoo() {
        place = new Place(10, 2, "Voliere", Arrays.stream(Types.values()).collect(Collectors.toList()));

    } @Test
    public void getAnimalByName() {
        Animals expectedAnimal = new Animals(1, "Leo", 10);
        Animals unExpectedAnimal = new Animals(2, "Leo", 10);

        place.animals.addAll(List.of(expectedAnimal, unExpectedAnimal));

        Animals actualAnimal = getTestAnimalByName("Leo");

        assertEquals(expectedAnimal, actualAnimal);
        assertNotEquals(expectedAnimal, unExpectedAnimal);

    }
    @ParameterizedTest
    @MethodSource("testAnimalProvider")
    public void addNewAnimal(Animals animal) {

        place.animals.add(animal);

        assertTrue(place.animals.contains(animal));
    }

    public static Stream<Animals> testAnimalProvider() {
        return Stream.of(
                new Animals(1, "Leo", 10),
                new Animals(1, "Leo", 10),
                new Animals(1, "Leo", 10),
                new Animals(1, "Leo", 10),
                new Animals(1, "Leo", 10)
        );
    }
    public Animals getTestAnimalByName(String name) {
        var opt = place.animals.stream().filter(place1 -> name.equals(place1.getName())).findFirst();
        if (opt.isPresent()) {
            return opt.get();
        }
        throw new NoSuchElementException();
    }
}