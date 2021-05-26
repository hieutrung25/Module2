import java.util.*;

public class CustomerManagement {
    Map<String, Customer> customerMap;
    Scanner scanner = new Scanner(System.in);
    Set<String> keys = null;
    List<Customer> customerList = null;

    public CustomerManagement() {
        customerMap = new HashMap<>();
    }

    public Map<String, Customer> getCustomerMap() {
        return customerMap;
    }

    public void add() {
        Customer customer = createCustomer();
        customerMap.put(customer.getId(), customer);
    }

    public boolean checkCustomerID(String cusID) {
        keys = customerMap.keySet();
        for (String key : keys) {
            if (customerMap.get(key).getId().equals(cusID)) {
                return true;
            }
        }
        return false;
    }

    public Customer createCustomer() {
        String ID;
        do {
            System.out.println("Enter customer ID:");
            ID = scanner.nextLine();
            if (checkCustomerID(ID)) {
                System.out.println("Duplicated customer ID, re input:");
            }
        } while (checkCustomerID(ID));
        System.out.println("Enter customer name:");
        String name = scanner.nextLine();
        System.out.println("Enter customer age:");
        int age = scanner.nextInt();
        int gender;
        do {
            System.out.println("Enter customer gender (1.Male/2.Female):");
            gender = scanner.nextInt();
            if (gender != 1 && gender != 2) {
                System.out.println("Wrong input, re input (1.Male/2.Female):");
            }
            scanner.nextLine();
        } while (gender != 1 && gender != 2);
        System.out.println("Enter customer address:");
        String address = scanner.nextLine();
        System.out.println("Enter customer job:");
        String job = scanner.nextLine();
        String phone;
        do {
            System.out.println("Enter customer phone:");
            phone = scanner.nextLine();
            if (phone.length() != 10) {
                System.out.println("Wrong input, re input (10 letter):");
            }
        } while (phone.length() != 10);
        return new Customer(ID, name, age, gender, address, phone);
    }

    public void display() {
        keys = customerMap.keySet();
        for (String key : keys) {
            System.out.println(customerMap.get(key));
        }
    }

    public void displayCustomerList() {
        if (customerList.size() != 0) {
            for (Customer customer : customerList) {
                System.out.println(customer);
            }
        } else {
            System.out.println("No Information!");
        }
    }

    public Customer searchCustomerByID() {
        System.out.println("Enter searching ID:");
        String ID = scanner.nextLine();
        keys = customerMap.keySet();
        for (String key : keys) {
            if (key.equals(ID))
                return customerMap.get(key);
        }
        return null;
    }

    public void searchCustomerByName() {
        System.out.println("Enter searching name:");
        String name = scanner.nextLine();
        keys = customerMap.keySet();
        customerList = new LinkedList<>();
        for (String key : keys) {
            if (customerMap.get(key).getName().equals(name)) {
                customerList.add(customerMap.get(key));
            }
        }
        displayCustomerList();
    }

    public void searchCustomerByAge() {
        System.out.println("Enter searching age:");
        int age = scanner.nextInt();
        scanner.nextLine();
        keys = customerMap.keySet();
        customerList = new LinkedList<>();
        for (String key : keys) {
            if (customerMap.get(key).getAge() == age) {
                customerList.add(customerMap.get(key));
            }
        }
        displayCustomerList();
    }

    public void searchCustomerByGender() {
        System.out.println("Enter searching gender:");
        String gioiTinh = scanner.nextLine();
        int gender = 0;
        if (gioiTinh.equals("nam")) {
            gender = 1;
        } else if (gioiTinh.equals("nữ")) {
            gender = 2;
        }
        keys = customerMap.keySet();
        customerList = new LinkedList<>();
        for (String key : keys) {
            if (customerMap.get(key).getGender() == gender) {
                customerList.add(customerMap.get(key));
            }
        }
        displayCustomerList();
    }

    public void searchCustomerByAddress() {
        System.out.println("Enter searching address:");
        String address = scanner.nextLine();
        keys = customerMap.keySet();
        customerList = new LinkedList<>();
        for (String key : keys) {
            if (customerMap.get(key).getAddress().equals(address)) {
                customerList.add(customerMap.get(key));
            }
        }
        displayCustomerList();
    }

    public void sortByID() {
        List<Map.Entry<String, Customer>> lists = new ArrayList<>(customerMap.entrySet());
        Collections.sort(lists, new Comparator<Map.Entry<String, Customer>>() {
            @Override
            public int compare(Map.Entry<String, Customer> customer1, Map.Entry<String, Customer> customer2) {
                return customer1.getValue().getId().compareTo(customer2.getValue().getId());
            }
        });
        Map<String, Customer> listCustomer = new LinkedHashMap<>();
        for (Map.Entry<String, Customer> list : lists) {
            listCustomer.put(list.getKey(), list.getValue());
        }
        this.customerMap = listCustomer;
    }

    public void sortByName() {
        List<Map.Entry<String, Customer>> lists = new ArrayList<>(customerMap.entrySet());
        Collections.sort(lists, new Comparator<Map.Entry<String, Customer>>() {
            @Override
            public int compare(Map.Entry<String, Customer> customer1, Map.Entry<String, Customer> customer2) {
                return customer1.getValue().getName().compareTo(customer2.getValue().getName());
            }
        });
        Map<String, Customer> listCustomer = new LinkedHashMap<>();
        for (Map.Entry<String, Customer> list : lists) {
            listCustomer.put(list.getKey(), list.getValue());
        }
        this.customerMap = listCustomer;
    }

    public void sortByAge() {
        List<Map.Entry<String, Customer>> lists = new ArrayList<>(customerMap.entrySet());
        Collections.sort(lists, new Comparator<Map.Entry<String, Customer>>() {
            @Override
            public int compare(Map.Entry<String, Customer> customer1, Map.Entry<String, Customer> customer2) {
                return customer1.getValue().getAge() - customer2.getValue().getAge();
            }
        });
        Map<String, Customer> listCustomer = new LinkedHashMap<>();
        for (Map.Entry<String, Customer> list : lists) {
            listCustomer.put(list.getKey(), list.getValue());
        }
        this.customerMap = listCustomer;
    }

    public void sortByAddress() {
        List<Map.Entry<String, Customer>> lists = new ArrayList<>(customerMap.entrySet());
        Collections.sort(lists, new Comparator<Map.Entry<String, Customer>>() {
            @Override
            public int compare(Map.Entry<String, Customer> customer1, Map.Entry<String, Customer> customer2) {
                return customer1.getValue().getAddress().compareTo(customer2.getValue().getAddress());
            }
        });
        Map<String, Customer> listCustomer = new LinkedHashMap<>();
        for (Map.Entry<String, Customer> list : lists) {
            listCustomer.put(list.getKey(), list.getValue());
        }
        this.customerMap = listCustomer;
    }

    public void editName(Customer customer) {
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        if (!name.equals("")) {
            customer.setName(name);
        }
    }

    public void editAge(Customer customer) {
        System.out.println("Enter age:");
        int age = scanner.nextInt();
        scanner.nextLine();
        if (age > 0 && age <= 100) {
            customer.setAge(age);
        }
    }

    public void editGender(Customer customer) {
        int gender;
        do {
            System.out.println("Enter gender (1.Male/2.Female):");
            gender = scanner.nextInt();
            if (gender == 1 || gender == 2) {
                customer.setGender(gender);
            } else {
                System.out.println("Wrong input, re input (1.Male/2.Female):");
            }
        } while (gender != 1 && gender != 2);
        scanner.nextLine();
    }

    public void editAddress(Customer customer) {
        System.out.println("Enter address:");
        String address = scanner.nextLine();
        if (!address.equals("")) {
            customer.setAddress(address);
        }
    }

    public void editPhone(Customer customer) {
        System.out.println("Enter phone:");
        String phone = scanner.nextLine();
        if (!phone.equals("")) {
            if (phone.length() < 10) {
                System.out.println("Number phone too short, re input (10 numbers):");
            } else if (phone.length() > 10) {
                System.out.println("Number phone too long, re input (10 numbers):");
            } else {
                customer.setPhone(phone);
            }
        }
    }

    public void editInformation(Customer customer) {
        editName(customer);
        editAge(customer);
        editGender(customer);
        editAddress(customer);
        editPhone(customer);
    }

    public void deleteCustomerByID() {
        Customer customer = searchCustomerByID();
        if (customer == null) {
            System.out.println("No information!");
        } else {
            System.out.println(customer);
            confirmDeleteCustomer(customer);
        }
    }

    public void confirmDeleteCustomer(Customer customer) {
        String confirm;
        do {
            System.out.println("Do you want to delete this customer (Y/N)");
            confirm = scanner.nextLine();
            if (confirm.equals("Y")) {
                customerMap.remove(customer.getId());
                System.out.println("Your customer was deleted!");
            } else if (confirm.equals("N")) {
                System.out.println("Your customer was not deleted!");
            } else {
                System.out.println("Wrong input, re input:");
            }
        } while (!confirm.equals("Y") && !confirm.equals("N"));
    }
}