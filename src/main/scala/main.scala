import canvas.{appendCanvas, drawGrid}
import org.scalajs.dom
import org.scalajs.dom.document

@main def main: Unit = {
  
  document.addEventListener(
    "DOMContentLoaded",
    (e: dom.Event) => setupUI()
  )
}

def setupUI(): Unit = {
  val canvas = appendCanvas(400, "#000000")
  drawGrid(canvas)
}
