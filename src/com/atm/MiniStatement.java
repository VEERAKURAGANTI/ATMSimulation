package com.atm;

import java.util.List;
import java.util.ArrayList;
public class MiniStatement {
      Scanner sc=new Scanner(System.in);
    private List<String> transactions;

    public MiniStatement() {
        transactions = new ArrayList<>();
    }

    public void addTransaction(String message) {
        transactions.add(message);
    }

    public void showMiniStatement() {
        if (transactions.isEmpty()) {
            System.out.println("No transactions available");
        } else {
            System.out.println("\n--- Mini Statement ---");
            for (String txn : transactions) {
                System.out.println(txn);
            }
        }
    }
}
