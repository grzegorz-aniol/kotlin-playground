package org.gangel.lambdas

fun html(body: String.() -> String): String =
    """<html>
        |${body("")}
        |</html>
    """.trimMargin()

fun String.p(body: String.() -> String): String =
    """<p>${body()}</p>"""

fun main() {

    val htmlContent = html {
        p {
            "Welcome"
        }
    }

    println(htmlContent)

}