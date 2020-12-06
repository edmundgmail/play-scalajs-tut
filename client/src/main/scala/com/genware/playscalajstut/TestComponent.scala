package com.genware.playscalajstut

import slinky.core.FunctionalComponent
import slinky.core.annotations.react
import slinky.web.html.h1

@react object TestComponent {
  case class Props(name: String)
  val component = FunctionalComponent[Props]{props=> h1(s"hello, ${props.name}")}
}
