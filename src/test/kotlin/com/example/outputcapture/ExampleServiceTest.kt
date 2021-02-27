package com.example.outputcapture

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.system.CapturedOutput
import org.springframework.boot.test.system.OutputCaptureExtension
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit.jupiter.SpringExtension
import strikt.api.expectThat
import strikt.assertions.contains

@ExtendWith(SpringExtension::class, OutputCaptureExtension::class)
@ContextConfiguration(classes = [ExampleService::class])
class ExampleServiceTest {

    @Autowired
    private lateinit var exampleService: ExampleService

    @Test
    fun `should assert that log is true`(output: CapturedOutput) {
        exampleService.doStuff(true)
        expectThat(output) contains "it's true"
    }

    @Test
    fun `should assert that log is false`(output: CapturedOutput) {
        exampleService.doStuff(false)
        expectThat(output) contains "it's false"
    }

}