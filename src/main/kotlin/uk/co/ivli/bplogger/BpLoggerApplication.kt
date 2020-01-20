package uk.co.ivli.bplogger

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BpLoggerApplication

	fun main(args: Array<String>) {
		runApplication<BpLoggerApplication>(*args)
	}