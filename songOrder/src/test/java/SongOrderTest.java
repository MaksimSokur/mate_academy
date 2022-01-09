import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import org.junit.Assert;
import org.junit.Test;

public class SongOrderTest {
  private static final int EXPECTED_CONSTRUCTORS_NUMBER = 2;
  private static final String MAKE_CHOICE_AGAIN_MESSAGE = "You haven't chosen a singer. Please make your choice)";

  @Test
  public void ofWithOneParameter_isOk() {
    SongOrder songOrder = SongOrder.of("Bon Jovi");
    String expected = "Play any Bon Jovi song";
    Assert.assertEquals("Wrong message is printed after creation of songOrder " +
        "where singer = \"Bon Jovi\". " +
        "Must be \"" + expected +  "\"\nbut you have \"" + songOrder + "\"\n",
      expected, songOrder.toString());
  }

  @Test
  public void ofWithOneParameter_IsOkIfSongNameIsNull() {
    SongOrder songOrder = SongOrder.of(null);
    Assert.assertEquals("Wrong message is printed after creation of songOrder " +
        "where singer = null\n" +
        "Must be \"" + MAKE_CHOICE_AGAIN_MESSAGE +  "\"\nbut you have \"" + songOrder + "\"\n",
      MAKE_CHOICE_AGAIN_MESSAGE, songOrder.toString());
  }

  @Test
  public void ofWithTwoParameters_IsOk() {
    SongOrder songOrder = SongOrder.of("Bon Jovi", "It's my life");
    String expected = "Play Bon Jovi song called \"It's my life\"";
    Assert.assertEquals(
      "Wrong message is printed after creation of songOrder " +
        "where singer = \"Bon Jovi\" and songName = \"It's my life\"\n" +
        "Must be \"" + expected +  "\"\nbut you have \"" + songOrder + "\"\n",
      expected, songOrder.toString());
  }

  @Test
  public void ofWithTwoParameters_IsOkIfSongNameIsNull() {
    SongOrder songOrder = SongOrder.of("Bon Jovi", null);
    String expected = "Play any Bon Jovi song";
    Assert.assertEquals("Wrong message is printed after creation of songOrder " +
        "where singer = \"Bon Jovi\" and songName = null\n" +
        "Must be \"" + expected +  "\"\nbut you have \"" + songOrder + "\"\n",
      expected, songOrder.toString());
  }

  @Test
  public void ofWithTwoParameters_IsOkIfSingerAndSongNameAreNull() {
    SongOrder songOrder = SongOrder.of(null, null);
    Assert.assertEquals("Wrong message is printed after creation of songOrder " +
        "where singer = null and songName = null\n" +
        "Must be \"" + MAKE_CHOICE_AGAIN_MESSAGE +  "\"\nbut you have \"" + songOrder + "\"\n",
      MAKE_CHOICE_AGAIN_MESSAGE, songOrder.toString());
  }

  @Test
  public void toString_IsOverridden() throws NoSuchMethodException {
    Class<?> actual = SongOrder.class.getMethod("toString").getDeclaringClass();
    Assert.assertEquals("toString() must be overridden\n", SongOrder.class, actual);
  }

  @Test
  public void songConstructors_checkIsSongHasTwoPrivateConstructors() {
    Constructor<?>[] constructors = SongOrder.class.getDeclaredConstructors();
    Assert.assertEquals(
      "Song must have 2 constructors but you have " + constructors.length + "\n",
      EXPECTED_CONSTRUCTORS_NUMBER, constructors.length);
    for (Constructor<?> constructor : constructors) {
      Assert.assertTrue("All constructors must be private\n",
        Modifier.isPrivate(constructor.getModifiers()));
    }
  }

  @Test
  public void ofWithOneParameter_checkIsSongHasOfMethodWithOneParameter() {
    checkHasOfMethodWithParametersNumber(1,
      "Song must have static factory method of() with singer parameter\n");
  }

  @Test
  public void ofWithTwoParameters_checkIsSongHasOfMethodWithTwoParameters() {
    checkHasOfMethodWithParametersNumber(2,
      "Song must have static factory method of() with singer and songName parameters\n");
  }

  @Test
  public void songConstructor_checkIsSongHasConstructorWithOneParameter() {
    checkHasConstructorWithParametersNumber(1,
      "Song must have private constructor with parameter singer\n");
  }


  @Test
  public void songConstructor_checkIsSongHasConstructorWithTwoParameters() {
    checkHasConstructorWithParametersNumber(2,
      "Song must have private constructor with parameters singer and songName\n");
  }

  private void checkHasOfMethodWithParametersNumber(int parametersNumber,
                                                    String errorMessage) {
    Method[] methods = SongOrder.class.getMethods();
    int actual = 0;
    for (Method method : methods) {
      if (method.getName().equals("of")
        && method.getParameters().length == parametersNumber
        && Modifier.isStatic(method.getModifiers())
        && Modifier.isPublic(method.getModifiers())
        && method.getReturnType().getName().equals(SongOrder.class.getName())) {
        actual++;
      }
    }
    Assert.assertEquals(errorMessage, 1, actual);
  }

  private void checkHasConstructorWithParametersNumber(int parameterNumbers, String errorMessage) {
    Constructor<?>[] constructors = SongOrder.class.getDeclaredConstructors();
    int actual = 0;
    for (Constructor<?> constructor : constructors) {
      if (constructor.getParameters().length == parameterNumbers) {
        actual++;
      }
    }
    Assert.assertEquals(errorMessage, 1, actual);
  }
}
