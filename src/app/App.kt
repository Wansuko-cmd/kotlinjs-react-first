package app

import react.*

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        +"Hello World!!"
    }
}

fun RBuilder.app() = child(App::class) {}
