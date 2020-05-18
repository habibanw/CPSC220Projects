package com.company;
import java.util.*;
public class Main {

    /**
     * Author: Habibullah Anwar
     * Version: 1.0
     *
     *This Program is a Application integrated as a Hawaiian Dictionary
     * Provides Phonetic, consonants, and vowels.
     * */

    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }
    public static void main(String[] args) {
	// write your code here
        //Method Choice


        Scanner stdin = new Scanner(System.in);
        String word = "";
        String choice = "";

        while ((!choice.equalsIgnoreCase("no")) && !(choice.equalsIgnoreCase("n"))) {
            System.out.println("Enter a Hawaiian word to pronounce: ");
            word = stdin.nextLine();

            if (word.equalsIgnoreCase("Aloha")) {
                System.out.println("ALOHA is pronounced ah-loh-hah");
            } else if (word.equalsIgnoreCase("Kakahiaka")) {
                System.out.println("KAKAHIAKA is pronounced kah-kah-hee-ah-kah ");
            } else if (word.equalsIgnoreCase("Mahalo")) {
                System.out.println("MAHALO is pronounced mah-hah-loh");
            } else if (word.equalsIgnoreCase("E komo mai")) {
                System.out.println("E KOMO MAI is pronounced eh koh-moh meye ");
            } else if (word.equalsIgnoreCase("maui")) {
                System.out.println("MAUI is pronounced mow-ee ");
            }else if (word.equalsIgnoreCase("kane")) {
                System.out.println("KANE is pronounced kah-neh ");
            }else if (word.equalsIgnoreCase("HOALOHA")) {
                System.out.println("HOALOHA is pronounced hoh-ah-loh-hah ");
            }else if (word.equalsIgnoreCase("makua")) {
                System.out.println("MAKUA is pronounced mah-koo-ah ");
            }else if (word.equalsIgnoreCase("keikikane")) {
                System.out.println("KEIKIKANE is pronounced kay-kee-kah-neh ");
            }else if (word.equalsIgnoreCase("humuhumunukunukuapua'a")) {
                System.out.println("HUMUHUMUNUKUNUKUAPUA'A is pronounced hoo-moo-hoo-moo-noo-koo-noo-koo-ahpoo-ah'ah");
            }else if (word.equalsIgnoreCase("keiki")) {
                System.out.println("KEIKI is pronounced kay-kee ");
            }else if (word.equalsIgnoreCase("Hoaloha")) {
                System.out.println("HOALOHA is pronounced hoh-ah-loh-hah");
            } else if (word.equalsIgnoreCase("kaiapuni")) {
                System.out.println("KAIAPUNI is pronounced keye-ah-poo-nee");
            } else if (word.equalsIgnoreCase("wahine")) {
                System.out.println("HOALOHA is pronounced hoh-ah-loh-hah ");
            } else if (word.equalsIgnoreCase("iwa")) {
                System.out.println("IWA is pronounced ee-vah");
            } else if (word.equalsIgnoreCase("Huaai")) {
                System.out.println("HUAAI is pronounced hoo-ah-eye");
                //Greeting
            } else if (word.equalsIgnoreCase("Aloha kakahiaka ")) {
                System.out.println("Aloha kakahiaka is pronounced ah-loh-hah kah-kah-hee-ah-kah”");
            } else if (word.equalsIgnoreCase("Aloha awakea ")) {
                System.out.println("Aloha awakea is pronounced ah-loh-hah ah-vah-keh-ah");
            } else if (word.equalsIgnoreCase("Aloha ahiahi ")) {
                System.out.println("Aloha ahiahi is pronounced ah-loh-hah ah-vah-keh-ah");
            }else if (word.equalsIgnoreCase("Ke 'olu'olu ")) {
                System.out.println("Ke 'olu'olu is pronounced keh oh-loo'oh-loo");
            }else if (word.equalsIgnoreCase("Mahalo ")) {
                System.out.println("Mahalo is pronounced mah-hah-loh");
                // People
            }else if (word.equalsIgnoreCase("Kane")) {
                System.out.println("Kāne is pronounced kāh-neh");
            } else if (word.equalsIgnoreCase("Wahine")) {
                System.out.println("Wahine is pronounced wah-hee-neh");
            } else if (word.equalsIgnoreCase("Ohana")) {
                System.out.println("Ohana is pronounced oh-hah-nah");
            }else if (word.equalsIgnoreCase("Hoaloha ")) {
                System.out.println("Hoaloha is pronounced hoh-ah-loh-hah");
            }else if (word.equalsIgnoreCase("Makua")) {
                System.out.println("Makua is pronounced mah-koo-ah");
            }else if (word.equalsIgnoreCase("Makuakane ")) {
                System.out.println("Makuakāne is pronounced mah-koo-ah-kāh-neh");
            }else if (word.equalsIgnoreCase("Makuahine mah-koo-ah-hee-neh")) {
                System.out.println("Makuahine is pronounced mah-koo-ah-hee-neh ");
            }else if (word.equalsIgnoreCase("Kaikamahine ")) {
                System.out.println("Kaikamahine is pronounced ky-kah-mah-hee-neh ");
            }else if (word.equalsIgnoreCase("Keikikane")) {
                System.out.println(" Keikikāne is pronounced kay-kee-kāh-neh");
            }else if (word.equalsIgnoreCase("Kaikamahine ")) {
                System.out.println("Kaikamahine is pronounced ky-kah-mah-hee-neh");
            }else if (word.equalsIgnoreCase("Pepe")) {
                System.out.println("Pēpē is pronounced pēh-pēh");
            }else if (word.equalsIgnoreCase("Kupunakāne")) {
                System.out.println("Kupunakane is pronounced koo-poo-nah-kāh-neh”");
            }else if (word.equalsIgnoreCase("Kupunawahine ")) {
                System.out.println("Kupunawahine is pronounced koo-poo-nah-wah-hee-neh ");
            }else if (word.equalsIgnoreCase("Kupuna")) {
                System.out.println("Kupuna is pronounced koo-poo-nah");
            }else if (word.equalsIgnoreCase("Pili mua")) {
                System.out.println("Pili mua is pronounced pee-lee moo-ah");
            }else if (word.equalsIgnoreCase("Mo'opuna ")) {
                System.out.println("Mo'opuna is pronounced moh’oh-poo-nah");
            }else if (word.equalsIgnoreCase("Anakala ")) {
                System.out.println(" Anakala is pronounced ah-nah-kah-lah");
            }else if (word.equalsIgnoreCase("Anake")) {
                System.out.println("Anakē is pronounced ah-nah-kēh");
            }else if (word.equalsIgnoreCase("Hoahanau ")) {
                System.out.println("Hoahānau is pronounced hoh-wah-hāh-now-oo ");
            }else if (word.equalsIgnoreCase("Okuhi ")) {
                System.out.println("Ōkuhi is pronounced ōh-koo-hee");
            }else if (word.equalsIgnoreCase(" Aia i hea ")) {
                System.out.println(" is pronounced ah-ee-yah ee heh-ah");
            }else if (word.equalsIgnoreCase("Ma 'ane'i")) {
                System.out.println("Ma 'ane'i is pronounced mah ah-neh'ee ");
            }else if (word.equalsIgnoreCase("Ma uka ")) {
                System.out.println(" is pronounced ");
            }else if (word.equalsIgnoreCase(" ")) {
                System.out.println("Ma uka is pronounced mah oo-kah");
            }else if (word.equalsIgnoreCase("Kokoke ")) {
                System.out.println("Kokoke is pronounced koh-koh-keh ");
            }else if (word.equalsIgnoreCase("Mamao ")) {
                System.out.println("Mamao is pronounced mah-mao");
            }else if (word.equalsIgnoreCase("Kaiapuni  ")) {
                System.out.println("Kaiapuni is pronounced ky-yah-poo-nee");
            }else if (word.equalsIgnoreCase("Honua ")) {
                System.out.println("Honua is pronounced hoh-noo-ah");
            }else if (word.equalsIgnoreCase("Mauna ")) {
                System.out.println("Mauna is pronounced mau-oo-nah");
            }else if (word.equalsIgnoreCase("Kai ")) {
                System.out.println("Kai is pronounced ky-ee");
            }else if (word.equalsIgnoreCase("Kahakai")) {
                System.out.println("Kahakai is pronounced kah-hah-ky-ee");
            }else if (word.equalsIgnoreCase("Hono ")) {
                System.out.println("Hono is pronounced hoh-noh");
            }else if (word.equalsIgnoreCase("One ")) {
                System.out.println("One is pronounced oh-neh");
            }else if (word.equalsIgnoreCase(" ")) {
                System.out.println("Awa is pronounced ah-vah");
            }else if (word.equalsIgnoreCase("Wailele ")) {
                System.out.println("Wailele is pronounced why-leh-leh");
            }else if (word.equalsIgnoreCase("Wai ")) {
                System.out.println("Wai is pronounced vy-ee");
            }else if (word.equalsIgnoreCase("Ao ")) {
                System.out.println("Ao is pronounced ow");
            }else if (word.equalsIgnoreCase("La")) {
                System.out.println("La is pronounced lāh");
            }else if (word.equalsIgnoreCase("Mahina")) {
                System.out.println("Mahina is pronounced mah-hee-nah");
            }else if (word.equalsIgnoreCase("Hoku")) {
                System.out.println("Hōkū is pronounced hōh-koo");
            }else if (word.equalsIgnoreCase("Lani ")) {
                System.out.println("Lani is pronounced lah-nee");
            }else if (word.equalsIgnoreCase("Anuenue")) {
                System.out.println("Ānuenue is pronounced āh-noo-weh-noo-weh");
            }else if (word.equalsIgnoreCase("Pohaku")) {
                System.out.println("Pōhaku is pronounced pōh-hah-koo");
            }else if (word.equalsIgnoreCase("Pali")) {
                System.out.println("Pali is pronounced pah-lee");
            }else if (word.equalsIgnoreCase("Ahi")) {
                System.out.println("Ahi is pronounced ah-hee");
            }else if (word.equalsIgnoreCase("Moana")) {
                System.out.println("Moana is pronounced moh-ah-nah");
            }else if (word.equalsIgnoreCase("Kai")) {
                System.out.println("Kai is pronounced ky-ee");
            }else if (word.equalsIgnoreCase("Nalu")) {
                System.out.println("Nalu is pronounced nah-loo");
            }else if (word.equalsIgnoreCase("Naia")) {
                System.out.println("Nai'a is pronounced ny’ah");
            }else if (word.equalsIgnoreCase("Mano")) {
                System.out.println("Manō is pronounced mah-nōh");
            }else if (word.equalsIgnoreCase("Ula")) {
                System.out.println("Ula is pronounced oo-lah");
            }else if (word.equalsIgnoreCase("Limu")) {
                System.out.println("Limu is pronounced lee-moo");
            }else if (word.equalsIgnoreCase("Pupu")) {
                System.out.println("Pūpū is pronounced poo-poo");
            }else if (word.equalsIgnoreCase("Ai")) {
                System.out.println("'Ai is pronounced eye");
            }else if (word.equalsIgnoreCase("Aina kakahiaka ")) {
                System.out.println("'Aina kakahiaka is pronounced eye-nah kah-kah-hee-ah-kah");
            }else if (word.equalsIgnoreCase("'Aina awakea")) {
                System.out.println("'Aina awakea is pronounced eye-nah ah-vah-keh-ah");
            }else if (word.equalsIgnoreCase("Aina Ahiahi")) {
                System.out.println("'Aina Ahiahi is pronounced eye-nah ah-hee-ah-hee");
            }else if (word.equalsIgnoreCase("Kope")) {
                System.out.println("Kope is pronounced koh-peh");
            }else if (word.equalsIgnoreCase("Ki")) {
                System.out.println("Ki is pronounced kee");
            }else if (word.equalsIgnoreCase("Moa")) {
                System.out.println("Moa is pronounced moh-ah");
            }else if (word.equalsIgnoreCase("Ia")) {
                System.out.println(" is pronounced ");
            }else if (word.equalsIgnoreCase("Huaai")) {
                System.out.println("Hua'ai is pronounced hoo-wah'eye");
            }else if (word.equalsIgnoreCase("Hale")) {
                System.out.println("Hale is pronounced hah-leh");
            }else if (word.equalsIgnoreCase("Laiki")) {
                System.out.println("Laiki is pronounced lye-ee-kee");
            }else if (word.equalsIgnoreCase("Haole")) {
                System.out.println("Haole  is pronounced how-leh");
            }else if (word.equalsIgnoreCase("Paakai")) {
                System.out.println("Pa'akai  is pronounced pah'h-ky-ee");
            }else if (word.equalsIgnoreCase("Pahī")) {
                System.out.println("Pahī is pronounced pah-hee ");
            }else if (word.equalsIgnoreCase("Palaoa")) {
                System.out.println("Palaoa  is pronounced pah-lah-wah");
            }else if (word.equalsIgnoreCase("Holoholona")) {
                System.out.println("Holoholona is pronounced hoh-loh-hoh-loh-nah ");
            }else if (word.equalsIgnoreCase("Popoki")) {
                System.out.println("Pōpoki  is pronounced pōh-poh-kee");
            }else if (word.equalsIgnoreCase("'Ilio")) {
                System.out.println("'Īlio is pronounced ee-lee-oh");
            }else if (word.equalsIgnoreCase("Puaa")) {
                System.out.println("Pua'a is pronounced poo-ah'ah");
            }else if (word.equalsIgnoreCase("Manu")) {
                System.out.println("Manu  is pronounced mah-noo");
            }else if (word.equalsIgnoreCase("Ia")) {
                System.out.println("Ia is pronounced ee'ah");
            }else if (word.equalsIgnoreCase("Pueo")) {
                System.out.println("Pueo is pronounced poo’weh-oh");
            }else if (word.equalsIgnoreCase("Meakanu")) {
                System.out.println("Meakanu is pronounced meh-ah-kah-noo");
            }else if (word.equalsIgnoreCase("Pua")) {
                System.out.println("Pua is pronounced poo-ah");
            }else if (word.equalsIgnoreCase("Awapuhi")) {
                System.out.println("'Awapuhi is pronounced ah-vah-poo-hee");
            }else if (word.equalsIgnoreCase("Akaaka")) {
                System.out.println("'Aka'aka is pronounced ah-kah'ah-kah");
            }else if (word.equalsIgnoreCase("Ola")) {
                System.out.println("Ola is pronounced oh-lah");
            }else if (word.equalsIgnoreCase(" Makana")) {
                System.out.println("Makana is pronounced mah-kah-nah ");
            }else if (word.equalsIgnoreCase("Mele")) {
                System.out.println("Mele is pronounced meh-leh");
            }else if (word.equalsIgnoreCase("Kapu")) {
                System.out.println("Kapu is pronounced kah-poo");
            }else if (word.equalsIgnoreCase("Lima")) {
                System.out.println("Lima is pronounced lee-mah");
            }else if (word.equalsIgnoreCase("Ihu")) {
                System.out.println("Ihu is pronounced ee-hoo");
            }else if (word.equalsIgnoreCase("Pepeiao")) {
                System.out.println("Pepeiao is pronounced peh-peh-ee-ow");
            } else if (word.equalsIgnoreCase("Niho")) {
                System.out.println("Niho is pronounced nee-hoh");
            }else if (word.equalsIgnoreCase("Na waihooluu")) {
                System.out.println("Nā waiho'olu'u is pronounced nāh vy-ee-hoh'oh-loo'oo ");
            }else if (word.equalsIgnoreCase("Melemele")) {
                System.out.println("Melemele is pronounced meh-leh-meh-leh");
            }else if (word.equalsIgnoreCase("Poni")) {
                System.out.println("Poni is pronounced poh-nee");
            }else if (word.equalsIgnoreCase("Kula")) {
                System.out.println("Kula is pronounced koo-lah");
            }else if (word.equalsIgnoreCase("'Alemanaka")) {
                System.out.println("'Alemanaka  is pronounced ah-leh-mah-nah-kah");
            }else if (word.equalsIgnoreCase("Malaki")) {
                System.out.println("Malaki is pronounced mah-lah-kee");
            }else if (word.equalsIgnoreCase("Mei")) {
                System.out.println("Mei is pronounced may-ee");
            }else if (word.equalsIgnoreCase("Iune")) {
                System.out.println("Iune is pronounced yoo-neh");
            }else if (word.equalsIgnoreCase("Aukake")) {
                System.out.println("'Aukake is pronounced ow-kah-keh");
            }else if (word.equalsIgnoreCase("Okakopa")) {
                System.out.println("'Okakopa is pronounced oh-kah-koh-pah");
            }else if (word.equalsIgnoreCase("Nowemapa")) {
                System.out.println("Nowemapa is pronounced noh-veh-mah-pah");
            }else if (word.equalsIgnoreCase("Nehinei")) {
                System.out.println("Nehinei  is pronounced neh-hee-nay-ee");
            }else if (word.equalsIgnoreCase(" Kakahiaka")) {
                System.out.println("Kakahiaka is pronounced kah-kah-hee-ah-kah");
            }else if (word.equalsIgnoreCase("Awakea")) {
                System.out.println("Awakea is pronounced ah-vah-keh-ah");
            }else if (word.equalsIgnoreCase("Ahiahi")) {
                System.out.println("Ahiahi is pronounced ah-hee-ah-hee");
            }else if (word.equalsIgnoreCase("Ole")) {
                System.out.println("'Ole is pronounced oh-leh");
            }else if (word.equalsIgnoreCase("Ekahi")) {
                System.out.println("'Ekahi is pronounced eh-kah-hee");
            }else if (word.equalsIgnoreCase("'Elima")) {
                System.out.println("Elima  is pronounced eh-lee-mah");
            }else if (word.equalsIgnoreCase("Ewalu")) {
                System.out.println("Ewalu is pronounced eh-vah-loo");
            }else if (word.equalsIgnoreCase("Waikiki")) {
                System.out.println("Waikiki is pronounced wy-kee-kee");
            }else if (word.equalsIgnoreCase("Honolulu")) {
                System.out.println("Honolulu is pronounced ho-no-loo-loo");
            }else if (word.equalsIgnoreCase("Kona")) {
                System.out.println("Kona is pronounced koh-nah");
            }else if (word.equalsIgnoreCase("Waimea")) {
                System.out.println("Waimea is pronounced vy-me-ah");
            }else if (word.equalsIgnoreCase("p" + "k" + "h" + "l" + "m" + "n")) {
                System.out.println(" Pronounced like the English versions " + " (p, k, h, l, m, n) ");
            }else if (word.equalsIgnoreCase("w")) {
                System.out.println(" Pronounced as a w " + " w after the letter ‘a’ Pronounced as a w " + " \nw after ‘i’ or ‘e’ Pronounced as a v" + " \nW after ‘u’ or ‘o’ Pronounced as a w");
            } else if (word.equalsIgnoreCase("a")) {
                System.out.println("sounds like ah. Eg. Austin");
            }else if (word.equalsIgnoreCase("e")) {
                System.out.println("sounds like eh. Eg. Egg");
            }else if (word.equalsIgnoreCase("i")) {
                System.out.println("sounds like ee Eg. Bee");
            } else if (word.equalsIgnoreCase("o")) {
                System.out.println("Sounds like oh. Eg. obey");
            } else if (word.equalsIgnoreCase("u")) {
                System.out.println("Sounds like oo. Eg. mood");
            }else if (word.equalsIgnoreCase("ai")) {
                System.out.println("Sounds like eye. eg. Ice");
            }else if (word.equalsIgnoreCase("ae")) {
                System.out.println("Sounds like eye. Same as ai");
            }else if (word.equalsIgnoreCase("ao")) {
                System.out.println("Sounds like ow. Eg. How");
            }else if (word.equalsIgnoreCase("au")) {
                System.out.println("Sounds like ow. Eg. House");
            }else if (word.equalsIgnoreCase("ei")) {
                System.out.println("Sounds like ay. Eg. Hay");
            }else if (word.equalsIgnoreCase("eu")) {
                System.out.println("Sounds like eh-oo");
            }else if (word.equalsIgnoreCase("iu")) {
                System.out.println("Sounds like ew");
            }else if (word.equalsIgnoreCase("oi")) {
                System.out.println("Sounds like oy");
            }else if (word.equalsIgnoreCase("ou")) {
                System.out.println("Sounds like ow");
            }else if (word.equalsIgnoreCase("ui")) {
                System.out.println("Sounds like ooey. Like gooey");
            }else if (word.equalsIgnoreCase("w")) {
                System.out.println("Pronounced as a w\n" +
                        "w after the letter ‘a’ Pronounced as a w\n" +
                        "w after ‘i’ or ‘e’ Pronounced as a v\n" +
                        "W after ‘u’ or ‘o’ Pronounced as a w");
            }else if (word == "p" + "k" + "h " + "l" + "m" + "n") {
                System.out.println("Pronounced like the English versions (p, k, h, l, m, n)");
            }else {
                System.out.println(choice.toUpperCase() + " is not a valid Hawaiian character" + dispMessage);
            }


            System.out.println("Do you want to enter another word? Y/YES/N/NO");
            choice = stdin.nextLine();
            if ((!choice.equalsIgnoreCase("Yes")) && !(choice.equalsIgnoreCase("Y")) && !(choice.equalsIgnoreCase("N")) && !(choice.equalsIgnoreCase("No"))) {
                System.out.println(choice.toUpperCase() + " is not a valid letter choice" + " please enter Y, YES, N or NO");
                choice = stdin.nextLine();
            }
        }
    }
}
    Scanner stdin = new Scanner(System.in);
    String word = "";
    String choice = "";

        while ((!choice.equalsIgnoreCase("no")) && !(choice.equalsIgnoreCase("n"))) {
                System.out.println("Enter a Hawaiian word to pronounce: ");
                word = stdin.nextLine();



                System.out.println("Do you want to enter another word? Y/YES/N/NO");
                choice = stdin.nextLine();
                if ((!choice.equalsIgnoreCase("Yes")) && !(choice.equalsIgnoreCase("Y")) && !(choice.equalsIgnoreCase("N")) && !(choice.equalsIgnoreCase("No"))) {
                System.out.println(choice.toUpperCase() + " is not a valid letter choice" + " please enter Y, YES, N or NO");
                choice = stdin.nextLine();
