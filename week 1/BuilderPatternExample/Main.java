package BuilderPatternExample;

public class Main {
    public static void main(String[] args) {
        // Building a gaming PC
        Computer gamingPC = new Computer.Builder()
                .setCpu("Intel i9")
                .setRam("32GB")
                .setStorage("1TB SSD")
                .setGraphicsCard("NVIDIA RTX 4080")
                .build();

        System.out.println("Gaming PC Specs:");
        gamingPC.specs();

        System.out.println("\nOffice PC Specs:");
        // Building an office PC
        Computer officePC = new Computer.Builder()
                .setCpu("Intel i5")
                .setRam("16GB")
                .setStorage("512GB SSD")
                .build();

        officePC.specs();
    }
}
