package abstractfactoryPattern;


public class WinButton implements Button {
    @Override
    public void paint() {
        System.out.println("Win Button");
    }
}
