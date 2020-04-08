package org.fansin.calculator

import java.io.Writer

private const val HELP =
    """
    How to use:
       1. Write first number and press enter
       2. Write second number and press enter
       3. Write command name and press enter
       4. Check result
    Supported commands:
       +, -, *, /
    """

class CalculatorHelp(writer: Writer) {
    init {
        writer.apply {
            write(HELP)
            flush()
        }
    }
}