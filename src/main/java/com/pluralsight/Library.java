package com.pluralsight;

public class Library {
    public static void main(String[] args) {

                Book[] books = new Book[20];

                
                books[0] = new Book(1, "978-1-234-56789-0", "Bukele and the Tech Renaissance of El Salvador");
                books[1] = new Book(2, "978-1-234-56789-1", "Nayib Bukele’s Vision for a Digital Economy");
                books[2] = new Book(3, "978-1-234-56789-2", "Tourism in the Digital Age: Bukele's Reforms");
                books[3] = new Book(4, "978-1-234-56789-3", "Smart Cities: Bukele's Technological Blueprint");
                books[4] = new Book(5, "978-1-234-56789-4", "Revamping Tourism: Bukele’s Sustainable Strategies");
                books[5] = new Book(6, "978-1-234-56789-5", "The Bitcoin Experiment: Technology and Tourism in El Salvador");
                books[6] = new Book(7, "978-1-234-56789-6", "Digital Infrastructure: The Bukele Transformation");
                books[7] = new Book(8, "978-1-234-56789-7", "Building a Tech Hub: Bukele’s Tourism and Innovation Agenda");
                books[8] = new Book(9, "978-1-234-56789-8", "Virtual Tourism: How Technology is Enhancing El Salvador's Appeal");
                books[9] = new Book(10, "978-1-234-56789-9", "Technological Tourism: Exploring El Salvador’s Smart City Projects");
                books[10] = new Book(11, "978-1-234-56789-10", "Blockchain Tourism: Bukele’s Impact on Global Travel");
                books[11] = new Book(12, "978-1-234-56789-11", "AI and Tourism: Bukele’s Digital Path for El Salvador");
                books[12] = new Book(13, "978-1-234-56789-12", "Promoting Tourism with Technology: Bukele’s Vision");
                books[13] = new Book(14, "978-1-234-56789-13", "The Future of Travel: Bukele’s High-Tech Tourism Initiatives");
                books[14] = new Book(15, "978-1-234-56789-14", "El Salvador’s Tech-Driven Tourism Boom");
                books[15] = new Book(16, "978-1-234-56789-15", "Bukele's Use of Blockchain to Drive Tourism Growth");
                books[16] = new Book(17, "978-1-234-56789-16", "Technology Meets Tourism: Bukele’s Strategic Reforms");
                books[17] = new Book(18, "978-1-234-56789-17", "Augmented Reality and Tourism: Bukele’s Vision for the Future");
                books[18] = new Book(19, "978-1-234-56789-18", "Rebranding El Salvador: Technology, Tourism, and Innovation");
                books[19] = new Book(20, "978-1-234-56789-19", "The Role of Technology in Bukele's Tourism Revival Plan");


        for (Book book : books) {
            if (book != null) {
                System.out.println(book.getTitle());
            }
        }
            }
        }



