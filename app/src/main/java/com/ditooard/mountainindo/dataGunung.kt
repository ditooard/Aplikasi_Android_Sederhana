package com.ditooard.mountainindo

object dataGunung {
    private val namaGunung = arrayOf(
        "Gunung Everest",
        "Gunung Makalu",
        "Gunung Manasalu",
        "Gunung Nanga Parbat",
        "Gunung Annapurna I ",
        "Gunung Aconcagua",
        "Gunung Denali",
        "Gunung Andes",
        "Gunung Kilimanjaro",
        "Gunung Vinson Massif"
    )

    private val detailGunung = arrayOf(
        "Gunung Everest atau Mount Everest ialah gunung tertinggi di dunia (jika diukur dari permukaan laut). Rabung puncaknya menandakan perbatasan antara Nepal dan Tibet. Puncaknya berada di Tibet.",
        "Makalu berada di posisi kelima sebagai gunung tertinggi di dunia dengan ketinggian 8.485 meter. Terletak di Mahalngur Himal dari pegunungan Himalaya di sepanjang perbatasan Nepal dan Tibet, Tiongkok. Pada 15 Mei 1955, pendaki Prancis Lionel Terray dan Jean Couzy menjadi yang pertama berhasil mendaki Gunung Makalu.",
        "Gunung Manasalu berada di posisi kedelapan sebagai gunung tertinggi di dunia dengan ketinggian 8.163 meter. Gunung ini terletak di negara Nepal. ",
        "Gunung Nanga Parbat berada di posisi kesembilan sebagai gunung tertinggi di dunia dengan ketinggian 8.126 meter. Terletak di wilayah Gilgit-Baltistan di Kashmir yang dikelola Pakistan. Gunung ini juga terletak di sebelah selatan Sungai Indus. Pada 3 Juli 1953, pendaki Austria Hermann Buhl menjadi yang pertama mendaki Gunung Nanga Parbat.",
        "Gunung Annapurna I berada di posisi kesepuluh sebagai gunung tertinggi di dunia dengan ketinggian 8.091 meter. Gunung ini terletak di negara Nepal. Gunung ini termasuk ke dalam kategori gunung yang sulit didaki dan memiliki rasio kematian tertinggi daripada puncak gunung lain di bumi. Akan tetapi, pada 3 Juni 1950, pendaki Prancis Maurice Herzog dan Louis Lachenal menjadi yang pertama mencapai puncak Gunung Annapurna I.",
        "Gunung tertinggi berikutnya terletak di Argentina. Gunung Aconcagua berada di jajaran Pegunungan Andes ini tak cuma terkenal dengan cuaca dingin ekstrem dan badai anginnya. Wilayahnya pun diketahui didominasi oleh es, gletser, dan bebatuan.",
        "Denali, biasa dikenal dengan nama Gunung McKinley, ialah gunung tertinggi di Amerika Utara dengan ketinggian 6.194 mdpl. Dengan tinggi dari dasar ke puncak sebesar 18.000 kaki (5.500 m), Denali merupakan gunung daratan tertinggi di dunia. ",
        "Gunung Andes adalah pegunungan terpanjang di dunia yang membentuk rangkaian dataran tinggi sepanjang pantai barat Amerika Selatan. Pegunungan ini panjangnya lebih dari 7.000 km, lebarnya mencapai 500 km pada beberapa tempat (terlebar pada 18° sampai 20° LS), dan memiliki ketinggian rata-rata sekitar 4.000 m. Pegunungan ini membentang melalui tujuh negara yaitu Argentina, Bolivia, Cile, Kolombia, Ekuador, Peru, dan Venezuela, yang kadang disebut Negara-Negara Andean (Andean States).",
        "Gunung yang terkenal dengan misteri dan keindahannya ini terletak di dataran Afrika Timur, tepatnya Tanzania Utara. Pesonanya membuat Gunung Kilimanjaro memiliki lebih dari 50.000 pendaki dalam satu tahun.",
        "Gunung Vinson Massif yang terletak di Antartika, Kutub Selatan. Dibandingkan dengan gunung Seven Summits lain, Gunung Vinson Massif berlokasi paling terpencil.Gunung ini menjadi yang terakhir dieksplorasi dari tujuh puncak, tepatnya pada 1966. Mengutip National Geographic, kendati Gunung Vinson Massif tergolong tidak sulit untuk didaki, suhu ekstrem dan lokasi yang terpencil menjadikannya menantang.",
    )

    private val lokasiGunung = arrayOf(
        "Nepal",
        "Mahalngur Himal",
        "Nepal",
        "Pakistan",
        "Nepal",
        "Argentina",
        "Alaska",
        "Andean States",
        "Tanzania Utara",
        "Antartika"
    )

    private val ketinggianGunung = arrayOf(
        "8.848 mdpl",
        "8.485 mdpl",
        "8.163 mdpl",
        "8.1266 mdpl",
        "8.091 mdpl",
        "6.961 mdpl",
        "6.194 mdpl",
        "6.100 mdpl",
        "5.895 mdpl",
        "4.892 mdpl",
    )

    private val jalurPendakian = arrayOf(
        "Via Southeast Ridge, Nepal",
        "Via Nepal",
        "Via Nepal",
        "Via Kashmir",
        "Via Nepal",
        "Via Gletscher Horcones",
        "Via Denali National Park and Preserve",
        "Via Santiago, Región Metropolitana, Chile",
        "Via Tanzania Utara",
        "Via Kutub Selatan",
    )

    private val gambarGunung = intArrayOf(
        R.drawable.gn_everest,
        R.drawable.gn_makalu,
        R.drawable.gn_manaslu,
        R.drawable.gn_parbat,
        R.drawable.gn_annapurna,
        R.drawable.gn_aconcagua,
        R.drawable.gn_denali,
        R.drawable.gn_andes,
        R.drawable.gn_kilimanjaro,
        R.drawable.gn_vinson
    )

    val listData: ArrayList<Gunung>
        get() {
            val list = arrayListOf<Gunung>()
            for (position in namaGunung.indices) {
                val gunung = Gunung()
                gunung.nama     = namaGunung[position]
                gunung.detail   = detailGunung[position]
                gunung.lokasi   = lokasiGunung[position]
                gunung.tinggi   = ketinggianGunung[position]
                gunung.jalur    = jalurPendakian[position]
                gunung.photo    = gambarGunung[position]
                list.add(gunung)
            }
            return list
        }
}