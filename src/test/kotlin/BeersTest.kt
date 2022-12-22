import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import kotlin.io.path.Path
import kotlin.io.path.readText

object BeersTest: StringSpec({
    "beers" {
        beers() shouldBe  Path("src/test/resources/beers.txt").readText()
    }
})
