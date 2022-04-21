package canvas
import org.scalajs.dom.document
import org.scalajs.dom.HTMLCanvasElement

def appendCanvas(width: Int, backgroundColor: String): HTMLCanvasElement = {
  val canvas = document
    .createElement("canvas")
    .asInstanceOf[HTMLCanvasElement]
  val w = 400
  canvas.height = w
  canvas.width = w
  canvas.style.background = backgroundColor
  document.body.appendChild(canvas)
  return canvas
}
