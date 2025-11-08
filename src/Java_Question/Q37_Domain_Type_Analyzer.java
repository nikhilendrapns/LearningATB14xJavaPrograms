package Java_Question;

import java.util.Scanner;

/*
Determine the Type of Website Based on Domain (.com, .org, .edu, etc.)
           :- take the Site URL input from the user
Example Scenarios
Input: example.com
Output: The website type is: Commercial website
Input: example.org
Output: The website type is: Non-profit organization
Input: example.edu
Output: The website type is: Educational institution
Input: example.gov
Output: The website type is: Government website
Input: example.net
Output: The website type is: Network-related website
Input: example.info
Output: The website type is: Informational website
Input: example.xyz
Output: The website type is: Unknown or other types of websites
*/

public class Q37_Domain_Type_Analyzer {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter website url");
            String url = sc.nextLine();

            String websiteType = "";

            if (url.endsWith(".com")) {
                websiteType = "Commercial website";
            } else if (url.endsWith(".org")) {
                websiteType = "Non-profit organization";
            } else if (url.endsWith(".edu")) {
                websiteType = "Educational institution";
            } else if (url.endsWith(".gov")) {
                websiteType = "Government website";
            } else if (url.endsWith(".net")) {
                websiteType = "Network-related website";
            } else if (url.endsWith(".info")) {
                websiteType = "Informational website";
            } else {
                System.out.println("Unknown or other types of websites ");
                System.exit(0);
            }
            System.out.println("The website type is: " + websiteType);
        }
    }

/*
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter website URL: ");
        String website = scanner.nextLine();
        String domain = website.split("\\.")[1];
        if (domain.equalsIgnoreCase("com")){
            System.out.println("The website type is: Commercial website");
        } else if (domain.equalsIgnoreCase("org")) {
            System.out.println("The website type is: Non-profit organization");
        }
        else if (domain.equalsIgnoreCase("edu")) {
            System.out.println("The website type is: Educational institution");
        }
        else if (domain.equalsIgnoreCase("gov")) {
            System.out.println("The website type is: Government institution");
        }
        else if (domain.equalsIgnoreCase("net")) {
            System.out.println("The website type is: Network-related institution");
        }
        else if (domain.equalsIgnoreCase("info")) {
            System.out.println("The website type is: Informational institution");
        }
        else if (domain.equalsIgnoreCase("xyz")) {
            System.out.println("The website type is: Unknown or other types of websites");
        }

    }
}
 */

/*
public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("enter website");
        String website=scn.next();

        if(website.contains("example.com")){
            System.out.println("The website type is: Commercial website");

        } else if (website.contains("example.org")) {
            System.out.println("The website type is: Non-profit organization");
        }
        else if (website.contains("example.edu")) {
            System.out.println("The website type is: Educational institution");
        }
        else if (website.contains("example.gov")) {
            System.out.println("The website type is: Government website");
        }
        else if (website.contains("example.net")) {
            System.out.println("The website type is: Network-related website");
        }
        else if (website.contains("example.info")) {
            System.out.println("The website type is: Informational website");
        }
        else if (website.contains("example.xyz")) {
            System.out.println("The website type is: Informational website");
        }

    }

}
 */

/*
  public static void main(String[] args) {
        //System.out.println("Try programiz.pro");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter URL: ");
        String urlString = sc.nextLine();
        String domainName = getDomainExtension(urlString);
        String domainType = determineWebsiteType(domainName);
        System.out.println("The website type is: "+domainType);
        sc.close();
    }

    public static String getDomainExtension(String urlString) {
        String[] parts = urlString.split("\\.");
        if(parts.length>0) return parts[parts.length -1];
        else return null;
    }

    public static String determineWebsiteType(String extension) {
        String lowerCaseExtension = extension.toLowerCase();

        switch (lowerCaseExtension) {
            case "com":
                return "Commercial website";
            case "org":
                return "Non-profit organization";
            case "edu":
                return "Educational institution";
            case "info":
                return "Informational website";
            case "net":
                return "Network-related website";
            default:
                return "Unknown or other types of websites";
        }
    }
}
 */

/*
public static void main(String[] args) {


Scanner sc = new Scanner(System.in);
	System.out.println("Enter the site URL like--> example.com");
	if (sc.hasNextLine())
        {
domaincheck(sc);
	}
            else System.out.println("Site URL cant be empty");

	sc.close();

	}

private static void domaincheck(Scanner sc) {
    // TODO Auto-generated method stub
    String input = sc.nextLine();
    String[] list= input.split("\\.");
    if (list.length< 2)
    {
        System.out.println("Please enter a valid URL");
    }
    else {
        String domain= list[(list.length)-1].toLowerCase();
        switch(domain)
        {
            case ("com"): System.out.println("The website type is: Commercial website"); break;
            case ("org"): System.out.println("The website type is: Non-profit organization");break;
            case("edu"): System.out.println("The website type is: Educational institution");break;
            case("gov"):System.out.println("The website type is: Government website");break;
            case("net"): System.out.println("The website type is: Network-related website");break;
            case("info"):System.out.println("The website type is: Informational website");break;
            default: System.out.println("The website type is: Unknown or other types of websites");break;
        }
    }


}

}
 */

/*
    public static void main(String[] args) {
        System.out.println("Enter the URL:");
        Scanner sc=new Scanner(System.in);
        String url=sc.nextLine();
        //split the string based on dot into string array
        String[] url_array=url.split("\\.");
        //System.out.println("How array looks like"+ Arrays.toString(url_array));
        switch (url_array[url_array.length-1].toLowerCase())
        {
            case "com":
                System.out.println("The website type is: Commercial website");
                break;
            case "org":
                System.out.println("The website type is: Non-profit organization");
                break;
            case "edu":
                System.out.println("The website type is: Educational institution");
                break;
            case "net":
                System.out.println("The website type is: Network-related website");
                break;
            case "gov":
                System.out.println("The website type is: Government website");
                break;
            case "info":
                System.out.println("The website type is: Informational website");
                break;
            default:
                System.out.println("The website type is: Unknown or other types of websites");
        }
    }
}
 */