package homework2;

public class PC {

    private Case aCase;
    private Motherboard motherboard;
    private Monitor monitor;


    public PC(Case aCase, Motherboard motherboard, Monitor monitor) {
        this.aCase = aCase;
        this.motherboard = motherboard;
        this.monitor = monitor;
    }

    public Case getaCase() {
        return aCase;
    }

    public void setaCase(Case aCase) {
        this.aCase = aCase;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    private void drawLogo(){
        monitor.drawPixel(1,3,"red");
    }



    public void powerUp(){
    aCase.pressPowerButton();
    drawLogo();
    motherboard.loadProgram("Mac");
    }

    @Override
    public String toString() {
        return "PC{" + "aCase=" + aCase + ", motherboard=" + motherboard + ", monitor=" + monitor + '}';
    }

    public void description(){
        System.out.println("Welcome to worst buy below is the description of the pc on sale today"+"\n" +aCase + "\n"+ motherboard + "\n" + monitor);
    }
}
