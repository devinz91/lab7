package edu.luc.cs271.linkedstack;


import java.util.Scanner;
import java.util.Stack;

public class ReverseLines {

  public static void main(final String[] args) {
    // TODO read successive input lines until EOF, then print out in reverse order

    IStack<String> stack = new LinkedStack<>();

    final Scanner input = new Scanner(System.in);
    System.out.println("Enter a word by a single letter at a time. Once the word is finished, type 'EOF'");
    while (input.hasNextLine()) {

      final String line = input.nextLine();
      if (line.equals("EOF")) break;
      stack.push(line);
    }

    while(!stack.isEmpty()){
      System.out.println(stack.pop());
    }







  }
}
