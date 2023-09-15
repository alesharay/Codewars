package com.aleshamray.seven_kyu;

// https://www.codewars.com/kata/complementary-dna/train/java

/*
    Deoxyribonucleic acid (DNA) is a chemical found in the nucleus of cells and carries the "instructions" for the development and functioning of living organisms.

    If you want to know more http://en.wikipedia.org/wiki/DNA

    In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G". You have function with one side of the DNA (string, except for Haskell); you need to get the other complementary side. DNA strand is never empty or there is no DNA at all (again, except for Haskell).

    More similar exercise are found here http://rosalind.info/problems/list-view/ (source)

    DnaStrand.makeComplement("ATTGC") // return "TAACG"

    DnaStrand.makeComplement("GTAT") // return "CATA"
*/

public class DnaStrand {
  public static void main(String... args) {
    System.out.println();
    System.out.println("Expected: TTTT --- Received: "  + DnaStrand.makeComplement("AAAA"));
    System.out.println("Expected: TAACG --- Received: " + DnaStrand.makeComplement("ATTGC"));
    System.out.println("Expected: CATA --- Received: "  + DnaStrand.makeComplement("GTAT"));
    System.out.println();
  }
  
  public static String makeComplement(String dna) {
      String result = "";
      for (String c : dna.split("")) {
          switch(c.toUpperCase()) {
              case "A": result += "T"; break;
              case "T": result += "A"; break;
              case "C": result += "G"; break;
              case "G": result += "C"; break;
          }
      }
    return result;
  }
}