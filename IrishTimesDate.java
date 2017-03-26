import java.io.*;
import java.util.*;
import java.net.URL;

class IrishTimesDate
{
	public static void main(String[] args)
	{
		try
		{
			URL url = new URL("http://www.irishtimes.com/");
			Scanner sc = new Scanner(new InputStreamReader(url.openStream()));
			while(sc.hasNextLine())
			{
				String tmp1 = sc.findInLine("<div class=\"date\">..., ... .., ....</div>");
				String tmp2 = sc.findInLine("<div class=\"date\">..., ... ., ....</div>");
				if(tmp1 != null)
				{
					tmp1 = tmp1.substring(18, 35);
					System.out.println(tmp1);
					break;
				}
				else if(tmp2 != null)
				{
					tmp2 = tmp2.substring(18, 34);
					System.out.println(tmp2);
					break;
				}
				sc.nextLine();
			}
			sc.close();
		} catch (Exception outE)
		{
			outE.printStackTrace();
		}
	}
}
