import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomerManagement customerManagement = new CustomerManagement();
        Customer customer1 = new Customer("C1", "Tiến", 28, 1, "Hải Phòng","0123456789" );
        Customer customer2 = new Customer("C2", "Sơn", 22, 1, "Thái Bình","0123456979" );
        Customer customer3 = new Customer("C3", "Tuấn Anh", 28, 1, "Nam Định","0123654789" );
        Customer customer4 = new Customer("C4", "Trường", 27, 1, "Thái Bình","0132456789" );
        customerManagement.getCustomerMap().put(customer1.getId(), customer1);
        customerManagement.getCustomerMap().put(customer2.getId(), customer2);
        customerManagement.getCustomerMap().put(customer3.getId(), customer3);
        customerManagement.getCustomerMap().put(customer4.getId(), customer4);
        int choice, option;
        do {
            customerManagementMenu();
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    customerManagement.add();
                    break;
                case 2:
                    searchingMenu();
                    option = scanner.nextInt();
                    scanner.nextLine();
                    switch (option) {
                        case 1:
                            Customer customer = customerManagement.searchCustomerByID();
                            if (customer == null) {
                                System.out.println("No information!");
                            } else {
                                System.out.println(customer);
                            }
                            break;
                        case 2:
                            customerManagement.searchCustomerByName();
                            break;
                        case 3:
                            customerManagement.searchCustomerByAge();
                            break;
                        case 4:
                            customerManagement.searchCustomerByGender();
                            break;
                        case 5:
                            customerManagement.searchCustomerByAddress();
                            break;
                        default:
                            System.out.println("Invalid!");
                    }
                    break;
                case 3:
                    sortingMenu();
                    option = scanner.nextInt();
                    scanner.nextLine();
                    switch (option) {
                        case 1:
                            customerManagement.sortByID();
                            break;
                        case 2:
                            customerManagement.sortByName();
                            break;
                        case 3:
                            customerManagement.sortByAge();
                            break;
                        case 4:
                            customerManagement.sortByAddress();
                            break;
                        default:
                            System.out.println("Invalid!");
                    }
                    break;
                case 4:
                    Customer customer = customerManagement.searchCustomerByID();
                    if (customer == null) {
                        System.out.println("No information!");
                    } else {
                        System.out.println(customer);
                        editingMenu();
                        option = scanner.nextInt();
                        scanner.nextLine();
                        switch (option) {
                            case 1:
                                customerManagement.editName(customer);
                                break;
                            case 2:
                                customerManagement.editAge(customer);
                                break;
                            case 3:
                                customerManagement.editGender(customer);
                                break;
                            case 4:
                                customerManagement.editAddress(customer);
                                break;
                            case 5:
                                customerManagement.editPhone(customer);
                                break;
                            case 6:
                                customerManagement.editInformation(customer);
                                break;
                            default:
                                System.out.println("Invalid!");
                        }
                    }
                    break;
                case 5:
                    customerManagement.display();
                    break;
                case 6:
                    customerManagement.deleteCustomerByID();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong input, re input (0-6):");
            }
        } while (true);
    }

    static void customerManagementMenu() {
        System.out.println("Customer Management");
        System.out.println("1. Add customer");
        System.out.println("2. Search customer");
        System.out.println("3. Sort customer");
        System.out.println("4. Edit customer");
        System.out.println("5. Display list customer");
        System.out.println("6. Delete customer");
        System.out.println("0. Exit");
        System.out.println("Enter your choice:");
    }

    static void searchingMenu() {
        System.out.println("Searching menu");
        System.out.println("1. Search customer by ID");
        System.out.println("2. Search customer by name");
        System.out.println("3. Search customer by age");
        System.out.println("4. Search customer by gender");
        System.out.println("5. Search customer by address");
        System.out.println("Enter your option");
    }

    static void editingMenu() {
        System.out.println("Editing menu");
        System.out.println("1. Edit name");
        System.out.println("2. Edit age");
        System.out.println("3. Edit gender");
        System.out.println("4. Edit address");
        System.out.println("6. Edit phone");
        System.out.println("7. Edit whole information");
        System.out.println("Enter your option");
    }

    static void sortingMenu() {
        System.out.println("Sorting menu");
        System.out.println("1. Sorting customer by ID");
        System.out.println("2. Sorting customer by name");
        System.out.println("3. Sorting customer by age");
        System.out.println("4. Sorting customer by address");
        System.out.println("Enter your option");
    }
}
