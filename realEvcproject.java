import java.util.Scanner;

public class realEvcproject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int haraaga = 500;
        int haraaga_Bangiga = 4000;
        int account = 37614522;
        int kaarka = 112266;

        System.out.print("Garaac *770# si aad u ogaato macluumaad badan: ");
        String user = input.nextLine();
        String num = "*770#";
        if (user.equals(num)) {
            System.out.println("-EVCPLUS-");
            System.out.print("Fadlan geli PIN-Kaag (Enter PIN): ");
            int userPin = input.nextInt();
            int pin = 2021;

            if (pin == userPin) {
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
                int choice = input.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("<-EVCPlus-> Haraagaagu waa $" + haraaga);
                        break;

                    case 2:
                        System.out.println("Kaarka hadalka:");
                        System.out.println("1. ku shubo Airtime");
                        System.out.println("2. ugu shub Airtime");
                        System.out.println("3. MIFI Packages");
                        System.out.println("4. ku shubo internet");
                        System.out.println("5. ugu shub qof kale (MMT)");

                        int mid_dooro = input.nextInt();
                        if (mid_dooro < 1 || mid_dooro > 5) {
                            System.out.println("Fadlan dooro number-ka saxda ah");
                            break;
                        }

                        switch (mid_dooro) {
                            case 1:
                                System.out.print("Fadlan geli lacagta: ");
                                int amount = input.nextInt();
                                if (amount <= 0) {
                                    System.out.println("Qalad: lacag sax ah geli.");
                                } else if (amount > haraaga) {
                                    System.out.println("Haraagaagu kuma filna.");
                                } else {
                                    System.out.println("Ma hubtaa inaad $" + amount + " ku shubto?");
                                    System.out.println("1. Haa\n2. Maya");
                                    int confirm = input.nextInt();
                                    if (confirm == 1) {
                                        haraaga -= amount;
                                        System.out.println("Waxaad ku shubatay $" + amount + ". Haraagaagu waa $" + haraaga);
                                    } else {
                                        System.out.println("Mahadsanid!");
                                    }
                                }
                                break;

                            case 2:
                                System.out.print("Fadlan geli mobile-ka: ");
                                String mobile = input.next();
                                System.out.print("Fadlan geli lacagta: ");
                                int Amount = input.nextInt();
                                if (Amount <= 0) {
                                    System.out.println("Qalad: lacag sax ah geli.");
                                } else if (Amount > haraaga) {
                                    System.out.println("Haraagaagu kuma filna.");
                                } else {
                                    System.out.println("Ma hubtaa inaad $" + Amount + " ugu shubtid " + mobile + "?");
                                    System.out.println("1. Haa\n2. Maya");
                                    int confirm = input.nextInt();
                                    if (confirm == 1) {
                                        haraaga -= Amount;
                                        System.out.println("Waxaad $" + Amount + " ugu shubtay " + mobile + ". Haraagaagu waa $" + haraaga);
                                    } else {
                                        System.out.println("Mahadsanid!");
                                    }
                                }
                                break;

                            case 3:
                                System.out.println("MIFI Packages:");
                                System.out.println("1. ku shubo data-da MIFI");
                                int mifi = input.nextInt();
                                if (mifi != 1) {
                                    System.out.println("Fadlan dooro number-ka saxda ah");
                                    break;
                                }

                                int dooro = 0;
                                for (int attempts = 0; attempts < 5 && (dooro < 1 || dooro > 3); attempts++) {
                                    System.out.println("--Internet Bundle Recharge--");
                                    System.out.println("1. Isbuucle (weekly)");
                                    System.out.println("2. Maalinle (daily)");
                                    System.out.println("3. Bille (MIFI)");
                                    dooro = input.nextInt();
                                    if (dooro < 1 || dooro > 3) {
                                        if (attempts < 4) {
                                            System.out.println("Fadlan dooro number-ka saxda ah ");
                                        } else {
                                            System.out.println("waxaad gaaratay inta ku noqosho laguu ogalaa, fadlan dib usoo gal");
                                            return;
                                        }
                                    }
                                }

                                if (dooro == 1) {
                                    int bundle = 0;
                                    for (int attempts = 0; attempts < 5 && (bundle < 1 || bundle > 2); attempts++) {
                                        System.out.println("1. $5 = 10GB");
                                        System.out.println("2. $10 = 25GB");
                                        bundle = input.nextInt();
                                        if (bundle < 1 || bundle > 2) {
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

                                    if (bundle == 1 && haraaga >= 5) {
                                        System.out.println("ma hubtaa in aad $5 ogu shubtay user mifi " + mifiUser);
                                        System.out.println("1.haa\n2.maya");
                                        int confirm1 = input.nextInt();
                                        if (confirm1 == 1) {
                                            haraaga -= 5;
                                            System.out.println("Waxaad $5 ugu shubtay user mifi " + mifiUser + ". Haraagaagu waa $" + haraaga);
                                        } else if (confirm1 == 2) {
                                            System.out.println("Mahadsanid!.");
                                        } else {
                                            System.out.println("lambar sax soo geli ");
                                        }
                                    } else if (bundle == 2 && haraaga >= 10) {
                                        System.out.println("ma hubtaa in aad $10 ogu shubtay user mifi " + mifiUser);
                                        System.out.println("1.haa\n2.maya");
                                        int confirm1 = input.nextInt();
                                        if (confirm1 == 1) {
                                            haraaga -= 10;
                                            System.out.println("Waxaad $10 ugu shubtay user mifi " + mifiUser + ". Haraagaagu waa $" + haraaga);
                                        } else if (confirm1 == 2) {
                                            System.out.println("Mahadsanid!.");
                                        } else {
                                            System.out.println("lambar sax soo geli ");
                                        }
                                    } else {
                                        System.out.println("Haraagaagu kuma filna.");
                                    }
                                } else if (dooro == 2) {
                                    int bundle = 0;
                                    for (int attempts = 0; attempts < 5 && (bundle < 1 || bundle > 2); attempts++) {
                                        System.out.println("1. $1 = 2GB");
                                        System.out.println("2. $2 = 5GB");
                                        bundle = input.nextInt();
                                        input.nextLine();
                                        if (bundle < 1 || bundle > 2) {
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
                                    if (bundle == 1 && haraaga >= 1) {
                                        System.out.println("ma hubtaa in aad $1 ogu shubtay user mifi " + mifiUser);
                                        System.out.println("1.haa\n2.maya");
                                        int confirm1 = input.nextInt();
                                        if (confirm1 == 1) {
                                            haraaga -= 1;
                                            System.out.println("Waxaad $1 ugu shubtay user mifi " + mifiUser + ". Haraagu waa $" + haraaga);
                                        } else if (confirm1 == 2) {
                                            System.out.println("Mahadsanid!.");
                                        } else {
                                            System.out.println("lambar sax soo geli ");
                                        }
                                    } else if (bundle == 2 && haraaga >= 2) {
                                        System.out.println("ma hubtaa in aad $2 ogu shubtay user mifi " + mifiUser);
                                        System.out.println("1.haa\n2.maya");
                                        int confirm1 = input.nextInt();
                                        if (confirm1 == 1) {
                                            haraaga -= 2;
                                            System.out.println("Waxaad $2 ugu shubtay user mifi " + mifiUser + ". Haraagu waa $" + haraaga);
                                        } else if (confirm1 == 2) {
                                            System.out.println("Mahadsanid!.");
                                        } else {
                                            System.out.println("lambar sax soo geli ");
                                        }
                                    } else {
                                        System.out.println("Haraagaagu kuma filna.");
                                    }
                                } else if (dooro == 3) {
                                    int bundle = 0;
                                    for (int attempts = 0; attempts < 5 && (bundle < 1 || bundle > 4); attempts++) {
                                        System.out.println("1. $20 = 40 GB");
                                        System.out.println("2. $40 = 85 GB");
                                        System.out.println("3. $60 = 150 GB");
                                        System.out.println("4. $25 = Monthly Unlimit");
                                        bundle = input.nextInt();
                                        if (bundle < 1 || bundle > 4) {
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

                                    int cost = 0;
                                    switch (bundle) {
                                        case 1:
                                            cost = 20;
                                            break;
                                        case 2:
                                            cost = 40;
                                            break;
                                        case 3:
                                            cost = 60;
                                            break;
                                        case 4:
                                            cost = 25;
                                            break;
                                        default:
                                            System.out.println("Doorasho khaldan.");
                                            break;
                                    }

                                    if (haraaga >= cost) {
                                        System.out.println("Ma hubtaa inaad $" + cost + " ugu shubtid user mifi " + mifiUser + "?");
                                        System.out.println("1. Haa\n2. Maya");
                                        int confirm1 = input.nextInt();
                                        if (confirm1 == 1) {
                                            haraaga -= cost;
                                            System.out.println("Waxaad $" + cost + " ugu shubtay user mifi " + mifiUser + ". Haraagaagu waa $" + haraaga);
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
                                int middooro = 0;
                                for (int attempts = 0; attempts < 5 && (middooro < 1 || middooro > 5); attempts++) {
                                    System.out.println("1.isbuucle(weekly)");
                                    System.out.println("2.TIME BASED PACKAGES");
                                    System.out.println("3.DATA");
                                    System.out.println("4.Maalinlee(daily)");
                                    System.out.println("5.Bille(MIFI)");
                                    middooro = input.nextInt();
                                    if (middooro < 1 || middooro > 5) {
                                        if (attempts < 4) {
                                            System.out.println("Fadlan dooro number-ka saxda ah");
                                        } else {
                                            System.out.println("waxaad gaaratay inta ku noqosho laguu ogalaa, fadlan dib usoo gal");
                                            return;
                                        }
                                    }
                                }

                                System.out.print("Fadlan geli lacagta: ");
                                int lacagta = input.nextInt();
                                if (lacagta <= 0) {
                                    System.out.println("Qalad: lacag sax ah geli.");
                                } else if (lacagta > haraaga) {
                                    System.out.println("Haraagaagu kuma filna.");
                                } else {
                                    System.out.println("Ma hubtaa inaad $" + lacagta + " ku shubatid?");
                                    System.out.println("1. Haa\n2. Maya");
                                    int confirm1 = input.nextInt();
                                    if (confirm1 == 1) {
                                        haraaga -= lacagta;
                                        System.out.println("Waxaad ku shubtay $" + lacagta + ". Haraagaagu waa $" + haraaga);
                                    } else if (confirm1 == 2) {
                                        System.out.println("Mahadsanid!");
                                    } else {
                                        System.out.println("Qalad: dooro 1 ama 2");
                                    }
                                }
                                break;

                            case 5:
                                System.out.println("Fadlan geli mobile-ka: ");
                                String tel = input.next();
                                System.out.print("Fadlan geli lacagta: ");
                                int lacag = input.nextInt();
                                if (lacag <= 0) {
                                    System.out.println("Qalad: lacag sax ah geli.");
                                } else if (lacag > haraaga) {
                                    System.out.println("Haraagaagu kuma filna.");
                                } else {
                                    System.out.println("Ma hubtaa inaad $" + lacag + " ugu shubtid " + tel + "?");
                                    System.out.println("1. Haa\n2. Maya");
                                    int confirm1 = input.nextInt();
                                    if (confirm1 == 1) {
                                        haraaga -= lacag;
                                        System.out.println("Waxaad $" + lacag + " ugu shubtay " + tel + ". Haraagaagu waa $" + haraaga);
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
                        int middoro = input.nextInt();
                        if (middoro < 1 || middoro > 2) {
                            System.out.println("Fadlan dooro number sax ah");
                            break;
                        }

                        switch (middoro) {
                            case 1:
                                System.out.println("Post Paid\n" +
                                        "1. Ogow Biilka\n" +
                                        "2. Bixi Biil\n" +
                                        "3. Ka Bixi Biil");
                                int confirm = input.nextInt();
                                if (confirm < 1 || confirm > 3) {
                                    System.out.println("Fadlan dooro number sax ah");
                                    break;
                                }
                                input.nextLine();
                                if (confirm == 1) {
                                    System.out.println("Biilkaagu waa $25.00");
                                } else if (confirm == 2) {
                                    System.out.print("Fadlan Geli Lacagta: ");
                                    String amount = input.nextLine();
                                    System.out.println("Ma Hubtaa inaad bixisid bill lacagtiisu tahay: " + amount + "$?");
                                    System.out.println("1. Haa");
                                    System.out.println("2. Maya");
                                    confirm = input.nextInt();
                                    input.nextLine();
                                    if (confirm == 1) {
                                        System.out.println("Waxaad bixisay bill lacagtiisu tahay: " + amount + "$");
                                    } else {
                                        System.out.println("Mahadsanid!.");
                                    }
                                } else if (confirm == 3) {
                                    System.out.print("Fadlan Geli Mobile-ka: ");
                                    String number = input.nextLine();
                                    System.out.print("Fadlan Geli Lacagta: ");
                                    int amount = input.nextInt();
                                    System.out.println("Ma Hubtaa inaad bixisid bill lacagtiisu tahay:  " + amount + "$" + " " +
                                            "oo laga rabo tel no " + number + "?");
                                    System.out.println("1. Haa");
                                    System.out.println("2. Maya");
                                    confirm = input.nextInt();
                                    input.nextLine();
                                    if (confirm == 1) {
                                        System.out.println("Waxaad bixisay bill lacagtiisu tahay: " + amount + "$" + " " +
                                                "Una dirtay tel no " + number);
                                    } else {
                                        System.out.println("Mahadsanid!.");
                                    }
                                }
                                break;
                            case 2:
                                System.out.print("Fadlan Geli aqoonsig ganacsiga: ");
                                int aqoonsig = input.nextInt();
                                if (aqoonsig == kaarka) {
                                    System.out.print("Fadlan soo geli lacagta: ");
                                    int lacagta1 = input.nextInt();
                                    if (lacagta1 <= 0) {
                                        System.out.println("Qalad: lacag sax ah geli.");
                                    } else if (lacagta1 > haraaga) {
                                        System.out.println("Haraagaagu kuma filna.");
                                    } else {
                                        System.out.println("ma hubtaa inaad wax ku iibsatay " + lacagta1 + "$");
                                        System.out.println("1. Haa");
                                        System.out.println("2. Maya");
                                        int conf = input.nextInt();
                                        if (conf == 1) {
                                            haraaga -= lacagta1;
                                            System.out.println("lacagtaa waxa ayad ku iibsatay " + lacagta1 + "$. Haraagu waa " + haraaga + "$");
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
                        String number = input.next();
                        System.out.print("Fadlan Geli Lacagta: ");
                        int amount = input.nextInt();
                        if (amount <= 0) {
                            System.out.println("Qalad: lacag sax ah geli.");
                        } else if (amount > haraaga) {
                            System.out.println("Haraagaagu kuma filna.");
                        } else {
                            System.out.println("Ma Hubtaa inaad $" + amount + " U wareejisid " + number + "?");
                            System.out.println("1. Haa");
                            System.out.println("2. Maya");
                            int confirm5 = input.nextInt();
                            if (confirm5 == 1) {
                                haraaga -= amount;
                                System.out.println("Waxaad $" + amount + " U wareejisay " + number + ". Haraagaagu waa $" + haraaga);
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

                        int warbixin_kooban = input.nextInt();
                        if (warbixin_kooban < 1 || warbixin_kooban > 5) {
                            System.out.println("Fadlan dooro number sax ah ");
                            break;
                        }
                        switch (warbixin_kooban) {
                            case 1:
                                System.out.println("$50 Ayaad u wareejisay 252616468331, Taariikh: 24/6/2025");
                                break;
                            case 2:
                                System.out.println("Wareejintii u dambeysay:");
                                System.out.println("1.U dirtay");
                                System.out.println("2.kaheshay");
                                int wareejinta = input.nextInt();
                                if (wareejinta == 1) {
                                    System.out.println("$1Ayaad u wareejisay 252616468331, Taariikh: 24/6/2025");
                                } else if (wareejinta == 2) {
                                    System.out.println("operation succeeded No Transactions to display!");
                                }
                                break;
                            case 3:
                                amount = 0;
                                for (int attempts = 0; attempts < 5 && amount != kaarka; attempts++) {
                                    System.out.println("Fadlan Geli aqoonsiga ganacsiga: ");
                                    amount = input.nextInt();
                                    if (amount != kaarka) {
                                        System.out.println("Invalid input format(dataType)");
                                    }
                                    if (attempts == 4 && amount != kaarka) {
                                        System.out.println("waxaad gaaratay inta ku noqosho laguu ogalaa, fadlan dib usoo gal");
                                        return;
                                    }
                                }
                                System.out.println("Fadlan soo geli lacagta: ");
                                int Lacagta = input.nextInt();
                                if (Lacagta <= haraaga) {
                                    System.out.println("Mahubtaa inaad ku iibsato " + "$" + Lacagta + "?");
                                    System.out.println("1. Haa");
                                    System.out.println("2. Maya");
                                    int confirm = input.nextInt();
                                    if (confirm == 1) {
                                        haraaga -= Lacagta;
                                        System.out.println("Waad ku iibsatay" + " Lacag Dhan $" + Lacagta + " " +
                                                "Haraagaagu waa $" + haraaga);
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
                                System.out.println("1. 25$ -> 252616463149 - Ayaad u dirtay - Taariikhda markay ahayd:24/6/2025 ");
                                System.out.println("2. 10$ -> 252616463149 - Ayaad u dirtay Taariikhda Markey ahayd: 05/06/2025");
                                System.out.println("3. 5$ airtime - Ayaad ogu shubtay - Taariikhda Markey ahayd: 24/6/2025");
                                break;
                            case 5:
                                input.nextLine();
                                System.out.println("5. Email Me My ACtivity");
                                System.out.print("Fadlan Geli email kaaga: ");
                                String email = input.nextLine();
                                if (!email.contains("@") || !email.contains(".")) {
                                    System.out.println("Email-ka aad gelisay ma ahan mid sax ah!");
                                    break;
                                }
                                System.out.print("Fadlan Geli taarikhda hore (MAALIN/BISHA/SANAD, e.g:01/04/2017): ");
                                String taarikhda_hore = input.nextLine();
                                System.out.print("Fadlan Geli taarikhda danbe (MAALIN/BISHA/SANAD, e.g:30/04/2017): ");
                                String taarikhda_danbe = input.nextLine();

                                System.out.println("Your request is being processed and the activity will be emailed to " + email);
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
                        int bankChoice = input.nextInt();

                        switch (bankChoice) {
                            case 1:
                                System.out.println("Koontadaada Bangiga: 77865532 Haraageedu waa: " + haraaga_Bangiga + " USD");
                                System.out.println("IBAN: SO 55 777 209 888866543");
                                break;
                            case 2:
                                System.out.print("Fadlan Geli Lacagta: ");
                                int depositAmount = input.nextInt();
                                if (depositAmount <= 0) {
                                    System.out.println("Qalad: lacag sax ah geli.");
                                    break;
                                }
                                int macluumaad = 0;
                                for (int attempts = 0; attempts < 5 && macluumaad != depositAmount; attempts++) {
                                    System.out.println("Fadlan Geli Macluumaad ");
                                    macluumaad = input.nextInt();
                                    if (macluumaad != depositAmount) {
                                        if (attempts < 4) {
                                            System.out.println("Invalid input format(dataType)");
                                        } else {
                                            System.out.println("waxaad gaaratay inta ku noqosho laguu ogalaa, fadlan dib usoo gal");
                                            return;
                                        }
                                    }
                                }
                                int number_sirta = 0;
                                int numberka_sirta = 123456;
                                for (int attempts = 0; attempts < 5 && numberka_sirta != number_sirta; attempts++) {
                                    System.out.println("Fadlan Geli Numberkaaga sirta ee Bangiga");
                                    number_sirta = input.nextInt();
                                    if (numberka_sirta != number_sirta) {
                                        if (attempts < 4) {
                                            System.out.println("Invalid input format(length)");
                                        } else {
                                            System.out.println("waxaad gaaratay inta ku noqosho laguu ogalaa, fadlan dib usoo gal");
                                            return;
                                        }
                                    }
                                }

                                if (macluumaad == depositAmount) {
                                    System.out.println("Ma hubtaa inaad $" + depositAmount + " dhigatid Account-kaaga bangiga?");
                                    System.out.println("1. Haa");
                                    System.out.println("2. Maya");
                                    int confirm = input.nextInt();
                                    long koonto = 210365467843L;
                                    if (haraaga_Bangiga < depositAmount) {
                                        System.out.println("Haraaga koontadan " + koonto + "kuma filna");
                                        return;
                                    }
                                    if (confirm == 1) {
                                        haraaga_Bangiga -= depositAmount;
                                        System.out.println("Waxaad $" + depositAmount + " dhigatay Account-kaaga bangiga");
                                        System.out.println("Haraagaagu waa $" + haraaga_Bangiga);
                                    } else {
                                        System.out.println("Mahadsanid!");
                                    }
                                } else {
                                    System.out.println("Macluumaadka lacagta waa khalad");
                                }
                                break;
                            case 3:
                                System.out.print("Fadlan Geli Lacagta: ");
                                depositAmount = input.nextInt();
                                if (depositAmount <= 0) {
                                    System.out.println("Qalad: lacag sax ah geli.");
                                    break;
                                }
                                macluumaad = 0;
                                for (int attempts = 0; attempts < 5 && macluumaad != depositAmount; attempts++) {
                                    System.out.println("Fadlan Geli Macluumaad ");
                                    macluumaad = input.nextInt();
                                    if (macluumaad != depositAmount) {
                                        if (attempts < 4) {
                                            System.out.println("Invalid input format(dataType)");
                                        } else {
                                            System.out.println("waxaad gaaratay inta ku noqosho laguu ogalaa, fadlan dib usoo gal");
                                            return;
                                        }
                                    }
                                }

                                number_sirta = 0;
                                numberka_sirta = 123456;
                                for (int attempts = 0; attempts < 5 && numberka_sirta != number_sirta; attempts++) {
                                    System.out.println("Fadlan Geli Numberkaaga sirta ee Bangiga");
                                    number_sirta = input.nextInt();
                                    if (numberka_sirta != number_sirta) {
                                        if (attempts < 4) {
                                            System.out.println("Invalid input format(length)");
                                        } else {
                                            System.out.println("waxaad gaaratay inta ku noqosho laguu ogalaa, fadlan dib usoo gal");
                                            return;
                                        }
                                    }
                                }

                                if (macluumaad == depositAmount) {
                                    System.out.println("Ma hubtaa inaad $" + depositAmount + " ka qaadatid Account-kaaga bangiga?");
                                    System.out.println("1. Haa");
                                    System.out.println("2. Maya");
                                    int confirm = input.nextInt();
                                    if (haraaga_Bangiga < depositAmount) {
                                        System.out.println("Haraaga koontadan " + account + "kuma filna");
                                        return;
                                    }
                                    if (haraaga_Bangiga < depositAmount) {
                                        System.out.println("Haraaga xisaabtaada kuguma filna");
                                        return;
                                    }
                                    if (confirm == 1) {
                                        haraaga_Bangiga -= depositAmount;
                                        System.out.println("Waxaad $" + depositAmount + " ka qaadatay Account-kaaga bangiga");
                                        System.out.println("Haraagaagu waa $" + haraaga_Bangiga);
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

                                int xisabta_Bangiga = input.nextInt();
                                int koonto1 = 37614522;
                                long macluumaadBank = 210337614522L;

                                if (xisabta_Bangiga >= 1 && xisabta_Bangiga <= 5) {
                                    System.out.println("Fadlan Geli Account-ka:");
                                    int input_account = input.nextInt();

                                    if (input_account != koonto1) {
                                        System.out.println("Fadlan Geli account sax ah");
                                        return;
                                    }

                                    System.out.println("Fadlan Geli Macluumaadka Bangiga:");
                                    long input_macluumaad = input.nextLong();

                                    if (input_macluumaad != macluumaadBank) {
                                        System.out.println("Macluumaadka Bangigu waa khalad");
                                        return;
                                    }

                                    System.out.println("Fadlan Geli Lacagta:");
                                    int lacagta1 = input.nextInt();

                                    if (lacagta1 <= 0) {
                                        System.out.println("Lacagta waa khalad");
                                        return;
                                    }

                                    if (lacagta1 > haraaga) {
                                        System.out.println("Haraagaagu kuma filna");
                                        return;
                                    }

                                    System.out.println("Ma hubtaa inaad $" + lacagta1 + " u wareejisid Account-ka Bangiga?");
                                    System.out.println("1. Haa");
                                    System.out.println("2. Maya");
                                    int confirm = input.nextInt();

                                    if (confirm == 1) {
                                        haraaga -= lacagta1;
                                        haraaga_Bangiga += lacagta1;
                                        System.out.println("Waxaad $" + lacagta1 + " u wareejisay Account-ka Bangiga.");
                                        System.out.println("Haraagaagu EVCPLUS waa $" + haraaga);
                                        System.out.println("Haraaga Bangiga waa $" + haraaga_Bangiga);
                                    } else {
                                        System.out.println("Mahadsanid!");
                                    }
                                } else {
                                    System.out.println("Fadlan dooro number sax ah");
                                }
                                break;

                            case 5:
                                System.out.println("Fadlan Geli Account-ka:");
                                int input_account = input.nextInt();

                                if (input_account != account) {
                                    System.out.println("Account-ka aad gelisay waa khalad");
                                    break;
                                }

                                System.out.println("Fadlan Geli Lacagta:");
                                int lacagta1 = input.nextInt();

                                if (lacagta1 <= 0) {
                                    System.out.println("Lacagta waa khalad");
                                    break;
                                }

                                if (lacagta1 > haraaga_Bangiga) {
                                    System.out.println("Haraaga Bangiga kuma filna");
                                    break;
                                }

                                System.out.println("Ma hubtaa inaad $" + lacagta1 + " u wareejisid Account-ka EVCPLUS?");
                                System.out.println("1. Haa");
                                System.out.println("2. Maya");
                                int confirm = input.nextInt();

                                if (confirm == 1) {
                                    haraaga_Bangiga -= lacagta1;
                                    haraaga += lacagta1;
                                    System.out.println("Waxaad $" + lacagta1 + " u wareejisay Account-ka EVCPLUS.");
                                    System.out.println("Haraaga Bangiga waa $" + haraaga_Bangiga);
                                    System.out.println("Haraaga EVCPLUS waa $" + haraaga);
                                } else {
                                    System.out.println("Mahadsanid!");
                                }
                                break;

                            case 6:
                                System.out.println("Fadlan Geli Account-ka:");
                                input_account = input.nextInt();

                                if (input_account != account) {
                                    System.out.println("Account-ka aad gelisay waa khalad");
                                    break;
                                }

                                System.out.println("Fadlan Geli Mobile-ka:");
                                String mobile = input.next();

                                System.out.println("Fadlan Geli Lacagta:");
                                lacagta1 = input.nextInt();

                                if (lacagta1 <= 0) {
                                    System.out.println("Lacagta waa khalad");
                                    break;
                                }

                                if (lacagta1 > haraaga_Bangiga) {
                                    System.out.println("Haraaga Bangiga kuma filna");
                                    break;
                                }

                                System.out.println("Ma hubtaa inaad $" + lacagta1 + " u wareejisid Mobile-ka " + mobile + "?");
                                System.out.println("1. Haa");
                                System.out.println("2. Maya");
                                confirm = input.nextInt();

                                if (confirm == 1) {
                                    haraaga_Bangiga -= lacagta1;
                                    System.out.println("Waxaad $" + lacagta1 + " u wareejisay Mobile-ka " + mobile);
                                    System.out.println("Haraaga Bangiga waa $" + haraaga_Bangiga);
                                } else {
                                    System.out.println("Mahadsanid!");
                                }
                                break;

                            case 7:
                                System.out.println("Maareynta Bankiga");
                                System.out.println("1. Badal PIN");
                                System.out.println("2. Xareynta Account-ka");
                                System.out.println("3. Ka Bax");

                                int maareynta = input.nextInt();
                                switch (maareynta) {
                                    case 1:
                                        System.out.println("Fadlan Geli PIN-ka Hadda:");
                                        int currentPin = input.nextInt();

                                        if (currentPin != pin) {
                                            System.out.println("PIN-ka aad gelisay waa khalad");
                                            break;
                                        }

                                        System.out.println("Fadlan Geli PIN-ka Cusub:");
                                        int newPin = input.nextInt();

                                        System.out.println("Fadlan Geli PIN-ka Cusub Mar labaad:");
                                        int confirmPin = input.nextInt();

                                        if (newPin != confirmPin) {
                                            System.out.println("PIN-ka cusub waa khalad");
                                            break;
                                        }

                                        pin = newPin;
                                        System.out.println("PIN-kaaga waa la badalay");
                                        break;

                                    case 2:
                                        System.out.println("Xareynta Account-ka");
                                        System.out.println("1. Xaree Account");
                                        System.out.println("2. Furan Account");
                                        System.out.println("3. Ka Bax");

                                        int xareynta = input.nextInt();
                                        switch (xareynta) {
                                            case 1:
                                                System.out.println("Ma hubtaa inaad xareyso Account-kaaga?");
                                                System.out.println("1. Haa");
                                                System.out.println("2. Maya");
                                                confirm = input.nextInt();

                                                if (confirm == 1) {
                                                    System.out.println("Account-kaaga waa la xareeyay");
                                                } else {
                                                    System.out.println("Mahadsanid!");
                                                }
                                                break;

                                            case 2:
                                                System.out.println("Ma hubtaa inaad furan Account-kaaga?");
                                                System.out.println("1. Haa");
                                                System.out.println("2. Maya");
                                                confirm = input.nextInt();

                                                if (confirm == 1) {
                                                    System.out.println("Account-kaaga waa la furey");
                                                } else {
                                                    System.out.println("Mahadsanid!");
                                                }
                                                break;

                                            case 3:
                                                System.out.println("Ka Bax");
                                                break;

                                            default:
                                                System.out.println("Fadlan dooro number sax ah");
                                                break;
                                        }
                                        break;

                                    case 3:
                                        System.out.println("Ka Bax");
                                        break;

                                    default:
                                        System.out.println("Fadlan dooro number sax ah");
                                        break;
                                }
                                break;

                            case 8:
                                System.out.println("Kala Bax");
                                break;

                            default:
                                System.out.println("Fadlan dooro number sax ah");
                                break;
                        }
                        break;

                    case 7:
                        System.out.println("Maareynta");
                        System.out.println("1. Badal PIN");
                        System.out.println("2. Xareynta Account-ka");
                        System.out.println("3. Ka Bax");

                        int maareynta1 = input.nextInt();
                        switch (maareynta1) {
                            case 1:
                                System.out.println("Fadlan Geli PIN-ka Hadda:");
                                int currentPin = input.nextInt();

                                if (currentPin != pin) {
                                    System.out.println("PIN-ka aad gelisay waa khalad");
                                    break;
                                }

                                System.out.println("Fadlan Geli PIN-ka Cusub:");
                                int newPin = input.nextInt();

                                System.out.println("Fadlan Geli PIN-ka Cusub Mar labaad:");
                                int confirmPin = input.nextInt();

                                if (newPin != confirmPin) {
                                    System.out.println("PIN-ka cusub waa khalad");
                                    break;
                                }

                                pin = newPin;
                                System.out.println("PIN-kaaga waa la badalay");
                                break;

                            case 2:
                                System.out.println("Xareynta Account-ka");
                                System.out.println("1. Xaree Account");
                                System.out.println("2. Furan Account");
                                System.out.println("3. Ka Bax");

                                int xareynta = input.nextInt();
                                switch (xareynta) {
                                    case 1:
                                        System.out.println("Ma hubtaa inaad xareyso Account-kaaga?");
                                        System.out.println("1. Haa");
                                        System.out.println("2. Maya");
                                        int confirm = input.nextInt();

                                        if (confirm == 1) {
                                            System.out.println("Account-kaaga waa la xareeyay");
                                        } else {
                                            System.out.println("Mahadsanid!");
                                        }
                                        break;

                                    case 2:
                                        System.out.println("Ma hubtaa inaad furan Account-kaaga?");
                                        System.out.println("1. Haa");
                                        System.out.println("2. Maya");
                                        confirm = input.nextInt();

                                        if (confirm == 1) {
                                            System.out.println("Account-kaaga waa la furey");
                                        } else {
                                            System.out.println("Mahadsanid!");
                                        }
                                        break;

                                    case 3:
                                        System.out.println("Ka Bax");
                                        break;

                                    default:
                                        System.out.println("Fadlan dooro number sax ah");
                                        break;
                                }
                                break;

                            case 3:
                                System.out.println("Ka Bax");
                                break;

                            default:
                                System.out.println("Fadlan dooro number sax ah");
                                break;
                        }
                        break;

                    case 8:
                        System.out.println("TAAJ");
                        System.out.println("1. TAAJ Express");
                        System.out.println("2. TAAJ Cash");
                        System.out.println("3. Ka Bax");

                        int taaj = input.nextInt();
                        switch (taaj) {
                            case 1:
                                System.out.println("TAAJ Express");
                                System.out.println("1. U dir TAAJ");
                                System.out.println("2. Qaado TAAJ");
                                System.out.println("3. Ka Bax");

                                int express = input.nextInt();
                                switch (express) {
                                    case 1:
                                        System.out.println("Fadlan Geli Mobile-ka:");
                                        String mobile = input.next();

                                        System.out.println("Fadlan Geli Lacagta:");
                                        int lacagta1 = input.nextInt();

                                        if (lacagta1 <= 0) {
                                            System.out.println("Lacagta waa khalad");
                                            break;
                                        }

                                        if (lacagta1 > haraaga) {
                                            System.out.println("Haraagaagu kuma filna");
                                            break;
                                        }

                                        System.out.println("Ma hubtaa inaad $" + lacagta1 + " u dirto Mobile-ka " + mobile + "?");
                                        System.out.println("1. Haa");
                                        System.out.println("2. Maya");
                                        int confirm = input.nextInt();

                                        if (confirm == 1) {
                                            haraaga -= lacagta1;
                                            System.out.println("Waxaad $" + lacagta1 + " u dirtay Mobile-ka " + mobile);
                                            System.out.println("Haraagaagu waa $" + haraaga);
                                        } else {
                                            System.out.println("Mahadsanid!");
                                        }
                                        break;

                                    case 2:
                                        System.out.println("Fadlan Geli TAAJ Number-ka:");
                                        String taajNumber = input.next();

                                        System.out.println("Fadlan Geli Lacagta:");
                                        lacagta1 = input.nextInt();

                                        if (lacagta1 <= 0) {
                                            System.out.println("Lacagta waa khalad");
                                            break;
                                        }

                                        System.out.println("Ma hubtaa inaad $" + lacagta1 + " ka qaadato TAAJ Number-ka " + taajNumber + "?");
                                        System.out.println("1. Haa");
                                        System.out.println("2. Maya");
                                        confirm = input.nextInt();

                                        if (confirm == 1) {
                                            System.out.println("Waxaad $" + lacagta1 + " ka qaadatay TAAJ Number-ka " + taajNumber);
                                        } else {
                                            System.out.println("Mahadsanid!");
                                        }
                                        break;

                                    case 3:
                                        System.out.println("Ka Bax");
                                        break;

                                    default:
                                        System.out.println("Fadlan dooro number sax ah");
                                        break;
                                }
                                break;

                            case 2:
                                System.out.println("TAAJ Cash");
                                System.out.println("1. U dir TAAJ Cash");
                                System.out.println("2. Qaado TAAJ Cash");
                                System.out.println("3. Ka Bax");

                                int cash = input.nextInt();
                                switch (cash) {
                                    case 1:
                                        System.out.println("Fadlan Geli Mobile-ka:");
                                        String mobile = input.next();

                                        System.out.println("Fadlan Geli Lacagta:");
                                        int lacagta1 = input.nextInt();

                                        if (lacagta1 <= 0) {
                                            System.out.println("Lacagta waa khalad");
                                            break;
                                        }

                                        if (lacagta1 > haraaga) {
                                            System.out.println("Haraagaagu kuma filna");
                                            break;
                                        }

                                        System.out.println("Ma hubtaa inaad $" + lacagta1 + " u dirto Mobile-ka " + mobile + "?");
                                        System.out.println("1. Haa");
                                        System.out.println("2. Maya");
                                        int confirm = input.nextInt();

                                        if (confirm == 1) {
                                            haraaga -= lacagta1;
                                            System.out.println("Waxaad $" + lacagta1 + " u dirtay Mobile-ka " + mobile);
                                            System.out.println("Haraagaagu waa $" + haraaga);
                                        } else {
                                            System.out.println("Mahadsanid!");
                                        }
                                        break;

                                    case 2:
                                        System.out.println("Fadlan Geli TAAJ Cash Number-ka:");
                                        String taajCashNumber = input.next();

                                        System.out.println("Fadlan Geli Lacagta:");
                                        lacagta1 = input.nextInt();

                                        if (lacagta1 <= 0) {
                                            System.out.println("Lacagta waa khalad");
                                            break;
                                        }

                                        System.out.println("Ma hubtaa inaad $" + lacagta1 + " ka qaadato TAAJ Cash Number-ka " + taajCashNumber + "?");
                                        System.out.println("1. Haa");
                                        System.out.println("2. Maya");
                                        confirm = input.nextInt();

                                        if (confirm == 1) {
                                            System.out.println("Waxaad $" + lacagta1 + " ka qaadatay TAAJ Cash Number-ka " + taajCashNumber);
                                        } else {
                                            System.out.println("Mahadsanid!");
                                        }
                                        break;

                                    case 3:
                                        System.out.println("Ka Bax");
                                        break;

                                    default:
                                        System.out.println("Fadlan dooro number sax ah");
                                        break;
                                }
                                break;

                            case 3:
                                System.out.println("Ka Bax");
                                break;

                            default:
                                System.out.println("Fadlan dooro number sax ah");
                                break;
                        }
                        break;

                    case 9:
                        System.out.println("Bill Payment");
                        System.out.println("1. Electricity Bill");
                        System.out.println("2. Water Bill");
                        System.out.println("3. Internet Bill");
                        System.out.println("4. Ka Bax");

                        int billPayment = input.nextInt();
                        switch (billPayment) {
                            case 1:
                                System.out.println("Electricity Bill");
                                System.out.println("1. Post Paid");
                                System.out.println("2. Pre Paid");
                                System.out.println("3. Ka Bax");

                                int electricity = input.nextInt();
                                switch (electricity) {
                                    case 1:
                                        System.out.println("Fadlan Geli Account-ka:");
                                        String accountNumber = input.next();

                                        System.out.println("Fadlan Geli Lacagta:");
                                        int lacagta1 = input.nextInt();

                                        if (lacagta1 <= 0) {
                                            System.out.println("Lacagta waa khalad");
                                            break;
                                        }

                                        if (lacagta1 > haraaga) {
                                            System.out.println("Haraagaagu kuma filna");
                                            break;
                                        }

                                        System.out.println("Ma hubtaa inaad $" + lacagta1 + " bixisid Electricity Bill-ka Account-ka " + accountNumber + "?");
                                        System.out.println("1. Haa");
                                        System.out.println("2. Maya");
                                        int confirm = input.nextInt();

                                        if (confirm == 1) {
                                            haraaga -= lacagta1;
                                            System.out.println("Waxaad $" + lacagta1 + " u bixisay Electricity Bill-ka Account-ka " + accountNumber);
                                            System.out.println("Haraagaagu waa $" + haraaga);
                                        } else {
                                            System.out.println("Mahadsanid!");
                                        }
                                        break;

                                    case 2:
                                        System.out.println("Fadlan Geli Meter Number-ka:");
                                        String meterNumber = input.next();

                                        System.out.println("Fadlan Geli Lacagta:");
                                        lacagta1 = input.nextInt();

                                        if (lacagta1 <= 0) {
                                            System.out.println("Lacagta waa khalad");
                                            break;
                                        }

                                        if (lacagta1 > haraaga) {
                                            System.out.println("Haraagaagu kuma filna");
                                            break;
                                        }

                                        System.out.println("Ma hubtaa inaad $" + lacagta1 + " bixisid Electricity Bill-ka Meter-ka " + meterNumber + "?");
                                        System.out.println("1. Haa");
                                        System.out.println("2. Maya");
                                        confirm = input.nextInt();

                                        if (confirm == 1) {
                                            haraaga -= lacagta1;
                                            System.out.println("Waxaad $" + lacagta1 + " u bixisay Electricity Bill-ka Meter-ka " + meterNumber);
                                            System.out.println("Haraagaagu waa $" + haraaga);
                                        } else {
                                            System.out.println("Mahadsanid!");
                                        }
                                        break;

                                    case 3:
                                        System.out.println("Ka Bax");
                                        break;

                                    default:
                                        System.out.println("Fadlan dooro number sax ah");
                                        break;
                                }
                                break;

                            case 2:
                                System.out.println("Water Bill");
                                System.out.println("1. Post Paid");
                                System.out.println("2. Pre Paid");
                                System.out.println("3. Ka Bax");

                                int water = input.nextInt();
                                switch (water) {
                                    case 1:
                                        System.out.println("Fadlan Geli Account-ka:");
                                        String accountNumber = input.next();

                                        System.out.println("Fadlan Geli Lacagta:");
                                        int lacagta1 = input.nextInt();

                                        if (lacagta1 <= 0) {
                                            System.out.println("Lacagta waa khalad");
                                            break;
                                        }

                                        if (lacagta1 > haraaga) {
                                            System.out.println("Haraagaagu kuma filna");
                                            break;
                                        }

                                        System.out.println("Ma hubtaa inaad $" + lacagta1 + " bixisid Water Bill-ka Account-ka " + accountNumber + "?");
                                        System.out.println("1. Haa");
                                        System.out.println("2. Maya");
                                        int confirm = input.nextInt();

                                        if (confirm == 1) {
                                            haraaga -= lacagta1;
                                            System.out.println("Waxaad $" + lacagta1 + " u bixisay Water Bill-ka Account-ka " + accountNumber);
                                            System.out.println("Haraagaagu waa $" + haraaga);
                                        } else {
                                            System.out.println("Mahadsanid!");
                                        }
                                        break;

                                    case 2:
                                        System.out.println("Fadlan Geli Meter Number-ka:");
                                        String meterNumber = input.next();

                                        System.out.println("Fadlan Geli Lacagta:");
                                        lacagta1 = input.nextInt();

                                        if (lacagta1 <= 0) {
                                            System.out.println("Lacagta waa khalad");
                                            break;
                                        }

                                        if (lacagta1 > haraaga) {
                                            System.out.println("Haraagaagu kuma filna");
                                            break;
                                        }

                                        System.out.println("Ma hubtaa inaad $" + lacagta1 + " bixisid Water Bill-ka Meter-ka " + meterNumber + "?");
                                        System.out.println("1. Haa");
                                        System.out.println("2. Maya");
                                        confirm = input.nextInt();

                                        if (confirm == 1) {
                                            haraaga -= lacagta1;
                                            System.out.println("Waxaad $" + lacagta1 + " u bixisay Water Bill-ka Meter-ka " + meterNumber);
                                            System.out.println("Haraagaagu waa $" + haraaga);
                                        } else {
                                            System.out.println("Mahadsanid!");
                                        }
                                        break;

                                    case 3:
                                        System.out.println("Ka Bax");
                                        break;

                                    default:
                                        System.out.println("Fadlan dooro number sax ah");
                                        break;
                                }
                                break;

                            case 3:
                                System.out.println("Internet Bill");
                                System.out.println("1. Post Paid");
                                System.out.println("2. Pre Paid");
                                System.out.println("3. Ka Bax");

                                int internet = input.nextInt();
                                switch (internet) {
                                    case 1:
                                        System.out.println("Fadlan Geli Account-ka:");
                                        String accountNumber = input.next();

                                        System.out.println("Fadlan Geli Lacagta:");
                                        int lacagta1 = input.nextInt();

                                        if (lacagta1 <= 0) {
                                            System.out.println("Lacagta waa khalad");
                                            break;
                                        }

                                        if (lacagta1 > haraaga) {
                                            System.out.println("Haraagaagu kuma filna");
                                            break;
                                        }

                                        System.out.println("Ma hubtaa inaad $" + lacagta1 + " bixisid Internet Bill-ka Account-ka " + accountNumber + "?");
                                        System.out.println("1. Haa");
                                        System.out.println("2. Maya");
                                        int confirm = input.nextInt();

                                        if (confirm == 1) {
                                            haraaga -= lacagta1;
                                            System.out.println("Waxaad $" + lacagta1 + " u bixisay Internet Bill-ka Account-ka " + accountNumber);
                                            System.out.println("Haraagaagu waa $" + haraaga);
                                        } else {
                                            System.out.println("Mahadsanid!");
                                        }
                                        break;

                                    case 2:
                                        System.out.println("Fadlan Geli Meter Number-ka:");
                                        String meterNumber = input.next();

                                        System.out.println("Fadlan Geli Lacagta:");
                                        lacagta1 = input.nextInt();

                                        if (lacagta1 <= 0) {
                                            System.out.println("Lacagta waa khalad");
                                            break;
                                        }

                                        if (lacagta1 > haraaga) {
                                            System.out.println("Haraagaagu kuma filna");
                                            break;
                                        }

                                        System.out.println("Ma hubtaa inaad $" + lacagta1 + " bixisid Internet Bill-ka Meter-ka " + meterNumber + "?");
                                        System.out.println("1. Haa");
                                        System.out.println("2. Maya");
                                        confirm = input.nextInt();

                                        if (confirm == 1) {
                                            haraaga -= lacagta1;
                                            System.out.println("Waxaad $" + lacagta1 + " u bixisay Internet Bill-ka Meter-ka " + meterNumber);
                                            System.out.println("Haraagaagu waa $" + haraaga);
                                        } else {
                                            System.out.println("Mahadsanid!");
                                        }
                                        break;

                                    case 3:
                                        System.out.println("Ka Bax");
                                        break;

                                    default:
                                        System.out.println("Fadlan dooro number sax ah");
                                        break;
                                }
                                break;

                            case 4:
                                System.out.println("Ka Bax");
                                break;

                            default:
                                System.out.println("Fadlan dooro number sax ah");
                                break;
                        }
                        break;

                    default:
                        System.out.println("Fadlan dooro number sax ah");
                        break;
                }
            } else {
                System.out.println("PIN-ka aad gelisay waa khalad");
            }
        } else {
            System.out.println("Fadlan garaac *770#");
        }
    }
}