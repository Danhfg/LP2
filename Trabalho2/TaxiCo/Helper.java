/**
 * The test class Helper.
 * Provides the beginning of a set of tests for program development.
 *
 * @author  (Daniel Henrique Ferreira Gomes)
 * @version 2018.09.11
 */
public class Helper 
{
	private TaxiCo taxiCo1;

    /**
     * Default constructor for test class Helper
     */
    public Helper()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
	protected void setUp()
	{
		taxiCo1 = new TaxiCo("IMD's cars");
		taxiCo1.addTaxi();
		taxiCo1.addTaxi();
		taxiCo1.addShuttle();
	}

    /**
     * Test whether we can book a taxi.
     */
	public void testBook()
	{
		setUp();
		Taxi taxi1 = (Taxi) taxiCo1.lookup("Car #1");		
		taxi1.book("HIPER");
		if ("HIPER".equalsIgnoreCase(taxi1.getDestination()) ) {
			System.out.println("Funcionou");
		} else { 
			System.out.println("Alguma coisa errada");
		}
	}

	/**
	 * Test the status of a taxi after it has arrived.
	 */
	public void testArrived()
	{
		Taxi taxi1 = (Taxi) taxiCo1.lookup("Car #1");
		taxi1.book("HIPER");
		taxi1.arrived();
		if ( taxi1.getDestination() == null && "HIPER".equalsIgnoreCase(taxi1.getLocation()) ) {
			System.out.println("Funcionou");
		} else { 
			System.out.println("Alguma coisa errada");
		}
	}

    /**
     * Test the status of a taxi after it has arrived.
     */
    /*
    public void testGetsSets()
    {
        Taxi taxi1 = (Taxi) taxiCo1.lookup("Car #1");
        //Taxi shuttle1 = (Shuttle) taxiCo1.[0];
        System.out.println("Descrição: " + taxi1.getDestination());

    }*/

    /**
     * Test for getNextVeicle when the destination is "Shuttle #3".
     */
    public void testGetNextVeicle1(){
        Shuttle shuttle1 = (Shuttle) taxiCo1.lookup("Shuttle #3");
        System.out.println(shuttle1.getDestination());
        Vehicle vel = taxiCo1.getNextVeicle(shuttle1.getDestination());
        if (vel instanceof Shuttle) {
            System.out.println("Funcionou");
        }

    }

    /**
     * Test for getNextVeicle when the destination is "Qualquer lugar".
     */
    public void testGetNextVeicle2(){
        Vehicle vel = taxiCo1.getNextVeicle("Qualquer lugar");
        if ( !(vel instanceof Shuttle) ) {
            System.out.println("Funcionou");
        }

    }

    /**
     * Test for getNextVeicle when the destination is "Qualquer lugar2".
     */
    public void testGetNextVeicle3(){
        taxiCo1.addTaxi();
        Vehicle vel = taxiCo1.getNextVeicle("Qualquer lugar2");
        if ( vel instanceof Taxi ) {
            System.out.println("Funcionou");
        }
    }

	public static void main(String[] args) {
		Helper helper = new Helper();

//        helper.testGetsSets();

		System.out.println("Primeiro teste");
		helper.testBook();
		
		System.out.println("Segundo teste");
		helper.testArrived();

        System.out.println("Terceiro teste");
        helper.testGetNextVeicle1();

        System.out.println("Quarto teste");
        helper.testGetNextVeicle2();

        System.out.println("Quinto teste");
        helper.testGetNextVeicle3();
	}
}


