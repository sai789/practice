public class RolexWatch extends AnalogClock {
    @Override
    public void cleanClock() {
        System.out.println("RolexWatch [extends AnalogClock [extends Clock]] cleaning clock...");
    }
}
