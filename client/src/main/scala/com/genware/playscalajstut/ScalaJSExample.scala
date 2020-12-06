package com.genware.playscalajstut

import com.genware.playscalajstut.TestComponent.Props
import com.genware.playscalajstut.shared.SharedMessages
import org.scalajs.dom.document
import slinky.web.ReactDOM

object ScalaJSExample {

  def main(args: Array[String]): Unit = {
    ReactDOM.render(TestComponent.component(Props(SharedMessages.itWorks)), document.getElementById("react-root"))
  }
}
