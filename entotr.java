package com.kronosapp.lugapp.Languages.toTr;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import java.util.UUID;

public class EnToTr {
    private Context context;
    private SQLiteDatabase database;
    private String packet_name,prmkey;
    private String word,translate;
    public EnToTr(Context context, SQLiteDatabase database) {
        this.context=context;
        this.database=database;
    }



    private String random()
    {
        String rand =   UUID.randomUUID().toString();
        String temp = rand.replaceAll("-","");
        String temp2 = temp.substring(0,25);
        return temp2;
    }

    private void createPacket(String pack_name, String prmkey, SQLiteDatabase database)
    {
        database.execSQL("insert into packets(packet_name,prmkey,ifShared) values('"+pack_name+"','"+prmkey+"','0')");
        System.out.println(pack_name+ " tablosu oluşturuldu. prmkey : "+prmkey );
    }


    private void insertData(String word, String translate, String prmkey, SQLiteDatabase database)
    {
        word =  word.replace("'","&apostrophe");
        translate =  translate.replace("'","&apostrophe");

        database.execSQL("insert into words(word,translate,prmkey,favCard,learned) values('"+word+"','"+translate+"','"+prmkey+"','0','0')");
        System.out.println(word+" Eklendi. prmkey : "+ prmkey);
    }


    public void fill() {

            drinks();
            colors();
            times();
            meeting();
            fruitAndVegetable();
            verbs();
            animal();
            jobs();
            emotion();
            trip();
            adjectives();
            family();
            body();
            electronic_dev();
            communicate();
            tools();
            computer();
            office();
            sport();
            view();
            health();
            art();
            trade();
            law();
            future_tense();
            home();
            music();
            countr();
            exm_senteces();
            shopping();
            number();
            question();

    }

    private void question()
    {
        packet_name = "Soru cümleleri";
        prmkey = random();
        createPacket(packet_name,prmkey,database);

        word = "What?";
        translate="Ne?";
        random();
        insertData(word,translate,prmkey,database);

        word = "Which?";
        translate="Hangi?";
        random();
        insertData(word,translate,prmkey,database);
        word = "Who?";
        translate="Kim?";
        random();
        insertData(word,translate,prmkey,database);
        word = "Whom?";
        translate="Kime?";
        random();
        insertData(word,translate,prmkey,database);
        word = "Whose?";
        translate="Kimin?";
        random();
        insertData(word,translate,prmkey,database);
        word = "Who is the president of the United States?";
        translate="Amerika başkanı kimdir?";
        random();
        insertData(word,translate,prmkey,database);
        word = "Who called me last night?";
        translate="Dün gece beni kim aradı?";
        random();
        insertData(word,translate,prmkey,database);
        word = "Who made this beautiful painting?";
        translate="Bu güzel tabloyu kim yaptı?";
        random();
        insertData(word,translate,prmkey,database);
        word = "Who is your favourite singer?";
        translate="Favori şarkıcınız kim?";
        random();
        insertData(word,translate,prmkey,database);
        word = "Who will be attending the meeting?";
        translate="Toplantıya kim katılacak?";
        random();
        insertData(word,translate,prmkey,database);
        word = "To whom should I address this letter?";
        translate="Bu mektubu kime ithafen yazmalıyım?";
        random();
        insertData(word,translate,prmkey,database);
        word = "With whom are you going to the concert?";
        translate="Kiminle konsere gidiyorsun?";
        random();
        insertData(word,translate,prmkey,database);
        word = "Whom did you see at the store?";
        translate="Dün mağazada kimi gördün?";
        random();
        insertData(word,translate,prmkey,database);
        word = "By whom was this book written?";
        translate="Bu kim tarafından yazıldı?";
        random();
        insertData(word,translate,prmkey,database);

        word = "For whom is this package?";
        translate="Bu paket kime ait?";
        random();
        insertData(word,translate,prmkey,database);
        word = "Whose coat is this?";
        translate="Bu kimin ceketi?";
        random();
        insertData(word,translate,prmkey,database);
        word = "Whose idea was it to go on a trip?";
        translate="Seyahate çıkmak kimin fikriydi?";
        random();
        insertData(word,translate,prmkey,database);
        word = "Whose books are these?";
        translate="Bunlar kimin kitapları?";
        random();
        insertData(word,translate,prmkey,database);
        word = "Which movie do you want to watch?";
        translate="Hangi filmi izlemek istersin?";
        random();
        insertData(word,translate,prmkey,database);
        word = "Which of these shirts do you like the most?";
        translate="Bu gömleklerden hangisini en çok beğeniyorsun?";
        random();
        insertData(word,translate,prmkey,database);
        word = "Which road should we take?";
        translate="Hangi yoldan gitmeliyim?";
        random();
        insertData(word,translate,prmkey,database);
        word = "Which one is yours?";
        translate="Hangisi senin?";
        random();
        insertData(word,translate,prmkey,database);
        word = "Which dessert would you like?";
        translate="Hangi tatlıyı istersin?";
        random();
        insertData(word,translate,prmkey,database);
        word = "What happened here?";
        translate="Burada ne oldu?";
        random();
        insertData(word,translate,prmkey,database);
        word = "Who is the author of this book?";
        translate="Bu kitabın yazarı kim?";
        random();
        insertData(word,translate,prmkey,database);
        word = "Whom did you meet at the party?";
        translate="Partide kiminle tanıştın?";
        random();
        insertData(word,translate,prmkey,database);
        word = "Who made the cake?";
        translate="Bu keki kim yaptı?";
        random();
        insertData(word,translate,prmkey,database);
        word = "To whom did you give the book?";
        translate="Kitabı kime verdin?";
        random();
        insertData(word,translate,prmkey,database);
        word = "Who will be the next speaker?";
        translate="Bir sonraki konuşmacı kim?";
        random();
        insertData(word,translate,prmkey,database);


    }

    private void number()
    {
        packet_name = "Sayılar";
        prmkey = random();
        createPacket(packet_name,prmkey,database);

        word = "One";
        translate="Bir";
        random();
        insertData(word,translate,prmkey,database);

        word = "Two";
        translate="İki";
        random();
        insertData(word,translate,prmkey,database);

        word = "Three";
        translate="Üç";
        random();
        insertData(word,translate,prmkey,database);

        word = "Four";
        translate="Dört";
        random();
        insertData(word,translate,prmkey,database);

        word = "Five";
        translate="Beş";
        random();
        insertData(word,translate,prmkey,database);

        word = "Six";
        translate="Altı";
        random();
        insertData(word,translate,prmkey,database);

        word = "Seven";
        translate="Yedi";
        random();
        insertData(word,translate,prmkey,database);

        word = "Eight";
        translate="Sekiz";
        random();
        insertData(word,translate,prmkey,database);

        word = "Nine";
        translate="Dokuz";
        random();
        insertData(word,translate,prmkey,database);

        word = "Ten";
        translate="On";
        random();
        insertData(word,translate,prmkey,database);

        word = "Eleven";
        translate="Onbir";
        random();
        insertData(word,translate,prmkey,database);

        word = "Twelve";
        translate="Oniki";
        random();
        insertData(word,translate,prmkey,database);

        word = "Thirteen";
        translate="Onüç";
        random();
        insertData(word,translate,prmkey,database);

        word = "Fourteen";
        translate="Ondört";
        random();
        insertData(word,translate,prmkey,database);

        word = "Fifteen";
        translate="Onbeş";
        random();
        insertData(word,translate,prmkey,database);

        word = "Sixteen";
        translate="Onaltı";
        random();
        insertData(word,translate,prmkey,database);
        word = "Seventeen";
        translate="Onyedi";
        random();
        word = "Eighteen";
        translate="Onsekiz";
        random();
        insertData(word,translate,prmkey,database);
        word = "Nineteen";
        translate="Ondokuz";
        random();
        insertData(word,translate,prmkey,database);
        word = "Twenty";
        translate="Yirmi";
        random();
        insertData(word,translate,prmkey,database);


        word = "Thirty";
        translate="Otuz";
        random();
        insertData(word,translate,prmkey,database);

        word = "Forty";
        translate="Kırk";
        random();
        insertData(word,translate,prmkey,database);

        word = "Fifty";
        translate="Elli";
        random();
        insertData(word,translate,prmkey,database);

        word = "Sixty";
        translate="Atmış";
        random();
        insertData(word,translate,prmkey,database);

        word = "Seventy";
        translate="Yetmiş";
        random();
        insertData(word,translate,prmkey,database);


        word = "Eighty";
        translate="Seksen";
        random();
        insertData(word,translate,prmkey,database);


        word = "Ninety";
        translate="Doksan";
        random();
        insertData(word,translate,prmkey,database);


        word = "One hundred";
        translate="Yüz";
        random();
        insertData(word,translate,prmkey,database);


        word = "One million";
        translate="Bir milyon";
        random();
        insertData(word,translate,prmkey,database);

        word = "First";
        translate="Birinci";
        random();
        insertData(word,translate,prmkey,database);

        word = "Second";
        translate="İkinci";
        random();
        insertData(word,translate,prmkey,database);

        word = "Third";
        translate="Üçüncü";
        random();
        insertData(word,translate,prmkey,database);

        word = "Fourth";
        translate="Dördüncü";
        random();
        insertData(word,translate,prmkey,database);

        word = "Fifth";
        translate="Beşinci";
        random();
        insertData(word,translate,prmkey,database);

        word = "Sixth";
        translate="Altıncı";
        random();
        insertData(word,translate,prmkey,database);

        word = "Seventh";
        translate="Yedinci";
        random();
        insertData(word,translate,prmkey,database);

        word = "Eighth";
        translate="Sekizinci";
        random();
        insertData(word,translate,prmkey,database);

        word = "Ninth";
        translate="Dokuzuncu";
        random();
        insertData(word,translate,prmkey,database);

        word = "Tenth";
        translate="Onuncu";
        random();
        insertData(word,translate,prmkey,database);

    }

    private void view()
    {
        packet_name = "Manzara";
        prmkey = random();
        createPacket(packet_name,prmkey,database);

        word = "Canyon";
        translate="Kanyon";
        random();
        insertData(word,translate,prmkey,database);


        word = "River";
        translate="Nehir";
        random();
        insertData(word,translate,prmkey,database);


        word = "Mountain";
        translate="Dağ";
        random();
        insertData(word,translate,prmkey,database);


        word = "Bridge";
        translate="Köprü";
        random();
        insertData(word,translate,prmkey,database);


        word = "Ocean";
        translate="Okyanus";
        random();
        insertData(word,translate,prmkey,database);


        word = "Lake";
        translate="Göl";
        random();
        insertData(word,translate,prmkey,database);


        word = "Field";
        translate="Tarla";
        random();
        insertData(word,translate,prmkey,database);


        word = "Tunnel";
        translate="Tünel";
        random();
        insertData(word,translate,prmkey,database);


        word = "City";
        translate="Şehir";
        random();
        insertData(word,translate,prmkey,database);


        word = "Road";
        translate="Yol  ";
        random();
        insertData(word,translate,prmkey,database);


        word = "Sea";
        translate="Deniz";
        random();
        insertData(word,translate,prmkey,database);


        word = "Plains";
        translate="Düzlükler";
        random();
        insertData(word,translate,prmkey,database);


        word = "Woods";
        translate="Orman";
        random();
        insertData(word,translate,prmkey,database);

        word = "Town";
        translate="Kasaba";
        random();
        insertData(word,translate,prmkey,database);

        word = "Village";
        translate="Köy";
        random();
        insertData(word,translate,prmkey,database);

        word = "Volcano";
        translate="Volkan";
        random();
        insertData(word,translate,prmkey,database);

        word = "Iceberg";
        translate="Buzdağı";
        random();
        insertData(word,translate,prmkey,database);

        word = "Forest";
        translate="Orman";
        random();
        insertData(word,translate,prmkey,database);

        word = "Desert";
        translate="Çöl";
        random();
        insertData(word,translate,prmkey,database);

        word = "Island";
        translate="Ada";
        random();
        insertData(word,translate,prmkey,database);

        word = "Cave";
        translate="Mağara";
        random();
        insertData(word,translate,prmkey,database);

        word = "Waterfall";
        translate="Şelale";
        random();
        insertData(word,translate,prmkey,database);

        word = "Cliff";
        translate="Uçurum";
        random();
        insertData(word,translate,prmkey,database);

        word = "Creek";
        translate="Dere";
        random();
        insertData(word,translate,prmkey,database);

        word = "Swamp";
        translate="Bataklık";
        random();
        insertData(word,translate,prmkey,database);

        word = "Moor";
        translate="Bozkır";
        random();
        insertData(word,translate,prmkey,database);
    }

    private void health()
    {
        packet_name = "Sağlık";
        prmkey = random();
        createPacket(packet_name,prmkey,database);

        word = "Health";
        translate="Sağlık";
        random();
        insertData(word,translate,prmkey,database);


        word = "Midwife";
        translate="Ebe";
        random();
        insertData(word,translate,prmkey,database);


        word = "Patient";
        translate="Hasta";
        random();
        insertData(word,translate,prmkey,database);


        word = "Surgeon";
        translate="Cerrah";
        random();
        insertData(word,translate,prmkey,database);


        word = "Hospital";
        translate="Hastahane";
        random();
        insertData(word,translate,prmkey,database);


        word = "Go on a diet";
        translate="Diyet yapmak";
        random();
        insertData(word,translate,prmkey,database);


        word = "Eye drops";
        translate="Göz damlası";
        random();
        insertData(word,translate,prmkey,database);


        word = "Syringe";
        translate="Şırınga";
        random();
        insertData(word,translate,prmkey,database);


        word = "Syrup";
        translate="Şurup";
        random();
        insertData(word,translate,prmkey,database);


        word = "Drugs";
        translate="İlaçlar";
        random();
        insertData(word,translate,prmkey,database);


        word = "Painkiller";
        translate="Ağrı kesici";
        random();
        insertData(word,translate,prmkey,database);


        word = "Pill";
        translate="Hap";
        random();
        insertData(word,translate,prmkey,database);


        word = "Tranquilizer";
        translate="Sakinleştirici";
        random();
        insertData(word,translate,prmkey,database);


        word = "Allergy";
        translate="Alerji";
        random();
        insertData(word,translate,prmkey,database);


        word = "Bleeding";
        translate="Kanama";
        random();
        insertData(word,translate,prmkey,database);

        word = "Disease";
        translate="Hastalık";
        random();
        insertData(word,translate,prmkey,database);

        word = "Earache";
        translate="Kulak ağrısı";
        random();
        insertData(word,translate,prmkey,database);

        word = "Flu";
        translate="Grip";
        random();
        insertData(word,translate,prmkey,database);

        word = "Headache";
        translate="Baş ağrısı";
        random();
        insertData(word,translate,prmkey,database);

        word = "Heart attack";
        translate="Kalp krizi";
        random();
        insertData(word,translate,prmkey,database);

        word = "Sunburn";
        translate="Güneş yanığı";
        random();
        insertData(word,translate,prmkey,database);

        word = "Antibiotic";
        translate="Antibyotik";
        random();
        insertData(word,translate,prmkey,database);

        word = "Pulse";
        translate="Nabız";
        random();
        insertData(word,translate,prmkey,database);

        word = "Pregnancy";
        translate="Gebelik";
        random();
        insertData(word,translate,prmkey,database);

        word = "Physiotherapy";
        translate="Fizyoterapi";
        random();
        insertData(word,translate,prmkey,database);

        word = "To cough";
        translate="Öksürmek";
        random();
        insertData(word,translate,prmkey,database);

        word = "Rabies";
        translate="Kuduz";
        random();
        insertData(word,translate,prmkey,database);

        word = "Pneumonia";
        translate="Zatürree";
        random();
        insertData(word,translate,prmkey,database);

        word = "Blind";
        translate="Kör";
        random();
        insertData(word,translate,prmkey,database);

        word = "Deaf";
        translate="Sağır";
        random();
        insertData(word,translate,prmkey,database);

        word = "Treatment";
        translate="Tedavi";
        random();
        insertData(word,translate,prmkey,database);

        word = "Examine";
        translate="Muayene etmek";
        random();
        insertData(word,translate,prmkey,database);

        word = "Backache";
        translate="Sırt ağrısı";
        random();
        insertData(word,translate,prmkey,database);

        word = "Nosebleed";
        translate="Burun kanaması";
        random();
        insertData(word,translate,prmkey,database);

        word = "Jaundice";
        translate="Sarılık";
        random();
        insertData(word,translate,prmkey,database);

        word = "Hypothermia";
        translate="Hipotermi";
        random();
        insertData(word,translate,prmkey,database);

        word = "Fracture";
        translate="Kırık";
        random();
        insertData(word,translate,prmkey,database);

        word = "Dizziness";
        translate="Baş dönmesi";
        random();
        insertData(word,translate,prmkey,database);

        word = "Cramp";
        translate="Kramp";
        random();
        insertData(word,translate,prmkey,database);

        word = "Diabetes";
        translate="Diyabet";
        random();
        insertData(word,translate,prmkey,database);

        word = "Epilepsy";
        translate="Epilepsi";
        random();
        insertData(word,translate,prmkey,database);

        word = "Fatigue";
        translate="Yorgunluk";
        random();
        insertData(word,translate,prmkey,database);

        word = "Painful";
        translate="Acı";
        random();
        insertData(word,translate,prmkey,database);
    }

    private void sport()
    {
        packet_name = "Spor";
        prmkey = random();
        createPacket(packet_name,prmkey,database);

        word = "Athletics";
        translate="Atletizm";
        random();
        insertData(word,translate,prmkey,database);


        word = "Baseball";
        translate="Bezbol";
        random();
        insertData(word,translate,prmkey,database);


        word = "Basketball";
        translate="Basketbol";
        random();
        insertData(word,translate,prmkey,database);


        word = "Billiards";
        translate="Bilardo";
        random();
        insertData(word,translate,prmkey,database);


        word = "Diving";
        translate="Dalış";
        random();
        insertData(word,translate,prmkey,database);


        word = "Football";
        translate="Futbol";
        random();
        insertData(word,translate,prmkey,database);


        word = "Gymnastics";
        translate="Jimnastik";
        random();
        insertData(word,translate,prmkey,database);


        word = "Horse racing";
        translate="At yarışı";
        random();
        insertData(word,translate,prmkey,database);


        word = "Jogging";
        translate="Koşu";
        random();
        insertData(word,translate,prmkey,database);


        word = "Paragliding";
        translate="Yamaç paraşütü";
        random();
        insertData(word,translate,prmkey,database);


        word = "Rowing";
        translate="Kürek çekme";
        random();
        insertData(word,translate,prmkey,database);


        word = "Volleyball";
        translate="Voleybol";
        random();
        insertData(word,translate,prmkey,database);


        word = "Weightlifting";
        translate="Ağırlık kaldırma";
        random();
        insertData(word,translate,prmkey,database);
    }

    private void office()
    {
        packet_name = "Ofis";
        prmkey = random();
        createPacket(packet_name,prmkey,database);

        word = "Office";
        translate="Ofis";
        random();
        insertData(word,translate,prmkey,database);

        word = "Paper";
        translate="Kağıt";
        random();
        insertData(word,translate,prmkey,database);

        word = "File";
        translate="Dosya";
        random();
        insertData(word,translate,prmkey,database);

        word = "Folder";
        translate="Klasör";
        random();
        insertData(word,translate,prmkey,database);


        word = "Cupboard";
        translate="Dolap";
        random();
        insertData(word,translate,prmkey,database);

        word = "Printer";
        translate="Yazıcı";
        random();
        insertData(word,translate,prmkey,database);


        word = "Plant";
        translate="Bitki";
        random();
        insertData(word,translate,prmkey,database);


        word = "Telephone";
        translate="Telefon";
        random();
        insertData(word,translate,prmkey,database);


        word = "Chair";
        translate="Sandalye";
        random();
        insertData(word,translate,prmkey,database);


        word = "Photocopier";
        translate="Fotokopi makinası";
        random();
        insertData(word,translate,prmkey,database);


        word = "Briefcase";
        translate="Evrak çantası";
        random();
        insertData(word,translate,prmkey,database);


        word = "Pen";
        translate="Kalem";
        random();
        insertData(word,translate,prmkey,database);


        word = "Calculator";
        translate="Hesap makinası";
        random();
        insertData(word,translate,prmkey,database);


        word = "Stapler";
        translate="Zımba";
        random();
        insertData(word,translate,prmkey,database);


        word = "Hole punch";
        translate="Delgeç";
        random();
        insertData(word,translate,prmkey,database);


        word = "Desk";
        translate="Masa";
        random();
        insertData(word,translate,prmkey,database);


        word = "Projector";
        translate="Projektör";
        random();
        insertData(word,translate,prmkey,database);


        word = "Safe";
        translate="Kasa";
        random();
        insertData(word,translate,prmkey,database);


        word = "Seal";
        translate="Mühür";
        random();
        insertData(word,translate,prmkey,database);


        word = "Stamp";
        translate="Kaşe";
        random();
        insertData(word,translate,prmkey,database);


        word = "Eraser";
        translate="Silgi";
        random();
        insertData(word,translate,prmkey,database);


        word = "Notepad";
        translate="Not defteri";
        random();
        insertData(word,translate,prmkey,database);


        word = "Board markers";
        translate="Tahta kalemi";
        random();
        insertData(word,translate,prmkey,database);


        word = "Pushpin";
        translate="Raptiye";
        random();
        insertData(word,translate,prmkey,database);


        word = "Waste basket";
        translate="Çöp kutusu";
        random();
        insertData(word,translate,prmkey,database);


        word = "Pencil sharpener";
        translate="Kalemtraş";
        random();
        insertData(word,translate,prmkey,database);
    }

    private void computer()
    {
        packet_name = "Bilgisayar - Yazılım";
        prmkey = random();
        createPacket(packet_name,prmkey,database);


        word = "Animation";
        translate="Animasyon";
        random();
        insertData(word,translate,prmkey,database);

        word = "App";
        translate="Uygulama";
        random();
        insertData(word,translate,prmkey,database);

        word = "Browser";
        translate="Tarayıcı";
        random();
        insertData(word,translate,prmkey,database);

        word = "Bug";
        translate="Yazılım hatası";
        random();
        insertData(word,translate,prmkey,database);

        word = "Backup";
        translate="Yedekleme";
        random();
        insertData(word,translate,prmkey,database);

        word = "Cache";
        translate="Önbellek";
        random();
        insertData(word,translate,prmkey,database);

        word = "Captcha code";
        translate="Güvenlik kodu";
        random();
        insertData(word,translate,prmkey,database);

        word = "Online";
        translate="Çevrimiçi";
        random();
        insertData(word,translate,prmkey,database);

        word = "Offline";
        translate="Çevrimdışı";
        random();
        insertData(word,translate,prmkey,database);

        word = "Password";
        translate="Parola";
        random();
        insertData(word,translate,prmkey,database);

        word = "Plug-in";
        translate="Eklenti";
        random();
        insertData(word,translate,prmkey,database);

        word = "Reboot";
        translate="Tekrar başlatmak";
        random();
        insertData(word,translate,prmkey,database);

        word = "Resolution";
        translate="Çözünürlük";
        random();
        insertData(word,translate,prmkey,database);

        word = "Search engine";
        translate="Arama motoru";
        random();
        insertData(word,translate,prmkey,database);

        word = "Software";
        translate="Yazılım";
        random();
        insertData(word,translate,prmkey,database);

        word = "Storage";
        translate="Depolama";
        random();
        insertData(word,translate,prmkey,database);

        word = "Virtual";
        translate="Sanal";
        random();
        insertData(word,translate,prmkey,database);

        word = "Import";
        translate="İçe aktar";
        random();
        insertData(word,translate,prmkey,database);

        word = "Hardware";
        translate="Donanım";
        random();
        insertData(word,translate,prmkey,database);
        word = "Keyword";
        translate="Anahtar kelime";
        random();
        insertData(word,translate,prmkey,database);

        word = "Toolbar";
        translate="Araç çubuğu";
        random();
        insertData(word,translate,prmkey,database);

        word = "Template";
        translate="Şablon";
        random();
        insertData(word,translate,prmkey,database);

        word = "Convert";
        translate="Dönüştürmek";
        random();
        insertData(word,translate,prmkey,database);
    }

    private void tools()
    {
        packet_name = "Aletler";
        prmkey = random();
        createPacket(packet_name,prmkey,database);


        word = "Tools";
        translate="Aletler";
        random();
        insertData(word,translate,prmkey,database);

        word = "Equipment";
        translate="Ekipmanlar";
        random();
        insertData(word,translate,prmkey,database);

        word = "Paintbrush";
        translate="Boya fırçası";
        random();
        insertData(word,translate,prmkey,database);

        word = "Paint";
        translate="Boya";
        random();
        insertData(word,translate,prmkey,database);

        word = "Stepladder";
        translate="Merdiven";
        random();
        insertData(word,translate,prmkey,database);

        word = "Hammer";
        translate="Çekiç";
        random();
        insertData(word,translate,prmkey,database);

        word = "Nail";
        translate="Çivi";
        random();
        insertData(word,translate,prmkey,database);

        word = "Screw";
        translate="Vida";
        random();
        insertData(word,translate,prmkey,database);

        word = "Screwdriver";
        translate="Tornavida";
        random();
        insertData(word,translate,prmkey,database);

        word = "Drill";
        translate="Matkap";
        random();
        insertData(word,translate,prmkey,database);

        word = "Pliers";
        translate="Kerpeten";
        random();
        insertData(word,translate,prmkey,database);

        word = "Toolbox";
        translate="Alet kutusu";
        random();
        insertData(word,translate,prmkey,database);

        word = "Saw";
        translate="Testere";
        random();
        insertData(word,translate,prmkey,database);


        word = "Axe";
        translate="Balta";
        random();
        insertData(word,translate,prmkey,database);

        word = "Cutter";
        translate="Maket bıçağı";
        random();
        insertData(word,translate,prmkey,database);

        word = "Broom";
        translate="Süpürge";
        random();
        insertData(word,translate,prmkey,database);


        word = "Bucket";
        translate="Kova";
        random();
        insertData(word,translate,prmkey,database);

        word = "Scissors";
        translate="Makas";
        random();
        insertData(word,translate,prmkey,database);

        word = "Flashlight";
        translate="El feneri";
        random();
        insertData(word,translate,prmkey,database);
    }

    private void art()
    {
        packet_name = "Sanat";
        prmkey = random();
        createPacket(packet_name,prmkey,database);

        word = "Art";
        translate="Sanat";
        random();
        insertData(word,translate,prmkey,database);

        word = "Art gallery";
        translate="Sanat galerisi";
        random();
        insertData(word,translate,prmkey,database);

        word = "Artist";
        translate="Sanatçı";
        random();
        insertData(word,translate,prmkey,database);


        word = "Classic";
        translate="Klasik";
        random();
        insertData(word,translate,prmkey,database);

        word = "Collection";
        translate="Koleksiyon";
        random();
        insertData(word,translate,prmkey,database);

        word = "Colour";
        translate="Renk";
        random();
        insertData(word,translate,prmkey,database);

        word = "Crafts";
        translate="El sanatları";
        random();
        insertData(word,translate,prmkey,database);

        word = "Culture";
        translate="Kültür";
        random();
        insertData(word,translate,prmkey,database);

        word = "Design";
        translate="Dizayn";
        random();
        insertData(word,translate,prmkey,database);

        word = "Exhibit";
        translate="Sergilemek";
        random();
        insertData(word,translate,prmkey,database);

        word = "Focus";
        translate="Odak";
        random();
        insertData(word,translate,prmkey,database);

        word = "Background";
        translate="Arka plan";
        random();
        insertData(word,translate,prmkey,database);

        word = "Graphic";
        translate="Grafik";
        random();
        insertData(word,translate,prmkey,database);

        word = "Imagination";
        translate="Hayal gücü";
        random();
        insertData(word,translate,prmkey,database);

        word = "Oil paint";
        translate="Yağlı boya";
        random();
        insertData(word,translate,prmkey,database);

        word = "Outline";
        translate="Taslak";
        random();
        insertData(word,translate,prmkey,database);

        word = "Painter";
        translate="Ressam";
        random();
        insertData(word,translate,prmkey,database);

        word = "Portrait";
        translate="Portre";
        random();
        insertData(word,translate,prmkey,database);

        word = "Popular";
        translate="Popüler";
        random();
        insertData(word,translate,prmkey,database);

        word = "Skill";
        translate="Beceri";
        random();
        insertData(word,translate,prmkey,database);

        word = "Technique ";
        translate="Teknik";
        random();
        insertData(word,translate,prmkey,database);

        word = "Tone";
        translate="Ton";
        random();
        insertData(word,translate,prmkey,database);

        word = "Visual";
        translate="Görsel";
        random();
        insertData(word,translate,prmkey,database);

        word = "Landscape";
        translate="Manzara";
        random();
        insertData(word,translate,prmkey,database);

        word = "Emotion";
        translate="Duygu";
        random();
        insertData(word,translate,prmkey,database);

        word = "Composition";
        translate="Kompozisyon";
        random();
        insertData(word,translate,prmkey,database);

        word = "Canvas";
        translate="Tuval";
        random();
        insertData(word,translate,prmkey,database);

        word = "Perspective";
        translate="Perspektif";
        random();
        insertData(word,translate,prmkey,database);

        word = "Dramatic";
        translate="Dramatik";
        random();
        insertData(word,translate,prmkey,database);

        word = "Celebrity";
        translate="Şöhret";
        random();
        insertData(word,translate,prmkey,database);

        word = "Abstarct";
        translate="Soyut";
        random();
        insertData(word,translate,prmkey,database);

        word = "Realistic";
        translate="Gerçekçi";
        random();
        insertData(word,translate,prmkey,database);

        word = "Shadow";
        translate="Gölge";
        random();
        insertData(word,translate,prmkey,database);

        word = "Texture";
        translate="Doku";
        random();
        insertData(word,translate,prmkey,database);

        word = "Unique";
        translate="Benzersiz";
        random();
        insertData(word,translate,prmkey,database);

        word = "Viewpoint";
        translate="Bakış açısı";
        random();
        insertData(word,translate,prmkey,database);

        word = "Statue";
        translate="Heykel";
        random();
        insertData(word,translate,prmkey,database);
    }

    private void trade()
    {
        packet_name = "Ticaret";
        prmkey = random();
        createPacket(packet_name,prmkey,database);

        word = "Advantage";
        translate="Avantaj";
        random();
        insertData(word,translate,prmkey,database);

        word = "Advertise";
        translate="Duyurmak";
        random();
        insertData(word,translate,prmkey,database);

        word = "Advice";
        translate="Tavsiye Etmek";
        random();
        insertData(word,translate,prmkey,database);

        word = "Authorization";
        translate="Yetki";
        random();
        insertData(word,translate,prmkey,database);

        word = "Brand";
        translate="Marka";
        random();
        insertData(word,translate,prmkey,database);

        word = "Commission";
        translate="Komisyon";
        random();
        insertData(word,translate,prmkey,database);


        word = "Customer";
        translate="Müşteri";
        random();
        insertData(word,translate,prmkey,database);

        word = "Creditor";
        translate="Alacaklı";
        random();
        insertData(word,translate,prmkey,database);

        word = "Deadline";
        translate="Son tarih";
        random();
        insertData(word,translate,prmkey,database);

        word = "Debt";
        translate="Borç";
        random();
        insertData(word,translate,prmkey,database);

        word = "Description";
        translate="Tanım";
        random();
        insertData(word,translate,prmkey,database);

        word = "Disadvantage";
        translate="Dezavantaj";
        random();
        insertData(word,translate,prmkey,database);


        word = "Employee";
        translate="İşçi";
        random();
        insertData(word,translate,prmkey,database);

        word = "Employer";
        translate="İşveren";
        random();
        insertData(word,translate,prmkey,database);

        word = "Experience";
        translate="Deneyim";
        random();
        insertData(word,translate,prmkey,database);

        word = "Factory";
        translate="Fabrika";
        random();
        insertData(word,translate,prmkey,database);

        word = "Goal";
        translate="Hedef";
        random();
        insertData(word,translate,prmkey,database);

        word = "Industry";
        translate="Sanayi";
        random();
        insertData(word,translate,prmkey,database);

        word = "Instructions";
        translate="Talimatlar";
        random();
        insertData(word,translate,prmkey,database);

        word = "Invoice";
        translate="Fatura";
        random();
        insertData(word,translate,prmkey,database);

        word = "Order";
        translate="Sipariş";
        random();
        insertData(word,translate,prmkey,database);

        word = "Payment";
        translate="Ödeme";
        random();
        insertData(word,translate,prmkey,database);

        word = "Production";
        translate="Üretim";
        random();
        insertData(word,translate,prmkey,database);

        word = "Product";
        translate="Ürün";
        random();
        insertData(word,translate,prmkey,database);

        word = "Profit";
        translate="Kar";
        random();
        insertData(word,translate,prmkey,database);

        word = "Purchase";
        translate="Satın almak";
        random();
        insertData(word,translate,prmkey,database);

        word = "Pay";
        translate="Ödemek";
        random();
        insertData(word,translate,prmkey,database);

        word = "Transport";
        translate="Taşıma";
        random();
        insertData(word,translate,prmkey,database);

        word = "Interest";
        translate="Faiz";
        random();
        insertData(word,translate,prmkey,database);
    }

    private void law()
    {
        packet_name = "Hukuk ve Kanun";
        prmkey = random();
        createPacket(packet_name,prmkey,database);

        word = "Law";
        translate="Kanun";
        random();
        insertData(word,translate,prmkey,database);

        word = "Arson";
        translate="Kundakçılık";
        random();
        insertData(word,translate,prmkey,database);

        word = "Arrest";
        translate="Tutuklama";
        random();
        insertData(word,translate,prmkey,database);

        word = "Assault";
        translate="Saldırı";
        random();
        insertData(word,translate,prmkey,database);

        word = "Claim";
        translate="İddia";
        random();
        insertData(word,translate,prmkey,database);

        word = "Complaint";
        translate="Şikayet";
        random();
        insertData(word,translate,prmkey,database);

        word = "Confess";
        translate="İtiraf etmek";
        random();
        insertData(word,translate,prmkey,database);

        word = "Constitution";
        translate="Anayasa";
        random();
        insertData(word,translate,prmkey,database);

        word = "Court";
        translate="Mahkeme";
        random();
        insertData(word,translate,prmkey,database);

        word = "Criminal";
        translate="Sabıkalı";
        random();
        insertData(word,translate,prmkey,database);

        word = "Custody";
        translate="Gözaltı";
        random();
        insertData(word,translate,prmkey,database);

        word = "Defendant";
        translate="Sanık";
        random();
        insertData(word,translate,prmkey,database);

        word = "Ethics";
        translate="Ahlak";
        random();
        insertData(word,translate,prmkey,database);

        word = "Evidence";
        translate="Kanıt";
        random();
        insertData(word,translate,prmkey,database);

        word = "Fraud";
        translate="Dolandırıcılık";
        random();
        insertData(word,translate,prmkey,database);

        word = "Handcuff";
        translate="Kelepçe";
        random();
        insertData(word,translate,prmkey,database);

        word = "Hearsay";
        translate="Söylenti";
        random();
        insertData(word,translate,prmkey,database);

        word = "Jail";
        translate="Hapis";
        random();
        insertData(word,translate,prmkey,database);

        word = "Justice";
        translate="Adalet";
        random();
        insertData(word,translate,prmkey,database);

        word = "Theft";
        translate="Hırsızlık";
        random();
        insertData(word,translate,prmkey,database);

        word = "Prison";
        translate="Cezaevi";
        random();
        insertData(word,translate,prmkey,database);

        word = "Police station";
        translate="Polis merkezi";
        random();
        insertData(word,translate,prmkey,database);

        word = "Lawsuit";
        translate="Dava";
        random();
        insertData(word,translate,prmkey,database);

        word = "Murder";
        translate="Cinayet";
        random();
        insertData(word,translate,prmkey,database);

        word = "Petition";
        translate="Dilekçe";
        random();
        insertData(word,translate,prmkey,database);
    }

    private void future_tense()
    {
        packet_name = "Gelecek Zaman";
        prmkey = random();
        createPacket(packet_name,prmkey,database);


        word = "I will not eat lunch.";
        translate="Ben öğle yemeği yemeyeceğim";
        random();
        insertData(word,translate,prmkey,database);

        word = "She will go to school on this monday.";
        translate="O bu pazartesi okula gidecek";
        random();
        insertData(word,translate,prmkey,database);

        word = "They will get marry in the future.";
        translate="Onlar gelecekte evlenecek.";
        random();
        insertData(word,translate,prmkey,database);

        word = "He will use my computer.";
        translate="O benim bilgisayarımı kullanacak.";
        random();
        insertData(word,translate,prmkey,database);

        word = "Will you stay in hotel?";
        translate="Otelde kalacak mısınız?";
        random();
        insertData(word,translate,prmkey,database);

        word = "They will not give you a gift.";
        translate="Onlar sana hediye vermeyecek.";
        random();
        insertData(word,translate,prmkey,database);

        word = "Is your friend going to come with you?";
        translate="Arkadaşın seninle gelecek mi?";
        random();
        insertData(word,translate,prmkey,database);

        word = "When are you going to graduate?";
        translate="Ne zaman mezun olacaksın?";
        random();
        insertData(word,translate,prmkey,database);

        word = "Who is going to send the letter?";
        translate="Mektubu kim gönderecek?";
        random();
        insertData(word,translate,prmkey,database);

        word = "I am going to send the letter.";
        translate="Mektubu ben göndereceğim.";
        random();
        insertData(word,translate,prmkey,database);

        word = "Why are you going to learn English?";
        translate="Neden İngilizce öğreneceksin?";
        random();
        insertData(word,translate,prmkey,database);
    }

    private void home()
    {
        packet_name = "Ev";
        prmkey = random();
        createPacket(packet_name,prmkey,database);

        word = "Sofa";
        translate="Kanepe";
        random();
        insertData(word,translate,prmkey,database);

        word = "Coffee table";
        translate="Sehpa";
        random();
        insertData(word,translate,prmkey,database);


        word = "Dining table";
        translate="Yemek masası";
        random();
        insertData(word,translate,prmkey,database);


        word = "Wardrobe";
        translate="Gardırop";
        random();
        insertData(word,translate,prmkey,database);


        word = "Bookshelf ";
        translate="Kitaplık";
        random();
        insertData(word,translate,prmkey,database);


        word = "Dresser";
        translate="Şifonyer";
        random();
        insertData(word,translate,prmkey,database);

        word = "Nightstand";
        translate="Komodin";
        random();
        insertData(word,translate,prmkey,database);

        word = "Lampshade";
        translate="Abajur";
        random();
        insertData(word,translate,prmkey,database);

        word = "Knife";
        translate="Bıçak";
        random();
        insertData(word,translate,prmkey,database);

        word = "Fork";
        translate="Çatal";
        random();
        insertData(word,translate,prmkey,database);

        word = "Spoon";
        translate="Kaşık";
        random();
        insertData(word,translate,prmkey,database);

        word = "Plate";
        translate="Tabak";
        random();
        insertData(word,translate,prmkey,database);

        word = "Rug";
        translate="Halı";
        random();
        insertData(word,translate,prmkey,database);

        word = "Mirror";
        translate="Ayna";
        random();
        insertData(word,translate,prmkey,database);

        word = "Bedroom";
        translate="Yatak odası";
        random();
        insertData(word,translate,prmkey,database);

        word = "Living room";
        translate="Oturma odası";
        random();
        insertData(word,translate,prmkey,database);

        word = "Kitchen";
        translate="Mutfak";
        random();
        insertData(word,translate,prmkey,database);

        word = "Bathroom";
        translate="Banyo";
        random();
        insertData(word,translate,prmkey,database);
    }

    private void music()
    {
        packet_name = "Müzik";
        prmkey = random();
        createPacket(packet_name,prmkey,database);

        word = "Violin";
        translate="Keman";
        random();
        insertData(word,translate,prmkey,database);

        word = "Saxophone";
        translate="Saksafon";
        random();
        insertData(word,translate,prmkey,database);

        word = "Clarinet";
        translate="Klarnet";
        random();
        insertData(word,translate,prmkey,database);

        word = "Beat";
        translate="Tempo";
        random();
        insertData(word,translate,prmkey,database);

        word = "Tune";
        translate="Melodi";
        random();
        insertData(word,translate,prmkey,database);

        word = "Acoustic";
        translate="Akustik";
        random();
        insertData(word,translate,prmkey,database);

        word = "Headphones";
        translate="Kulaklık";
        random();
        insertData(word,translate,prmkey,database);

        word = "Guitar";
        translate="Gitar";
        random();
        insertData(word,translate,prmkey,database);
    }

    private void countr()
    {
        packet_name = "Ülkeler";
        prmkey = random();
        createPacket(packet_name,prmkey,database);

        word = "Scotland";
        translate="İskoçya";
        random();
        insertData(word,translate,prmkey,database);

        word = "Russia";
        translate="Rusya";
        random();
        insertData(word,translate,prmkey,database);

        word = "Ireland";
        translate="İrlanda";
        random();
        insertData(word,translate,prmkey,database);


        word = "Japan";
        translate="Japonya";
        random();
        insertData(word,translate,prmkey,database);

        word = "Denmark";
        translate="Danimarka";
        random();
        insertData(word,translate,prmkey,database);

        word = "Finland";
        translate="Finlandiya";
        random();
        insertData(word,translate,prmkey,database);

        word = "Norway";
        translate="Norveç";
        random();
        insertData(word,translate,prmkey,database);

        word = "Sweden";
        translate="İsveç";
        random();
        insertData(word,translate,prmkey,database);

        word = "Switzerland";
        translate="İsviçre";
        random();
        insertData(word,translate,prmkey,database);

        word = "France";
        translate="Fransa";
        random();
        insertData(word,translate,prmkey,database);

        word = "Germany";
        translate="Almanya";
        random();
        insertData(word,translate,prmkey,database);

        word = "Netherlands";
        translate="Hollanda";
        random();
        insertData(word,translate,prmkey,database);


        word = "Ukraine";
        translate="Ukrayna";
        random();
        insertData(word,translate,prmkey,database);


        word = "Bulgaria";
        translate="Bulgaristan";
        random();
        insertData(word,translate,prmkey,database);


        word = "Portugal";
        translate="Portekiz";
        random();
        insertData(word,translate,prmkey,database);


        word = "Turkey";
        translate="Türkiye";
        random();
        insertData(word,translate,prmkey,database);


        word = "India";
        translate="Hindistan";
        random();
        insertData(word,translate,prmkey,database);


        word = "Greece";
        translate="Yunanistan";
        random();
        insertData(word,translate,prmkey,database);


        word = "Hungary";
        translate="Macaristan";
        random();
        insertData(word,translate,prmkey,database);

        word = "Asia";
        translate="Asya";
        random();
        insertData(word,translate,prmkey,database);

        word = "Europe";
        translate="Avrupa";
        random();
        insertData(word,translate,prmkey,database);

        word = "America";
        translate="Amerika";
        random();
        insertData(word,translate,prmkey,database);

        word = "Africa";
        translate="Afrika";
        random();
        insertData(word,translate,prmkey,database);

        word = "Antarctica";
        translate="Antarktika";
        random();
        insertData(word,translate,prmkey,database);





        word = "Turkish";
        translate="Türkçe";
        random();
        insertData(word,translate,prmkey,database);

        word = "Spanish";
        translate="İspanyolca";
        random();
        insertData(word,translate,prmkey,database);

        word = "Greek";
        translate="Yunanca";
        random();
        insertData(word,translate,prmkey,database);

        word = "Armenian";
        translate="Ermenice";
        random();
        insertData(word,translate,prmkey,database);

        word = "Arabic";
        translate="Arapça";
        random();
        insertData(word,translate,prmkey,database);

        word = "Hindi";
        translate="Hintçe";
        random();
        insertData(word,translate,prmkey,database);

        word = "Chinese";
        translate="Çince";
        random();
        insertData(word,translate,prmkey,database);

        word = "Portuguese";
        translate="Portekizce";
        random();
        insertData(word,translate,prmkey,database);

        word = "Russian";
        translate="Rusça";
        random();
        insertData(word,translate,prmkey,database);

        word = "French";
        translate="Fransızca";
        random();
        insertData(word,translate,prmkey,database);

        word = "Italian";
        translate="İtalyanca";
        random();
        insertData(word,translate,prmkey,database);

        word = "Japanese";
        translate="Japonca";
        random();
        insertData(word,translate,prmkey,database);

        word = "German";
        translate="Almanca";
        random();
        insertData(word,translate,prmkey,database);
    }

    private void shopping()
    {
        packet_name = "Alış Veriş";
        prmkey = random();
        createPacket(packet_name,prmkey,database);

        word = "Shopping";
        translate="Alışveriş";
        random();
        insertData(word,translate,prmkey,database);

        word = "Shopping centre";
        translate="Alışveriş merkezi";
        random();
        insertData(word,translate,prmkey,database);

        word = "How much is it?";
        translate="Fiyatı nedir?";
        random();
        insertData(word,translate,prmkey,database);

        word = "Have you got this in different colours?";
        translate="Bunun farklı renkleri var mı?";
        random();
        insertData(word,translate,prmkey,database);

        word = "Is this the last price for this shirt?";
        translate="Bu gömlek için son fiyat bu mudur?";
        random();
        insertData(word,translate,prmkey,database);

        word = "Can you make a reduction for the dress?";
        translate="Bu elbise için indirim yapabilir misiniz?";
        random();
        insertData(word,translate,prmkey,database);

        word = "Can I pay by card?";
        translate="Kartla ödeyebilir miyim?";
        random();
        insertData(word,translate,prmkey,database);

        word = "Could gift-wrap it?";
        translate="Hediye paketi yapabilir misiniz?";
        random();
        insertData(word,translate,prmkey,database);

        word = "It is too tight";
        translate="Çok dar.";
        random();
        insertData(word,translate,prmkey,database);

        word = "It is too loose.";
        translate="Çok geniş";
        random();
        insertData(word,translate,prmkey,database);

        word = "How can I help you?";
        translate="Size nasıl yardımcı olabilirim?";
        random();
        insertData(word,translate,prmkey,database);

        word = "Can you help me?";
        translate="Bana yardım edebilir misiniz?";
        random();
        insertData(word,translate,prmkey,database);

        word = "I want to return this.";
        translate="Bunu iade etmek istiyorum";
        random();
        insertData(word,translate,prmkey,database);

        word = "Where is the fitting room?";
        translate="Deneme kabini nerede?";
        random();
        insertData(word,translate,prmkey,database);

        word = "What size do you wear?";
        translate="Kaç beden giyiyorsunuz?";
        random();
        insertData(word,translate,prmkey,database);

        word = "Do you have this in different sizes?";
        translate="Bunun başka bedenleri var mıdır?";
        random();
        insertData(word,translate,prmkey,database);

        word = "My size is medium";
        translate="Medium beden giyiyorum.";
        random();
        insertData(word,translate,prmkey,database);

        word = "How does it look?";
        translate="Nasıl gözüküyor?";
        random();
        insertData(word,translate,prmkey,database);

        word = "How would you like to pay?";
        translate="Nasıl ödemek istersiniz?";
        random();
        insertData(word,translate,prmkey,database);

        word = "Will that be cash or credit?";
        translate="Nakit mi kredi kartı mı?";
        random();
        insertData(word,translate,prmkey,database);

        word = "We do not have it in your size.";
        translate="Bunun size göre olan bedeni yok.";
        random();
        insertData(word,translate,prmkey,database);

        word = "Thank you, I am just looking.";
        translate="Teşekkürler, sadece bakıyorum.";
        random();
        insertData(word,translate,prmkey,database);

        word = "That is too expensive.";
        translate="Çok pahalı.";
        random();
        insertData(word,translate,prmkey,database);

        word = "That looks nice on you";
        translate="Üzerinizde güzel durdu";
        random();
        insertData(word,translate,prmkey,database);
    }

    private void exm_senteces()
    {
        packet_name = "Örnek Cümleler";
        prmkey = random();
        createPacket(packet_name,prmkey,database);

        word = "I lost my pen.";
        translate="Kalemimi kaybettim";
        random();
        insertData(word,translate,prmkey,database);

        word = "I am drinking coffee";
        translate="Kahve içiyorum.";
        random();
        insertData(word,translate,prmkey,database);

        word = "You are so handsome.";
        translate="Çok yakışıklısın.";
        random();
        insertData(word,translate,prmkey,database);

        word = "I love you.";
        translate="Seni seviyorum";
        random();
        insertData(word,translate,prmkey,database);


        word = "Are you coming with me?";
        translate="Benimle geliyor musun?";
        random();
        insertData(word,translate,prmkey,database);

        word = "What do you need?";
        translate="Neye ihtiyacın var?";
        random();
        insertData(word,translate,prmkey,database);


        word = "What happened?";
        translate="Ne oldu?";
        random();
        insertData(word,translate,prmkey,database);


        word = "I admire you.";
        translate="Sana hayranım.";
        random();
        insertData(word,translate,prmkey,database);


        word = "I got it.";
        translate="Anladım";
        random();
        insertData(word,translate,prmkey,database);


        word = "I hope so.";
        translate="Umarım.";
        random();
        insertData(word,translate,prmkey,database);


        word = "Nice to meet you.";
        translate="Tanıştığıma memnun oldum";
        random();
        insertData(word,translate,prmkey,database);


        word = "See you later.";
        translate="Sonra görüşürüz.";
        random();
        insertData(word,translate,prmkey,database);


        word = "I have no idea.";
        translate="Fikrim yok.";
        random();
        insertData(word,translate,prmkey,database);


        word = "I am not hungry.";
        translate="Aç değilim.";
        random();
        insertData(word,translate,prmkey,database);


        word = "Are you okay? You look pale.";
        translate="İyi misin? Yorgun gözüküyorsun.";
        random();
        insertData(word,translate,prmkey,database);


        word = "You broke my favorite necklace.";
        translate="En sevdiğim kolyemi kırdın.";
        random();
        insertData(word,translate,prmkey,database);


        word = "I will call you.";
        translate="Seni arayacağım.";
        random();
        insertData(word,translate,prmkey,database);

        word = "I feel good.";
        translate="İyi hissediyorum.";
        random();
        insertData(word,translate,prmkey,database);

        word = "I am so busy.";
        translate="Çok yoğunum.";
        random();
        insertData(word,translate,prmkey,database);
    }

    private void communicate()
    {
        packet_name = "İletişim";
        prmkey = random();
        createPacket(packet_name,prmkey,database);

        word = "Advertisement";
        translate="Reklam";
        random();
        insertData(word,translate,prmkey,database);

        word = "Mass media";
        translate="Kitle iletişim araçları";
        random();
        insertData(word,translate,prmkey,database);

        word = "Social Media";
        translate="Sosyal Medya";
        random();
        insertData(word,translate,prmkey,database);

        word = "Radio station";
        translate="Radyo istasyonu";
        random();
        insertData(word,translate,prmkey,database);

        word = "News";
        translate="Haberler";
        random();
        insertData(word,translate,prmkey,database);

        word = "Social network";
        translate="Sosyal Ağ";
        random();
        insertData(word,translate,prmkey,database);

        word = "Announce";
        translate="Duyurmak";
        random();
        insertData(word,translate,prmkey,database);

        word = "Listener";
        translate="Dinleyici";
        random();
        insertData(word,translate,prmkey,database);

        word = "Audience";
        translate="İzleyici";
        random();
        insertData(word,translate,prmkey,database);

        word = "Journalist";
        translate="Gazeteci";
        random();
        insertData(word,translate,prmkey,database);

        word = "Reporter";
        translate="Muhabir";
        random();
        insertData(word,translate,prmkey,database);

        word = "Documentary";
        translate="Belgesel";
        random();
        insertData(word,translate,prmkey,database);

        word = "Broadcast";
        translate="Yayın";
        random();
        insertData(word,translate,prmkey,database);

        word = "Newspaper";
        translate="Gazete";
        random();
        insertData(word,translate,prmkey,database);

        word = "Brochure";
        translate="Broşür";
        random();
        insertData(word,translate,prmkey,database);

        word = "Subtitles";
        translate="Altyazı";
        random();
        insertData(word,translate,prmkey,database);

        word = "Censorship";
        translate="Sansür";
        random();
        insertData(word,translate,prmkey,database);

        word = "Message";
        translate="Mesaj";
        random();
        insertData(word,translate,prmkey,database);

        word = "Letter";
        translate="Mektup";
        random();
        insertData(word,translate,prmkey,database);

        word = "Television";
        translate="Televizyon";
        random();
        insertData(word,translate,prmkey,database);
    }

    private void electronic_dev()
    {
        packet_name = "Elektronik Aletler";
        prmkey = random();
        createPacket(packet_name,prmkey,database);


        word = "Computer";
        translate="Bilgisayar";
        random();
        insertData(word,translate,prmkey,database);



        word = "Device";
        translate="Cihaz";
        random();
        insertData(word,translate,prmkey,database);

        word = "Fridge";
        translate="Buzdolabı";
        random();
        insertData(word,translate,prmkey,database);

        word = "Deep freezer";
        translate="Derin dondurucu";
        random();
        insertData(word,translate,prmkey,database);

        word = "Microwave oven";
        translate="Mikrodalga fırın";
        random();
        insertData(word,translate,prmkey,database);

        word = "Washing machine";
        translate="Çamaşır Makinası";
        random();
        insertData(word,translate,prmkey,database);

        word = "Dryer";
        translate="Kurutma makinası";
        random();
        insertData(word,translate,prmkey,database);

        word = "Oven";
        translate="Fırın";
        random();
        insertData(word,translate,prmkey,database);

        word = "İron";
        translate="Ütü";
        random();
        insertData(word,translate,prmkey,database);

        word = "Speaker";
        translate="Hoparlör";
        random();
        insertData(word,translate,prmkey,database);

        word = "Keyboard";
        translate="Klavye";
        random();
        insertData(word,translate,prmkey,database);

        word = "Smartphone";
        translate="Akıllı telefon";
        random();
        insertData(word,translate,prmkey,database);

        word = "Printer";
        translate="Yazıcı";
        random();
        insertData(word,translate,prmkey,database);


        word = "Screen";
        translate="Ekran";
        random();
        insertData(word,translate,prmkey,database);


        word = "Memory card";
        translate="Hafıza kartı";
        random();
        insertData(word,translate,prmkey,database);
    }

    private void body()
    {
        packet_name = "Vücut";
        prmkey = random();
        createPacket(packet_name,prmkey,database);

        word = "Head";
        translate="Baş";
        random();
        insertData(word,translate,prmkey,database);

        word = "Body";
        translate="Vücut";
        random();
        insertData(word,translate,prmkey,database);

        word = "Hair";
        translate="Saç";
        random();
        insertData(word,translate,prmkey,database);

        word = "Eye";
        translate="Göz";
        random();
        insertData(word,translate,prmkey,database);

        word = "Mouth";
        translate="Ağız";
        random();
        insertData(word,translate,prmkey,database);

        word = "Tooth";
        translate="Diş";
        random();
        insertData(word,translate,prmkey,database);

        word = "Teeth";
        translate="Dişler   ";
        random();
        insertData(word,translate,prmkey,database);


        word = "Knee";
        translate="Diz";
        random();
        insertData(word,translate,prmkey,database);

        word = "Hand";
        translate="El";
        random();
        insertData(word,translate,prmkey,database);

        word = "Face";
        translate="Yüz";
        random();
        insertData(word,translate,prmkey,database);

        word = "Ear";
        translate="Kulak";
        random();
        insertData(word,translate,prmkey,database);

        word = "Finger";
        translate="Parmak";
        random();
        insertData(word,translate,prmkey,database);

        word = "Ankle";
        translate="Ayak bileği";
        random();
        insertData(word,translate,prmkey,database);

        word = "Back";
        translate="Sırt";
        random();
        insertData(word,translate,prmkey,database);

        word = "Hip";
        translate="Kalça";
        random();
        insertData(word,translate,prmkey,database);

        word = "Beard";
        translate="Sakal";
        random();
        insertData(word,translate,prmkey,database);

        word = "Blood";
        translate="Kan";
        random();
        insertData(word,translate,prmkey,database);

        word = "Bone";
        translate="Kemik";
        random();
        insertData(word,translate,prmkey,database);

        word = "Cheek";
        translate="Yanak";
        random();
        insertData(word,translate,prmkey,database);

        word = "Chin";
        translate="Çene";
        random();
        insertData(word,translate,prmkey,database);

        word = "Elbow";
        translate="Dirsek";
        random();
        insertData(word,translate,prmkey,database);


        word = "Foot";
        translate="Ayak";
        random();
        insertData(word,translate,prmkey,database);

        word = "Feet";
        translate="Ayaklar";
        random();
        insertData(word,translate,prmkey,database);

        word = "Leg";
        translate="Bacak";
        random();
        insertData(word,translate,prmkey,database);

        word = "Lip";
        translate="Dudak";
        random();
        insertData(word,translate,prmkey,database);

        word = "Nose";
        translate="Burun";
        random();
        insertData(word,translate,prmkey,database);

        word = "Shoulder";
        translate="Omuz";
        random();
        insertData(word,translate,prmkey,database);

        word = "Skin";
        translate="Cilt";
        random();
        insertData(word,translate,prmkey,database);

        word = "Tongue";
        translate="Dil";
        random();
        insertData(word,translate,prmkey,database);
    }

    private void family()
    {
        packet_name = "Aile";
        prmkey = random();
        createPacket(packet_name,prmkey,database);

        word = "Family";
        translate="Aile";
        random();
        insertData(word,translate,prmkey,database);

        word = "Father";
        translate="Baba";
        random();
        insertData(word,translate,prmkey,database);

        word = "Mother";
        translate="Anne";
        random();
        insertData(word,translate,prmkey,database);

        word = "Son";
        translate="Oğul";
        random();
        insertData(word,translate,prmkey,database);

        word = "Daughter";
        translate="Kız çocuk";
        random();
        insertData(word,translate,prmkey,database);

        word = "Parent";
        translate="Ebeveyn";
        random();
        insertData(word,translate,prmkey,database);

        word = "Child";
        translate="Çocuk";
        random();
        insertData(word,translate,prmkey,database);


        word = "Children";
        translate="Çocuklar";
        random();
        insertData(word,translate,prmkey,database);


        word = "Husband";
        translate="Eş ( Koca )";
        random();
        insertData(word,translate,prmkey,database);


        word = "Wife";
        translate="Eş ( Bayan )";
        random();
        insertData(word,translate,prmkey,database);

        word = "Brother";
        translate="Erkek kardeş";
        random();
        insertData(word,translate,prmkey,database);


        word = "Sister";
        translate="Kız kardeş";
        random();
        insertData(word,translate,prmkey,database);


        word = "Uncle";
        translate="Amca - Dayı";
        random();
        insertData(word,translate,prmkey,database);


        word = "Aunt";
        translate="Hala - Teyze";
        random();
        insertData(word,translate,prmkey,database);


        word = "Cousin";
        translate="Kuzen";
        random();
        insertData(word,translate,prmkey,database);


        word = "Grandfather";
        translate="Dede - Büyükbaba";
        random();
        insertData(word,translate,prmkey,database);

        word = "Grandmother";
        translate="Nine - Büyükanne";
        random();
        insertData(word,translate,prmkey,database);


        word = "Marriage";
        translate="Evlilik  ";
        random();
        insertData(word,translate,prmkey,database);


        word = "Engaged";
        translate="Nişanlı";
        random();
        insertData(word,translate,prmkey,database);

        word = "Stepmother";
        translate="Üvey Anne";
        random();
        insertData(word,translate,prmkey,database);


        word = "Stepdaughter";
        translate="Üvey kız";
        random();
        insertData(word,translate,prmkey,database);


        word = "Stepson";
        translate="Üvey oğul";
        random();
        insertData(word,translate,prmkey,database);
    }

    private void adjectives()
    {
        packet_name = "Sıfatlar";
        prmkey = random();
        createPacket(packet_name,prmkey,database);

        word = "New";
        translate="Yeni";
        random();
        insertData(word,translate,prmkey,database);


        word = "Old";
        translate="Eski";
        random();
        insertData(word,translate,prmkey,database);

        word = "Big";
        translate="Büyük";
        random();
        insertData(word,translate,prmkey,database);

        word = "Small";
        translate="Küçük";
        random();
        insertData(word,translate,prmkey,database);

        word = "Large";
        translate="Geniş";
        random();
        insertData(word,translate,prmkey,database);

        word = "Different";
        translate="Farklı";
        random();
        insertData(word,translate,prmkey,database);

        word = "Little";
        translate="Az";
        random();
        insertData(word,translate,prmkey,database);

        word = "Long";
        translate="Uzun";
        random();
        insertData(word,translate,prmkey,database);

        word = "Important";
        translate="Önemli";
        random();
        insertData(word,translate,prmkey,database);

        word = "Best";
        translate="En iyi";
        random();
        insertData(word,translate,prmkey,database);

        word = "Low";
        translate="Düşük";
        random();
        insertData(word,translate,prmkey,database);

        word = "Hard";
        translate="Zor";
        random();
        insertData(word,translate,prmkey,database);

        word = "Economic";
        translate="Ekonomik";
        random();
        insertData(word,translate,prmkey,database);

        word = "Strong";
        translate="Güçlü";
        random();
        insertData(word,translate,prmkey,database);

        word = "Famous";
        translate="Ünlü";
        random();
        insertData(word,translate,prmkey,database);

        word = "Special";
        translate="Özel";
        random();
        insertData(word,translate,prmkey,database);

        word = "Easy";
        translate="Kolay";
        random();
        insertData(word,translate,prmkey,database);

        word = "Clever";
        translate="Zeki";
        random();
        insertData(word,translate,prmkey,database);

        word = "Difficult";
        translate="Zor";
        random();
        insertData(word,translate,prmkey,database);

        word = "Short";
        translate="Kısa";
        random();
        insertData(word,translate,prmkey,database);

        word = "Honest";
        translate="Dürüst";
        random();
        insertData(word,translate,prmkey,database);

        word = "Private";
        translate="Özel";
        random();
        insertData(word,translate,prmkey,database);

        word = "Poor";
        translate="Yoksul";
        random();
        insertData(word,translate,prmkey,database);

        word = "Natural";
        translate="Doğal";
        random();
        insertData(word,translate,prmkey,database);
    }

    private void emotion()
    {
        packet_name = "Duygular";
        prmkey = random();
        createPacket(packet_name,prmkey,database);

        word = "Happy";
        translate="Mutlu";
        insertData(word,translate,prmkey,database);

        word = "Unhappy";
        translate="Mutsuz";
        insertData(word,translate,prmkey,database);

        word = "Sad";
        translate="Üzgün";
        insertData(word,translate,prmkey,database);

        word = "Good";
        translate="İyi";
        insertData(word,translate,prmkey,database);

        word = "Alone";
        translate="Yalnız";
        insertData(word,translate,prmkey,database);

        word = "Reliable";
        translate="Güvenilir";
        insertData(word,translate,prmkey,database);

        word = "Terrible";
        translate="Korkunç";
        insertData(word,translate,prmkey,database);

        word = "Confused";
        translate="Şaşkın";
        insertData(word,translate,prmkey,database);

        word = "Upset";
        translate="Üzgün";
        insertData(word,translate,prmkey,database);

        word = "Shy";
        translate="Utangaç";
        insertData(word,translate,prmkey,database);

        word = "Angry";
        translate="Kızgın";
        insertData(word,translate,prmkey,database);

        word = "Nervous";
        translate="Sinirli";
        insertData(word,translate,prmkey,database);

        word = "Worried";
        translate="Endişeli";
        insertData(word,translate,prmkey,database);

        word = "Aggressive";
        translate="Agresif";
        insertData(word,translate,prmkey,database);

        word = "Indecisive";
        translate="Kararsız";
        insertData(word,translate,prmkey,database);

        word = "Embarrassed";
        translate="Mahçup";
        insertData(word,translate,prmkey,database);

        word = "Uneasy";
        translate="Huzursuz";
        insertData(word,translate,prmkey,database);

        word = "Pessimistic";
        translate="Kötümser";
        insertData(word,translate,prmkey,database);

        word = "Helpless";
        translate="Çaresiz";
        insertData(word,translate,prmkey,database);

        word = "Insensitive";
        translate="Duyarsız";
        insertData(word,translate,prmkey,database);

        word = "Optimistic";
        translate="İyimser";
        insertData(word,translate,prmkey,database);

        word = "Quiet";
        translate="Sessiz";
        insertData(word,translate,prmkey,database);

        word = "Calm";
        translate="Sakin";
        insertData(word,translate,prmkey,database);

        word = "Wonderful";
        translate="Müthiş";
        insertData(word,translate,prmkey,database);

        word = "Cheerful";
        translate="Neşeli";
        insertData(word,translate,prmkey,database);

        word = "Lucky";
        translate="Şanslı";
        insertData(word,translate,prmkey,database);

        word = "Afflicted";
        translate="Dertli";
        insertData(word,translate,prmkey,database);
    }

    private void trip()
    {
        packet_name = "Seyahat";
        prmkey = random();
        createPacket(packet_name,prmkey,database);

        word = "Airplane";
        translate="Uçak";
        insertData(word,translate,prmkey,database);

        word = "Airport";
        translate="Havalimanı";
        insertData(word,translate,prmkey,database);

        word = "Backpack";
        translate="Sırt çantası";
        insertData(word,translate,prmkey,database);

        word = "Baggage";
        translate="Bagaj";
        insertData(word,translate,prmkey,database);

        word = "Bag";
        translate="Çanta";
        insertData(word,translate,prmkey,database);

        word = "Beach";
        translate="Plaj";
        insertData(word,translate,prmkey,database);

        word = "Boat";
        translate="Tekne";
        insertData(word,translate,prmkey,database);

        word = "Bus";
        translate="Otobüs";
        insertData(word,translate,prmkey,database);

        word = "Campground";
        translate="Kamp alanı";
        insertData(word,translate,prmkey,database);

        word = "Car";
        translate="Araba";
        insertData(word,translate,prmkey,database);

        word = "Cruise Ship";
        translate="Gemi gezisi";
        insertData(word,translate,prmkey,database);

        word = "Currency Exchange";
        translate="Döviz bürosu";
        insertData(word,translate,prmkey,database);

        word = "Sight";
        translate="Manzara";
        insertData(word,translate,prmkey,database);

        word = "Explore";
        translate="Keşfetmek";
        insertData(word,translate,prmkey,database);

        word = "Subway";
        translate="Metro";
        insertData(word,translate,prmkey,database);

        word = "Suitcase";
        translate="Bavul";
        insertData(word,translate,prmkey,database);

        word = "Sunscreen";
        translate="Güneş kremi";
        insertData(word,translate,prmkey,database);

        word = "Swim";
        translate="Yüzmek";
        insertData(word,translate,prmkey,database);

        word = "Holiday";
        translate="Tatil";
        insertData(word,translate,prmkey,database);

        word = "Tourist";
        translate="Turist";
        insertData(word,translate,prmkey,database);

        word = "Travel";
        translate="Seyahat";
        insertData(word,translate,prmkey,database);

        word = "Visa";
        translate="Vize";
        insertData(word,translate,prmkey,database);

        word = "Museum";
        translate="Müze";
        insertData(word,translate,prmkey,database);

        word = "Transportation";
        translate="Toplu taşıma";
        insertData(word,translate,prmkey,database);

        word = "Ticket";
        translate="Bilet";
        insertData(word,translate,prmkey,database);
    }

    private void jobs()
    {
        packet_name = "Meslekler";
        prmkey = random();
        createPacket(packet_name,prmkey,database);

        word = "Accountant";
        translate="Muhasebeci";
        insertData(word,translate,prmkey,database);

        word = "Author";
        translate="Yazar";
        insertData(word,translate,prmkey,database);

        word = "Baker";
        translate="Fırıncı";
        insertData(word,translate,prmkey,database);

        word = "Barber";
        translate="Berber";
        insertData(word,translate,prmkey,database);

        word = "Hairdresser";
        translate="Kuaför";
        insertData(word,translate,prmkey,database);

        word = "Beautician";
        translate="Güzellik uzmanı";
        insertData(word,translate,prmkey,database);

        word = "Butcher";
        translate="Kasap";
        insertData(word,translate,prmkey,database);

        word = "Carpenter";
        translate="Marangoz";
        insertData(word,translate,prmkey,database);

        word = "Cashier";
        translate="Kasiyer";
        insertData(word,translate,prmkey,database);

        word = "Dentist";
        translate="Dişçi";
        insertData(word,translate,prmkey,database);

        word = "Doctor";
        translate="Doktor";
        insertData(word,translate,prmkey,database);

        word = "Engineer";
        translate="Mühendis";
        insertData(word,translate,prmkey,database);

        word = "Farmer";
        translate="Çiftçi";
        insertData(word,translate,prmkey,database);

        word = "Lawyer";
        translate="Avukat";
        insertData(word,translate,prmkey,database);

        word = "Musician";
        translate="Müzisyen";
        insertData(word,translate,prmkey,database);

        word = "Nurse";
        translate="Hemşire";
        insertData(word,translate,prmkey,database);

        word = "Pharmacist";
        translate="Eczane";
        insertData(word,translate,prmkey,database);

        word = "Policeman";
        translate="Polis";
        insertData(word,translate,prmkey,database);

        word = "Politician";
        translate="Politikacı";
        insertData(word,translate,prmkey,database);

        word = "Postman";
        translate="Postacı";
        insertData(word,translate,prmkey,database);

        word = "Scientist";
        translate="Bilim insanı";
        insertData(word,translate,prmkey,database);

        word = "Soldier";
        translate="Asker";
        insertData(word,translate,prmkey,database);

        word = "Tailor";
        translate="Terzi";
        insertData(word,translate,prmkey,database);

        word = "Teacher";
        translate="Öğretmen";
        insertData(word,translate,prmkey,database);

        word = "Technician";
        translate="Teknisyen";
        insertData(word,translate,prmkey,database);

        word = "Vet";
        translate="Veteriner";
        insertData(word,translate,prmkey,database);
    }

    private void animal()
    {
        packet_name = "Hayvanlar";
        prmkey = random();
        createPacket(packet_name,prmkey,database);

        word = "Cat";
        translate="Kedi";
        insertData(word,translate,prmkey,database);

        word = "Kitten";
        translate="Kedi yavrusu";
        insertData(word,translate,prmkey,database);

        word = "Dog";
        translate="Köpek";
        insertData(word,translate,prmkey,database);

        word = "Budgie";
        translate="Muhabbet kuşu";
        insertData(word,translate,prmkey,database);

        word = "Parrot";
        translate="Papağan";
        insertData(word,translate,prmkey,database);

        word = "Canary";
        translate="Kanarya";
        insertData(word,translate,prmkey,database);

        word = "Goldfish";
        translate="Akvaryum balığı";
        insertData(word,translate,prmkey,database);

        word = "Puppy";
        translate="Köpek yavrusu";
        insertData(word,translate,prmkey,database);

        word = "Rabbit";
        translate="Tavşan";
        insertData(word,translate,prmkey,database);

        word = "Lion";
        translate="Aslan";
        insertData(word,translate,prmkey,database);

        word = "Tiger";
        translate="Kaplan";
        insertData(word,translate,prmkey,database);

        word = "Elephant";
        translate="Fil";
        insertData(word,translate,prmkey,database);

        word = "Hippo";
        translate="Su aygırı";
        insertData(word,translate,prmkey,database);

        word = "Rhino";
        translate="Gergedan";
        insertData(word,translate,prmkey,database);

        word = "Wolf";
        translate="Kurt";
        insertData(word,translate,prmkey,database);

        word = "Fox";
        translate="Tilki";
        insertData(word,translate,prmkey,database);

        word = "Hyena";
        translate="Sırtlan";
        insertData(word,translate,prmkey,database);

        word = "Cheetah";
        translate="Çita";
        insertData(word,translate,prmkey,database);

        word = "Panther";
        translate="Panter";
        insertData(word,translate,prmkey,database);

        word = "Lynx";
        translate="Vaşak";
        insertData(word,translate,prmkey,database);

        word = "Bear";
        translate="Ayı";
        insertData(word,translate,prmkey,database);

        word = "Giraffe";
        translate="Zürafa";
        insertData(word,translate,prmkey,database);

        word = "Deer";
        translate="Geyik";
        insertData(word,translate,prmkey,database);

        word = "Chimpanzee";
        translate="Şempaze";
        insertData(word,translate,prmkey,database);

        word = "Monkey";
        translate="Maymun";
        insertData(word,translate,prmkey,database);

        word = "Gorilla";
        translate="Goril";
        insertData(word,translate,prmkey,database);

        word = "Snake";
        translate="Yılan";
        insertData(word,translate,prmkey,database);

        word = "Kangaroo";
        translate="Kanguru";
        insertData(word,translate,prmkey,database);

        word = "Crocodile";
        translate="Timsah";
        insertData(word,translate,prmkey,database);
    }

    private void verbs()
    {
        packet_name = "Fiiler";
        prmkey = random();
        createPacket(packet_name,prmkey,database);

        word = "Count";
        translate="Saymak";
        insertData(word,translate,prmkey,database);

        word = "Write";
        translate="Yazmak";
        insertData(word,translate,prmkey,database);

        word = "Create";
        translate="Yaratmak";
        insertData(word,translate,prmkey,database);

        word = "Cry";
        translate="Ağlamak";
        insertData(word,translate,prmkey,database);

        word = "Cut";
        translate="Kesmek";
        insertData(word,translate,prmkey,database);

        word = "Develop";
        translate="Geliştirmek";
        insertData(word,translate,prmkey,database);

        word = "Discover";
        translate="Keşfetmek";
        insertData(word,translate,prmkey,database);

        word = "Do";
        translate="Yapmak";
        insertData(word,translate,prmkey,database);

        word = "Draw";
        translate="Çizmek";
        insertData(word,translate,prmkey,database);

        word = "Drink";
        translate="İçmek";
        insertData(word,translate,prmkey,database);

        word = "Drive";
        translate="Sürmek";
        insertData(word,translate,prmkey,database);

        word = "Earn";
        translate="Kazanmak";
        insertData(word,translate,prmkey,database);

        word = "Eat";
        translate="Yemek";
        insertData(word,translate,prmkey,database);

        word = "Discuss";
        translate="Tartışmak";
        insertData(word,translate,prmkey,database);

        word = "Disagree";
        translate="Aynı fikirde olmamak";
        insertData(word,translate,prmkey,database);

        word = "Educate";
        translate="Eğitmek";
        insertData(word,translate,prmkey,database);

        word = "Enjoy";
        translate="Zevk almak";
        insertData(word,translate,prmkey,database);

        word = "Exercise";
        translate="Egzersiz yapmak";
        insertData(word,translate,prmkey,database);

        word = "Expand";
        translate="Genişletmek";
        insertData(word,translate,prmkey,database);

        word = "Explain";
        translate="Açıklamak";
        insertData(word,translate,prmkey,database);

        word = "Fall";
        translate="Düşmek";
        insertData(word,translate,prmkey,database);

        word = "Fail";
        translate="Başarısız Olmak";
        insertData(word,translate,prmkey,database);

        word = "Feel";
        translate="Hissetmek";
        insertData(word,translate,prmkey,database);

        word = "Fear";
        translate="Korkmak";
        insertData(word,translate,prmkey,database);

        word = "Fill";
        translate="Doldurmak";
        insertData(word,translate,prmkey,database);

        word = "Find";
        translate="Bulmak";
        insertData(word,translate,prmkey,database);

        word = "Finish";
        translate="Bitirmek";
        insertData(word,translate,prmkey,database);

        word = "Fly";
        translate="Uçmak";
        insertData(word,translate,prmkey,database);

        word = "Follow";
        translate="Takip etmek";
        insertData(word,translate,prmkey,database);

        word = "Fool";
        translate="Kandırmak";
        insertData(word,translate,prmkey,database);

        word = "Forbid";
        translate="Yasaklamak";
        insertData(word,translate,prmkey,database);

        word = "Forget";
        translate="Unutmak";
        insertData(word,translate,prmkey,database);

        word = "Forgive";
        translate="Affetmek";
        insertData(word,translate,prmkey,database);

        word = "Force";
        translate="Zorlamak";
        insertData(word,translate,prmkey,database);

        word = "Freeze";
        translate="Donmak";
        insertData(word,translate,prmkey,database);

        word = "Fry";
        translate="Kızartmak";
        insertData(word,translate,prmkey,database);

        word = "Get";
        translate="Almak";
        insertData(word,translate,prmkey,database);

        word = "Give";
        translate="Vermek";
        insertData(word,translate,prmkey,database);

        word = "Go";
        translate="Gitmek";
        insertData(word,translate,prmkey,database);

        word = "Guess";
        translate="Tahmin etmek";
        insertData(word,translate,prmkey,database);

        word = "Hate";
        translate="Nefret etmek";
        insertData(word,translate,prmkey,database);

        word = "Harm";
        translate="Zarar vermek";
        insertData(word,translate,prmkey,database);

        word = "Heal";
        translate="İyileşmek";
        insertData(word,translate,prmkey,database);

        word = "Hear";
        translate="Duymak";
        insertData(word,translate,prmkey,database);

        word = "Help";
        translate="Yardım etmek";
        insertData(word,translate,prmkey,database);

        word = "Hide";
        translate="Gizlemek / Saklamak";
        insertData(word,translate,prmkey,database);

        word = "Hope";
        translate="Umut etmek";
        insertData(word,translate,prmkey,database);

        word = "Hurry";
        translate="Acele etmek";
        insertData(word,translate,prmkey,database);

        word = "Imagine";
        translate="Hayal etmek";
        insertData(word,translate,prmkey,database);

        word = "Interest";
        translate="İlgi uyandırmak";
        insertData(word,translate,prmkey,database);

        word = "Invite";
        translate="Davet etmek";
        insertData(word,translate,prmkey,database);

        word = "Jump";
        translate="Zıplamak";
        insertData(word,translate,prmkey,database);

        word = "Kiss";
        translate="Öpmek";
        insertData(word,translate,prmkey,database);

        word = "Know";
        translate="Bilmek";
        insertData(word,translate,prmkey,database);

        word = "Learn";
        translate="Öğrenmek";
        insertData(word,translate,prmkey,database);

        word = "Listen";
        translate="Dinlemek";
        insertData(word,translate,prmkey,database);

        word = "Look";
        translate="Bakmak";
        insertData(word,translate,prmkey,database);

        word = "Lose";
        translate="Kaybetmek";
        insertData(word,translate,prmkey,database);

        word = "Make";
        translate="Yapmak";
        insertData(word,translate,prmkey,database);

        word = "Miss";
        translate="Özlemek / kaçırmak";
        insertData(word,translate,prmkey,database);

        word = "Need";
        translate="İhtiyaç duymak";
        insertData(word,translate,prmkey,database);

        word = "Observe";
        translate="İncelemek";
        insertData(word,translate,prmkey,database);

        word = "Pass";
        translate="Geçmek";
        insertData(word,translate,prmkey,database);

        word = "Pay";
        translate="Ödemek";
        insertData(word,translate,prmkey,database);

        word = "Pray";
        translate="Dua etmek";
        insertData(word,translate,prmkey,database);

        word = "Produce";
        translate="Üretmek";
        insertData(word,translate,prmkey,database);

        word = "Pull";
        translate="Çekmek";
        insertData(word,translate,prmkey,database);

        word = "Remember";
        translate="Hatırlamak";
        insertData(word,translate,prmkey,database);

        word = "Repair";
        translate="Tamir etmek";
        insertData(word,translate,prmkey,database);

        word = "Search";
        translate="Araştırmak";
        insertData(word,translate,prmkey,database);

        word = "Shake";
        translate="Sallamak";
        insertData(word,translate,prmkey,database);

        word = "Show";
        translate="Göstermek";
        insertData(word,translate,prmkey,database);

        word = "Sleep";
        translate="Uyumak";
        insertData(word,translate,prmkey,database);
    }

    private void fruitAndVegetable()
    {
        packet_name = "Meyveler";
        prmkey = random();
        createPacket(packet_name,prmkey,database);

        word = "Apple";
        translate="Elma";
        insertData(word,translate,prmkey,database);

        word = "Apricot";
        translate="Kayısı";
        insertData(word,translate,prmkey,database);

        word = "Asian persimmon";
        translate="Cennet hurması";
        insertData(word,translate,prmkey,database);

        word = "Avocado";
        translate = "Avokado";
        insertData(word, translate, prmkey, database);

        word = "Banana";
        translate="Muz";
        insertData(word,translate,prmkey,database);

        word = "Blackberry";
        translate="Böğürtlen";
        insertData(word,translate,prmkey,database);

        word = "Cherry";
        translate="Kiraz";
        insertData(word,translate,prmkey,database);

        word = "Coconut";
        translate="Hindistan cevizi";
        insertData(word,translate,prmkey,database);

        word = "Fig";
        translate="İncir";
        insertData(word,translate,prmkey,database);

        word = "Grape";
        translate="Üzüm";
        insertData(word,translate,prmkey,database);

        word = "Grapefruit";
        translate="Greyfurt";
        insertData(word,translate,prmkey,database);

        word = "Peach";
        translate="Şeftali";
        insertData(word,translate,prmkey,database);

        word = "Orange";
        translate="Portakal";
        insertData(word,translate,prmkey,database);

        word = "Plum";
        translate="Erik";
        insertData(word,translate,prmkey,database);


        packet_name = "Sebzeler";
        prmkey = random();
        createPacket(packet_name,prmkey,database);


        word = "Potato";
        translate="Patates";
        insertData(word,translate,prmkey,database);

        word = "Tomato";
        translate="Domates";
        insertData(word,translate,prmkey,database);

        word = "Cucumber";
        translate="Salatalık";
        insertData(word,translate,prmkey,database);

        word = "Onion";
        translate="Soğan";
        insertData(word,translate,prmkey,database);

        word = "Garlic";
        translate="Sarımsak";
        insertData(word,translate,prmkey,database);

        word = "Pepper";
        translate="Biber";
        insertData(word,translate,prmkey,database);

        word = "Peas";
        translate="Bezelye";
        insertData(word,translate,prmkey,database);

        word = "Beans";
        translate="Fasulye";
        insertData(word,translate,prmkey,database);

        word = "Kidney beans";
        translate="Barbunya";
        insertData(word,translate,prmkey,database);

        word = "Zucchini";
        translate="Kabak";
        insertData(word,translate,prmkey,database);

        word = "Aubergine";
        translate="Patlıcan";
        insertData(word,translate,prmkey,database);

        word = "Corn";
        translate="Mısır";
        insertData(word,translate,prmkey,database);

        word = "Carrot";
        translate="Havuç";
        insertData(word,translate,prmkey,database);

        word = "Mushroom";
        translate="Mantar";
        insertData(word,translate,prmkey,database);


        word = "Marrow";
        translate="Kabak";
        insertData(word,translate,prmkey,database);

        word = "Cauliflower";
        translate="Karnabahar";
        insertData(word,translate,prmkey,database);

        word = "Celery";
        translate="Kereviz";
        insertData(word,translate,prmkey,database);


        word = "Spinach";
        translate="Ispanak";
        insertData(word,translate,prmkey,database);

        word = "Turnip";
        translate="Turp";
        insertData(word,translate,prmkey,database);

        word = "Broccoli";
        translate="Brokoli";
        insertData(word,translate,prmkey,database);

        word = "Artichoke";
        translate="Enginar";
        insertData(word,translate,prmkey,database);

        word = "Arugula";
        translate="Roka";
        insertData(word,translate,prmkey,database);

        word = "Lettuce";
        translate="Marul";
        insertData(word,translate,prmkey,database);
    }

    private void meeting()
    {
        packet_name = "Tanışma";
        prmkey = random();
        createPacket(packet_name,prmkey,database);

        word = "Hello";
        translate="Merhaba";
        insertData(word,translate,prmkey,database);

        word = "What are your hobbies?";
        translate="Hobilerin neler?";
        insertData(word,translate,prmkey,database);

        word = "How are you?";
        translate="Nasılsın?";
        insertData(word,translate,prmkey,database);

        word = "I am fine.";
        translate="İyiyim.";
        insertData(word,translate,prmkey,database);

        word = "Thank you";
        translate="Teşekkür ederim";
        insertData(word,translate,prmkey,database);

        word = "Do you have any brothers or sisters?";
        translate="Kız ya da erkek kardeşin var mı?";
        insertData(word,translate,prmkey,database);

        word = "I have two sisters.";
        translate="İki kız kardeşim var.";
        insertData(word,translate,prmkey,database);

        word = "Are you student?";
        translate="Öğrenci misin?";
        insertData(word,translate,prmkey,database);

        word = "I am from Germany";
        translate="Ben Almanyalıyım.";
        insertData(word,translate,prmkey,database);

        word = "Where do you live?";
        translate="Nerede yaşıyorsun?";
        insertData(word,translate,prmkey,database);

        word = "I live in Turkey.";
        translate="Türkiye&apostrophede yaşıyorum.";
        insertData(word,translate,prmkey,database);

        word = "What do you do?";
        translate="Ne iş yapıyorsun?";
        insertData(word,translate,prmkey,database);

        word = "How old are you?";
        translate="Kaç yaşındasın?";
        insertData(word,translate,prmkey,database);

        word = "I am twenty years old.";
        translate="Ben yirmi yaşındayım.";
        insertData(word,translate,prmkey,database);

        word = "I work in London.";
        translate="Londra''da çalışıyorum.";
        insertData(word,translate,prmkey,database);

        word = "Where are you from?";
        translate="Nerelisin?";
        insertData(word,translate,prmkey,database);

        word = "I am an engineer.";
        translate="Ben mühendisim.";
        insertData(word,translate,prmkey,database);

        word = "Is there any cafe near here?";
        translate="Buraya yakın bir kafe var mı?";
        insertData(word,translate,prmkey,database);

        word = "I have a cat.";
        translate="Benim bir kedim var.";
        insertData(word,translate,prmkey,database);

        word = "Do you smoke?";
        translate="Sigara içiyor musun?";
        insertData(word,translate,prmkey,database);

        word = "What kind of music do you listen to?";
        translate="Ne tarz müzikler dinlersin?";
        insertData(word,translate,prmkey,database);

        word = "Shall we get some drinks?";
        translate="Birşeyler içelim mi?";
        insertData(word,translate,prmkey,database);

        word = "My eyes are black.";
        translate="Göz rengim siyahtır.";
        insertData(word,translate,prmkey,database);

        word = "I like coffee.";
        translate="Kahve severim.";
        insertData(word,translate,prmkey,database);

        word = "Are you single or married?";
        translate="Evli misin bekar mı?";
        insertData(word,translate,prmkey,database);

        word = "I don&apostrophet know";
        translate="Bilmiyorum.";
        insertData(word,translate,prmkey,database);

        word = "I know";
        translate="Biliyorum.";
        insertData(word,translate,prmkey,database);

        word = "What did you say?";
        translate="Ne dediniz?";
        insertData(word,translate,prmkey,database);


        word = "Where do you reside?";
        translate="Nerede oturuyorsun?";
        insertData(word,translate,prmkey,database);

        word = "How is it going?";
        translate="Nasıl gidiyor?";
        insertData(word,translate,prmkey,database);

        word = "I like going shopping with my friends.";
        translate="Arkadaşlarımla alışverişe çıkmayı seviyorum.";
        insertData(word,translate,prmkey,database);

        word = "I study economics.";
        translate="Ekonomi okuyorum.";
        insertData(word,translate,prmkey,database);

        word = "I am single.";
        translate="Bekarım.";
        insertData(word,translate,prmkey,database);

        word = "Have a good day.";
        translate="İyi günler.";
        insertData(word,translate,prmkey,database);

        word = "Gladly";
        translate="Seve seve";
        insertData(word,translate,prmkey,database);

        word = "You are welcome.";
        translate="Rica ederim";
        insertData(word,translate,prmkey,database);

        word = "What's wrong?";
        translate="Sorun nedir?";
        insertData(word,translate,prmkey,database);

        word = "In my opinion.";
        translate="Bence.";
        insertData(word,translate,prmkey,database);


    }

    private void times()
    {
        packet_name = "Zamanlar";
        prmkey = random();
        createPacket(packet_name,prmkey,database);

        word = "Today";
        translate="Bugün";
        insertData(word,translate,prmkey,database);

        word = "Month";
        translate="Ay";
        insertData(word,translate,prmkey,database);

        word = "Tomorrow";
        translate="Yarın";
        insertData(word,translate,prmkey,database);

        word = "Night";
        translate="Akşam";
        insertData(word,translate,prmkey,database);

        word = "Morning";
        translate="Sabah";
        insertData(word,translate,prmkey,database);

        word = "Week";
        translate="Hafta";
        insertData(word,translate,prmkey,database);

        word = "Day";
        translate="Gün";
        insertData(word,translate,prmkey,database);

        word = "Monday";
        translate="Pazartesi";
        insertData(word,translate,prmkey,database);

        word = "Tuesday";
        translate="Salı";
        insertData(word,translate,prmkey,database);

        word = "Wednesday";
        translate="Çarşamba";
        insertData(word,translate,prmkey,database);

        word = "Thursday";
        translate="Perşembe";
        insertData(word,translate,prmkey,database);

        word = "Friday";
        translate="Cuma";
        insertData(word,translate,prmkey,database);

        word = "Saturday";
        translate="Cumartesi";
        insertData(word,translate,prmkey,database);

        word = "Sunday";
        translate="Pazar";
        insertData(word,translate,prmkey,database);

        word = "Winter";
        translate="Kış";
        insertData(word,translate,prmkey,database);

        word = "Spring";
        translate="İlkbhar";
        insertData(word,translate,prmkey,database);

        word = "Summer";
        translate="Yaz";
        insertData(word,translate,prmkey,database);

        word = "Autumn";
        translate="Sonbahar";
        insertData(word,translate,prmkey,database);
    }

    private void colors()
    {
        packet_name = "Renkler";
        prmkey = random();
        createPacket(packet_name,prmkey,database);

        word = "Red";
        translate="Kırmızı";
        insertData(word,translate,prmkey,database);

        word = "Blue";
        translate="Mavi";
        insertData(word,translate,prmkey,database);

        word = "Yellow";
        translate="Sarı";
        insertData(word,translate,prmkey,database);

        word = "Black";
        translate="Siyah";
        insertData(word,translate,prmkey,database);

        word = "White";
        translate="Beyaz";
        insertData(word,translate,prmkey,database);

        word = "Gray";
        translate="Gri";
        insertData(word,translate,prmkey,database);

        word = "Purple";
        translate="Mor";
        insertData(word,translate,prmkey,database);

        word = "Navy blue";
        translate="Lacivert";
        insertData(word,translate,prmkey,database);

        word = "Turquoise";
        translate="Turkuvaz";
        insertData(word,translate,prmkey,database);

        word = "Violet";
        translate="Eflatun";
        insertData(word,translate,prmkey,database);
    }

    private void drinks() {
        packet_name = "İçecekler";
        prmkey = random();
        createPacket(packet_name,prmkey,database);

        word = "Tea";
        translate="Çay";
        random();
        insertData(word,translate,prmkey,database);

        word = "Coke";
        translate="Kola";
        random();
        insertData(word,translate,prmkey,database);

        word = "Fruit juice";
        translate="Meyve Suyu";
        random();
        insertData(word,translate,prmkey,database);

        word = "Lemonade";
        translate="Limonata";
        random();
        insertData(word,translate,prmkey,database);

        word = "Wine";
        translate="Şarap";
        random();
        insertData(word,translate,prmkey,database);

        word = "Cocktail";
        translate="Kokteyl";
        random();
        insertData(word,translate,prmkey,database);

        word = "Water";
        translate="Su";
        random();
        insertData(word,translate,prmkey,database);

        word = "Ice tea";
        translate="Soğuk çay";
        random();
        insertData(word,translate,prmkey,database);
    }
}
