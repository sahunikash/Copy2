package RegularExpressonnn;

public class StringRegex 
{
	public static void main(String[] args) 
	{
		String s = "nsdhiasdyhjksdykh ,.sadhu. nhddsaiu,blsad. biiasd7ho9g";
		String [] st = s.split("\\s");
		for(int i =0;i<st.length;i++)
		{
			System.out.println(st[i]);
		}
		
	}

}
