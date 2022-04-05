import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(1,"Kien",1);
        Product product2 = new Product(2,"Binh",2);
        Product product3 = new Product(3,"Thuong",3);
        Product product4 = new Product(4,"Hung",4);
        Product product5 = new Product(5,"Hue",5);

        ProductManager productManager = new ProductManager();

        productManager.addProduct(product1);
        productManager.addProduct(product2);
        productManager.addProduct(product3);
        productManager.addProduct(product4);
        productManager.addProduct(product5);

        productManager.showProduct();

        // Sua ten san pham
        productManager.setProduct(2, "Quoc Anh");
        productManager.showProduct();

        // Sap xep theo gia giam dan
        productManager.sortDecresingPrice();
        productManager.showProduct();

        // Sap xep theo gia tang dan
        productManager.sortIncresingPrice();
        productManager.showProduct();

        // Xoa san pham theo id
        productManager.removeProduct(2);
        productManager.showProduct();

        // Tim kiem san pham theo ten
        productManager.searchProductName("Kien");


//        Scanner scanner = new Scanner(System.in);
//        ProductManager productManager = new ProductManager();
//        int choice = 0;
//        do {
//            System.out.println("Menu:");
//            System.out.println("1. Them san pham vao danh sach");
//            System.out.println("2. Sua thong tin san pham theo id");
//            System.out.println("3. Xoa san pham theo id");
//            System.out.println("4. Hien thi danh sach san pham");
//            System.out.println("5. Tim kiem san pham theo ten");
//            System.out.println("6. Sap xep san pham tang dan theo gia");
//            System.out.println("7. Sap xep san pham giam dan theo gia");
//            System.out.println("0. Thoat khoi chuong trinh");
//            System.out.println("Vui long chon chuc nang: ");
//
//            choice = scanner.nextInt();
//            scanner.nextLine();
//
//            switch (choice) {
//                case 1: //Them san pham
//                    System.out.println("Nhap id san pham: ");
//                    int id = scanner.nextInt();
//                    System.out.println("Nhap ten san pham: ");
//                    String name = scanner.next();
//                    System.out.println("Nhap gia san pham: ");
//                    Double price = scanner.nextDouble();
//                    Product product = new Product(id, name, price);
//                    productManager.addProduct(product);
//
//                case 2: //Sua thong tin san pham theo id
//                    System.out.println("Nhap id san pham: ");
//                    int idSet = scanner.nextInt();
//                    System.out.println("Nhap ten san pham: ");
//                    String nameSet = scanner.nextLine();
//                    productManager.setProduct(idSet, nameSet);
//                    productManager.showProduct();
//
//                case 3: //Xoa san pham theo id
//                    System.out.println("Nhap id san pham");
//                    int idRemove = scanner.nextInt();
//                    productManager.removeProduct(idRemove);
//                    productManager.showProduct();
//
//                case 4: //Hien thi danh sach san pham
//                    productManager.showProduct();
//
//                case 5: //Tim kiem san pham theo ten
//                    System.out.println("Nhap ten san pham muon tim: ");
//                    String nameSearch = scanner.nextLine();
//                    productManager.searchProductName(nameSearch);
//
//                case 6: //Sap xep san pham tang dan theo gia
//                    productManager.sortIncresingPrice();
//                    productManager.showProduct();
//
//                case 7: //Sap xep san pham giam dan theo gia
//                    productManager.sortDecresingPrice();
//                    productManager.showProduct();
//            }
//        } while (choice != 0);
    }
}
