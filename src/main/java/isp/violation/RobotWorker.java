package main.java.isp.violation;

/**
 * violation: RobotWorker is forced to implement eat, which it does not use.
 */
public class RobotWorker implements Worker
{
    public void work()
    {
        // working
    }

    public void eat()
    {
        // irrelevant for robots
    }
}
