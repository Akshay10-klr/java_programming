package interfacepack;

interface Movie {            
	void movieDetails();
}

interface Actors extends Movie {    
	void castDetails();
}

interface Technicians extends Movie {
	void technicalDetails();
}

class ProductionDesign implements Technicians, Actors {  //class production design implents techician and actor
	public void technicalDetails() {                   //methods in both interfaces are defined
		System.out.println("Technical details");
	}

	public void castDetails() {
		System.out.println("details of the cast and crew");
	}

	public void movieDetails() {                        //since both interfaces are childeren of movie the methoid in movie also need to be defiend
		System.out.println("movie details");
	}
}

public class HybridNewExample {

	public static void main(String[] args) {

		ProductionDesign movie = new ProductionDesign();
		movie.castDetails();
		movie.technicalDetails();
		movie.movieDetails();

	}

}
