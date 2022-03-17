package DifferentPatterns;

import java.util.Scanner;

public class GOPatterns {
    
    Scanner scanner = new Scanner(System.in);
    int patternChoice;
    
    int givenRow;
    int givenColumn;
    int givenSquare;
    
    public GOPatterns() {
        
        prompt();
        
    }
    
    public void prompt() {
        
        System.out.println("Please choose your desired choice.");
        System.out.println(""
                + "\t[1] Right Triangle"
                + "\n\t[2] Square"
                + "\n\t[3] Halo Square"
                + "\n\t[4] Square with + pattern."
                + "\n\t[5] Square with x pattern."
                + "\n\t[6] Square with + and x pattern."
                + "\n\t[111] End program.");
        
        System.out.print("\nEnter choice: ");
        patternChoice = Integer.parseInt(scanner.nextLine());
        
        if(patternChoice == 111) {
            System.exit(0);
        }
        
        if(patternChoice >= 0 && patternChoice <= 10) {
            
            System.out.println();
            switch(patternChoice) {
                case (1):
                    getROWandorCOLUMN();
                    triangle();
                    break;
                case (2):
                    getROWandorCOLUMN();
                    square();
                    break;
                case (3):
                    
                    break;
                case (4):
                    
                    break;
                case (5):
                    
                    break;
        }
            
        } else {
            prompt();
        }
        
    }
    
    public void getROWandorCOLUMN() {
        
        switch(patternChoice) {
            case (1):
                System.out.print("Enter row: ");
                givenRow = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter column: ");
                givenColumn = Integer.parseInt(scanner.nextLine());
                break;
            case (2):
                System.out.print("Enter size: ");
                givenSquare = Integer.parseInt(scanner.nextLine());
                break;
            case (3):
                
                break;
            case (4):
                
                break;
            case (5):
                
                break;
        }
        
    }
    
    public void triangle() {
        
        for(int a = 0; a < givenRow; a++) {
            for(int b = 0; b <= a; b++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        System.out.println();
        prompt();
        
    }
    
    public void square() {
        
        for(int a = 0; a < givenSquare; a++) {
            for(int b = 0; b < givenSquare; b++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        System.out.println();
        prompt();
        
    }
    
    public static void main(String[] args) {
        
        new GOPatterns();
        
    }
}