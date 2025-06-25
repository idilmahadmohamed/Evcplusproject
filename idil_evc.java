import java.util.Scanner;

public class idil_evc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int evcBalance = 500;          // Renamed from haraaga
        int bankBalance = 4000;        // Renamed from haraaga_Bangiga
        int bankAccount = 37614522;    // Renamed from account
        int merchantCode = 112266;     // Renamed from kaarka

        System.out.print("Garaac *770# si aad u ogaato macluumaad badan: ");
        String userInput = input.nextLine();
        String validCode = "*770#";
        if (userInput.equals(validCode)) {
            System.out.println("-EVCPLUS-");
            System.out.print("Fadlan geli PIN-Kaag (Enter PIN): ");
            int userPin = input.nextInt();
            int validPin = 8811;

            if (validPin == userPin) {
                System.out.println("\nEVCPlus");
                System.out.println("1. Itus Haraaga");
                System.out.println("2. Kaarka hadalka");
                System.out.println("3. Bixi Biil");
                System.out.println("4. U wareeji EVCPlus");
                System.out.println("5. Warbixin Kooban");
                System.out.println("6. Salaam Bank");
                System.out.println("7. Maareynta");
                System.out.println("8. TAAJ");
                System.out.println("9. Bill Payment");

                System.out.print("Fadlan dooro: ");
                int mainChoice = input.nextInt();

                switch (mainChoice) {
                    case 1:
                        System.out.println("<-EVCPlus-> Haraagaagu waa $" + evcBalance);
                        break;

                    case 2:
                        System.out.println("Kaarka hadalka:");
                        System.out.println("1. ku shubo Airtime");
                        System.out.println("2. ugu shub Airtime");
                        System.out.println("3. MIFI Packages");
                        System.out.println("4. ku shubo internet");
                        System.out.println("5. ugu shub qof kale (MMT)");

                        int airtimeChoice = input.nextInt();
                        if (airtimeChoice < 1 || airtimeChoice > 5) {
                            System.out.println("Fadlan dooro number-ka saxda ah");
                            break;
                        }

                        switch (airtimeChoice) {
                            case 1:
                                System.out.print("Fadlan geli lacagta: ");
                                int rechargeAmount = input.nextInt();
                                if (rechargeAmount <= 0) {
                                    System.out.println("Qalad: lacag sax ah geli.");
                                } else if (rechargeAmount > evcBalance) {
                                    System.out.println("Haraagaagu kuma filna.");
                                } else {
                                    System.out.println("Ma hubtaa inaad $" + rechargeAmount + " ku shubto?");
                                    System.out.println("1. Haa\n2. Maya");
                                    int confirm = input.nextInt();
                                    if (confirm == 1) {
                                        evcBalance -= rechargeAmount;
                                        System.out.println("Waxaad ku shubatay $" + rechargeAmount + ". Haraagaagu waa $" + evcBalance);
                                    } else {
                                        System.out.println("Mahadsanid!");
                                    }
                                }
                                break;

                            case 2:
                                System.out.print("Fadlan geli mobile-ka: ");
                                String recipientPhone = input.next();
                                System.out.print("Fadlan geli lacagta: ");
                                int transferAmount = input.nextInt();
                                if (transferAmount <= 0) {
                                    System.out.println("Qalad: lacag sax ah geli.");
                                } else if (transferAmount > evcBalance) {
                                    System.out.println("Haraagaagu kuma filna.");
                                } else {
                                    System.out.println("Ma hubtaa inaad $" + transferAmount + " ugu shubtid " + recipientPhone + "?");
                                    System.out.println("1. Haa\n2. Maya");
                                    int confirm = input.nextInt();
                                    if (confirm == 1) {
                                        evcBalance -= transferAmount;
                                        System.out.println("Waxaad $" + transferAmount + " ugu shubtay " + recipientPhone + ". Haraagaagu waa $" + evcBalance);
                                    } else {
                                        System.out.println("Mahadsanid!");
                                    }
                                }
                                break;

                            case 3:
                                System.out.println("MIFI Packages:");
                                System.out.println("1. ku shubo data-da MIFI");
                                int mifiOption = input.nextInt();
                                if (mifiOption != 1) {
                                    System.out.println("Fadlan dooro number-ka saxda ah");
                                    break;
                                }

                                int packageType = 0;
                                for (int attempts = 0; attempts < 5 && (packageType < 1 || packageType > 3); attempts++) {
                                    System.out.println("--Internet Bundle Recharge--");
                                    System.out.println("1. Isbuucle (weekly)");
                                    System.out.println("2. Maalinle (daily)");
                                    System.out.println("3. Bille (MIFI)");
                                    packageType = input.nextInt();
                                    if (packageType < 1 || packageType > 3) {
                                        if (attempts < 4) {
                                            System.out.println("Fadlan dooro number-ka saxda ah ");
                                        } else {
                                            System.out.println("waxaad gaaratay inta ku noqosho laguu ogalaa, fadlan dib usoo gal");
                                            return;
                                        }
                                    }
                                }

                                if (packageType == 1) {
                                    int weeklyBundle = 0;
                                    for (int attempts = 0; attempts < 5 && (weeklyBundle < 1 || weeklyBundle > 2); attempts++) {
                                        System.out.println("1. $5 = 10GB");
                                        System.out.println("2. $10 = 25GB");
                                        weeklyBundle = input.nextInt();
                                        if (weeklyBundle < 1 || weeklyBundle > 2) {
                                            if (attempts < 4) {
                                                System.out.println("Fadlan dooro number-ka saxda ah ");
                                            } else {
                                                System.out.println("waxaad gaaratay inta ku noqosho laguu ogalaa, fadlan dib usoo gal");
                                                return;
                                            }
                                        }
                                        input.nextLine();
                                    }
                                    System.out.print("Fadlan geli MIFI user: ");
                                    String mifiUser = input.nextLine();

                                    if (weeklyBundle == 1 && evcBalance >= 5) {
                                        System.out.println("ma hubtaa in aad $5 ogu shubtay user mifi " + mifiUser);
                                        System.out.println("1.haa\n2.maya");
                                        int confirm1 = input.nextInt();
                                        if (confirm1 == 1) {
                                            evcBalance -= 5;
                                            System.out.println("Waxaad $5 ugu shubtay user mifi " + mifiUser + ". Haraagaagu waa $" + evcBalance);
                                        } else if (confirm1 == 2) {
                                            System.out.println("Mahadsanid!.");
                                        } else {
                                            System.out.println("lambar sax soo geli ");
                                        }
                                    } else if (weeklyBundle == 2 && evcBalance >= 10) {
                                        System.out.println("ma hubtaa in aad $10 ogu shubtay user mifi " + mifiUser);
                                        System.out.println("1.haa\n2.maya");
                                        int confirm1 = input.nextInt();
                                        if (confirm1 == 1) {
                                            evcBalance -= 10;
                                            System.out.println("Waxaad $10 ugu shubtay user mifi " + mifiUser + ". Haraagaagu waa $" + evcBalance);
                                        } else if (confirm1 == 2) {
                                            System.out.println("Mahadsanid!.");
                                        } else {
                                            System.out.println("lambar sax soo geli ");
                                        }
                                    } else {
                                        System.out.println("Haraagaagu kuma filna.");
                                    }
                                } else if (packageType == 2) {
                                    int dailyBundle = 0;
                                    for (int attempts = 0; attempts < 5 && (dailyBundle < 1 || dailyBundle > 2); attempts++) {
                                        System.out.println("1. $1 = 2GB");
                                        System.out.println("2. $2 = 5GB");
                                        dailyBundle = input.nextInt();
                                        input.nextLine();
                                        if (dailyBundle < 1 || dailyBundle > 2) {
                                            if (attempts < 4) {
                                                System.out.println("Fadlan dooro number-ka saxda ah ");
                                            } else {
                                                System.out.println("waxaad gaaratay inta ku noqosho laguu ogalaa, fadlan dib usoo gal");
                                                return;
                                            }
                                        }
                                    }
                                    System.out.print("Fadlan geli MIFI user: ");
                                    String mifiUser = input.nextLine();
                                    if (dailyBundle == 1 && evcBalance >= 1) {
                                        System.out.println("ma hubtaa in aad $1 ogu shubtay user mifi " + mifiUser);
                                        System.out.println("1.haa\n2.maya");
                                        int confirm1 = input.nextInt();
                                        if (confirm1 == 1) {
                                            evcBalance -= 1;
                                            System.out.println("Waxaad $1 ugu shubtay user mifi " + mifiUser + ". Haraagu waa $" + evcBalance);
                                        } else if (confirm1 == 2) {
                                            System.out.println("Mahadsanid!.");
                                        } else {
                                            System.out.println("lambar sax soo geli ");
                                        }
                                    } else if (dailyBundle == 2 && evcBalance >= 2) {
                                        System.out.println("ma hubtaa in aad $2 ogu shubtay user mifi " + mifiUser);
                                        System.out.println("1.haa\n2.maya");
                                        int confirm1 = input.nextInt();
                                        if (confirm1 == 1) {
                                            evcBalance -= 2;
                                            System.out.println("Waxaad $2 ugu shubtay user mifi " + mifiUser + ". Haraagu waa $" + evcBalance);
                                        } else if (confirm1 == 2) {
                                            System.out.println("Mahadsanid!.");
                                        } else {
                                            System.out.println("lambar sax soo geli ");
                                        }
                                    } else {
                                        System.out.println("Haraagaagu kuma filna.");
                                    }
                                } else if (packageType == 3) {
                                    int mifiBundle = 0;
                                    for (int attempts = 0; attempts < 5 && (mifiBundle < 1 || mifiBundle > 4); attempts++) {
                                        System.out.println("1. $20 = 40 GB");
                                        System.out.println("2. $40 = 85 GB");
                                        System.out.println("3. $60 = 150 GB");
                                        System.out.println("4. $25 = Monthly Unlimit");
                                        mifiBundle = input.nextInt();
                                        if (mifiBundle < 1 || mifiBundle > 4) {
                                            if (attempts < 4) {
                                                System.out.println("Fadlan dooro number-ka saxda ah )");
                                            } else {
                                                System.out.println("waxaad gaaratay inta ku noqosho laguu ogalaa, fadlan dib usoo gal");
                                                return;
                                            }
                                        }
                                        input.nextLine();
                                    }

                                    System.out.print("Fadlan geli MIFI user: ");
                                    String mifiUser = input.nextLine();

                                    int bundleCost = 0;
                                    switch (mifiBundle) {
                                        case 1:
                                            bundleCost = 20;
                                            break;
                                        case 2:
                                            bundleCost = 40;
                                            break;
                                        case 3:
                                            bundleCost = 60;
                                            break;
                                        case 4:
                                            bundleCost = 25;
                                            break;
                                        default:
                                            System.out.println("Doorasho khaldan.");
                                            break;
                                    }

                                    if (evcBalance >= bundleCost) {
                                        System.out.println("Ma hubtaa inaad $" + bundleCost + " ugu shubtid user mifi " + mifiUser + "?");
                                        System.out.println("1. Haa\n2. Maya");
                                        int confirm1 = input.nextInt();
                                        if (confirm1 == 1) {
                                            evcBalance -= bundleCost;
                                            System.out.println("Waxaad $" + bundleCost + " ugu shubtay user mifi " + mifiUser + ". Haraagaagu waa $" + evcBalance);
                                        } else if (confirm1 == 2) {
                                            System.out.println("Mahadsanid!.");
                                        } else {
                                            System.out.println("Lambar sax ah geli.");
                                        }
                                    } else {
                                        System.out.println("Haraagaagu kuma filna.");
                                    }
                                }
                                break;

                            case 4:
                                int internetOption = 0;
                                for (int attempts = 0; attempts < 5 && (internetOption < 1 || internetOption > 5); attempts++) {
                                    System.out.println("1.isbuucle(weekly)");
                                    System.out.println("2.TIME BASED PACKAGES");
                                    System.out.println("3.DATA");
                                    System.out.println("4.Maalinlee(daily)");
                                    System.out.println("5.Bille(MIFI)");
                                    internetOption = input.nextInt();
                                    if (internetOption < 1 || internetOption > 5) {
                                        if (attempts < 4) {
                                            System.out.println("Fadlan dooro number-ka saxda ah");
                                        } else {
                                            System.out.println("waxaad gaaratay inta ku noqosho laguu ogalaa, fadlan dib usoo gal");
                                            return;
                                        }
                                    }
                                }

                                System.out.print("Fadlan geli lacagta: ");
                                int internetAmount = input.nextInt();
                                if (internetAmount <= 0) {
                                    System.out.println("Qalad: lacag sax ah geli.");
                                } else if (internetAmount > evcBalance) {
                                    System.out.println("Haraagaagu kuma filna.");
                                } else {
                                    System.out.println("Ma hubtaa inaad $" + internetAmount + " ku shubatid?");
                                    System.out.println("1. Haa\n2. Maya");
                                    int confirm1 = input.nextInt();
                                    if (confirm1 == 1) {
                                        evcBalance -= internetAmount;
                                        System.out.println("Waxaad ku shubtay $" + internetAmount + ". Haraagaagu waa $" + evcBalance);
                                    } else if (confirm1 == 2) {
                                        System.out.println("Mahadsanid!");
                                    } else {
                                        System.out.println("Qalad: dooro 1 ama 2");
                                    }
                                }
                                break;

                            case 5:
                                System.out.println("Fadlan geli mobile-ka: ");
                                String mmtRecipient = input.next();
                                System.out.print("Fadlan geli lacagta: ");
                                int mmtAmount = input.nextInt();
                                if (mmtAmount <= 0) {
                                    System.out.println("Qalad: lacag sax ah geli.");
                                } else if (mmtAmount > evcBalance) {
                                    System.out.println("Haraagaagu kuma filna.");
                                } else {
                                    System.out.println("Ma hubtaa inaad $" + mmtAmount + " ugu shubtid " + mmtRecipient + "?");
                                    System.out.println("1. Haa\n2. Maya");
                                    int confirm1 = input.nextInt();
                                    if (confirm1 == 1) {
                                        evcBalance -= mmtAmount;
                                        System.out.println("Waxaad $" + mmtAmount + " ugu shubtay " + mmtRecipient + ". Haraagaagu waa $" + evcBalance);
                                    } else if (confirm1 == 2) {
                                        System.out.println("Mahadsanid!");
                                    } else {
                                        System.out.println("Qalad: dooro 1 ama 2");
                                    }
                                }
                                break;
                        }
                        break;

                    case 3:
                        System.out.println("Bixi Biil");
                        System.out.println("1. Post Paid");
                        System.out.println("2. Ku libso");
                        int billOption = input.nextInt();
                        if (billOption < 1 || billOption > 2) {
                            System.out.println("Fadlan dooro number sax ah");
                            break;
                        }

                        switch (billOption) {
                            case 1:
                                System.out.println("Post Paid\n" +
                                        "1. Ogow Biilka\n" +
                                        "2. Bixi Biil\n" +
                                        "3. Ka Bixi Biil");
                                int postPaidChoice = input.nextInt();
                                if (postPaidChoice < 1 || postPaidChoice > 3) {
                                    System.out.println("Fadlan dooro number sax ah");
                                    break;
                                }
                                input.nextLine();
                                if (postPaidChoice == 1) {
                                    System.out.println("Biilkaagu waa $25.00");
                                } else if (postPaidChoice == 2) {
                                    System.out.print("Fadlan Geli Lacagta: ");
                                    String billAmount = input.nextLine();
                                    System.out.println("Ma Hubtaa inaad bixisid bill lacagtiisu tahay: " + billAmount + "$?");
                                    System.out.println("1. Haa");
                                    System.out.println("2. Maya");
                                    postPaidChoice = input.nextInt();
                                    input.nextLine();
                                    if (postPaidChoice == 1) {
                                        System.out.println("Waxaad bixisay bill lacagtiisu tahay: " + billAmount + "$");
                                    } else {
                                        System.out.println("Mahadsanid!.");
                                    }
                                } else if (postPaidChoice == 3) {
                                    System.out.print("Fadlan Geli Mobile-ka: ");
                                    String phoneNumber = input.nextLine();
                                    System.out.print("Fadlan Geli Lacagta: ");
                                    int paidAmount = input.nextInt();
                                    System.out.println("Ma Hubtaa inaad bixisid bill lacagtiisu tahay:  " + paidAmount + "$" + " " +
                                            "oo laga rabo tel no " + phoneNumber + "?");
                                    System.out.println("1. Haa");
                                    System.out.println("2. Maya");
                                    postPaidChoice = input.nextInt();
                                    input.nextLine();
                                    if (postPaidChoice == 1) {
                                        System.out.println("Waxaad bixisay bill lacagtiisu tahay: " + paidAmount + "$" + " " +
                                                "Una dirtay tel no " + phoneNumber);
                                    } else {
                                        System.out.println("Mahadsanid!.");
                                    }
                                }
                                break;
                            case 2:
                                System.out.print("Fadlan Geli aqoonsiga ganacsiga: ");
                                int enteredMerchantCode = input.nextInt();
                                if (enteredMerchantCode == merchantCode) {
                                    System.out.print("Fadlan soo geli lacagta: ");
                                    int paymentAmount = input.nextInt();
                                    if (paymentAmount <= 0) {
                                        System.out.println("Qalad: lacag sax ah geli.");
                                    } else if (paymentAmount > evcBalance) {
                                        System.out.println("Haraagaagu kuma filna.");
                                    } else {
                                        System.out.println("ma hubtaa inaad wax ku iibsatay " + paymentAmount + "$");
                                        System.out.println("1. Haa");
                                        System.out.println("2. Maya");
                                        int conf = input.nextInt();
                                        if (conf == 1) {
                                            evcBalance -= paymentAmount;
                                            System.out.println("lacagtaa waxa ayad ku iibsatay " + paymentAmount + "$. Haraagu waa " + evcBalance + "$");
                                        } else {
                                            System.out.println("Mahadsanid!");
                                        }
                                    }
                                } else {
                                    System.out.println("Aqoonsiga ganacsiga waa khalad");
                                }
                                break;
                        }
                        break;

                    case 4:
                        System.out.print("Fadlan Geli Mobile-ka: ");
                        String transferRecipient = input.next();
                        System.out.print("Fadlan Geli Lacagta: ");
                        int transferValue = input.nextInt();
                        if (transferValue <= 0) {
                            System.out.println("Qalad: lacag sax ah geli.");
                        } else if (transferValue > evcBalance) {
                            System.out.println("Haraagaagu kuma filna.");
                        } else {
                            System.out.println("Ma Hubtaa inaad $" + transferValue + " U wareejisid " + transferRecipient + "?");
                            System.out.println("1. Haa");
                            System.out.println("2. Maya");
                            int confirmTransfer = input.nextInt();
                            if (confirmTransfer == 1) {
                                evcBalance -= transferValue;
                                System.out.println("Waxaad $" + transferValue + " U wareejisay " + transferRecipient + ". Haraagaagu waa $" + evcBalance);
                            } else {
                                System.out.println("Mahadsanid!.");
                            }
                        }
                        break;

                    case 5:
                        System.out.println("Warbixin Kooban");
                        System.out.println("1. Last Action");
                        System.out.println("2. Wareejintii u dambsay");
                        System.out.println("3. libsashadii u dambeysay");
                        System.out.println("4. Last 3 Actions");
                        System.out.println("5. Email Me My ACtivity");

                        int reportChoice = input.nextInt();
                        if (reportChoice < 1 || reportChoice > 5) {
                            System.out.println("Fadlan dooro number sax ah ");
                            break;
                        }
                        switch (reportChoice) {
                            case 1:
                                System.out.println("$20 Ayaad u wareejisay 252612600202, Taariikh: 10/06/2025");
                                break;
                            case 2:
                                System.out.println("Wareejintii u dambeysay:");
                                System.out.println("1.U dirtay");
                                System.out.println("2.kaheshay");
                                int transferType = input.nextInt();
                                if (transferType == 1) {
                                    System.out.println("$.25 Ayaad u wareejisay 252612600202, Taariikh: 13/06/2025");
                                } else if (transferType == 2) {
                                    System.out.println("operation succeeded No Transactions to display!");
                                }
                                break;
                            case 3:
                                int merchantAuth = 0;
                                for (int attempts = 0; attempts < 5 && merchantAuth != merchantCode; attempts++) {
                                    System.out.println("Fadlan Geli aqoonsiga ganacsiga: ");
                                    merchantAuth = input.nextInt();
                                    if (merchantAuth != merchantCode) {
                                        System.out.println("Invalid input format(dataType)");
                                    }
                                    if (attempts == 4 && merchantAuth != merchantCode) {
                                        System.out.println("waxaad gaaratay inta ku noqosho laguu ogalaa, fadlan dib usoo gal");
                                        return;
                                    }
                                }
                                System.out.println("Fadlan soo geli lacagta: ");
                                int purchaseAmount = input.nextInt();
                                if (purchaseAmount <= evcBalance) {
                                    System.out.println("Mahubtaa inaad ku iibsato " + "$" + purchaseAmount + "?");
                                    System.out.println("1. Haa");
                                    System.out.println("2. Maya");
                                    int confirm = input.nextInt();
                                    if (confirm == 1) {
                                        evcBalance -= purchaseAmount;
                                        System.out.println("Waad ku iibsatay" + " Lacag Dhan $" + purchaseAmount + " " +
                                                "Haraagaagu waa $" + evcBalance);
                                    } else if (confirm == 2) {
                                        System.out.println("Mahadsanid!.");
                                    } else {
                                        System.out.println("Mahadsanid!.");
                                    }
                                } else {
                                    System.out.println("Haraaga xisaabtaada Kuguma filna");
                                }
                                break;
                            case 4:
                                System.out.println("Last 3 Actions:");
                                System.out.println("1. 25$ -> 252634567890 - Ayaad u dirtay - Taariikhda markay ahayd: 09/06/2025 ");
                                System.out.println("2. 10$ -> 252612345678 - Ayaad u dirtay Taariikhda Markey ahayd: 05/06/2025");
                                System.out.println("3. 5$ airtime - Ayaad ogu shubtay - Taariikhda Markey ahayd: 03/06/2025");
                                break;
                            case 5:
                                input.nextLine();
                                System.out.println("5. Email Me My ACtivity");
                                System.out.print("Fadlan Geli email kaaga: ");
                                String userEmail = input.nextLine();
                                if (!userEmail.contains("@") || !userEmail.contains(".")) {
                                    System.out.println("Email-ka aad gelisay ma ahan mid sax ah!");
                                    break;
                                }
                                System.out.print("Fadlan Geli taarikhda hore (MAALIN/BISHA/SANAD, e.g:01/04/2017): ");
                                String startDate = input.nextLine();
                                System.out.print("Fadlan Geli taarikhda danbe (MAALIN/BISHA/SANAD, e.g:30/04/2017): ");
                                String endDate = input.nextLine();

                                System.out.println("Your request is being processed and the activity will be emailed to " + userEmail);
                                break;
                        }
                        break;

                    case 6:
                        System.out.println("Salaam Bank");
                        System.out.println("1. Itus Haraaga");
                        System.out.println("2. Lacag dhigasho");
                        System.out.println("3. Lacag qaadasho");
                        System.out.println("4. Ka Wareeji EVCPlus");
                        System.out.println("5. Ka Wareeji Account-kaga");
                        System.out.println("6. Hubi wareejin account");
                        System.out.println("7. Maareynta Bankiga");
                        System.out.println("8. Kala Bax");

                        System.out.print("Fadlan dooro: ");
                        int bankService = input.nextInt();

                        switch (bankService) {
                            case 1:
                                System.out.println("Koontadaada Bangiga: 65467843 Haraageedu waa: " + bankBalance + " USD");
                                System.out.println("IBAN: SO 45 0007 108 500065467843");
                                break;
                            case 2:
                                System.out.print("Fadlan Geli Lacagta: ");
                                int depositAmount = input.nextInt();
                                if (depositAmount <= 0) {
                                    System.out.println("Qalad: lacag sax ah geli.");
                                    break;
                                }
                                int depositInfo = 0;
                                for (int attempts = 0; attempts < 5 && depositInfo != depositAmount; attempts++) {
                                    System.out.println("Fadlan Geli Macluumaad ");
                                    depositInfo = input.nextInt();
                                    if (depositInfo != depositAmount) {
                                        if (attempts < 4) {
                                            System.out.println("Invalid input format(dataType)");
                                        } else {
                                            System.out.println("waxaad gaaratay inta ku noqosho laguu ogalaa, fadlan dib usoo gal");
                                            return;
                                        }
                                    }
                                }
                                int enteredPin = 0;
                                int bankPin = 123456;
                                for (int attempts = 0; attempts < 5 && bankPin != enteredPin; attempts++) {
                                    System.out.println("Fadlan Geli Numberkaaga sirta ee Bangiga");
                                    enteredPin = input.nextInt();
                                    if (bankPin != enteredPin) {
                                        if (attempts < 4) {
                                            System.out.println("Invalid input format(length)");
                                        } else {
                                            System.out.println("waxaad gaaratay inta ku noqosho laguu ogalaa, fadlan dib usoo gal");
                                            return;
                                        }
                                    }
                                }

                                if (depositInfo == depositAmount) {
                                    System.out.println("Ma hubtaa inaad $" + depositAmount + " dhigatid Account-kaaga bangiga?");
                                    System.out.println("1. Haa");
                                    System.out.println("2. Maya");
                                    int confirm = input.nextInt();
                                    long accountNumber = 210365467843L;
                                    if (bankBalance < depositAmount) {
                                        System.out.println("Haraaga koontadan " + accountNumber + "kuma filna");
                                        return;
                                    }
                                    if (confirm == 1) {
                                        bankBalance -= depositAmount;
                                        System.out.println("Waxaad $" + depositAmount + " dhigatay Account-kaaga bangiga");
                                        System.out.println("Haraagaagu waa $" + bankBalance);
                                    } else {
                                        System.out.println("Mahadsanid!");
                                    }
                                } else {
                                    System.out.println("Macluumaadka lacagta waa khalad");
                                }
                                break;
                            case 3:
                                System.out.print("Fadlan Geli Lacagta: ");
                                int withdrawalAmount = input.nextInt();
                                if (withdrawalAmount <= 0) {
                                    System.out.println("Qalad: lacag sax ah geli.");
                                    break;
                                }
                                int withdrawalInfo = 0;
                                for (int attempts = 0; attempts < 5 && withdrawalInfo != withdrawalAmount; attempts++) {
                                    System.out.println("Fadlan Geli Macluumaad ");
                                    withdrawalInfo = input.nextInt();
                                    if (withdrawalInfo != withdrawalAmount) {
                                        if (attempts < 4) {
                                            System.out.println("Invalid input format(dataType)");
                                        } else {
                                            System.out.println("waxaad gaaratay inta ku noqosho laguu ogalaa, fadlan dib usoo gal");
                                            return;
                                        }
                                    }
                                }

                                enteredPin = 0;
                                bankPin = 123456;
                                for (int attempts = 0; attempts < 5 && bankPin != enteredPin; attempts++) {
                                    System.out.println("Fadlan Geli Numberkaaga sirta ee Bangiga");
                                    enteredPin = input.nextInt();
                                    if (bankPin != enteredPin) {
                                        if (attempts < 4) {
                                            System.out.println("Invalid input format(length)");
                                        } else {
                                            System.out.println("waxaad gaaratay inta ku noqosho laguu ogalaa, fadlan dib usoo gal");
                                            return;
                                        }
                                    }
                                }

                                if (withdrawalInfo == withdrawalAmount) {
                                    System.out.println("Ma hubtaa inaad $" + withdrawalAmount + " ka qaadatid Account-kaaga bangiga?");
                                    System.out.println("1. Haa");
                                    System.out.println("2. Maya");
                                    int confirm = input.nextInt();
                                    long accountNumber = 210365467843L;
                                    if (bankBalance < withdrawalAmount) {
                                        System.out.println("Haraaga koontadan " + accountNumber + "kuma filna");
                                        return;
                                    }
                                    if (bankBalance < withdrawalAmount) {
                                        System.out.println("Haraaga xisaabtaada kuguma filna");
                                        return;
                                    }
                                    if (confirm == 1) {
                                        bankBalance -= withdrawalAmount;
                                        System.out.println("Waxaad $" + withdrawalAmount + " ka qaadatay Account-kaaga bangiga");
                                        System.out.println("Haraagaagu waa $" + bankBalance);
                                    } else {
                                        System.out.println("Mahadsanid!");
                                    }
                                } else {
                                    System.out.println("Macluumaadka lacagta waa khalad");
                                }
                                break;
                            case 4:
                                System.out.println("Fadlan dooro xisaabta Bangiga\n" +
                                        "1. SALAAM SOMALI BANK\n" +
                                        "2. Salaam Sch\n" +
                                        "3. Bank Beeraha\n" +
                                        "4. Darasalaam Bank\n" +
                                        "5. MyBank LTD");

                                int bankSelection = input.nextInt();
                                int accountNumber = 37614522;
                                long bankDetails = 210337614522L;

                                if (bankSelection >= 1 && bankSelection <= 5) {
                                    System.out.println("Fadlan Geli Account-ka:");
                                    int inputAccount = input.nextInt();

                                    if (inputAccount != accountNumber) {
                                        System.out.println("Fadlan Geli account sax ah");
                                        return;
                                    }

                                    long inputDetails = 0L;
                                    boolean validDetails = false;

                                    for (int attempts = 0; attempts < 5; attempts++) {
                                        System.out.println("Fadlan Geli Macluumaad:");
                                        inputDetails = input.nextLong();

                                        if (inputDetails == bankDetails) {
                                            validDetails = true;
                                            break;
                                        } else {
                                            if (attempts < 4) {
                                                System.out.println("Invalid input format (dataType)");
                                            } else {
                                                System.out.println("Waxaad gaaratay inta ku noqosho laguu ogalaa, fadlan dib usoo gal");
                                                return;
                                            }
                                        }
                                    }

                                    if (validDetails) {
                                        System.out.println("Fadlan Geli lacagta:");
                                        int bankTransferAmount = input.nextInt();
                                        bankBalance = 5000; // sample initial balance

                                        if (bankBalance < bankTransferAmount) {
                                            System.out.println("Haraaga koontadan " + accountNumber + " kuma filna.");
                                            return;
                                        }

                                        System.out.println("Ma hubtaa inaad $" + bankTransferAmount +
                                                " u wareejiso Bank Account ABDIWALI ABDULLAHI GULED (65467843)?\n" +
                                                "1. Haa\n" +
                                                "2. Maya");
                                        int confirm = input.nextInt();

                                        if (confirm == 1) {
                                            bankBalance -= bankTransferAmount;
                                            System.out.println("Waxaad $" + bankTransferAmount +
                                                    " u wareejisay Bank Account ABDIWALI ABDULLAHI GULED (65467843)");
                                            System.out.println("Haraagaagu cusub waa $" + bankBalance);
                                        } else {
                                            System.out.println("Mahadsanid");
                                        }
                                    }

                                } else {
                                    System.out.println("Number sax ah soo dooro");
                                }
                                break;

                            case 5:
                                System.out.print("Fadlan Geli Account ama  mobile: ");
                                int recipientAccount = input.nextInt();
                                if (recipientAccount != 37614522 && recipientAccount != 252612600202L) {
                                    System.out.println("Invalid Account Number.");
                                    return;
                                }
                                System.out.println("Fadlan Geli lacagta:");
                                int accountTransferAmount = input.nextInt();

                                int transferDetails = 0;
                                int attempts = 0;
                                for (attempts = 0; attempts < 5 && transferDetails != accountTransferAmount; attempts++) {
                                    System.out.println("Fadlan geli macluumaad:");
                                    transferDetails = input.nextInt();

                                    if (transferDetails != accountTransferAmount) {
                                        System.out.println("Macluumaadka aad gelisay waa khalad.");
                                    }

                                    if (attempts == 4 && transferDetails != accountTransferAmount) {
                                        System.out.println("waxaad gaaratay inta ku noqosho laguu ogalaa, fadlan dib usoo gal");
                                        return;
                                    }
                                }
                                int storedBankPin = 224488;
                                int bankAuthPin = 0;
                                for (attempts = 0; attempts < 5 && bankAuthPin != storedBankPin; attempts++) {
                                    System.out.println("Fadlan Geli Numberkaaga sirta ee Bangiga:");
                                    bankAuthPin = input.nextInt();

                                    if (bankAuthPin != storedBankPin) {
                                        System.out.println("Fadlan iska hubi number sireedka aad isticmaashay ee Bangiga.");
                                    }

                                    if (attempts == 4 && bankAuthPin != storedBankPin) {
                                        System.out.println("waxaad gaaratay inta ku noqosho laguu ogalaa, fadlan dib usoo gal");
                                        return;
                                    }
                                }

                                System.out.println("Ma hubtaa inaad USD" + accountTransferAmount +
                                        " u wareejiso Bank Account: SHARMAKE ALI AHMED(" + recipientAccount + ")?\n" +
                                        "1. Haa\n" +
                                        "2. Maya");
                                int confirm1 = input.nextInt();
                                if (bankBalance < accountTransferAmount) {
                                    System.out.println("Haraaga koontadan" + " " + bankAccount + " " + "kuma filna.");
                                    return;
                                }
                                if (confirm1 == 1) {
                                    if (bankBalance >= accountTransferAmount) {
                                        bankBalance -= accountTransferAmount;
                                        System.out.println("Waxaad USD" + accountTransferAmount +
                                                " u wareejisay Bank Account:  SHARMAKE ALI AHMED (" + bankAccount + ")");
                                        System.out.println("Haraagaagu cusub waa USD" + bankBalance);
                                    } else {
                                        System.out.println("Haraaga koontadan kuma filna.");
                                    }
                                } else {
                                    System.out.println("Mahadsanid");
                                }
                                break;

                            case 6:
                                int validOTP = 210;
                                System.out.println("Fadlan Geli OPT");
                                int userOTP = input.nextInt();
                                if (validOTP == userOTP) {
                                    System.out.println("Ma hubtaa in aad aqbasho lacag diridan\n1. Haa \n2. Maya");
                                    int confirm2 = input.nextInt();
                                    if (confirm2 == 1)
                                        System.out.println("Waad ku guulaysatay in aad ku dirto lacagta Account to Account");
                                    else
                                        System.out.println("Mahadsanid!");
                                } else {
                                    System.out.println("OTP not found");
                                }
                                break;
                            case 7:
                                System.out.println("Maareynta Bankiga");
                                System.out.println("1. Bedel PIN-ka Bangiga Number");
                                System.out.println("2. Bedel Passwordka Ebank");
                                int manageChoice = input.nextInt();

                                if (manageChoice == 1) {
                                    int oldBankPin = 2200;
                                    System.out.println("Fadlan Geli Numberkaaga sirta ee Bangiga");
                                    int currentPin = input.nextInt();

                                    if (currentPin != oldBankPin) {
                                        System.out.println("Fadlan iska hubi number sireed ka aad isticmaashay ee bangiga");
                                        break;
                                    }

                                    System.out.print("Fadlan geli PIN-ka Cusub: ");
                                    int newBankPin = input.nextInt();
                                    System.out.println("Hubi PIN-kaaga cusub:");
                                    int confirmPin = input.nextInt();

                                    if (newBankPin == oldBankPin) {
                                        System.out.println("Fadlan iska hubi Number sireed ka cusub inuusan la mid ahayn Number sireed kaagi hore ee bangiga");
                                    } else {

                                        attempts = 0;
                                        while (newBankPin != confirmPin && attempts < 4) {
                                            attempts++;

                                            System.out.println("IMPUT MISMATCH" +
                                                    " Hubi PIN-kaaga cusub:");
                                            confirmPin = input.nextInt();
                                        }

                                        if (newBankPin == confirmPin) {
                                            System.out.println("<-EVCPlus-> Waad ku guulaysatay in aad badesho PIN-kaaga Bangiga");
                                        } else {
                                            System.out.println("Waxaad gaartay tirada isku dayga ugu badan. Fadlan dib usoo gal.");
                                            return;
                                        }
                                    }

                                } else if (manageChoice == 2) {
                                    int oldBankPin = 2200;
                                    System.out.println("Fadlan Geli Numberkaaga sirta ee Bangiga");
                                    int currentPin = input.nextInt();

                                    if (currentPin != oldBankPin) {
                                        System.out.println("Fadlan iska hubi number sireed ka aad isticmaashay ee bangiga");
                                        break;
                                    }

                                    System.out.print("Fadlan geli PIN-ka Cusub: ");
                                    int newBankPin = input.nextInt();
                                    System.out.println("Hubi PIN-kaaga cusub:");
                                    int confirmPin = input.nextInt();

                                    if (newBankPin == oldBankPin) {
                                        System.out.println("Fadlan iska hubi Numer sireed ka cusub inuusan la mid ahayn Number sireed kaagi hore ee bangiga");
                                    } else {

                                        attempts = 0;
                                        while (newBankPin != confirmPin && attempts < 4) {
                                            attempts++;

                                            System.out.println("IMPUT MISMATCH\n" +
                                                    " Hubi PIN-kaaga cusub:");
                                            confirmPin = input.nextInt();
                                        }

                                        if (newBankPin == confirmPin) {
                                            System.out.println("<-EVCPlus-> Waad ku guulaysatay in aad badesho PIN-kaaga Bangiga");
                                        } else {
                                            System.out.println("Waxaad gaartay tirada isku dayga ugu badan. Fadlan dib usoo gal.");
                                            return;
                                        }
                                    }
                                } else {
                                    System.out.println("Doorasho khaldan");
                                }
                                break;


                            case 8:
                                int withdrawalCode = 1234;
                                int enteredWithdrawalCode = 0;

                                for ( attempts = 0; attempts < 5 && enteredWithdrawalCode != withdrawalCode; attempts++) {
                                    System.out.println("Fadlan Geli aqoonsiga codsiga: ");
                                    enteredWithdrawalCode = input.nextInt();
                                    if (enteredWithdrawalCode != withdrawalCode) {
                                        System.out.println("Invalid input format(dataType)");
                                    }
                                    if (attempts == 4 && enteredWithdrawalCode != withdrawalCode) {
                                        System.out.println("waxaad gaaratay inta ku noqosho laguu ogalaa, fadlan dib usoo gal");
                                        return;
                                    }
                                    if (enteredWithdrawalCode == withdrawalCode) {
                                        System.out.println("fadlan geli lacagta");
                                        int withdrawalValue = input.nextInt();
                                        System.out.println("Mahubtaa inaad kala baxdid $" + withdrawalValue + "?");
                                        System.out.println("1.Haa");
                                        System.out.println("2.Maya");
                                        int confirm = input.nextInt();
                                        if (confirm == 1) {
                                            System.out.println("Waxaad kala baxday $" + withdrawalValue);
                                        }
                                    }
                                }
                        }break;
                    case 7:
                        System.out.println("Maareynta\n" +
                                "1. Bedel lambarka sirta ah\n" +
                                "2. Bedel Luqadda\n" +
                                "3. Wargelin Mobile Lumay\n" +
                                "4. Lacag Xirasho\n" +
                                "5. U celi lacag qaldantay");
                        int managementChoice = input.nextInt();
                        if (managementChoice < 1 || managementChoice > 5) {
                            System.out.println("Fadlan dooro lambar sax ah ");
                            break;
                        }
                        if (managementChoice == 1) {
                            System.out.println("Fadlan Geli PIN-kaaga cusub");
                            int newPin = input.nextInt();
                            int confirmPin = 0;
                            for (int attempts = 0; attempts < 5 && confirmPin != newPin; attempts++) {
                                System.out.println("Hubi PIN-kaaga cusub");
                                confirmPin = input.nextInt();
                                if (confirmPin != newPin) {
                                    System.out.println("Invalid input format(length)");
                                }
                                if (attempts == 4 && confirmPin != newPin) {
                                    System.out.println("waxaad gaaratay inta ku noqosho laguu ogalaa, fadlan dib usoo gal");
                                    return;

                                } else if (confirmPin == newPin) {
                                    System.out.println("Waad badashay PINKA macmaiil");
                                    break;
                                }
                            }
                        } else if (managementChoice == 2) {
                            int languageChoice = 0;
                            while (languageChoice < 1 || languageChoice > 2) {
                                System.out.println();
                                System.out.println("Fadlan dooro luqada\n" +
                                        "1. English\n" +
                                        "2. Somali");
                                languageChoice = input.nextInt();
                                if (languageChoice < 1 || languageChoice > 2) {
                                    System.out.println(" ");
                                }


                                if (languageChoice == 1) {
                                    System.out.println("<-EVCPlus- > You have successfully changed\n" +
                                            "your language");
                                } else if (languageChoice == 2) {
                                    System.out.println("<-EVCPlus- > You have successfully changed\n" +
                                            "your language");
                                } else if (managementChoice == 3) {
                                    System.out.println("Fadlan Geli Mobileka Lumay");
                                    int lostPhone = input.nextInt();
                                    System.out.println("Fadlan Geli Numberkiisa Sirta ah");
                                    int lostPhonePin = input.nextInt();
                                    System.out.println("Ma hubtaa in aad u diiwaan Geliso lumid number-kan" + " " + lostPhone + "?\n" +
                                            "1.Haa\n" +
                                            "2.Maya");
                                    int confirm = input.nextInt();
                                    if (confirm == 1) {
                                        System.out.println("Waad Diwaan galisay lumid number - kan" + " " + lostPhone);
                                    } else {
                                        System.out.println("Mahadsanid");
                                        break;
                                    }

                                } else if (managementChoice == 4) {
                                    System.out.println("Fadlan Geli number-ka khalad-ka ah");
                                    int wrongNumber = input.nextInt();
                                    System.out.println("Fadlan Geli number-kii loo rabay");
                                    int correctNumber = input.nextInt();
                                    System.out.println("Ma hubtaa in aad xirto lacagtan?\n" +
                                            "1. Haa\n" +
                                            "2. Maya");
                                    int confirm = input.nextInt();
                                    if (confirm == 1) {
                                        System.out.println("Waad xirtay lacagtaan");
                                    } else {
                                        System.out.println("Mahadsanid");
                                        break;
                                    }


                                } else if (managementChoice == 5) {
                                    System.out.println("Fadlan Geli aqoonsiga lacag diridda");
                                    int transferId = input.nextInt();
                                    System.out.println("Fadlan Geli Macluumaad");
                                    int transferInfo = input.nextInt();
                                    System.out.println("Ma hubtaa in aad celiso lacagta?\n" +
                                            "1. Haa\n" +
                                            "2. Maya");
                                    int confirm = input.nextInt();
                                    if (confirm == 1) {
                                        System.out.println("Waad celisay lacagtan");
                                    } else {
                                        System.out.println("Mahadsanid");
                                        break;
                                    }
                                }
                            }
                        }

                    case 8:
                        System.out.println("TAAJ\n" +
                                "1. Gudaha\n" +
                                "2. Dibadda\n" +
                                "3. Ogoow Khidmada\n" +
                                "4. Macluumadka xawaaladda\n" +
                                "5. Jooji Xawaaladda\n" +
                                "6. Fur Xawaaladda\n");
                        int taajService = input.nextInt();
                        if (taajService < 1 || taajService > 6) {
                            System.out.println("Fadlan dooro number sax ah");
                        }
                        if (taajService == 1) {
                            System.out.println("Fadlan dooro shirkada\n" +
                                    "1. E-KAAFI\n" +
                                    "2. E-SAHAL");
                            int companyChoice = input.nextInt();
                            input.nextLine();
                            if (companyChoice == 1) {
                                System.out.println("Fadlan Geli Taleefanka qaataha");
                                int recipientPhone = input.nextInt();
                                input.nextLine();

                                System.out.println("Fadlan Geli Magaca qaataha oo seddexan");
                                // Rest of the code continues with the same pattern...
                            }
                        }
                }
            }
        }
    }
}