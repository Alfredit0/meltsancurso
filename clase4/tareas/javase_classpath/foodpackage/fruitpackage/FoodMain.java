package foodpackage.fruitpackage;
/**
*@autor Alfredo Reyes
*@version 1.0
*/
public class FoodMain{
	public static void main(String [] args){
		Food food = new Food();
		food.setName("Pizza");
		food.setPrice(120);
		food.setSize("Grande");
		System.out.println("Nombre del platillo: " + food.getName());
		System.out.println("Precio del platillo: " + food.getPrice());
		System.out.println("Tamaño del platillo: " + food.getSize());
}
}
