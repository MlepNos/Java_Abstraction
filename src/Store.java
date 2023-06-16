import java.util.ArrayList;
/*
In this challenge, you need to build an application, that can be a store front, for any imaginable item for sale.
Instead of the Main class we usually create, create a Store class, with a main method.
The Store class should:
-manage a list of products for sale, including displaying the product details.
-manage an order, which can just be a list of OrderItem objects.
-have methods to add an item to the order, and print the ordered items, so it looks like a sales receipt.

Create a ProductForSale class that should have at least three fields: a type, price, and a description, and should have methods to:
-get a Sales Price, a concrete method, which takes a quantity, and returns the quantity times the price.
-print a Priced Line Item, a concrete method, which takes a quantity, and should print an itemized line item for an order,
with quantity and line item price.
-show Details, an abstract method, which represents what might be displayed on a product page, product type, description, price, and so on.
Create an OrderItem type, that has at a minimum 2 fields, quantity and a Product for Sale.
You should create two or three classes that extend the ProductForSale class, that will be products in your store.
See the class diagram "Diagram/Challange_Abstraction.png"
 */




record OrderItem(int qty, ProductForSale product){}
public class Store {

    private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();
    public static void main(String[] args){

        storeProducts.add(new ArtObject("Oil Painting", 1500,"Printed by Hawking in 1975"));
        storeProducts.add(new ArtObject("Sculpture", 8000,"Made of Bronze"));
        storeProducts.add(new Furniture("Bed", 2000,"Its Just Nice"));

        storeProducts.add(new Furniture("Lamp", 200,"Shiny"));
        ListProduct();

        System.out.println("\nOrder 1");
        var Order1 = new ArrayList<OrderItem>();
        AddItemToOrder(Order1,1,2);
        AddItemToOrder(Order1,0,1);
        AddItemToOrder(Order1,2,3);
        PrintOrder(Order1);



        System.out.println("\nOrder 2");
        var Order2 = new ArrayList<OrderItem>();
        AddItemToOrder(Order2 ,3,20);
        AddItemToOrder(Order2,2,1);
        PrintOrder(Order2 );

    }

    public static void ListProduct(){
        for(var product : storeProducts){  // could also be "ProductForSale product : storeProducts"
            System.out.println("-".repeat(30));
            product.ShowDetails();
        }
    }

    public static void AddItemToOrder(ArrayList<OrderItem> order, int OrderIndex,int qty){
        order.add(new OrderItem(qty,storeProducts.get(OrderIndex)));
    }

    public static void PrintOrder(ArrayList<OrderItem> order){
        double salesTotal = 0;
        for(var item : order){
            item.product().PrintPricedItem(item.qty());
            salesTotal += item.product().GetSalesPrice(item.qty());
        }
        System.out.printf("Sales Total = $%6.2f %n", salesTotal);
    }

}
