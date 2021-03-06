package com.travelocity.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Resultados {

    private Resultados() {
    }

    public static final Target LISTA_HOTELES = Target.the("Resultados de busqueda Hoteles")
            .locatedBy("//ol//li[@data-stid='property-listing']");

    public static final Target LISTA_PRECIOS = Target.the("Precio")
            .locatedBy("//*[@data-stid='property-listing']");

    public static final Target PRECIO = Target.the("Precio {0}")
            .locatedBy("(//ol//li[@data-stid='property-listing']//span[@data-stid='price-lockup-text'])[{0}]");

    public static final Target HOTEL_BARATO = Target.the("Hotel mas barato {0}")
            .locatedBy("(//*[@data-stid='open-hotel-information'])[{0}]");

    public static final Target NOMBRE_HOTEL = Target.the("Nombre hotel {0}")
            .locatedBy("(//*[@data-stid='property-listing']//h3)[{0}]");

    public static final Target ORDENAR_HOTEL = Target.the("Ordenar por")
            .located(By.id("sort"));

    public static final Target BTN_MOSTAR_MAS = Target.the("Boton mostrar mas")
            .locatedBy("//*[@data-stid='show-more-results']");

    public static final Target LISTA_VUELOS = Target.the("Resultados de busqueda Vuelos")
            .locatedBy("//*[@data-test-id='select-link']");

    public static final Target SELECCIONA_VUELO = Target.the("Selecciona el vuelo {0}")
            .locatedBy("(//*[@data-test-id='select-link'])[{0}]");

    public static final Target CONFIRMA_VUELO = Target.the("Confirma vuelo")
            .locatedBy("//*[@data-test-id='select-button']");


}
