package sample.exceptions;

public class ExceptionExample {

    public void MethodWithException() throws Exception {
        try {
            //var z = 3 / 0;
            throw new ArithmeticException("Exception: Bla bla");
        } catch (final ArithmeticException | NullPointerException ex) { // multi-catch
            System.out.println(ex);
        } catch (final Exception ex) {
            System.out.println(ex);
        } finally {
            // do something

        }
    }
}
