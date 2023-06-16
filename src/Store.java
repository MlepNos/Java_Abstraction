import java.util.ArrayList;


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
