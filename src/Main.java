public class Main {
    public static void main(String[] args) {
        Clock rolexWatch = new RolexWatch();
        rolexWatch.buyClock();
        rolexWatch.sellClock();
        AnalogClock analogClock = (AnalogClock)rolexWatch;
        analogClock.cleanClock();

        System.out.println();
        System.out.println();

        Clock appleWatch = new AppleWatch();
        appleWatch.buyClock();
        appleWatch.sellClock();
        DigitalClock digitalClock = (DigitalClock) appleWatch;
        digitalClock.setClock();

        System.out.println();
        System.out.println();

        Clock badWatch = new BadWatch();
        badWatch.buyClock();
        badWatch.sellClock();
        RolexWatch brolexWatch = (RolexWatch)badWatch;
        brolexWatch.cleanClock();
        BadWatch bbadWatch = (BadWatch)badWatch;
        bbadWatch.repairClock();
    }
}
