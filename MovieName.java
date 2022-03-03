//Write a Program to add and display movie names. Should add least 20 names
//Should add a movie name , if name is min 2 chars , and no special char except space and max of 40 chars 
class MovieName{
String[] movie=new String[20];
int index=0;

void addMoviesName(String movieNames)
{
	System.out.println("Here,i am adding the Movie Name is : "+movieNames);
	this.movie[index]=movieNames;
	index=index+1;
}
void displayNames()
{
	System.out.println("Here,displaying the movie names:");
	for(int i=0;i<movie.length;i++)
	{
		String movieNames=this.movie[i];
		System.out.println(movieNames);
	}
	
}
}