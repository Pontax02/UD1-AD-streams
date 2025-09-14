
import models.Continent;
import models.Country;

import static models.Countries.WORLD_COUNTRIES;

public class Main {
    public static void main(String[] args) {

        /* La clase Countries contiene un campo estático WORLD_COUNTRIES constante que nos proporciona una lista de países.
         Usaremos esta lista como fuente para generar un Stream y realizar las consultas.Escribe un
         método que mediante streams obtenga a partir de la lista WORLD_COUNTRIES los siguientes datos: */


        /* 1. Una lista de todos los países que estén en Europa. */

        WORLD_COUNTRIES.stream().
                filter(country -> country.getContinent().equals(Continent.EUROPE)).
                forEach(System.out::println);

        /* 2. La lista de países europeos ordenada según el orden natural. */
        WORLD_COUNTRIES.stream().
                filter(country -> country.getContinent().equals(Continent.EUROPE)).
                sorted().
                forEach(System.out::println);

        /* 3. Lista de países de América ordenados por el nombre del país. */

        WORLD_COUNTRIES.stream().
                filter(c -> c.getContinent().equals(Continent.AMERICAS)).
                sorted().
                toList().
                forEach(System.out::println);
        /* 4. Lista de países de Europa ordenados de mayor a menor superficie. */
/*
        WORLD_COUNTRIES.stream()
                .filter(c -> c.getContinent().equals(Continent.EUROPE)).
                 map(Country::getSurface).
                sorted().
                toList().
                forEach(System.out::println);*/

        /* 5. Lista de nombres de todos los países ordenada alfabéticamente. */
        WORLD_COUNTRIES.stream().
                map(Country::getName).
                sorted().
                toList().
                forEach(System.out::println);
        /* 6. Mapa de nombres países (lista) clasificados por continente. */


        /* 7. Lista de países cuya superficie es conocida. */
        /* 8. Lista de países cuya superficie no es conocida. */
        /* 9. Lista de países que no están en Europa. */
        /* 10. Lista de países ordenados de manera natural. */
        /* 11. El país más poblado del mundo. */
        /* 12. El país menos poblado del mundo. */
        /* 13. El país que más y el país que menos habitantes tiene del mundo. */
        /* 14. Los países con mas y con menos población de cada continente. */
        /* 15. La población mundial como suma de la población de todos los países. */
        /* 16. La población total de Europa. */
        /* 17. La población de cada continente. */
        /* 18. La población de cada continente ordenada de mayor a menor. */
        /* 19. El porcentaje de población que vive en cada continente ordenado de mayor a menor. */
        /* 20. Los cinco países con mayor población. */
        /* 21. La suma de la población de los tres países más poblados del mundo. */
        /* 22. El porcentaje de población que suponen los tres países mas poblados del mundo respecto del total de la población mundial. */
        /* 23. El porcentaje de la población del país más poblado de cada continente respecto de la población total de cada continente. */
        /* 24. El porcentaje de la población que suponen los dos países más poblados de cada continente respecto de la población total de cada continente. */
        /* 25. El porcentaje que supone el total de la población europea respecto del total mundial. */
        /* 26. Lista de todos los países con mayor población que España. */
        /* 27. Lista de los cinco países más grandes del mundo (por superficie). */
        /* 28. Los cinco países con mayor densidad de población. */
        /* 29. Nombres de los países de Asia. */
        /* 30. Ciudades capitales de los países de África. */
        /* 31. Nombres de las capitales de los países de Europa. */
        /* 32. Lista de todos los continentes. */
        /* 33. Continentes cuyo nombre empieza por la letra A. */
        /* 34. Lista de las regiones de Europa. */
        /* 35. Regiones clasificadas por continente. */
        /* 36. Un mapa de los países de Europa usando como clave la ISO3. */
        /* 37. Mapa de los países de Europa usando la clave ISO3 y ordenado por habitantes de su capital de manera descendente. */
        /* 38. Capitales europeas clasificadas por región. */
        /* 39. País más grande de cada continente. */
        /* 40. País más poblado de cada continente. */
        /* 41. País más poblado de cada región ordenado por continente. */
        /* 42. Los tres países más grandes de cada continente. */
        /* 43. Los tres países más grandes de cada región. */
        /* 44. Las cinco capitales con mayor población del mundo. */
        /* 45. Cuantos países hay en cada continente ordenados por cantidad. */
    }
}
