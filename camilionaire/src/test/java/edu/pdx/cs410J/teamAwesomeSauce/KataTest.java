package edu.pdx.cs410J.teamAwesomeSauce;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.jupiter.api.Assertions.*;
public class KataTest
{

  @Test
  void ifNumberIsOneWrite1() {
    Kata aKata = new Kata();
//    System.out.println(aKata.compute("1"));
//    assertEquals(aKata.compute("1"), "1");
    assertThat(aKata.compute("1"),   containsString("1"));
  }

  @Test
  void ifNumberIsDivThreeWriteFoo() {
    Kata aKata = new Kata();

    assertThat(aKata.compute("3"), containsString("Foo"));
  }

  @Test
  void ifNumberIsDivFiveAddBar() {
    Kata aKata = new Kata();
    assertTrue(aKata.compute("5").equals("Bar"));
  }

}
