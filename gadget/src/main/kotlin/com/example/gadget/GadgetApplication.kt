package src.main.kotlin.com.example.gadget

import com.example.gadget.GadgetApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GadgetApplication

fun main(args: Array<String>) {
	runApplication<GadgetApplication>(*args)
}
