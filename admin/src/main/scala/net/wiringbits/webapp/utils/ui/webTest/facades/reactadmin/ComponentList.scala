package net.wiringbits.webapp.utils.ui.webTest.facades.reactadmin

import io.github.nafg.simplefacade.Implicits._
import io.github.nafg.simplefacade._
import japgolly.scalajs.react.vdom.VdomNode
import net.wiringbits.webapp.utils.ui.webTest.facades

import scala.scalajs.js

object ComponentList extends FacadeModule.NodeChildren.Simple {
  override def raw: js.Object = facades.reactadmin.ReactAdmin.List
  override def mkProps = new Props
  class Props extends PropTypes.WithChildren[VdomNode] {
    val children: PropTypes.Prop[VdomNode] = of[VdomNode]
    val actions: PropTypes.Prop[VdomNode] = of[VdomNode]
  }
}
