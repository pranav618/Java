package desingPattern.factoryCreationalDesginPattern;

public class OperatingSystemFactory {
    public OS getInstance(String input){
        switch (input){
            case "Open":
                return new Android();
            case "Closed":
                return new IOS();
            default:
                return new Windows();
        }
    }
}
