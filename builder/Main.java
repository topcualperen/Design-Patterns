package builder;

class Computer {
    private String processor;
    private String memory;
    private String storage;
    private String graphicsCard;
    
    // Private constructor
    private Computer(ComputerBuilder builder) {
        this.processor = builder.processor;
        this.memory = builder.memory;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
    }
    
    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", memory='" + memory + '\'' +
                ", storage='" + storage + '\'' +
                ", graphicsCard='" + graphicsCard + '\'' +
                '}';
    }
    
    // Builder sınıfı
    public static class ComputerBuilder {
        private String processor;
        private String memory;
        private String storage;
        private String graphicsCard;
        
        public ComputerBuilder setProcessor(String processor) {
            this.processor = processor;
            return this;
        }
        
        public ComputerBuilder setMemory(String memory) {
            this.memory = memory;
            return this;
        }
        
        public ComputerBuilder setStorage(String storage) {
            this.storage = storage;
            return this;
        }
        
        public ComputerBuilder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }
        
        public Computer build() {
            return new Computer(this);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("\n=== BUILDER PATTERN ===");
        Computer computer = new Computer.ComputerBuilder()
                .setProcessor("Intel i7")
                .setMemory("16GB")
                .setStorage("512GB SSD")
                .setGraphicsCard("RTX 4060")
                .build();
        System.out.println(computer);
    }
}
