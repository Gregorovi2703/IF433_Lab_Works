package oop_00000105999_chaychinhendri.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- LIBRARY GREGOR ---")

    print("Masukkan Judul Buku: ")
    val bookTitle = scanner.nextLine()

    print("Masukkan Nama Peminjam: ")
    val borrower = scanner.nextLine()

    print("Masukkan Lama Pinjam (hari): ")
    var loanDuration = scanner.nextInt()

    scanner.nextLine()

    if (loanDuration <= 0) loanDuration = 1

    val loan = Loan(bookTitle, borrower, loanDuration)

    println("")
    println("--- DETAIL PEMINJAMAN ---")
    println("Judul Buku: $bookTitle")
    println("Nama Peminjam: $borrower")
    println("Lama Pinjam: $loanDuration hari")
    println("Total Denda: Rp${loan.calculateFine()}")
}