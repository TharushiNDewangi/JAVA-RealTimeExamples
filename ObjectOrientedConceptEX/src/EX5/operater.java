package EX5;
public class operater extends user implements calculation{
	protected int empnumber;
	protected String jobTitle;
	protected int NumOfDownlod;
	
	
	
	public operater(String name, String email, int empnumber, String jobTitle) 
	{
		super(name, email);
		this.empnumber = empnumber;
		this.jobTitle = jobTitle;
	}

	
	public void PrintDetails()
	{
		System.out.println("operater name is "+name);
		System.out.println("operater email is "+email);
		System.out.println("operater employee number is"+empnumber);
		System.out.println("operater designation is "+jobTitle);
		
		// TODO Auto-generated method stub
	}
	public void setNumOfDownlod(int numOfDownlod)
	{
		NumOfDownlod = numOfDownlod;
	}

	public void calcRevenus1(Artist a)
	{
		float tot = 0;
		float avg ;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<1;j++)
			{
				//System.out.print(a.SongList[i][j]+"\t");
				j++;
				int result = Integer.parseInt(a.SongList[i][1]);
				tot = (float)result+tot;
			}
			
		}
		avg =tot/a.NumberOfSongs;
		System.out.println("");
		System.out.println("Artist:"+a.name);
		//System.out.println("Album revenue is "+tot);
		//System.out.println("Album revenue is "+avg);
		System.out.println("Album revenue is LKR "+avg*NumOfDownlod);
		
	}

@Override
public void calcRevenus(Artist a) {
	// TODO Auto-generated method stub
	
}


public int getNumOfDownlod() {
	return NumOfDownlod;
}



}
