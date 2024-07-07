package main.java.lsp.violation;

/**
 * violation: replacing Bird with its subclass Ostrich can lead to runtime errors.
 */
public class Ostrich extends Bird
{
    @Override
    public void fly()
    {
        throw new UnsupportedOperationException("Ostrich can't fly");
    }
}