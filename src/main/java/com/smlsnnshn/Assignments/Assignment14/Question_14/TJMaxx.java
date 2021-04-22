package com.smlsnnshn.Assignments.Assignment14.Question_14;

import java.util.ArrayList;
import java.util.List;

//represents TJMaxx store class.
class TJMaxx {

	//Private lists to hold regular Item objects and OnSaleItem objects that represent items that sell in TJMaxx
    private List<Item> regularItems;
    private List<OnSaleItem> onSaleItems;

    //Public no-args constructor - Instantiates regularItems and onSaleItems lists as new ArrayList
    public TJMaxx() { 
    	regularItems = new ArrayList<>();
    	onSaleItems = new ArrayList<>();
    }

    //adds an item object to regularItems list @param item
    public void addRegularItem(Item item) {
        regularItems.add(item);      
    }

    //adds OnSaleItem object to onSaleItems list @param item
    public void addOnSaleItem(OnSaleItem item) {
        onSaleItems.add(item);    
    }

    //getter for regularItems @return
    public List<Item> getRegularItems() {
         return regularItems;
    }

    //getter for onSaleItems @return
    public List<OnSaleItem> getOnSaleItems() {
         return onSaleItems;
    }

    //return count of regularItem object @return
    public int regularItemsCount() {
        return regularItems.size();
    }

    //returns count of onSaleItems in TJ Maxx @return
     public int onSaleItemsCount() {
         return onSaleItems.size();
     }

    //returns the name of each item in TJ Maxx starting from regular item then onSaleItems @return
    public List<String> getAllItemNames() { 
    	ArrayList<String> namesList = new ArrayList<>();
    	for (Item each : regularItems) {
    		namesList.add(each.getName());
    	} 
    	for (OnSaleItem each : onSaleItems) {
    		namesList.add(each.getName());
    	}   	
    	return namesList ;
    }

    //gets catalog number and returns price for the item
    //it will search for the item both regularItems and onsaleonSaleItems @param catalogNumber
    //@returns 0.0 if product cannot be found with that catalognumber
    public double getItemPrice(int catalogNumber) {
    	double price = 0;
    	for (Item each : regularItems) {
    		if (each.getCatalogNumber()==catalogNumber) {
    			price = each.getPrice();
    		}
    	}
    	for (OnSaleItem each : onSaleItems) {
    		if (each.getCatalogNumber()==catalogNumber) {
    			price = each.getPrice();
    		}
    	}
    	return price;
    }

    //accepts a name then searches amoung onSaleItems. Once it finds, 
    //the method will return that OnSaleItem object @param name @return
    public OnSaleItem getOnSaleItem(String name) { 
    	OnSaleItem itemFound = null;
		for (OnSaleItem each : onSaleItems) {
    		if (each.getName().equals(name)) {
    			itemFound = each;
    		}
    	}
    	return itemFound;
    }

    //removes the item with matching catalogNumber from both regularItems and onSaleItems.
    //Does nothing if not found @param catalogNumber
    public void removeItem(int catalogNumber) {   	
    	for (Item each : regularItems) {
    		if (each.getCatalogNumber()==catalogNumber) {
    			regularItems.remove(each);
    		}
    	}
    	for (OnSaleItem each : onSaleItems) {
      		if (each.getCatalogNumber()==catalogNumber) {
    			regularItems.remove(each);
    		}
    	}
    }

    //it accepts a catalog number and finds that item among regularItems and onSaleItems
    //if it finds the item: decrease the count of the Item by 1
    //if count reaches 0 after decrementing then remove the product(call removeItem method @param catalogNumber
    public void buyItem(int catalogNumber) {
    
    	for (Item each : regularItems) {
    		if (each.getCatalogNumber()==catalogNumber) {
    			each.setQuantity(each.getQuantity()-1);
    			if (each.getQuantity()==0) {
    				removeItem(catalogNumber);
    			}
    		}
    	}
    	for (OnSaleItem each : onSaleItems) {
    		if (each.getCatalogNumber()==catalogNumber) {
    			each.setQuantity(each.getQuantity()-1);
    			if (each.getQuantity()>0) {
    				removeItem(catalogNumber);
    			}
    		}
    	}
    }

}




