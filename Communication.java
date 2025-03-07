public class Communication {
    String name;
    int friendliness;

    public Communication(String name, int friendliness) {
        this.name = name;
        this.friendliness = friendliness;
    }

    public static void main(String[] args) {
        Communication com = new Communication("Aita", 0);
        com.greet();
    }

    public void greet() {
        switch (friendliness) {
            case 0:
                System.out.println("auää nid scho wieder du " + name);
                break;
            case 1:
                System.out.println("Hoi, " + name);
                break;
            case 2:
                System.out.println("Helloo " + name + ", schö di zgeh!");
                break;
            case 3:
                System.out.println("jooo! " + name + "missed you a little");
                break;
            default:
                System.out.println("Error: Freundlichkeit ausserhalb des Messbereichs. System überlastet...");
                break;
        }
    }
}§