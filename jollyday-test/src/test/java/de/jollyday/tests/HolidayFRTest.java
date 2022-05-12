package de.focus_shift.tests;

import de.focus_shift.HolidayCalendar;
import de.focus_shift.tests.base.AbstractCountryTestBase;
import org.junit.jupiter.api.Test;

import java.util.Locale;

public class HolidayFRTest extends AbstractCountryTestBase {

  private static final String ISO_CODE = "fr";
  private static final int YEAR = 2010;

  @Test
  public void testManagerFRStructure() throws Exception {
    validateCalendarData(ISO_CODE, YEAR);
  }

  @Test
  public void testManagerSameInstanceFR() {
    validateManagerSameInstance(Locale.FRANCE, HolidayCalendar.FRANCE);
  }

  @Test
  public void testManagerDifferentInstanceFR() {
    validateManagerDifferentInstance(HolidayCalendar.FRANCE);
  }

}
