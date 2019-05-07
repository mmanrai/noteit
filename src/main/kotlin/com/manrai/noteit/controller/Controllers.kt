package com.manrai.noteit.controller

import com.manrai.noteit.entity.Notebook
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.*

abstract class AbstractController {
    val logger = LoggerFactory.getLogger(this.javaClass)
}

@RequestMapping("/api/feedback")
@RestController
@CrossOrigin
class FeedbackController : AbstractController() {


    @PostMapping
    fun sendFeedback(@RequestBody feedback: Feedback) {
        logger.info("sending feedback email $feedback")
    }
}

@RequestMapping("/api/notebook")
@RestController
@CrossOrigin
class NotebookController : AbstractController() {


    @GetMapping("/all")
    fun allNotebooks() : List<Notebook> {
        logger.info("fetching all notebooks")
        return listOf(Notebook("notebook1"), Notebook("notebook2"))
    }
}

data class Feedback(val name: String, val email: String, val comments: String)