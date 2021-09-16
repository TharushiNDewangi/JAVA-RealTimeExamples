package EX5;

public class Artist extends user {
	protected String MusicGenre;
	protected int NumberOfSongs;
	protected String SongList[][];
	
	
	
	public Artist(String name, String email, String musicGenre, int numberOfSongs, String[][] songList) 
	{
		super(name, email);
		MusicGenre = musicGenre;
		NumberOfSongs = numberOfSongs;
		SongList = songList;
	}

    @Override
	public void PrintDetails() 
	{
		System.out.println("Artists name is "+name);
		System.out.println("Artists email is "+email);
		System.out.println("Artists music genre is"+MusicGenre);
		System.out.println("number of songs is "+NumberOfSongs);
		System.out.println("song List is ");
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<1;j++)
			{
				System.out.print(SongList[i][j]+"\t");
				j++;
				System.out.println(SongList[i][j]);
			}
			System.out.print("");
		}
		// TODO Auto-generated method stub
		
	}

}
