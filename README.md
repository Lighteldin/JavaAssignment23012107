I provided 2 PDFs, 1 for GUI version of the project, called "WITH GUI", and 1 for the non-GUI version of the project, called "WITHOUT GUI".

However! I only provided classes for the GUI version (along with some needs classes for the GUI including: PrimaryController, SecondaryController and ShowController)

I also provided the .fxml ("primary.fxml" "secondary.fxml" "show.fxml") files for those 3 extra classes as they're needed.

##########################################################################################################################################

-In both versions of the project:
1) I used an ARRAYLIST to accept as many products as the user wants instead of limiting them to a number;
2) I used an IF-ELSE statement to make sure input is a positive number;
3) I used a FOR-EACH loop for looping through the ARRAYLIST instead of a normal FOR loop with "int i".

-In the GUI version:
1) I used JavaFX with its SceneBuilder, hence the existence of Controller classes and .fxml files;
2) In the "Cart" class, I have 1 extra method: "removeAllProduts()", this removes all products inside the ARRAYLIST;
3) In the "Order" class, I have 1 extra method: "getProductsName()", only returns the names of each product;
4) In the "Order" class, the "printOrderInfo()";
5) In the "EcommerceSystem" class, methods like "start()", "setRoot()" and "loadFXML()" are only related to JavaFX and not the project;
6) Instances of each Product Class were made "static" to be able to access them across all 3 Controller classes.
   
##########################################################################################################################################
--EXPLANATION OF THE GUI CODE: (NOTE: The non-logical part of the GUI, like buttons, are created inside the SceneBuilder)

-In EcommerceSystem class:
   I created STATIC variables for each class of the project without instantiating them. They are static to access them across the JavaFX Controller classes.
   In start() method: It starts up the GUI starting with the "PrimaryController" class.

-In PrimaryController class:
   In the initialize() method, I instantiated the Electronic, Clothing and Book Product objects with data from the given Test Case. 
   In this class, I take the information given by the user from the TextFields once they press the "Enter" button.
   I then instantiate the Customer object with this information and also instantiate the Cart object.
   Once the user presses "Enter", the code in "SecondaryController" starts running instead. This is done using the "switchToSecondary()" method.
   
-In SecondaryController class:
   This class shows the user 3 buttons, "OOP", "Smartphone" and "T-Shirt" with their price tags too. 
   User has to click on which product they want to add.
   When user clicks one of the options, "cart.addProduct(#)" will be called accordingly.
   Any selected product will show up to the user before clicking the "Place Order" button.
   A total is also shown to the user automatically.
   If user clicks on "Cancel Order" button, "cart.removeAllProducts()" method is called.

-In ShowController class:
   This class is responsible for showing the order details to the user.
   The method "order.printOrderInfo()" is used in this class. 
