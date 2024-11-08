package com.example.prova1

data class Bebidas(val nome: String, val desc: String, val img: Int) {

    object BebidasData{
        fun getBebidas(): List<Bebidas>{
            return listOf(
                Bebidas("Espresso","Um café forte e concentrado feito ao forçar água quente através de café moído fino. Base de várias outras bebidas de café.", R.drawable.expresso),
                Bebidas("Cappuccino","Combina espresso com partes iguais de leite vaporizado e espuma de leite. Famoso pelo equilíbrio entre sabores ricos e textura cremosa.", R.drawable.cappucino),
                Bebidas("Latte ","Uma dose de espresso com uma quantidade generosa de leite vaporizado e uma pequena camada de espuma por cima. Suave e levemente adocicado.", R.drawable.latte),
                Bebidas("Americano","Espresso diluído com água quente, resultando em um café mais suave e menos intenso. Popular entre quem gosta de sabores menos concentrados.", R.drawable.americano),
                Bebidas("Mocha ","Mistura de espresso com leite vaporizado e uma dose de chocolate. Geralmente coberto com chantilly e popular entre os amantes de chocolate.", R.drawable.mocha),
                Bebidas("Macchiato","Espresso “manchado” com um pouco de espuma de leite, acentuando o sabor forte do café com apenas um toque de suavidade.", R.drawable.macchiato),
                Bebidas("Flat White","Similar ao cappuccino, mas com menos espuma e uma proporção maior de leite. De origem australiana, tem sabor intenso e textura sedosa.", R.drawable.flatwhite),
                Bebidas("Ristretto","Uma dose de espresso mais concentrada e curta, com sabor mais denso e encorpado. Ideal para quem gosta de café intenso.", R.drawable.ristreto),
                Bebidas("Affogato","Uma sobremesa italiana que combina espresso quente sobre uma bola de sorvete de baunilha. Uma deliciosa fusão de quente e frio.", R.drawable.affogato),
                Bebidas("Cold Brew","Café preparado com infusão em água fria por 12-24 horas, resultando em um sabor suave e menos ácido. Servido gelado.", R.drawable.coldbrew),
            )
        }
    }
}