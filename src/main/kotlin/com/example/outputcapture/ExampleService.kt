package com.example.outputcapture

import mu.KotlinLogging
import org.springframework.stereotype.Service

private val logger = KotlinLogging.logger {}

@Service
class ExampleService {

    fun doStuff(example: Boolean) {
        if (example) logger.info { "it's true" }
        else logger.info { "it's false" }
    }

}