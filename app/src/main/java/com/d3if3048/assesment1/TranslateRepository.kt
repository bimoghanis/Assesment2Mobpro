package com.d3if3048.assesment1

class TranslateRepository {
    private val dictionary = mapOf(
        "hallo" to "halo",
        "welt" to "dunia",
        "guten morgen" to "selamat pagi",
        "guten tag" to "selamat siang",
        "guten abend" to "selamat malam",
        "Wie geht's" to "apa kabar",
        "danke" to "terima kasih",
        "auf wiedersehen" to "sampai jumpa lagi",
        "ja" to "ya",
        "nein" to "tidak",
        "bitte" to "silakan",
        "entschuldigung" to "maaf",
        "tschüss" to "selamat tinggal",
        "ich liebe dich" to "Aku cinta kamu",
        "essen" to "makan",
        "trinken" to "minum",
        "schlafen" to "tidur",
        "lesen" to "membaca",
        "lernen" to "belajar",
        "arbeiten" to "bekerja",
        "spielen" to "bermain",
        "fahren" to "mengemudi",
        "fliegen" to "terbang",
        "schwimmen" to "berenang",
        "laufen" to "berlari",
        "sitzen" to "duduk",
        "stehen" to "berdiri",
        "liegen" to "berbaring",
        "kommen" to "datang",
        "gehen" to "pergi",
        "bleiben" to "tinggal",
        "heiß" to "panas",
        "kalt" to "dingin",
        "klein" to "kecil",
        "groß" to "besar",
        "schön" to "cantik",
        "hässlich" to "jelek",
        "lecker" to "enak",
        "teuer" to "mahal",
        "billig" to "murah",
        "schnell" to "cepat",
        "langsam" to "lambat",
        "schwer" to "berat",
        "leicht" to "ringan",
        "alt" to "tua",
        "jung" to "muda",
        "heute" to "hari ini",
        "gestern" to "kemarin",
        "morgen" to "besok",
        "montag" to "Senin",
        "dienstag" to "Selasa",
        "mittwoch" to "Rabu",
        "donnerstag" to "Kamis",
        "freitag" to "Jumat",
        "samstag" to "Sabtu",
        "sonntag" to "Minggu",
        "kennenlernen" to "mengenal",
        "verstehen" to "mengerti",
        "sprechen" to "berbicara",
        "schreiben" to "menulis",
        "hören" to "mendengar",
        "sehen" to "melihat",
        "fühlen" to "merasakan",
        "denken" to "berpikir",
        "wissen" to "tahu",
        "vergessen" to "lupa",
        "verzeihung" to "maaf",
        "vergib mir" to "ampuni aku",
        "begrüßen" to "menyapa",
        "abschied nehmen" to "berpisah",
        "erklären" to "menjelaskan",
        "beschreiben" to "menggambarkan",
        "zeigen" to "menunjukkan",
        "finden" to "menemukan",
        "suchen" to "mencari",
        "kaufen" to "membeli",
        "verkaufen" to "menjual",
        "geben" to "memberikan",
        "nehmen" to "mengambil",
        "öffnen" to "membuka",
        "schließen" to "menutup",
        "einladen" to "mengundang",
        "antworten" to "menjawab",
        "fragen" to "bertanya",
        "warten" to "menunggu",
        "verstehen Sie?" to "Apakah Anda mengerti?",
        "ich verstehe nicht" to "Saya tidak mengerti",
        "wie bitte?" to "Maaf, bisa diulangi?",
        "das ist gut" to "Itu baik",
        "das ist schlecht" to "Itu buruk",
        "Ich bin müde" to "Saya lelah",
        "Ich bin hungrig" to "Saya lapar",
        "Ich bin durstig" to "Saya haus",
        "Ich bin fertig" to "Saya selesai",
        "Ich bin bereit" to "Saya siap",
        "Ich brauche Hilfe" to "Saya butuh bantuan",
        "Ich weiß nicht" to "Saya tidak tahu",
        "Ich liebe dich auch" to "Aku juga mencintaimu",
        "Ich vermisse dich" to "Aku merindukanmu",
        "Ich habe dich lieb" to "Aku sayang padamu",
        "Ich habe Angst" to "Saya takut",
        "Ich bin glücklich" to "Saya bahagia",
        "Ich bin traurig" to "Saya sedih",
        "Ich bin krank" to "Saya sakit",
        "Ich muss gehen" to "Saya harus pergi",
        "Ich bin beschäftigt" to "Saya sibuk",
        "Ich habe Zeit" to "Saya punya waktu",
        "Ich mag das" to "Saya suka itu",
        "Ich mag das nicht" to "Saya tidak suka itu",
        "Ich habe eine Frage" to "Saya punya pertanyaan",
        "Ich habe eine Idee" to "Saya punya ide",
        "Ich habe eine Überraschung" to "Saya punya kejutan",
        "ausgezeichnet" to "sangat baik",
        "schlecht" to "buruk",
        "schön" to "indah",
        "hässlich" to "jelek",
        "gut" to "baik",
        "schlecht" to "buruk",
        "richtig" to "benar",
        "falsch" to "salah",
        "vielleicht" to "mungkin",
        "gar nicht" to "tidak sama sekali",
        "sehr" to "sangat",
        "etwas" to "sedikit",
        "genug" to "cukup",
        "mehr" to "lebih",
        "weniger" to "kurang",
        "heiß" to "panas",
        "kalt" to "dingin",
        "früh" to "pagi",
        "spät" to "telat",
        "frühstücken" to "sarapan",
        "zu Mittag essen" to "makan siang",
        "zu Abend essen" to "makan malam",
        "einkaufen" to "berbelanja",
        "verkaufen" to "menjual",
        "kaufen" to "membeli",
        "besuchen" to "mengunjungi",
        "reisen" to "berwisata",
        "verstehen" to "mengerti",
        "sprechen" to "berbicara",
        "schreiben" to "menulis",
        "zeichnen" to "menggambar",
        "malen" to "melukis",
        "sehen" to "melihat",
        "hören" to "mendengar",
        "fühlen" to "merasakan",
        "riechen" to "mencium"
    )
    fun translate(germanText: String): String {
        val lowercaseText = germanText.trim().lowercase()
        return dictionary[lowercaseText] ?: "Kata tidak ditemukan dalam kamus"
    }
}