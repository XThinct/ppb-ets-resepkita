package com.example.resepkita.repository

import com.example.resepkita.R
import com.example.resepkita.model.Recipe
import com.example.resepkita.model.RecipeCategory

class RecipeRepository {
    fun getAllRecipes(): List<Recipe> {
        return listOf(
            Recipe(
                id = 1,
                name = "Nasi Goreng",
                image = R.drawable.nasi_goreng,
                description = "Nasi goreng khas Indonesia dengan bumbu rempah yang harum dan lezat.",
                ingredients = listOf(
                    "2 piring nasi putih",
                    "2 butir telur",
                    "3 siung bawang merah",
                    "2 siung bawang putih",
                    "1 sdm kecap manis",
                    "1 sdt garam",
                    "1/2 sdt merica"
                ),
                steps = listOf(
                    "Panaskan minyak, tumis bawang merah dan bawang putih hingga harum.",
                    "Masukkan telur, aduk hingga berbentuk orak-arik.",
                    "Tambahkan nasi putih, aduk rata.",
                    "Beri kecap manis, garam, dan merica, aduk hingga merata.",
                    "Masak hingga nasi panas dan bumbu meresap, sajikan."
                ),
                cookingTime = 15,
                difficulty = "Mudah",
                category = RecipeCategory.MAKANAN
            ),
            Recipe(
                id = 2,
                name = "Sate Ayam",
                image = R.drawable.sate_ayam,
                description = "Sate ayam empuk dengan bumbu kacang yang kaya rasa.",
                ingredients = listOf(
                    "500 gram daging ayam, potong dadu",
                    "10 tusuk sate",
                    "2 sdm kecap manis",
                    "1 sdm minyak goreng",
                    "Bumbu kacang siap pakai"
                ),
                steps = listOf(
                    "Tusuk potongan ayam ke tusukan sate.",
                    "Campur kecap manis dan minyak, oleskan ke ayam.",
                    "Bakar sate di atas bara api sambil sesekali diolesi bumbu.",
                    "Sajikan dengan bumbu kacang."
                ),
                cookingTime = 30,
                difficulty = "Sedang",
                category = RecipeCategory.MAKANAN
            ),
            Recipe(
                id = 3,
                name = "Mie Goreng",
                image = R.drawable.mie_goreng,
                description = "Mie goreng ala rumahan yang gurih dan nikmat.",
                ingredients = listOf(
                    "1 bungkus mie instan",
                    "1 butir telur",
                    "2 siung bawang putih",
                    "1 sdm kecap manis",
                    "Sayuran (kol, wortel) sesuai selera"
                ),
                steps = listOf(
                    "Rebus mie hingga matang, tiriskan.",
                    "Tumis bawang putih hingga harum.",
                    "Masukkan telur, buat orak-arik.",
                    "Tambahkan sayuran, aduk rata.",
                    "Masukkan mie, bumbu mie, dan kecap manis, aduk hingga tercampur rata."
                ),
                cookingTime = 20,
                difficulty = "Mudah",
                category = RecipeCategory.MAKANAN
            ),
            Recipe(
                id = 4,
                name = "Ayam Goreng Kalasan",
                image = R.drawable.ayam_kalasan,
                description = "Ayam goreng dengan bumbu tradisional yang gurih dan empuk.",
                ingredients = listOf(
                    "1 ekor ayam, potong 8 bagian",
                    "500 ml air kelapa",
                    "3 lembar daun salam",
                    "2 batang serai, memarkan",
                    "Bumbu halus (8 bawang merah, 5 bawang putih, 3 cm jahe, 1 sdm ketumbar, 1 sdt gula merah)",
                    "Minyak untuk menggoreng",
                    "Bawang goreng untuk taburan"
                ),
                steps = listOf(
                    "Rebus ayam dengan air kelapa, bumbu halus, daun salam, dan serai hingga empuk dan bumbu meresap.",
                    "Angkat ayam, tiriskan hingga kering.",
                    "Goreng ayam dalam minyak panas hingga kecoklatan.",
                    "Sajikan dengan taburan bawang goreng, lalapan, dan sambal."
                ),
                cookingTime = 60,
                difficulty = "Sedang",
                category = RecipeCategory.MAKANAN
            ),
            Recipe(
                id = 5,
                name = "Soto Ayam",
                image = R.drawable.soto_ayam,
                description = "Sup ayam kuning dengan aroma rempah yang segar dan kaya rasa.",
                ingredients = listOf(
                    "500 gram ayam",
                    "2 liter air",
                    "3 lembar daun jeruk",
                    "2 lembar daun salam",
                    "2 batang serai",
                    "2 cm lengkuas, memarkan",
                    "Bumbu halus (6 bawang merah, 4 bawang putih, 3 kemiri, 1 cm kunyit, 1 cm jahe)",
                    "200 gram tauge, seduh air panas",
                    "1 batang daun bawang, iris halus",
                    "Bawang goreng untuk taburan"
                ),
                steps = listOf(
                    "Rebus ayam hingga empuk, angkat dan suwir-suwir dagingnya.",
                    "Tumis bumbu halus, daun jeruk, daun salam, serai, dan lengkuas hingga harum.",
                    "Masukkan tumisan bumbu ke dalam air kaldu, aduk rata.",
                    "Bumbui dengan garam dan gula secukupnya, koreksi rasa.",
                    "Sajikan soto dengan ayam suwir, tauge, irisan daun bawang, dan bawang goreng."
                ),
                cookingTime = 60,
                difficulty = "Sedang",
                category = RecipeCategory.MAKANAN
            ),
            Recipe(
                id = 6,
                name = "Gado-gado",
                image = R.drawable.gado_gado,
                description = "Salad sayuran dengan bumbu kacang khas Indonesia yang lezat dan sehat.",
                ingredients = listOf(
                    "100 gram tauge, seduh air panas",
                    "100 gram kacang panjang, potong 3 cm, rebus",
                    "1 buah kentang, rebus, kupas, potong dadu",
                    "1 buah timun, potong dadu",
                    "100 gram kubis, iris tipis",
                    "2 butir telur rebus, potong-potong",
                    "Kerupuk untuk pelengkap",
                    "Bumbu kacang (200 gram kacang tanah goreng, 3 cabe merah, 2 bawang putih, 1 sdm gula merah, garam secukupnya)"
                ),
                steps = listOf(
                    "Haluskan semua bahan bumbu kacang, tambahkan air hingga kekentalan yang diinginkan.",
                    "Tata semua sayuran yang sudah direbus dan diiris di atas piring.",
                    "Siram dengan bumbu kacang.",
                    "Sajikan dengan kerupuk dan telur rebus."
                ),
                cookingTime = 30,
                difficulty = "Mudah",
                category = RecipeCategory.MAKANAN
            ),
            Recipe(
                id = 7,
                name = "Rendang",
                image = R.drawable.rendang,
                description = "Hidangan daging sapi dengan bumbu rempah khas Minangkabau yang kaya akan rasa.",
                ingredients = listOf(
                    "500 gram daging sapi, potong kotak",
                    "1 liter santan dari 1 butir kelapa",
                    "4 lembar daun jeruk",
                    "2 batang serai, memarkan",
                    "2 lembar daun salam",
                    "3 cm lengkuas, memarkan",
                    "3 sdm bumbu rendang halus",
                    "1 sdt garam",
                    "1/2 sdt gula merah"
                ),
                steps = listOf(
                    "Rebus daging dengan santan encer, masak hingga empuk.",
                    "Masukkan bumbu halus, daun jeruk, serai, daun salam, dan lengkuas.",
                    "Tambahkan santan kental, aduk perlahan.",
                    "Masak dengan api kecil sambil sesekali diaduk hingga kuah mengental.",
                    "Teruskan memasak hingga santan menyusut dan bumbu meresap.",
                    "Sajikan rendang dengan nasi putih hangat."
                ),
                cookingTime = 240,
                difficulty = "Sulit",
                category = RecipeCategory.MAKANAN
            ),
            Recipe(
                id = 8,
                name = "Pepes Ikan",
                image = R.drawable.pepes_ikan,
                description = "Ikan dibumbui rempah dan dibungkus daun pisang kemudian dikukus atau dipanggang.",
                ingredients = listOf(
                    "500 gram ikan mas atau nila, bersihkan",
                    "5 lembar daun pisang untuk membungkus",
                    "5 tangkai kemangi",
                    "2 buah tomat, potong-potong",
                    "3 buah cabe rawit utuh",
                    "Bumbu halus (6 bawang merah, 4 bawang putih, 4 cabe merah, 1 cm kunyit, 1 cm jahe, 1 sdt ketumbar)",
                    "1 sdt garam",
                    "1/2 sdt gula"
                ),
                steps = listOf(
                    "Lumuri ikan dengan bumbu halus, garam, dan gula, diamkan 15 menit.",
                    "Siapkan daun pisang, letakkan ikan yang sudah dibumbui.",
                    "Tambahkan kemangi, tomat, dan cabe rawit di atas ikan.",
                    "Bungkus rapi dan sematkan dengan tusuk gigi atau lidi.",
                    "Kukus pepes selama 30-45 menit hingga matang.",
                    "Bakar sebentar di atas panggangan jika suka aromanya lebih harum."
                ),
                cookingTime = 60,
                difficulty = "Sedang",
                category = RecipeCategory.MAKANAN
            ),
            Recipe(
                id = 9,
                name = "Tempe Mendoan",
                image = R.drawable.tempe_mendoan,
                description = "Tempe yang dibalut tepung dan digoreng setengah matang dengan tekstur yang lembut.",
                ingredients = listOf(
                    "200 gram tempe, potong tipis-tipis",
                    "100 gram tepung terigu",
                    "50 gram tepung beras",
                    "2 batang daun bawang, iris halus",
                    "1 sdm ketumbar bubuk",
                    "1 sdt garam",
                    "1/2 sdt baking powder",
                    "200 ml air",
                    "Minyak untuk menggoreng"
                ),
                steps = listOf(
                    "Campurkan tepung terigu, tepung beras, ketumbar, garam, dan baking powder dalam mangkuk.",
                    "Tambahkan air sedikit demi sedikit sambil diaduk hingga adonan tercampur rata.",
                    "Masukkan daun bawang, aduk rata.",
                    "Celupkan tempe ke dalam adonan tepung.",
                    "Goreng dalam minyak panas dengan api sedang hingga setengah matang.",
                    "Angkat dan tiriskan, sajikan dengan cabai rawit."
                ),
                cookingTime = 20,
                difficulty = "Mudah",
                category = RecipeCategory.MAKANAN
            ),
            Recipe(
                id = 10,
                name = "Es Cendol",
                image = R.drawable.es_cendol,
                description = "Minuman tradisional Indonesia yang segar, terbuat dari tepung beras dengan santan dan gula merah.",
                ingredients = listOf(
                    "100 gram tepung beras",
                    "30 gram tepung hunkwe",
                    "1 sdm air kapur sirih",
                    "200 ml air daun pandan (10 lembar daun pandan diblender dengan air)",
                    "300 ml santan kental",
                    "200 ml sirup gula merah",
                    "Es batu secukupnya"
                ),
                steps = listOf(
                    "Campur tepung beras, tepung hunkwe, air kapur sirih, dan air daun pandan, aduk rata.",
                    "Masak di atas api sedang sambil diaduk hingga mengental seperti lem.",
                    "Tuang adonan ke dalam cetakan cendol, tekan-tekan hingga keluar melalui lubang dan jatuh ke dalam air es.",
                    "Saring cendol, tiriskan.",
                    "Siapkan gelas saji, masukkan cendol, sirup gula merah, dan santan.",
                    "Tambahkan es batu, sajikan."
                ),
                cookingTime = 30,
                difficulty = "Sedang",
                category = RecipeCategory.MINUMAN
            ),
            Recipe(
                id = 11,
                name = "Bajigur",
                image = R.drawable.bajigur,
                description = "Minuman tradisional hangat dari Jawa Barat dengan rasa manis, gurih dan aroma rempah yang khas.",
                ingredients = listOf(
                    "500 ml santan",
                    "100 gram gula merah, sisir halus",
                    "2 lembar daun pandan, simpulkan",
                    "2 cm jahe, memarkan",
                    "1 batang serai, memarkan",
                    "1 sendok makan kopi bubuk",
                    "1/4 sendok teh garam",
                    "25 gram kolang kaling (optional)",
                    "25 gram nangka matang, potong dadu (optional)"
                ),
                steps = listOf(
                    "Rebus santan, gula merah, daun pandan, jahe, dan serai dengan api kecil sambil diaduk.",
                    "Masukkan kopi bubuk dan garam, aduk rata.",
                    "Jika menggunakan kolang kaling dan nangka, tambahkan ke dalam rebusan.",
                    "Masak hingga semua bahan matang dan santan mendidih.",
                    "Saring bajigur ke dalam gelas atau cangkir.",
                    "Sajikan selagi hangat."
                ),
                cookingTime = 25,
                difficulty = "Mudah",
                category = RecipeCategory.MINUMAN
            ),
            Recipe(
                id = 12,
                name = "Es Kopyor",
                image = R.drawable.es_kopyor,
                description = "Minuman segar dengan kelapa muda kopyor, sirup, dan es serut yang cocok dinikmati saat cuaca panas.",
                ingredients = listOf(
                    "1 buah kelapa muda kopyor",
                    "100 ml sirup merah/cocopandan",
                    "50 ml susu kental manis",
                    "500 gram es serut",
                    "Agar-agar kelapa: 1 bungkus agar-agar plain, 400 ml air kelapa, 100 ml santan, 5 sdm gula pasir (untuk kelapa kopyor sintetis)"
                ),
                steps = listOf(
                    "Jika menggunakan kelapa kopyor asli: Kerok daging kelapa kopyor dari tempurungnya.",
                    "Jika membuat kelapa kopyor sintetis: Masak semua bahan agar-agar kelapa hingga mendidih, dinginkan dalam mangkuk berisi es batu sambil diaduk hingga mengental seperti kopyor, lalu potong-potong.",
                    "Siapkan gelas saji, masukkan es serut secukupnya.",
                    "Tambahkan kelapa kopyor asli atau buatan.",
                    "Tuang sirup merah atau cocopandan sesuai selera.",
                    "Tambahkan susu kental manis di atasnya.",
                    "Sajikan segera selagi dingin."
                ),
                cookingTime = 20,
                difficulty = "Mudah",
                category = RecipeCategory.MINUMAN
            )
        )
    }

    fun searchRecipes(query: String, recipesToFilter: List<Recipe>): List<Recipe> {
        return recipesToFilter.filter { recipe ->
            recipe.name.contains(query, ignoreCase = true) ||
                    recipe.ingredients.any { it.contains(query, ignoreCase = true) }
        }
    }
}