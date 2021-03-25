package com.hoodbrains.ktmdbapi.cli

import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.parameters.options.option
import com.github.ajalt.clikt.parameters.options.prompt

private class TmdbCli : CliktCommand() {
    private val token: String by option(help = "tmdb api key")
        .prompt("Enter you token")

    override fun run() {
            echo("Your token is $token")
    }
}

fun main(args: Array<String>) = TmdbCli().main(args)
