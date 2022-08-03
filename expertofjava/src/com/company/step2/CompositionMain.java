package com.company.step2;
 class Motherboard{
    private String name;
    private String manufacturer;
    private int ramSlot;
    private int cardSlots;
    private String bios;

    Motherboard(String name, String manufacturer,int ramSlot, int cardSlots,String bios){
        this.name=name;
        this.manufacturer=manufacturer;
        this.ramSlot=ramSlot;
        this.cardSlots=cardSlots;
        this.bios=bios;
    }

    public void loadProgram(String programName){
        System.out.println("Program "+programName+" is now loading...");
    }
    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamSlot() {
        return ramSlot;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getBios() {
        return bios;
    }
}
 class Monitor{
    private String model;
    private String manufacturer;
    private int size;
    private Resolution nativeResolution;

    public Monitor(String model, String manufacturer, int size, Resolution nativeResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixelAt(int x,int y, String color){
        System.out.println("Drawing pixel at "+x+","+y+" in colour "+color);
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}
 class Resolution{
    private int width;
    private int height;

    public Resolution(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
 class Case{
    private String model;
    private String manufaturer;
    private String powerSupply;
    private Dimensions dimensions;

    public Case(String model, String manufaturer, String powerSupply, Dimensions dimensions) {
        this.model = model;
        this.manufaturer = manufaturer;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }
    public void pressPowerButton(){
        System.out.println("Power button pressed");
    }
    public String getModel() {
        return model;
    }

    public String getManufaturer() {
        return manufaturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
 class Dimensions{
    private int width;
    private int height;
    private int depth;

    Dimensions(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getDepth() {
        return depth;
    }
}
 class PC{
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }
    public Case getTheCase() {
        return theCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }
}
public class CompositionMain {

   public static void main(String[] message){
        Dimensions dimensions=new Dimensions(20,20,5);
        Case theCase=new Case("KA100","Dell","240",dimensions);

        Monitor theMonitor=new Monitor("27INC Beast","Rampage",27,new Resolution(2540,1440));
        Motherboard motherboard=new Motherboard("TS-400","Lenovo",4,6,"V5.99");
        PC thePc=new PC(theCase,theMonitor,motherboard);

        //Awesome
        thePc.getMonitor().drawPixelAt(5,6,"RGB");
        thePc.getMotherboard().loadProgram("MacOS Monterey");
        thePc.getTheCase().pressPowerButton();
   }
}
