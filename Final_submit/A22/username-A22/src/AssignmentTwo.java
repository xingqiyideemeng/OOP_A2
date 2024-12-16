public class AssignmentTwo {
    public static void main(String[] args) {
        // Create employee object
        Employee rideOperator = new Employee("Zhang San", 30, "Theme Park Employee Dormitory", "E001", "Operator");

        // Create ride object and specify the operator
        Ride rollerCoaster = new Ride("Roller Coaster", 5, rideOperator);

        // Create visitor objects
        Visitor visitor1 = new Visitor("Li Si", 25, "Chaoyang District, Beijing", "V001", "VIP Ticket");
        Visitor visitor2 = new Visitor("Wang Wu", 22, "Pudong District, Shanghai", "V002", "Regular Ticket");
        Visitor visitor3 = new Visitor("Zhao Liu", 28, "Tianhe District, Guangzhou", "V003", "Regular Ticket");

        // Test adding visitors to the queue
        System.out.println("=== Test Adding Visitors to Queue ===");
        rollerCoaster.addVisitorToQueue(visitor1);
        rollerCoaster.addVisitorToQueue(visitor2);
        rollerCoaster.addVisitorToQueue(visitor3);

        // Print current queue
        System.out.println("\n=== Print Current Queue ===");
        rollerCoaster.printQueue();

        // Remove a visitor
        System.out.println("\n=== Remove One Visitor ===");
        rollerCoaster.removeVisitorFromQueue();
        rollerCoaster.printQueue();

        // Add visitors to history
        System.out.println("\n=== Add Visitors to History ===");
        rollerCoaster.addVisitorToHistory(visitor1);
        rollerCoaster.addVisitorToHistory(visitor2);

        // Print history
        System.out.println("\n=== Print History ===");
        rollerCoaster.printRideHistory();

        // Check if visitors are in history
        System.out.println("\n=== Check If Visitors Are in History ===");
        System.out.println("Is visitor Li Si in history: " + rollerCoaster.checkVisitorFromHistory(visitor1));
        System.out.println("Is visitor Zhao Liu in history: " + rollerCoaster.checkVisitorFromHistory(visitor3));

        // Print total number of visitors in history
        System.out.println("\n=== Print Number of Visitors in History ===");
        System.out.println("A total of " + rollerCoaster.numberOfVisitors() + " visitors have participated in the ride.");
    }
    public void partThree() {
    }

    public void partFourA() {
    }

    public void partFourB() {
    }

    public void partFive() {
    }

    public void partSix() {
    }

    public void partSeven() {
    }
}
