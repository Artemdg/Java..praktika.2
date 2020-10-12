package com.company;

public class TestAuthor {

    public static void main(String[] args) {
        Author author1 = new Author("Kirgizov", "kirgizov@war.piece", 'M');
        Author author2 = new Author("Rubtsov", "rubtsov@gulag.ussr", 'M');
        System.out.println(author1);
        System.out.println(author2);
    }
}