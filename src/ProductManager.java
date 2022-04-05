import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ProductManager {
    private ArrayList<Product> productArrayList;

    public ProductManager() {
        this.productArrayList = new ArrayList<Product>();
    }

    public ProductManager(ArrayList<Product> productArrayList) {
        this.productArrayList = productArrayList;
    }

    public void addProduct(Product product) {
        this.productArrayList.add(product);
    }

    public void setProduct(int id, String name) {
        for (int i = 0; i < productArrayList.size(); i++) {
            if (productArrayList.get(i).getId() == id) {
                productArrayList.get(i).setName(name);
            }
        }
    }

    public void removeProduct(int id) {
//        for (Product product : productArrayList) {
//            if (product.getId() == id) {
//                productArrayList.remove(product);
//            }
//        }
        for (int i = 0; i < productArrayList.size(); i++) {
            if (productArrayList.get(i).getId() == id) {
                productArrayList.remove(productArrayList.get(i));
            }
        }
    }

    public void showProduct() {
        for (Product product : productArrayList) {
            System.out.println(product.toString());
        }
    }

    public void searchProductName(String name) {
        for (Product product : productArrayList) {
            if (product.getName().indexOf(name) >= 0) {
                System.out.println(product);
            }
        }
    }

    public void sortDecresingPrice() {
        Collections.sort(this.productArrayList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if(o1.getPrice() < o2.getPrice()) {
                    return 1;
                }else if(o1.getPrice() > o2.getPrice()) {
                    return -1;
                }else {
                    return 0;
                }
            }
        });
    }

    public void sortIncresingPrice() {
        Collections.sort(this.productArrayList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if(o1.getPrice() < o2.getPrice()) {
                    return -1;
                }else if(o1.getPrice() > o2.getPrice()) {
                    return 1;
                }else {
                    return 0;
                }
            }
        });
    }
}
