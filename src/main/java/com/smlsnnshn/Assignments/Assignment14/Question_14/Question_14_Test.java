package com.smlsnnshn.Assignments.Assignment14.Question_14;

public class Question_14_Test {
	
	public static void main(String[] args) {
		
		TJMaxx tjmaxx = new TJMaxx();
			
		tjmaxx.addRegularItem(new Item      ("Computer" , 1 , 01 , 1000    ));
		tjmaxx.addRegularItem(new Item      ("Phone"    , 5 , 02 , 500     ));
		tjmaxx.addRegularItem(new Item      ("TV"       , 3 , 03 , 2500    ));
		tjmaxx.addOnSaleItem (new OnSaleItem("Headset"  , 4 , 04 , 200, 20 ));
		tjmaxx.addOnSaleItem (new OnSaleItem("Mouse"    , 10, 05 , 150, 10 ));
		
		System.out.println("**************************************************************");
				
		System.out.println("getRegularItems() : " + tjmaxx.getRegularItems());
		System.out.println("getOnSaleItems()  : " + tjmaxx.getOnSaleItems());
		
		System.out.println("**************************************************************");
		
		System.out.println("regularItemsCount : " + tjmaxx.regularItemsCount());
		System.out.println("onSaleItemsCount  : " + tjmaxx.onSaleItemsCount());
		
		System.out.println("**************************************************************");
		
		System.out.println("getAllItemsNames() : " + tjmaxx.getAllItemNames());
		
		System.out.println("**************************************************************");
		
		System.out.println("getItemPrice(01) : " + tjmaxx.getItemPrice(04));
				
		System.out.println("**************************************************************");
		
		System.out.println("getOnSaleItem(\"Mouse\") : " + tjmaxx.getOnSaleItem("Mouse"));
		
		System.out.println("**************************************************************");
		
		System.out.println("removeItem(02)");
		tjmaxx.removeItem(02);
		
		System.out.println("**************************************************************");
		
		System.out.println("buyItem(01)");
		tjmaxx.buyItem(01);

	}

}
