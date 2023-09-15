package com.aleshamray.eight_kyu;
// https://www.codewars.com/kata/dna-to-rna-conversion

/*
    Deoxyribonucleic acid, DNA is the primary information storage molecule in biological systems. It is composed of four nucleic acid bases Guanine ('G'), Cytosine ('C'), Adenine ('A'), and Thymine ('T').
    Ribonucleic acid, RNA, is the primary messenger molecule in cells. RNA differs slightly from DNA its chemical structure and contains no Thymine. In RNA Thymine is replaced by another nucleic acid Uracil ('U').
    Create a funciton which translates a given DNA string into RNA.
*/

public class Bio {
  public String dnaToRna( String dna ) {
    return dna.replaceAll("T","U");
  }

  public static void main( String... args ) {
    System.out.println(new Bio().dnaToRna("GCAT") + " GCAU");
  }
}