import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element

fun main() {
    val doc: Document =
        Jsoup.connect("https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/")
            .get()
    val newLines = doc.select(".sc-2aegk7-2")
    for (element: Element in newLines) {
        val string: String = element.toString().drop(34).dropLast(7)
        println(string)
        println()
    }
}