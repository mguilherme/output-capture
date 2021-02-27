package com.example.outputcapture

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Service

@SpringBootApplication
class OutputCaptureApplication

fun main(args: Array<String>) {
    runApplication<OutputCaptureApplication>(*args)
}
