package replits;

import java.util.Scanner;

public class replit_Assesment_3_2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int statusCode = scan.nextInt();
        switch (statusCode) {

                case 200:
                    System.out.println("OK");
                    break;
                case 401:
                    System.out.println("Unauthorized");
                    break;
                case 403:
                    System.out.println("Forbidden");
                    break;
                case 404:
                    System.out.println("Not Found");
                    break;
                case 500:
                    System.out.println("Internal Server Error");
                    break;

                default:
                    System.out.println("not supported status code");
            }

        }

    }

