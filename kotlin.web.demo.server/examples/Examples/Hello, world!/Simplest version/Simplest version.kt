/**
 * We declare a package-level function main which returns Unit and takes
 * an Array of strings as a parameter. Note that semicolons are optional.
 */
fun main() = createCode {
    SoLangConfiguration.soLangMode = SoLangConfiguration.SoLangMode.PRINT
    +SimpleSnippet("First revision:")
    +StackOverflowSnippet(answerNumber = 4362605, codeBlockNumber = 2, revisionNumber = 1)
    +SimpleSnippet("Second revision:")
    +StackOverflowSnippet(answerNumber = 4362605, codeBlockNumber = 2, revisionNumber = 2)
}.buildWith("python2", "script.py")
