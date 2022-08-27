interface Hotel {
    fun getPrice(): Int
}

class Amaris : Hotel {
    private val basePrice = 1000
    override fun getPrice(): Int {
        return basePrice
    }

}

class Mariott : Hotel {
    private val basePrice = 2000
    private val tax = 500
    override fun getPrice(): Int {
        return basePrice + tax
    }
}

class Merdeka : Hotel {
    private val basePrice = 3000
    override fun getPrice(): Int {
        return basePrice
    }
}

class HotelFactory {
    fun calculatePrices(hotels: List<Hotel>): Int {
        var totalPrice = 0
        hotels.forEach {
            totalPrice += it.getPrice()
        }
        return totalPrice
    }
}

fun main() {
    print(HotelFactory().calculatePrices(listOf(Mariott(),Merdeka(),Amaris())))
}
