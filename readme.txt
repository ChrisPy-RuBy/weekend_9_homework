Shopping Basket Design.

MVP- The project has been created to allow for the following criteria to be met.

-Add items to a basket
-Remove items from a basket
-Empty basket

I am writing the project in Android Studio due to its support for Java, its preferable work flow and ease of test creation and use.

The project has been built from Scratch using TDD as the primary development tool. The code will be refactored and changed as required to create addition functionality.

Initial Entry

The bulk of the functionality for the MVP can be acheived using one class and a ArrayList I believe and so this is how I will start. I may change the project to use a HashMap at a later date as I still haven't used on of these in Java so that would be a good learning opportunity.

Update

Very Basic mvp achieved using ints to create a basket and then an add, remove and clear method. 

Obviously more work can be done to improve the usefulness of the program.

Further Work

Additionally, you must be able to calculate the total value of the shopping basket. This should account for:
* buy-one-get-one-free discounts on items,
* 10% off on totals greater than £20 (after previous discount is applied),
* 2% off on total for customers with loyalty cards (after all other discounts are applied).  

Here obviously it is required that each item has an identity i.e. a name and price, so I think due to the potential complexity here it would be best to take this out to seperate item class. It is tempting to use a HashMap but I think that I would just just end up using a class anyway so might as well just start now.

Update

OK, so have created an item class that can be placed in the basket. This fine and in spec but not very realistic so I will now spend some time flushing out the details. Specifically I want the values to be floats or doubles and I want to abstract items out into multiple items with different properties and values. This might be how I will create the value features for the BOGOF features etc.

 Update

 Refactored the code so that I can use floats now instead and add a buyable interface.


Update

So I've now added a buyable interface, and I'm also trying to make items an abstract class, I want it so that you can call all the methods includes on the abstract parent class but I can't seem to make this work at the moment. I should be able to do this using super but not really 100 % on how to do this. Will ask on MOnday. I will now move on to trying to create the bogof feature.

Update

I have a method that checks the number of instances of bread in the basket. I will now extend the class to have a method that determines if there number is odd or even and then another to calculate the discounts. If the number is even then this is even then is easy but if odd I will have to create another method the calculates the discount for the nearest even number 



