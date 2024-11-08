package com.example.prova1

data class ListInic(val nome: String) {

    object ListInicData{
        fun getList(): List<ListInic>{
            return listOf(
                ListInic("Bebidas"),
                ListInic("Comida"),
                ListInic("Mercearia")

            )
        }
    }

}