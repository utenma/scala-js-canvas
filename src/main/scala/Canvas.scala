import org.scalajs.dom
import org.scalajs.dom.document
import scala.scalajs.js.annotation.JSExportTopLevel
import org.scalajs.dom.HTMLCanvasElement
import org.scalajs.dom.CanvasRenderingContext2D

@main def main: Unit = {
  val canvas = document
    .createElement("canvas")
    .asInstanceOf[HTMLCanvasElement]
  val w = 400
  canvas.height = w
  canvas.width = w

  document.body.appendChild(canvas)

  // val canvas = document
  //   .getElementById("canv")
  //   .asInstanceOf[HTMLCanvasElement]

  println(canvas)

  val context = canvas.getContext("2d")

  println(context)

  val ctx = canvas
    .getContext("2d")
    .asInstanceOf[CanvasRenderingContext2D]

  ctx.strokeStyle = "red"
  ctx.lineWidth = 3
  ctx.beginPath()
  ctx.moveTo(w / 3, 0)
  ctx.lineTo(w / 3, w / 3)
  ctx.moveTo(w * 2 / 3, 0)
  ctx.lineTo(w * 2 / 3, w / 3)
  ctx.moveTo(w, w / 2)
  ctx.arc(w / 2, w / 2, w / 2, 0, 3.14)
  ctx.stroke()

}
