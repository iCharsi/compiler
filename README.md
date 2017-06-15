# compiler
Методы синтаксического анализа (Финютина и Панина А4101)

Основной класс - Main.
В нем в виде массива String'ов задается пример кода на языке Pascal.
Далее из данного массива формируется массив char'ов, который подается в лексер, в котором происходит разбивание потока символов на токены.
Затем поток токенов подается в парсер. voidPascalBaseVisitor.visit(pascalParser.program()); позволяет получить дерево, обходя которое мы на выходе получаем подобие байт-кода в Java.

Example.java -- используется только для получения Java байт-кода, чтобы сравнить с нашим

Pascal.g4 -- Грамматика языка Pascal, с помощью нее получаем классы pascal.tokens, pascalBaseListener.java, pascalBaseVisitor.java, pascalLexer.java, pascalLexer.tokens, pascalListener.java, pascalParser.java, pascalVisitor.java

pascalBaseVisitor.java -- немного изменен, при посещении всех необходимых детей в лист String'ов добавляются строки нашего байт-кода (а так же изменяются уже существующие)
