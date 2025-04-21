/********************************************
*	DACArecipient Tester
*********************************************
*	PROGRAM DESCRIPTION:
*	This program is to test methods of the DACArecipient class.
*********************************************/
class Main 
{
  public static void main(String[] args) 
	{
    // Create two DACArecipient objects and set their attributes

    // Set up person one and print their details and card
    DACArecipient personOne = new DACArecipient();
    personOne.setAll("Smith", "John", "A123456789", "Mexico", 2452006, 2460421, 2461212, 'M');
    System.out.println(personOne);
    System.out.println(personOne.printCard());

    System.out.println();

    // Set up person two and print their details and card
    DACArecipient personTwo = new DACArecipient();
    personTwo.setAll("Doe", "Jane", "B987654321", "Canada", 2451275, 2459702, 2461230, 'F');
    System.out.println(personTwo);
    System.out.println(personTwo.printCard());

    System.out.println();

    // Check if the two persons are equal
    System.out.println("Are personOne and personTwo equal? " + personOne.equals(personTwo));
  }
}