import org.w3c.dom.ls.LSOutput;

import java.awt.*;
import java.util.Scanner;


public class DrawingMenu {
    public static void Rectangle(){
        int width, height;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width: ");
        width = sc.nextInt();
        System.out.println("Enter the height: ");
        height = sc.nextInt();
        for(int i = 0; i < height; i++ ) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void TriangleTopLeft(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height: ");
        int height = sc.nextInt();
        int i, j;
        for(i = height; i >= 1; i--){
            for(j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void TriangleTopRight(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height: ");
        int height = sc.nextInt();
        int i, j, s;
        for(i = 1; i <= height; i++){
            for(s = 1; s < i; s++) {
                System.out.print(" ");
            }
            for(j = 0; j <= height - s; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void TriangleBottomLeft(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height: ");
        int height = sc.nextInt();
        int i,j;
        for(i = 1; i <= height; i++){
            for(j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void TriangleBottomRight(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height: ");
        int height = sc.nextInt();
        int i, j, s;
        for(i = height; i >= 1; i--){
            for(s = 1; s < i; s++){
                System.out.print(" ");
            }
            for(j = 0; j <= height-s; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void IsoscelesTriangle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height: ");
        int height = sc.nextInt();
        int i = 0,s,j;
        while (height > 0){
            for (s = 1; s < height; s++) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (j = 0; j < i; j++) {
                System.out.print("*");
            }
            height--;
            i++;
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int choice = -1;
        Scanner sc = new Scanner(System.in);
        while (choice != 0){
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("1. Print the rectangle");
                    DrawingMenu rect = new DrawingMenu();
                    rect.Rectangle();
                    break;
                case 2:
                    System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
                    Scanner sc1 = new Scanner(System.in);
                    String choice2 = sc1.nextLine();
                    switch (choice2){
                        case "top-left":
                            System.out.println("Print the triangle top-left");
                            DrawingMenu topLeft = new DrawingMenu();
                            topLeft.TriangleTopLeft();
                            break;
                        case "top-right":
                            System.out.println("Print the triangle top-right");
                            DrawingMenu topRight = new DrawingMenu();
                            topRight.TriangleTopRight();
                            break;
                        case "bottom-left":
                            System.out.println("Print the triangle bottom-left");
                            DrawingMenu bottomLeft = new DrawingMenu();
                            bottomLeft.TriangleBottomLeft();
                            break;
                        case "bottom-right":
                            System.out.println("Print the triangle bottom-right");
                            DrawingMenu bottomRight = new DrawingMenu();
                            bottomRight.TriangleBottomRight();
                            break;
                    }
                case 3:
                    System.out.println("3. Print isosceles triangle");
                    DrawingMenu isoscelesTriangle = new DrawingMenu();
                    isoscelesTriangle.IsoscelesTriangle();
                    break;
                case 4:
                    System.exit(4);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}

