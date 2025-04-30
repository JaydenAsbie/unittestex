package tests;

import org.junit.jupiter.api.*;
import animals.AnimalType;
import animals.petstore.pet.attributes.Breed;
import animals.petstore.pet.attributes.Gender;
import animals.petstore.pet.attributes.Skin;
import animals.petstore.pet.types.Dog;
import animals.petstore.pet.types.Snake;

import static org.junit.jupiter.api.Assertions.assertEquals;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SnakeTests {

    private static Snake actualSnake;
    @BeforeAll
    public static void createAnimals()
    {
        actualSnake = new Snake(AnimalType.DOMESTIC, Skin.SCALES, Gender.UNKNOWN, Breed.UNKNOWN);
    }


    @Test
    @Order(1)
    @DisplayName("Animal Test Type Tests Domestic")
    public void animalTypeTests()
    {
        assertEquals(AnimalType.DOMESTIC, actualSnake.getAnimalType(), "Animal Type Expected[" + AnimalType.DOMESTIC
                + "] Actual[" + actualSnake.getAnimalType() + "]");
    }

    @Test
    @Order(1)
    @DisplayName("Snake Speak pss Tests")
    public void dogGoesWoffTest()
    {
        assertEquals("The snake goes pss! pss!", actualSnake.speak(), "I was expecting pss! pss!");
    }

    @Test
    @Order(1)
    @DisplayName("Snake scale is it Hyperallergetic")
    public void dogHyperAllergeticTests()
    {
        assertEquals("The snake is hyperallergetic!", actualSnake.snakeHypoallergenic(),
                "The snake is hyperallergetic!");
    }

    @Test
    @Order(1)
    @DisplayName("Snake has legs Test")
    public void legTests()
    {
        Assertions.assertNotNull(actualSnake.getNumberOfLegs());
    }

    @Test
    @Order(2)
    @DisplayName("Snake Gender Test Male")
    public void genderTestMale()
    {
        actualSnake = new Snake(AnimalType.WILD, Skin.UNKNOWN,Gender.MALE, Breed.UNKNOWN);
        assertEquals(Gender.MALE, actualSnake.getGender(), "Expecting Male Gender!");
    }

    @Test
    @Order(2)
    @DisplayName("Snake Breed Test Burmese Python")
    public void genderDogBreed() {
        actualSnake = new Snake(AnimalType.WILD, Skin.UNKNOWN,Gender.FEMALE, Breed.BURMESE_PYTHON);
        assertEquals(Breed.BURMESE_PYTHON, actualSnake.getBreed(), "Expecting Breed Burmese Python!");
    }

    @Test
    @Order(2)
    @DisplayName("Snake Speak hiss Tests")
    public void dogGoesGrrTest()
    {
        actualSnake = new Snake(AnimalType.WILD, Skin.UNKNOWN,Gender.UNKNOWN, Breed.UNKNOWN);
        assertEquals("The snake goes hiss! hiss!", actualSnake.speak(), "I was expecting hiss");
    }

    @Test
    @Order(2)
    @DisplayName("Snake Speak hiss Tests 1")
    public void dogGoesBarkTest()
    {
        actualSnake = new Snake(AnimalType.UNKNOWN, Skin.UNKNOWN,Gender.UNKNOWN, Breed.UNKNOWN);
        assertEquals("The snake goes Psss! Psss!", actualSnake.speak(), "I was expecting hiss");
    }
}
