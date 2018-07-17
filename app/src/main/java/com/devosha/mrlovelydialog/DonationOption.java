package com.devosha.mrlovelydialog;
/*
Our DonationOption class. represents a Donation choice by user.
 */
public class DonationOption {

    public final String description;
    public final String amount;

    public DonationOption(String amount, String description) {
        this.amount = amount;
        this.description = description;
    }

    @Override
    public String toString() {
        return "DonationOption{" +
                "description='" + description + '\'' +
                ", amount='" + amount + '\'' +
                '}';
    }
}
