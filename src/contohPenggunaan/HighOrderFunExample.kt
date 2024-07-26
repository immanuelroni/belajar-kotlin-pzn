package contohPenggunaan

data class Product(val name: String, val price: Double, val category: String)

// Higher Order Function untuk memfilter dan memproses produk
fun processProducts(
    products: List<Product>,
    filter: (Product) -> Boolean,
    transform: (Product) -> String
): List<String> {
    return products.filter(filter).map(transform)
}

fun main() {
    val products = listOf(
        Product("Laptop", 1000.0, "Electronics"),
        Product("Book", 15.0, "Books"),
        Product("Smartphone", 500.0, "Electronics"),
        Product("T-shirt", 20.0, "Clothing")
    )

    // Menggunakan HOF untuk mendapatkan nama produk elektronik yang harganya di atas $100
    val expensiveElectronics = processProducts(
        products,
        { it.category == "Electronics" && it.price > 100 },
        { "${it.name} - $${it.price}" }
    )

    println("Expensive Electronics:")
    expensiveElectronics.forEach(::println)

    // Menggunakan HOF untuk mendapatkan produk diskon (anggap semua produk di bawah $50 didiskon 10%)
    val discountedProducts = processProducts(
        products,
        { it.price < 50 },
        { "${it.name} - Original: $${it.price}, Discounted: $${it.price * 0.9}" }
    )

    println("\nDiscounted Products:")
    discountedProducts.forEach(::println)
}