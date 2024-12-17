package compare;
import java.util.*;

	public class Moviemain {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Moviemain m=new Moviemain();
			MovieDataBase mdb=m.new MovieDataBase();
			
			while(true) {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter choice:\n1.Adding a new movie to the database\n2.Adding actor to movie\n3.Remove an actor from a movie\n4.Displaying all the movies in the database\n"
						+ "5.Displaying all actors of a movie\n6.Displaying all the unique actors in the entire database ");
				int choice=sc.nextInt();
				sc.nextLine();
			switch(choice){
				
				case 1:
					System.out.println("Enter Movie Title: ");
					String title=sc.nextLine();
					System.out.println("Enter Director name: ");
					String director=sc.nextLine();
					System.out.println("Enter release year: ");
					int releaseyear=sc.nextInt();
					sc.nextLine();
					/*System.out.println("Enter the actors: ");
					String actorName=sc.nextLine();
					System.out.println("Enter birth year: ");
					int birthYear=sc.nextInt();
					Actor actor=m.new Actor(actorName,birthYear);*/
					Movie newMovie=m.new Movie(title,director,releaseyear);
					//newMovie.getActorset().add(actor);
					mdb.addNewMovie(newMovie);
					break;
				case 2:
					System.out.println("Enter the movie: ");
					String newactmovie=sc.nextLine();
					System.out.println("Enter actor to be added: ");
					String actorname=sc.nextLine();
					System.out.println("Enter birth year:");
					int birthyear=sc.nextInt();
					sc.nextLine();
					Actor newactor=m.new Actor(actorname,birthyear);
					mdb.addActorToMovie(newactmovie,newactor);
					break;
				case 3:
					System.out.println("Enter the movie:");
					String remactmovie=sc.nextLine();
					System.out.println("Enter actor to be removed:");
					String remactorname=sc.nextLine();
					System.out.println("Enter birth year:");
					int rembirthyear=sc.nextInt();
					Actor remactor=m.new Actor(remactorname,rembirthyear);
					mdb.removeActor(remactmovie,remactor);
					break;
				case 4:
					System.out.println("Movies in the database:");
					mdb.allMovies();
					break;
				case 5:
					System.out.println("Enter the movie title:");
					title=sc.nextLine();
					System.out.println("Actors in the movie:");
					mdb.allActorMovie(title);
					break;
				case 6:
					System.out.println("Unique actors List:");
					mdb.allActorData();
					break;
					
			}

		}

	}

		class Actor{
			private String actorname;
			private int birthyear;
			public Actor(String actorname, int birthyear) {
				this.actorname=actorname;
				this.birthyear=birthyear;
			}
			public String getActorname() {
				return actorname;
			}
			public int getBirthyear() {
				return birthyear;
			}
			public void setActorname(String actorname) {
				this.actorname=actorname;
			}
			public void setBirthyear(int birthyear) {
				this.birthyear=birthyear;
			}
			public String toString() {
				return actorname+" ("+birthyear+")";
			}
			
		}
		
		
	class Movie{
		Actor actor;
		private String title;
		private String director;
		private int releaseyear;
		
		private Set<Actor> actorset=new HashSet<>();
		
		public Movie(String title,String director,int releaseyear) {
			super();
			this.title=title;
			this.director=director;
			this.releaseyear=releaseyear;
		}
		
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title=title;
		}
		public String getDirector() {
			return director;
		}
		public void setDirector(String director) {
			this.director=director;
		}
		public int getReleaseyear() {
			return releaseyear;
		}
		public void setReleaseyear(int releaseyear) {
			this.releaseyear=releaseyear;
		}
		public Set<Actor> getActorset(){
			return actorset;
		}
		public void setActorset(Set<Actor> actorset) {
			this.actorset=actorset;
		}
		public String toString() {
			return "Title: "+title+" ("+releaseyear+"), Directed by "+director;
		}
		
		
	}

	class MovieDataBase{
		Movie movie;
		Set<Movie> movieset=new HashSet<>();
		public MovieDataBase() {
			this.movie=movie;
		}
		//methods
		public void addNewMovie(Movie movie) {
			movieset.add(movie);
			System.out.println("Movie added: "+movie);
		}
		public void addActorToMovie(String newactmovie,Actor newactor) {
			for(Movie movie:movieset) {
			if(newactmovie.equals(movie.getTitle()))
				movie.getActorset().add(newactor);
			System.out.println("Actor "+newactor+" added to the movie "+movie.getTitle());
			}
			
		}
		public void removeActor(String remactmovie,Actor remactor) {
			for(Movie movie:movieset) {
				if(remactmovie.equals(movie.getTitle()))
					movie.getActorset().remove(remactor);
				System.out.println("Actor "+remactor+" removed to the movie "+movie.getTitle());
				}
				
		}
		public void allMovies() {
			for(Movie set:movieset) {
				System.out.println(set);
			}
		}
		public void allActorMovie(String title) {
			for(Movie set:movieset) {
				System.out.println(set.getActorset());
			}
		}
			
		public void allActorData() {
			List<String> ul=new LinkedList<>();
			for(Movie unique:movieset) {
				for(Actor actor:unique.getActorset()) {
					ul.add(actor.getActorname());
				}
			}
			for(String name:ul) {
				System.out.println(name);
			}
		}
		
	}
	}

