package LabWork4;

import LabWork3.Place;
import LabWork3.Types;
import LabWork3.Zoo;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class ZooTest {
    private Zoo testZoo;
    @Before
    public void initialize() {
        testZoo = new Zoo();
    }
    @BeforeEach
    public void setZoo() {
        testZoo = new Zoo();
    }

    @ParameterizedTest
    @MethodSource("testPlaceProvider")
    public void addNewPlace(Place place) {
        testZoo.addPlace(place);

        assertTrue(testZoo.getPlaces().contains(place));
    }

    public static Stream<Place> testPlaceProvider() {
        return Stream.of(
                new Place(5, 1, "Aquarium", List.of(Types.values())),
                new Place(5, 2, "Voliere", List.of(Types.values()))
        );
    }



    @Test
    public void getPlaceByName() {
        Place expectedPlace = new Place(5, 1, "Aquarium", List.of(Types.values()));
        Place unExpectedPlace = new Place(5, 2, "Voliere", List.of(Types.values()));

        testZoo.getPlaces().addAll(List.of(expectedPlace, unExpectedPlace));

        Place actualPlace = getTestPlaceByName("Aquarium");

        assertEquals(expectedPlace, actualPlace);
        assertNotEquals(expectedPlace, unExpectedPlace);

    }

    public Place getTestPlaceByName(String name) {
        var opt = testZoo.getPlaces().stream().filter(place1 -> name.equals(place1.name)).findFirst();
        if (opt.isPresent()) {
            return opt.get();
        }
        throw new NoSuchElementException();
    }

}